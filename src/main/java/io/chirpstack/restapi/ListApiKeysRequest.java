// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/internal.proto

package io.chirpstack.restapi;

import io.chirpstack.restapi.ListApiKeysRequestOrBuilder;

/**
 * Protobuf type {@code api.ListApiKeysRequest}
 */
public final class ListApiKeysRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.ListApiKeysRequest)
        ListApiKeysRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListApiKeysRequest.newBuilder() to construct.
  private ListApiKeysRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListApiKeysRequest() {
    tenantId_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListApiKeysRequest();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.chirpstack.restapi.InternalProto.internal_static_api_ListApiKeysRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.chirpstack.restapi.InternalProto.internal_static_api_ListApiKeysRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.chirpstack.restapi.ListApiKeysRequest.class, io.chirpstack.restapi.ListApiKeysRequest.Builder.class);
  }

  public static final int LIMIT_FIELD_NUMBER = 1;
  private int limit_;
  /**
   * <pre>
   * Max number of items to return.
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

  public static final int IS_ADMIN_FIELD_NUMBER = 3;
  private boolean isAdmin_;
  /**
   * <pre>
   * Return only admin keys.
   * </pre>
   *
   * <code>bool is_admin = 3;</code>
   * @return The isAdmin.
   */
  @Override
  public boolean getIsAdmin() {
    return isAdmin_;
  }

  public static final int TENANT_ID_FIELD_NUMBER = 4;
  private volatile Object tenantId_;
  /**
   * <pre>
   * Filter on tenant ID.
   * </pre>
   *
   * <code>string tenant_id = 4;</code>
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
   * Filter on tenant ID.
   * </pre>
   *
   * <code>string tenant_id = 4;</code>
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
    if (isAdmin_ != false) {
      output.writeBool(3, isAdmin_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, tenantId_);
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
    if (isAdmin_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isAdmin_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tenantId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, tenantId_);
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
    if (!(obj instanceof io.chirpstack.restapi.ListApiKeysRequest)) {
      return super.equals(obj);
    }
    io.chirpstack.restapi.ListApiKeysRequest other = (io.chirpstack.restapi.ListApiKeysRequest) obj;

    if (getLimit()
        != other.getLimit()) return false;
    if (getOffset()
        != other.getOffset()) return false;
    if (getIsAdmin()
        != other.getIsAdmin()) return false;
    if (!getTenantId()
        .equals(other.getTenantId())) return false;
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
    hash = (37 * hash) + IS_ADMIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsAdmin());
    hash = (37 * hash) + TENANT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTenantId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.chirpstack.restapi.ListApiKeysRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.ListApiKeysRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListApiKeysRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.ListApiKeysRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListApiKeysRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.restapi.ListApiKeysRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListApiKeysRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.ListApiKeysRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListApiKeysRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.ListApiKeysRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.restapi.ListApiKeysRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.restapi.ListApiKeysRequest parseFrom(
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
  public static Builder newBuilder(io.chirpstack.restapi.ListApiKeysRequest prototype) {
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
   * Protobuf type {@code api.ListApiKeysRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.ListApiKeysRequest)
      ListApiKeysRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.chirpstack.restapi.InternalProto.internal_static_api_ListApiKeysRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.chirpstack.restapi.InternalProto.internal_static_api_ListApiKeysRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.chirpstack.restapi.ListApiKeysRequest.class, io.chirpstack.restapi.ListApiKeysRequest.Builder.class);
    }

    // Construct using io.chirpstack.restapi.ListApiKeysRequest.newBuilder()
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

      isAdmin_ = false;

      tenantId_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.chirpstack.restapi.InternalProto.internal_static_api_ListApiKeysRequest_descriptor;
    }

    @Override
    public io.chirpstack.restapi.ListApiKeysRequest getDefaultInstanceForType() {
      return io.chirpstack.restapi.ListApiKeysRequest.getDefaultInstance();
    }

    @Override
    public io.chirpstack.restapi.ListApiKeysRequest build() {
      io.chirpstack.restapi.ListApiKeysRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public io.chirpstack.restapi.ListApiKeysRequest buildPartial() {
      io.chirpstack.restapi.ListApiKeysRequest result = new io.chirpstack.restapi.ListApiKeysRequest(this);
      result.limit_ = limit_;
      result.offset_ = offset_;
      result.isAdmin_ = isAdmin_;
      result.tenantId_ = tenantId_;
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
      if (other instanceof io.chirpstack.restapi.ListApiKeysRequest) {
        return mergeFrom((io.chirpstack.restapi.ListApiKeysRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.chirpstack.restapi.ListApiKeysRequest other) {
      if (other == io.chirpstack.restapi.ListApiKeysRequest.getDefaultInstance()) return this;
      if (other.getLimit() != 0) {
        setLimit(other.getLimit());
      }
      if (other.getOffset() != 0) {
        setOffset(other.getOffset());
      }
      if (other.getIsAdmin() != false) {
        setIsAdmin(other.getIsAdmin());
      }
      if (!other.getTenantId().isEmpty()) {
        tenantId_ = other.tenantId_;
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
            case 24: {
              isAdmin_ = input.readBool();

              break;
            } // case 24
            case 34: {
              tenantId_ = input.readStringRequireUtf8();

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
     * Max number of items to return.
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
     * Max number of items to return.
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
     * Max number of items to return.
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

    private boolean isAdmin_ ;
    /**
     * <pre>
     * Return only admin keys.
     * </pre>
     *
     * <code>bool is_admin = 3;</code>
     * @return The isAdmin.
     */
    @Override
    public boolean getIsAdmin() {
      return isAdmin_;
    }
    /**
     * <pre>
     * Return only admin keys.
     * </pre>
     *
     * <code>bool is_admin = 3;</code>
     * @param value The isAdmin to set.
     * @return This builder for chaining.
     */
    public Builder setIsAdmin(boolean value) {
      
      isAdmin_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Return only admin keys.
     * </pre>
     *
     * <code>bool is_admin = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsAdmin() {
      
      isAdmin_ = false;
      onChanged();
      return this;
    }

    private Object tenantId_ = "";
    /**
     * <pre>
     * Filter on tenant ID.
     * </pre>
     *
     * <code>string tenant_id = 4;</code>
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
     * Filter on tenant ID.
     * </pre>
     *
     * <code>string tenant_id = 4;</code>
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
     * Filter on tenant ID.
     * </pre>
     *
     * <code>string tenant_id = 4;</code>
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
     * Filter on tenant ID.
     * </pre>
     *
     * <code>string tenant_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTenantId() {
      
      tenantId_ = getDefaultInstance().getTenantId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Filter on tenant ID.
     * </pre>
     *
     * <code>string tenant_id = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:api.ListApiKeysRequest)
  }

  // @@protoc_insertion_point(class_scope:api.ListApiKeysRequest)
  private static final io.chirpstack.restapi.ListApiKeysRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.chirpstack.restapi.ListApiKeysRequest();
  }

  public static io.chirpstack.restapi.ListApiKeysRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListApiKeysRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListApiKeysRequest>() {
    @Override
    public ListApiKeysRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListApiKeysRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ListApiKeysRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public io.chirpstack.restapi.ListApiKeysRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

