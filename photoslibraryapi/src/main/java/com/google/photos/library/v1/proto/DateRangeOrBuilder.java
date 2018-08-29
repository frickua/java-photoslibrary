// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface DateRangeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.DateRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The start date (included as part of the range) in one of the formats
   * described.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1;</code>
   */
  boolean hasStartDate();
  /**
   *
   *
   * <pre>
   * The start date (included as part of the range) in one of the formats
   * described.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1;</code>
   */
  com.google.type.Date getStartDate();
  /**
   *
   *
   * <pre>
   * The start date (included as part of the range) in one of the formats
   * described.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1;</code>
   */
  com.google.type.DateOrBuilder getStartDateOrBuilder();

  /**
   *
   *
   * <pre>
   * The end date (included as part of the range). It must be specified in the
   * same format as the start date.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2;</code>
   */
  boolean hasEndDate();
  /**
   *
   *
   * <pre>
   * The end date (included as part of the range). It must be specified in the
   * same format as the start date.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2;</code>
   */
  com.google.type.Date getEndDate();
  /**
   *
   *
   * <pre>
   * The end date (included as part of the range). It must be specified in the
   * same format as the start date.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2;</code>
   */
  com.google.type.DateOrBuilder getEndDateOrBuilder();
}
