// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface LocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the location to be displayed.
   * </pre>
   *
   * <code>string location_name = 1;</code>
   */
  java.lang.String getLocationName();
  /**
   *
   *
   * <pre>
   * Name of the location to be displayed.
   * </pre>
   *
   * <code>string location_name = 1;</code>
   */
  com.google.protobuf.ByteString getLocationNameBytes();

  /**
   *
   *
   * <pre>
   * Position of the location on the map.
   * </pre>
   *
   * <code>.google.type.LatLng latlng = 2;</code>
   */
  boolean hasLatlng();
  /**
   *
   *
   * <pre>
   * Position of the location on the map.
   * </pre>
   *
   * <code>.google.type.LatLng latlng = 2;</code>
   */
  com.google.type.LatLng getLatlng();
  /**
   *
   *
   * <pre>
   * Position of the location on the map.
   * </pre>
   *
   * <code>.google.type.LatLng latlng = 2;</code>
   */
  com.google.type.LatLngOrBuilder getLatlngOrBuilder();
}
