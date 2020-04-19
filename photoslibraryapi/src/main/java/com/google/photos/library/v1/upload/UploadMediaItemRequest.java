/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.photos.library.v1.upload;

import java.io.IOException;
import java.io.RandomAccessFile;

/** Represents an upload request. */
public final class UploadMediaItemRequest {

  private static final int DEFAULT_CHUNK_SIZE = 1024 * 1024 * 10; // 10 MB

  private final String fileName;
  private final String mimeType;
  private final String uploadUrl;
  private final int chunkSize;
  private final RandomAccessFile dataFile;

  private UploadMediaItemRequest(
      String fileName,
      String uploadUrl,
      int chunkSize,
      String mimeType,
      RandomAccessFile dataFile) {
    this.fileName = fileName;
    this.uploadUrl = uploadUrl;
    this.chunkSize = chunkSize;
    this.mimeType = mimeType;
    this.dataFile = dataFile;
  }

  /** Returns the file name to be uploaded. */
  public String getFileName() {
    return fileName;
  }

  /** Returns the mime type for the file to be uploaded. */
  public String getMimeType() {
    return mimeType;
  }

  /** Returns the url where this file will be uploaded. */
  public String getUploadUrl() {
    return uploadUrl;
  }

  /** Returns the chunk size where the file will be split. */
  public int getChunkSize() {
    return chunkSize;
  }

  /** Returns the total size of the file. */
  public long getFileSize() throws IOException {
    return dataFile.getChannel().size();
  }

  /** Reads bytes from the input file. */
  int readData(byte[] bytes) throws IOException {
    return dataFile.read(bytes);
  }

  /** Moves the cursor of the input file. */
  void seekCursor(long offset) throws IOException {
    dataFile.seek(offset);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  /** Builder for {@link UploadMediaItemRequest}. */
  public static final class Builder {

    private String fileName;
    private String mimeType;
    private String uploadUrl;
    private int chunkSize;
    private RandomAccessFile dataFile;

    private Builder() {
      chunkSize = DEFAULT_CHUNK_SIZE;
      fileName = null;
      mimeType = null;
      uploadUrl = null;
    }

    /**
     * @deprecated As of 1.5.0, set the file name in {@link
     *     com.google.photos.library.v1.proto.NewMediaItem} instead, which also supports Unicode
     *     strings. For example, use {@link
     *     com.google.photos.library.v1.util.NewMediaItemFactory#createNewMediaItem(String, String,
     *     String)} to generate a NewMediaItem with a description and file name.
     */
    @Deprecated
    public Builder setFileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    public Builder setMimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    public Builder setUploadUrl(String uploadUrl) {
      this.uploadUrl = uploadUrl;
      return this;
    }

    public Builder setChunkSize(int chunkSize) {
      this.chunkSize = chunkSize;
      return this;
    }

    public Builder setDataFile(RandomAccessFile dataFile) {
      this.dataFile = dataFile;
      return this;
    }

    public UploadMediaItemRequest build() {
      UploadMediaItemRequest uploadMediaItemRequest =
          new UploadMediaItemRequest(fileName, uploadUrl, chunkSize, mimeType, dataFile);
      return uploadMediaItemRequest;
    }
  }
}
