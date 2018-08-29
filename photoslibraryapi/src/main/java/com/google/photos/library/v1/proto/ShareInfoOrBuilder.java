// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface ShareInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.ShareInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Options that control the sharing of an album.
   * </pre>
   *
   * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 1;</code>
   */
  boolean hasSharedAlbumOptions();
  /**
   *
   *
   * <pre>
   * Options that control the sharing of an album.
   * </pre>
   *
   * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 1;</code>
   */
  com.google.photos.library.v1.proto.SharedAlbumOptions getSharedAlbumOptions();
  /**
   *
   *
   * <pre>
   * Options that control the sharing of an album.
   * </pre>
   *
   * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 1;</code>
   */
  com.google.photos.library.v1.proto.SharedAlbumOptionsOrBuilder getSharedAlbumOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * A link to the album that's now shared on the Google Photos website and app.
   * Anyone with the link can access this shared album and see all of the items
   * present in the album.
   * </pre>
   *
   * <code>string shareable_url = 2;</code>
   */
  java.lang.String getShareableUrl();
  /**
   *
   *
   * <pre>
   * A link to the album that's now shared on the Google Photos website and app.
   * Anyone with the link can access this shared album and see all of the items
   * present in the album.
   * </pre>
   *
   * <code>string shareable_url = 2;</code>
   */
  com.google.protobuf.ByteString getShareableUrlBytes();

  /**
   *
   *
   * <pre>
   * A token that can be used by other users to join this shared album via the
   * API.
   * </pre>
   *
   * <code>string share_token = 3;</code>
   */
  java.lang.String getShareToken();
  /**
   *
   *
   * <pre>
   * A token that can be used by other users to join this shared album via the
   * API.
   * </pre>
   *
   * <code>string share_token = 3;</code>
   */
  com.google.protobuf.ByteString getShareTokenBytes();

  /**
   *
   *
   * <pre>
   * True if the user has joined the album. This is always true for the owner
   * of the shared album.
   * </pre>
   *
   * <code>bool is_joined = 4;</code>
   */
  boolean getIsJoined();
}
