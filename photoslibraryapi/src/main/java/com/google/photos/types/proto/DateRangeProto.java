// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/types/date_range.proto

package com.google.photos.types.proto;

public final class DateRangeProto {
  private DateRangeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_photos_types_DateRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_photos_types_DateRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/photos/types/date_range.proto\022\023"
          + "google.photos.types\032\026google/type/date.pr"
          + "oto\"W\n\tDateRange\022%\n\nstart_date\030\001 \001(\0132\021.g"
          + "oogle.type.Date\022#\n\010end_date\030\002 \001(\0132\021.goog"
          + "le.type.DateBk\n\035com.google.photos.types."
          + "protoB\016DateRangeProtoP\001Z8google.golang.o"
          + "rg/genproto/googleapis/photos/types;type"
          + "sb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.type.DateProto.getDescriptor(),
        },
        assigner);
    internal_static_google_photos_types_DateRange_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_photos_types_DateRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_photos_types_DateRange_descriptor,
            new java.lang.String[] {
              "StartDate", "EndDate",
            });
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
