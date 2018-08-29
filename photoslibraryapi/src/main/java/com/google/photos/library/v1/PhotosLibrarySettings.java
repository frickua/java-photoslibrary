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

package com.google.photos.library.v1;

import com.google.api.core.ApiClock;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.WatchdogProvider;
import com.google.photos.library.v1.internal.InternalPhotosLibrarySettings;
import com.google.photos.library.v1.internal.stub.PhotosLibraryStubSettings;
import com.google.photos.library.v1.upload.UploadMediaItemRequest;
import com.google.photos.library.v1.upload.UploadMediaItemResponse;
import java.io.IOException;
import javax.annotation.Nullable;
import org.threeten.bp.Duration;

/**
 * Wrapper of {@link InternalPhotosLibrarySettings}. This includes {@link UnaryCallSettings} as an
 * extension.
 */
public final class PhotosLibrarySettings extends InternalPhotosLibrarySettings {
  /** The default endpoint of the upload service. */
  private static final String DEFAULT_UPLOAD_ENDPOINT =
      "https://photoslibrary.googleapis.com/v1/uploads";

  private final UnaryCallSettings<UploadMediaItemRequest, UploadMediaItemResponse>
      uploadMediaItemSettings;

  protected PhotosLibrarySettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
    uploadMediaItemSettings = settingsBuilder.uploadMediaItemSettingsBuilder().build();
  }

  /** Returns the object with the settings used for calls to uploadMediaItem. */
  public UnaryCallSettings<UploadMediaItemRequest, UploadMediaItemResponse>
      uploadMediaItemSettings() {
    return uploadMediaItemSettings;
  }

  /** Returns the upload endpoint used for calls to uploadMediaItem. */
  public static String getUploadEndpoint() {
    return DEFAULT_UPLOAD_ENDPOINT;
  }

  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Builder class for {@link PhotosLibrarySettings}. */
  public static final class Builder extends InternalPhotosLibrarySettings.Builder {

    private UnaryCallSettings.Builder<UploadMediaItemRequest, UploadMediaItemResponse>
        uploadMediaItemSettingsBuilder;

    private Builder() throws IOException {
      uploadMediaItemSettingsBuilder = UnaryCallSettings.newUnaryCallSettingsBuilder();
    }

    private Builder(ClientContext clientContext) {
      super(clientContext);
      uploadMediaItemSettingsBuilder = UnaryCallSettings.newUnaryCallSettingsBuilder();
    }

    private Builder(InternalPhotosLibrarySettings settings) {
      super(settings);
      uploadMediaItemSettingsBuilder = UnaryCallSettings.newUnaryCallSettingsBuilder();
    }

    private Builder(PhotosLibraryStubSettings.Builder stubSettings) {
      super(stubSettings);
      uploadMediaItemSettingsBuilder = UnaryCallSettings.newUnaryCallSettingsBuilder();
    }

    @Override
    public Builder setExecutorProvider(ExecutorProvider executorProvider) {
      super.setExecutorProvider(executorProvider);
      return this;
    }

    @Override
    public Builder setCredentialsProvider(CredentialsProvider credentialsProvider) {
      super.setCredentialsProvider(credentialsProvider);
      return this;
    }

    @Override
    public Builder setHeaderProvider(HeaderProvider headerProvider) {
      super.setHeaderProvider(headerProvider);
      return this;
    }

    @Override
    protected Builder setInternalHeaderProvider(HeaderProvider internalHeaderProvider) {
      super.setInternalHeaderProvider(internalHeaderProvider);
      return this;
    }

    @Override
    public Builder setTransportChannelProvider(TransportChannelProvider transportChannelProvider) {
      super.setTransportChannelProvider(transportChannelProvider);
      return this;
    }

    @Override
    public Builder setClock(ApiClock clock) {
      super.setClock(clock);
      return this;
    }

    @Override
    public Builder setEndpoint(String endpoint) {
      super.setEndpoint(endpoint);
      return this;
    }

    @Override
    public Builder setWatchdogProvider(@Nullable WatchdogProvider watchdogProvider) {
      super.setWatchdogProvider(watchdogProvider);
      return this;
    }

    @Override
    public Builder setWatchdogCheckInterval(@Nullable Duration checkInterval) {
      super.setWatchdogCheckInterval(checkInterval);
      return this;
    }

    @Override
    public PhotosLibrarySettings build() throws IOException {
      return new PhotosLibrarySettings(this);
    }

    /** Returns the builder for the settings used for calls to uploadMediaItem. */
    public UnaryCallSettings.Builder<UploadMediaItemRequest, UploadMediaItemResponse>
        uploadMediaItemSettingsBuilder() {
      return uploadMediaItemSettingsBuilder;
    }

    public static Builder createDefault() {
      return new Builder(PhotosLibraryStubSettings.newBuilder());
    }
  }
}
