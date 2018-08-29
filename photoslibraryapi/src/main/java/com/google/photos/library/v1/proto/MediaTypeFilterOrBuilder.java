// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface MediaTypeFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.MediaTypeFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The types of media items to be included. This field should be populated
   * with only one media type. If you specify multiple media types, it results
   * in an error.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
   */
  java.util.List<com.google.photos.library.v1.proto.MediaTypeFilter.MediaType> getMediaTypesList();
  /**
   *
   *
   * <pre>
   * The types of media items to be included. This field should be populated
   * with only one media type. If you specify multiple media types, it results
   * in an error.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
   */
  int getMediaTypesCount();
  /**
   *
   *
   * <pre>
   * The types of media items to be included. This field should be populated
   * with only one media type. If you specify multiple media types, it results
   * in an error.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
   */
  com.google.photos.library.v1.proto.MediaTypeFilter.MediaType getMediaTypes(int index);
  /**
   *
   *
   * <pre>
   * The types of media items to be included. This field should be populated
   * with only one media type. If you specify multiple media types, it results
   * in an error.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
   */
  java.util.List<java.lang.Integer> getMediaTypesValueList();
  /**
   *
   *
   * <pre>
   * The types of media items to be included. This field should be populated
   * with only one media type. If you specify multiple media types, it results
   * in an error.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
   */
  int getMediaTypesValue(int index);
}
