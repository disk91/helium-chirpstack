// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/tenant.proto

package io.chirpstack.restapi;

import io.chirpstack.restapi.ListTenantUsersRequestOrBuilder;

/**
 * Protobuf type {@code api.ListTenantUsersRequest}
 */
public final class ListTenantUsersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.ListTenantUsersRequest)
        ListTenantUsersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTenantUsersRequest.newBuilder() to construct.
  private ListTenantUsersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTenantUsersRequest() {
    tenantId_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTenantUsersRequest();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.chirpstack.restapi.TenantProto.internal_static_api_ListTenantUsersRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.chirpstack.restapi.TenantProto.internal_static_api_ListTenantUsersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.chirpstack.restapi.ListTenantUsersRequest.class, io.chirpstack.restapi.ListTenantUsersRequest.Builder.class);
  }

  public static final int TENANT_ID_FIELD_NUMBER = 1;
  private volatile Object tenantId_;
  /**
   * <pre>
   * Tenant ID (UUID).
   * </pre>
   *
   * <code>string tenant_id = 1;</code>
   * @return The tenantId.
   */
  @Override
  public String getTenantId() {
    Object ref = tenantId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      tenantId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Tenant ID (UUID).
   * </pre>
   *
   * <code>string tenant_id = 1;</code>
   * @return The bytes for tenantId.
   */
  @Override
  public com.google.protobuf.ByteString
      getTenantIdBytes() {
    Object ref = tenantId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      tenantId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIMIT_FIELD_NUMBER = 2;
  private int limit_;
  /**
   * <pre>
   * Max number of tenants to return in the result-set.
   * </pre>
   *
   * <code>uint32 limit = 2;</code>
   * @return The limit.
   */
  @Override
  public int getLimit() {
    return limit_;
  }

  public static final int OFFSET_FIELD_NUMBER = 3;
  private int offset_;
  /**
   * <pre>
   * Offset in the result-set (for pagination).
   * </pre>
   *
   * <code>uint32 offset = 3;</code>
   * @return The offset.
   */
  @Override
  public int getOffset() {
    return offset_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tenantId_);
    }
    if (limit_ != 0) {
      output.writeUInt32(2, limit_);
    }
    if (offset_ != 0) {
      output.writeUInt32(3, offset_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tenantId_);
    }
    if (limit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, limit_);
    }
    if (offset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, offset_);
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
    if (!(obj instanceof io.chirpstack.restapi.ListTenantUsersRequest)) {
      return super.equals(obj);
    }
    io.chirpstack.restapi.ListTenantUsersRequest other = (io.chirpstack.restapi.ListTenantUsersRequest) obj;

    if (!getTenantId()
        .equals(other.getTenantId())) return false;
    if (getLimit()
        != other.getLimit()) return false;
    if (getOffset()
        != other.getOffset()) return false;
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
    hash = (37 * hash) + TENANT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTenantId().hashCode();
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit();
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.chirpstack.restapi.ListTenantUsersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.ListTenantUsersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListTenantUsersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.ListTenantUsersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListTenantUsersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.ListTenantUsersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListTenantUsersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.ListTenantUsersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListTenantUsersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.ListTenantUsersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListTenantUsersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.ListTenantUsersRequest parseFrom(
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
  public static Builder newBuilder(io.chirpstack.restapi.ListTenantUsersRequest prototype) {
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
   * Protobuf type {@code api.ListTenantUsersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.ListTenantUsersRequest)
      ListTenantUsersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.chirpstack.restapi.TenantProto.internal_static_api_ListTenantUsersRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.chirpstack.restapi.TenantProto.internal_static_api_ListTenantUsersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.chirpstack.restapi.ListTenantUsersRequest.class, io.chirpstack.restapi.ListTenantUsersRequest.Builder.class);
    }

    // Construct using io.chirpstack.restapi.ListTenantUsersRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      tenantId_ = "";

      limit_ = 0;

      offset_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.chirpstack.restapi.TenantProto.internal_static_api_ListTenantUsersRequest_descriptor;
    }

    @Override
    public io.chirpstack.restapi.ListTenantUsersRequest getDefaultInstanceForType() {
      return io.chirpstack.restapi.ListTenantUsersRequest.getDefaultInstance();
    }

    @Override
    public io.chirpstack.restapi.ListTenantUsersRequest build() {
      io.chirpstack.restapi.ListTenantUsersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public io.chirpstack.restapi.ListTenantUsersRequest buildPartial() {
      io.chirpstack.restapi.ListTenantUsersRequest result = new io.chirpstack.restapi.ListTenantUsersRequest(this);
      result.tenantId_ = tenantId_;
      result.limit_ = limit_;
      result.offset_ = offset_;
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
      if (other instanceof io.chirpstack.restapi.ListTenantUsersRequest) {
        return mergeFrom((io.chirpstack.restapi.ListTenantUsersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.chirpstack.restapi.ListTenantUsersRequest other) {
      if (other == io.chirpstack.restapi.ListTenantUsersRequest.getDefaultInstance()) return this;
      if (!other.getTenantId().isEmpty()) {
        tenantId_ = other.tenantId_;
        onChanged();
      }
      if (other.getLimit() != 0) {
        setLimit(other.getLimit());
      }
      if (other.getOffset() != 0) {
        setOffset(other.getOffset());
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
            case 10: {
              tenantId_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 16: {
              limit_ = input.readUInt32();

              break;
            } // case 16
            case 24: {
              offset_ = input.readUInt32();

              break;
            } // case 24
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

    private Object tenantId_ = "";
    /**
     * <pre>
     * Tenant ID (UUID).
     * </pre>
     *
     * <code>string tenant_id = 1;</code>
     * @return The tenantId.
     */
    public String getTenantId() {
      Object ref = tenantId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        tenantId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Tenant ID (UUID).
     * </pre>
     *
     * <code>string tenant_id = 1;</code>
     * @return The bytes for tenantId.
     */
    public com.google.protobuf.ByteString
        getTenantIdBytes() {
      Object ref = tenantId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        tenantId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Tenant ID (UUID).
     * </pre>
     *
     * <code>string tenant_id = 1;</code>
     * @param value The tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tenantId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Tenant ID (UUID).
     * </pre>
     *
     * <code>string tenant_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTenantId() {
      
      tenantId_ = getDefaultInstance().getTenantId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Tenant ID (UUID).
     * </pre>
     *
     * <code>string tenant_id = 1;</code>
     * @param value The bytes for tenantId to set.
     * @return This builder for chaining.
     */
    public Builder setTenantIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tenantId_ = value;
      onChanged();
      return this;
    }

    private int limit_ ;
    /**
     * <pre>
     * Max number of tenants to return in the result-set.
     * </pre>
     *
     * <code>uint32 limit = 2;</code>
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
     * <code>uint32 limit = 2;</code>
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
     * <code>uint32 limit = 2;</code>
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
     * <code>uint32 offset = 3;</code>
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
     * <code>uint32 offset = 3;</code>
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
     * <code>uint32 offset = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      
      offset_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.ListTenantUsersRequest)
  }

  // @@protoc_insertion_point(class_scope:api.ListTenantUsersRequest)
  private static final io.chirpstack.restapi.ListTenantUsersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.chirpstack.restapi.ListTenantUsersRequest();
  }

  public static io.chirpstack.restapi.ListTenantUsersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTenantUsersRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListTenantUsersRequest>() {
    @Override
    public ListTenantUsersRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTenantUsersRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ListTenantUsersRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public io.chirpstack.restapi.ListTenantUsersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

