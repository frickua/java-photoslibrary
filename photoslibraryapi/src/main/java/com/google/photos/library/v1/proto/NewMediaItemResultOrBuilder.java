// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface NewMediaItemResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.NewMediaItemResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The upload token used to create this new media item.
   * </pre>
   *
   * <code>string upload_token = 1;</code>
   */
  java.lang.String getUploadToken();
  /**
   *
   *
   * <pre>
   * The upload token used to create this new media item.
   * </pre>
   *
   * <code>string upload_token = 1;</code>
   */
  com.google.protobuf.ByteString getUploadTokenBytes();

  /**
   *
   *
   * <pre>
   * If an error occurred during the creation of this media item, this field
   * is  populated with information related to the error. For details regarding
   * this field, see &lt;a href="#Status"&gt;Status&lt;/a&gt;.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * If an error occurred during the creation of this media item, this field
   * is  populated with information related to the error. For details regarding
   * this field, see &lt;a href="#Status"&gt;Status&lt;/a&gt;.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   */
  com.google.rpc.Status getStatus();
  /**
   *
   *
   * <pre>
   * If an error occurred during the creation of this media item, this field
   * is  populated with information related to the error. For details regarding
   * this field, see &lt;a href="#Status"&gt;Status&lt;/a&gt;.
   * </pre>
   *
   * <code>.google.rpc.Status status = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Media item created with the upload token. It's populated if no errors
   * occurred and the media item was created successfully.
   * </pre>
   *
   * <code>.google.photos.library.v1.MediaItem media_item = 3;</code>
   */
  boolean hasMediaItem();
  /**
   *
   *
   * <pre>
   * Media item created with the upload token. It's populated if no errors
   * occurred and the media item was created successfully.
   * </pre>
   *
   * <code>.google.photos.library.v1.MediaItem media_item = 3;</code>
   */
  com.google.photos.library.v1.proto.MediaItem getMediaItem();
  /**
   *
   *
   * <pre>
   * Media item created with the upload token. It's populated if no errors
   * occurred and the media item was created successfully.
   * </pre>
   *
   * <code>.google.photos.library.v1.MediaItem media_item = 3;</code>
   */
  com.google.photos.library.v1.proto.MediaItemOrBuilder getMediaItemOrBuilder();
}
