// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/tenant.proto

package io.chirpstack.restapi;

import io.chirpstack.restapi.ListTenantsRequestOrBuilder;

/**
 * Protobuf type {@code api.ListTenantsRequest}
 */
public final class ListTenantsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.ListTenantsRequest)
        ListTenantsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTenantsRequest.newBuilder() to construct.
  private ListTenantsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTenantsRequest() {
    search_ = "";
    userId_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTenantsRequest();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.chirpstack.restapi.TenantProto.internal_static_api_ListTenantsRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.chirpstack.restapi.TenantProto.internal_static_api_ListTenantsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.chirpstack.restapi.ListTenantsRequest.class, io.chirpstack.restapi.ListTenantsRequest.Builder.class);
  }

  public static final int LIMIT_FIELD_NUMBER = 1;
  private int limit_;
  /**
   * <pre>
   * Max number of tenants to return in the result-set.
   * </pre>
   *
   * <code>uint32 limit = 1;</code>
   * @return The limit.
   */
  @Override
  public int getLimit() {
    return limit_;
  }

  public static final int OFFSET_FIELD_NUMBER = 2;
  private int offset_;
  /**
   * <pre>
   * Offset in the result-set (for pagination).
   * </pre>
   *
   * <code>uint32 offset = 2;</code>
   * @return The offset.
   */
  @Override
  public int getOffset() {
    return offset_;
  }

  public static final int SEARCH_FIELD_NUMBER = 3;
  private volatile Object search_;
  /**
   * <pre>
   * If set, the given string will be used to search on name.
   * </pre>
   *
   * <code>string search = 3;</code>
   * @return The search.
   */
  @Override
  public String getSearch() {
    Object ref = search_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      search_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If set, the given string will be used to search on name.
   * </pre>
   *
   * <code>string search = 3;</code>
   * @return The bytes for search.
   */
  @Override
  public com.google.protobuf.ByteString
      getSearchBytes() {
    Object ref = search_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      search_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_ID_FIELD_NUMBER = 4;
  private volatile Object userId_;
  /**
   * <pre>
   * If set, filters the result set to the tenants of the user.
   * Only global API keys are able to filter by this field.
   * </pre>
   *
   * <code>string user_id = 4;</code>
   * @return The userId.
   */
  @Override
  public String getUserId() {
    Object ref = userId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If set, filters the result set to the tenants of the user.
   * Only global API keys are able to filter by this field.
   * </pre>
   *
   * <code>string user_id = 4;</code>
   * @return The bytes for userId.
   */
  @Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    Object ref = userId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (limit_ != 0) {
      output.writeUInt32(1, limit_);
    }
    if (offset_ != 0) {
      output.writeUInt32(2, offset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(search_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, search_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, userId_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (limit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, limit_);
    }
    if (offset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, offset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(search_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, search_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, userId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.chirpstack.restapi.ListTenantsRequest)) {
      return super.equals(obj);
    }
    io.chirpstack.restapi.ListTenantsRequest other = (io.chirpstack.restapi.ListTenantsRequest) obj;

    if (getLimit()
        != other.getLimit()) return false;
    if (getOffset()
        != other.getOffset()) return false;
    if (!getSearch()
        .equals(other.getSearch())) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit();
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset();
    hash = (37 * hash) + SEARCH_FIELD_NUMBER;
    hash = (53 * hash) + getSearch().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.chirpstack.restapi.ListTenantsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.ListTenantsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListTenantsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.ListTenantsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListTenantsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.ListTenantsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListTenantsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.ListTenantsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListTenantsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.ListTenantsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListTenantsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.ListTenantsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.chirpstack.restapi.ListTenantsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api.ListTenantsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.ListTenantsRequest)
      ListTenantsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.chirpstack.restapi.TenantProto.internal_static_api_ListTenantsRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.chirpstack.restapi.TenantProto.internal_static_api_ListTenantsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.chirpstack.restapi.ListTenantsRequest.class, io.chirpstack.restapi.ListTenantsRequest.Builder.class);
    }

    // Construct using io.chirpstack.restapi.ListTenantsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      limit_ = 0;

      offset_ = 0;

      search_ = "";

      userId_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.chirpstack.restapi.TenantProto.internal_static_api_ListTenantsRequest_descriptor;
    }

    @Override
    public io.chirpstack.restapi.ListTenantsRequest getDefaultInstanceForType() {
      return io.chirpstack.restapi.ListTenantsRequest.getDefaultInstance();
    }

    @Override
    public io.chirpstack.restapi.ListTenantsRequest build() {
      io.chirpstack.restapi.ListTenantsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public io.chirpstack.restapi.ListTenantsRequest buildPartial() {
      io.chirpstack.restapi.ListTenantsRequest result = new io.chirpstack.restapi.ListTenantsRequest(this);
      result.limit_ = limit_;
      result.offset_ = offset_;
      result.search_ = search_;
      result.userId_ = userId_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.chirpstack.restapi.ListTenantsRequest) {
        return mergeFrom((io.chirpstack.restapi.ListTenantsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.chirpstack.restapi.ListTenantsRequest other) {
      if (other == io.chirpstack.restapi.ListTenantsRequest.getDefaultInstance()) return this;
      if (other.getLimit() != 0) {
        setLimit(other.getLimit());
      }
      if (other.getOffset() != 0) {
        setOffset(other.getOffset());
      }
      if (!other.getSearch().isEmpty()) {
        search_ = other.search_;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              limit_ = input.readUInt32();

              break;
            } // case 8
            case 16: {
              offset_ = input.readUInt32();

              break;
            } // case 16
            case 26: {
              search_ = input.readStringRequireUtf8();

              break;
            } // case 26
            case 34: {
              userId_ = input.readStringRequireUtf8();

              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int limit_ ;
    /**
     * <pre>
     * Max number of tenants to return in the result-set.
     * </pre>
     *
     * <code>uint32 limit = 1;</code>
     * @return The limit.
     */
    @Override
    public int getLimit() {
      return limit_;
    }
    /**
     * <pre>
     * Max number of tenants to return in the result-set.
     * </pre>
     *
     * <code>uint32 limit = 1;</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(int value) {
      
      limit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Max number of tenants to return in the result-set.
     * </pre>
     *
     * <code>uint32 limit = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      
      limit_ = 0;
      onChanged();
      return this;
    }

    private int offset_ ;
    /**
     * <pre>
     * Offset in the result-set (for pagination).
     * </pre>
     *
     * <code>uint32 offset = 2;</code>
     * @return The offset.
     */
    @Override
    public int getOffset() {
      return offset_;
    }
    /**
     * <pre>
     * Offset in the result-set (for pagination).
     * </pre>
     *
     * <code>uint32 offset = 2;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(int value) {
      
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Offset in the result-set (for pagination).
     * </pre>
     *
     * <code>uint32 offset = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      
      offset_ = 0;
      onChanged();
      return this;
    }

    private Object search_ = "";
    /**
     * <pre>
     * If set, the given string will be used to search on name.
     * </pre>
     *
     * <code>string search = 3;</code>
     * @return The search.
     */
    public String getSearch() {
      Object ref = search_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        search_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * If set, the given string will be used to search on name.
     * </pre>
     *
     * <code>string search = 3;</code>
     * @return The bytes for search.
     */
    public com.google.protobuf.ByteString
        getSearchBytes() {
      Object ref = search_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        search_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If set, the given string will be used to search on name.
     * </pre>
     *
     * <code>string search = 3;</code>
     * @param value The search to set.
     * @return This builder for chaining.
     */
    public Builder setSearch(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      search_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, the given string will be used to search on name.
     * </pre>
     *
     * <code>string search = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSearch() {
      
      search_ = getDefaultInstance().getSearch();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, the given string will be used to search on name.
     * </pre>
     *
     * <code>string search = 3;</code>
     * @param value The bytes for search to set.
     * @return This builder for chaining.
     */
    public Builder setSearchBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      search_ = value;
      onChanged();
      return this;
    }

    private Object userId_ = "";
    /**
     * <pre>
     * If set, filters the result set to the tenants of the user.
     * Only global API keys are able to filter by this field.
     * </pre>
     *
     * <code>string user_id = 4;</code>
     * @return The userId.
     */
    public String getUserId() {
      Object ref = userId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * If set, filters the result set to the tenants of the user.
     * Only global API keys are able to filter by this field.
     * </pre>
     *
     * <code>string user_id = 4;</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If set, filters the result set to the tenants of the user.
     * Only global API keys are able to filter by this field.
     * </pre>
     *
     * <code>string user_id = 4;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, filters the result set to the tenants of the user.
     * Only global API keys are able to filter by this field.
     * </pre>
     *
     * <code>string user_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If set, filters the result set to the tenants of the user.
     * Only global API keys are able to filter by this field.
     * </pre>
     *
     * <code>string user_id = 4;</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.ListTenantsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.ListTenantsRequest)
  private static final io.chirpstack.restapi.ListTenantsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.chirpstack.restapi.ListTenantsRequest();
  }

  public static io.chirpstack.restapi.ListTenantsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTenantsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListTenantsRequest>() {
    @Override
    public ListTenantsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ListTenantsRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ListTenantsRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public io.chirpstack.restapi.ListTenantsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

