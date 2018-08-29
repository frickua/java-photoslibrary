// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

/**
 *
 *
 * <pre>
 * Request to make an album shared in Google Photos.
 * </pre>
 *
 * Protobuf type {@code google.photos.library.v1.ShareAlbumRequest}
 */
public final class ShareAlbumRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.photos.library.v1.ShareAlbumRequest)
    ShareAlbumRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ShareAlbumRequest.newBuilder() to construct.
  private ShareAlbumRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ShareAlbumRequest() {
    albumId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ShareAlbumRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              albumId_ = s;
              break;
            }
          case 18:
            {
              com.google.photos.library.v1.proto.SharedAlbumOptions.Builder subBuilder = null;
              if (sharedAlbumOptions_ != null) {
                subBuilder = sharedAlbumOptions_.toBuilder();
              }
              sharedAlbumOptions_ =
                  input.readMessage(
                      com.google.photos.library.v1.proto.SharedAlbumOptions.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(sharedAlbumOptions_);
                sharedAlbumOptions_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_ShareAlbumRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_ShareAlbumRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.photos.library.v1.proto.ShareAlbumRequest.class,
            com.google.photos.library.v1.proto.ShareAlbumRequest.Builder.class);
  }

  public static final int ALBUM_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object albumId_;
  /**
   *
   *
   * <pre>
   * Identifier of the album to be shared. This `albumId` must belong to an
   * album created by the developer.
   * .
   * </pre>
   *
   * <code>string album_id = 1;</code>
   */
  public java.lang.String getAlbumId() {
    java.lang.Object ref = albumId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      albumId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Identifier of the album to be shared. This `albumId` must belong to an
   * album created by the developer.
   * .
   * </pre>
   *
   * <code>string album_id = 1;</code>
   */
  public com.google.protobuf.ByteString getAlbumIdBytes() {
    java.lang.Object ref = albumId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      albumId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHARED_ALBUM_OPTIONS_FIELD_NUMBER = 2;
  private com.google.photos.library.v1.proto.SharedAlbumOptions sharedAlbumOptions_;
  /**
   *
   *
   * <pre>
   * Options to be set when converting the album to a shared album.
   * </pre>
   *
   * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 2;</code>
   */
  public boolean hasSharedAlbumOptions() {
    return sharedAlbumOptions_ != null;
  }
  /**
   *
   *
   * <pre>
   * Options to be set when converting the album to a shared album.
   * </pre>
   *
   * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 2;</code>
   */
  public com.google.photos.library.v1.proto.SharedAlbumOptions getSharedAlbumOptions() {
    return sharedAlbumOptions_ == null
        ? com.google.photos.library.v1.proto.SharedAlbumOptions.getDefaultInstance()
        : sharedAlbumOptions_;
  }
  /**
   *
   *
   * <pre>
   * Options to be set when converting the album to a shared album.
   * </pre>
   *
   * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 2;</code>
   */
  public com.google.photos.library.v1.proto.SharedAlbumOptionsOrBuilder
      getSharedAlbumOptionsOrBuilder() {
    return getSharedAlbumOptions();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getAlbumIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, albumId_);
    }
    if (sharedAlbumOptions_ != null) {
      output.writeMessage(2, getSharedAlbumOptions());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAlbumIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, albumId_);
    }
    if (sharedAlbumOptions_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSharedAlbumOptions());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.photos.library.v1.proto.ShareAlbumRequest)) {
      return super.equals(obj);
    }
    com.google.photos.library.v1.proto.ShareAlbumRequest other =
        (com.google.photos.library.v1.proto.ShareAlbumRequest) obj;

    boolean result = true;
    result = result && getAlbumId().equals(other.getAlbumId());
    result = result && (hasSharedAlbumOptions() == other.hasSharedAlbumOptions());
    if (hasSharedAlbumOptions()) {
      result = result && getSharedAlbumOptions().equals(other.getSharedAlbumOptions());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ALBUM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAlbumId().hashCode();
    if (hasSharedAlbumOptions()) {
      hash = (37 * hash) + SHARED_ALBUM_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getSharedAlbumOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.photos.library.v1.proto.ShareAlbumRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.ShareAlbumRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ShareAlbumRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.ShareAlbumRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ShareAlbumRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.ShareAlbumRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ShareAlbumRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.ShareAlbumRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ShareAlbumRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.ShareAlbumRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ShareAlbumRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.ShareAlbumRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.photos.library.v1.proto.ShareAlbumRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request to make an album shared in Google Photos.
   * </pre>
   *
   * Protobuf type {@code google.photos.library.v1.ShareAlbumRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.photos.library.v1.ShareAlbumRequest)
      com.google.photos.library.v1.proto.ShareAlbumRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_ShareAlbumRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_ShareAlbumRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.photos.library.v1.proto.ShareAlbumRequest.class,
              com.google.photos.library.v1.proto.ShareAlbumRequest.Builder.class);
    }

    // Construct using com.google.photos.library.v1.proto.ShareAlbumRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      albumId_ = "";

      if (sharedAlbumOptionsBuilder_ == null) {
        sharedAlbumOptions_ = null;
      } else {
        sharedAlbumOptions_ = null;
        sharedAlbumOptionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_ShareAlbumRequest_descriptor;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.ShareAlbumRequest getDefaultInstanceForType() {
      return com.google.photos.library.v1.proto.ShareAlbumRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.ShareAlbumRequest build() {
      com.google.photos.library.v1.proto.ShareAlbumRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.ShareAlbumRequest buildPartial() {
      com.google.photos.library.v1.proto.ShareAlbumRequest result =
          new com.google.photos.library.v1.proto.ShareAlbumRequest(this);
      result.albumId_ = albumId_;
      if (sharedAlbumOptionsBuilder_ == null) {
        result.sharedAlbumOptions_ = sharedAlbumOptions_;
      } else {
        result.sharedAlbumOptions_ = sharedAlbumOptionsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.photos.library.v1.proto.ShareAlbumRequest) {
        return mergeFrom((com.google.photos.library.v1.proto.ShareAlbumRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.photos.library.v1.proto.ShareAlbumRequest other) {
      if (other == com.google.photos.library.v1.proto.ShareAlbumRequest.getDefaultInstance())
        return this;
      if (!other.getAlbumId().isEmpty()) {
        albumId_ = other.albumId_;
        onChanged();
      }
      if (other.hasSharedAlbumOptions()) {
        mergeSharedAlbumOptions(other.getSharedAlbumOptions());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.photos.library.v1.proto.ShareAlbumRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.photos.library.v1.proto.ShareAlbumRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object albumId_ = "";
    /**
     *
     *
     * <pre>
     * Identifier of the album to be shared. This `albumId` must belong to an
     * album created by the developer.
     * .
     * </pre>
     *
     * <code>string album_id = 1;</code>
     */
    public java.lang.String getAlbumId() {
      java.lang.Object ref = albumId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        albumId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifier of the album to be shared. This `albumId` must belong to an
     * album created by the developer.
     * .
     * </pre>
     *
     * <code>string album_id = 1;</code>
     */
    public com.google.protobuf.ByteString getAlbumIdBytes() {
      java.lang.Object ref = albumId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        albumId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifier of the album to be shared. This `albumId` must belong to an
     * album created by the developer.
     * .
     * </pre>
     *
     * <code>string album_id = 1;</code>
     */
    public Builder setAlbumId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      albumId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifier of the album to be shared. This `albumId` must belong to an
     * album created by the developer.
     * .
     * </pre>
     *
     * <code>string album_id = 1;</code>
     */
    public Builder clearAlbumId() {

      albumId_ = getDefaultInstance().getAlbumId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifier of the album to be shared. This `albumId` must belong to an
     * album created by the developer.
     * .
     * </pre>
     *
     * <code>string album_id = 1;</code>
     */
    public Builder setAlbumIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      albumId_ = value;
      onChanged();
      return this;
    }

    private com.google.photos.library.v1.proto.SharedAlbumOptions sharedAlbumOptions_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.photos.library.v1.proto.SharedAlbumOptions,
            com.google.photos.library.v1.proto.SharedAlbumOptions.Builder,
            com.google.photos.library.v1.proto.SharedAlbumOptionsOrBuilder>
        sharedAlbumOptionsBuilder_;
    /**
     *
     *
     * <pre>
     * Options to be set when converting the album to a shared album.
     * </pre>
     *
     * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 2;</code>
     */
    public boolean hasSharedAlbumOptions() {
      return sharedAlbumOptionsBuilder_ != null || sharedAlbumOptions_ != null;
    }
    /**
     *
     *
     * <pre>
     * Options to be set when converting the album to a shared album.
     * </pre>
     *
     * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 2;</code>
     */
    public com.google.photos.library.v1.proto.SharedAlbumOptions getSharedAlbumOptions() {
      if (sharedAlbumOptionsBuilder_ == null) {
        return sharedAlbumOptions_ == null
            ? com.google.photos.library.v1.proto.SharedAlbumOptions.getDefaultInstance()
            : sharedAlbumOptions_;
      } else {
        return sharedAlbumOptionsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Options to be set when converting the album to a shared album.
     * </pre>
     *
     * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 2;</code>
     */
    public Builder setSharedAlbumOptions(
        com.google.photos.library.v1.proto.SharedAlbumOptions value) {
      if (sharedAlbumOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sharedAlbumOptions_ = value;
        onChanged();
      } else {
        sharedAlbumOptionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Options to be set when converting the album to a shared album.
     * </pre>
     *
     * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 2;</code>
     */
    public Builder setSharedAlbumOptions(
        com.google.photos.library.v1.proto.SharedAlbumOptions.Builder builderForValue) {
      if (sharedAlbumOptionsBuilder_ == null) {
        sharedAlbumOptions_ = builderForValue.build();
        onChanged();
      } else {
        sharedAlbumOptionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Options to be set when converting the album to a shared album.
     * </pre>
     *
     * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 2;</code>
     */
    public Builder mergeSharedAlbumOptions(
        com.google.photos.library.v1.proto.SharedAlbumOptions value) {
      if (sharedAlbumOptionsBuilder_ == null) {
        if (sharedAlbumOptions_ != null) {
          sharedAlbumOptions_ =
              com.google.photos.library.v1.proto.SharedAlbumOptions.newBuilder(sharedAlbumOptions_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          sharedAlbumOptions_ = value;
        }
        onChanged();
      } else {
        sharedAlbumOptionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Options to be set when converting the album to a shared album.
     * </pre>
     *
     * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 2;</code>
     */
    public Builder clearSharedAlbumOptions() {
      if (sharedAlbumOptionsBuilder_ == null) {
        sharedAlbumOptions_ = null;
        onChanged();
      } else {
        sharedAlbumOptions_ = null;
        sharedAlbumOptionsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Options to be set when converting the album to a shared album.
     * </pre>
     *
     * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 2;</code>
     */
    public com.google.photos.library.v1.proto.SharedAlbumOptions.Builder
        getSharedAlbumOptionsBuilder() {

      onChanged();
      return getSharedAlbumOptionsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Options to be set when converting the album to a shared album.
     * </pre>
     *
     * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 2;</code>
     */
    public com.google.photos.library.v1.proto.SharedAlbumOptionsOrBuilder
        getSharedAlbumOptionsOrBuilder() {
      if (sharedAlbumOptionsBuilder_ != null) {
        return sharedAlbumOptionsBuilder_.getMessageOrBuilder();
      } else {
        return sharedAlbumOptions_ == null
            ? com.google.photos.library.v1.proto.SharedAlbumOptions.getDefaultInstance()
            : sharedAlbumOptions_;
      }
    }
    /**
     *
     *
     * <pre>
     * Options to be set when converting the album to a shared album.
     * </pre>
     *
     * <code>.google.photos.library.v1.SharedAlbumOptions shared_album_options = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.photos.library.v1.proto.SharedAlbumOptions,
            com.google.photos.library.v1.proto.SharedAlbumOptions.Builder,
            com.google.photos.library.v1.proto.SharedAlbumOptionsOrBuilder>
        getSharedAlbumOptionsFieldBuilder() {
      if (sharedAlbumOptionsBuilder_ == null) {
        sharedAlbumOptionsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.photos.library.v1.proto.SharedAlbumOptions,
                com.google.photos.library.v1.proto.SharedAlbumOptions.Builder,
                com.google.photos.library.v1.proto.SharedAlbumOptionsOrBuilder>(
                getSharedAlbumOptions(), getParentForChildren(), isClean());
        sharedAlbumOptions_ = null;
      }
      return sharedAlbumOptionsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.photos.library.v1.ShareAlbumRequest)
  }

  // @@protoc_insertion_point(class_scope:google.photos.library.v1.ShareAlbumRequest)
  private static final com.google.photos.library.v1.proto.ShareAlbumRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.photos.library.v1.proto.ShareAlbumRequest();
  }

  public static com.google.photos.library.v1.proto.ShareAlbumRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShareAlbumRequest> PARSER =
      new com.google.protobuf.AbstractParser<ShareAlbumRequest>() {
        @java.lang.Override
        public ShareAlbumRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ShareAlbumRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ShareAlbumRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShareAlbumRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.photos.library.v1.proto.ShareAlbumRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
