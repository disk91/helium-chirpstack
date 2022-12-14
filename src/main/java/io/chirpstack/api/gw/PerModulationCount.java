// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gw/gw.proto

package io.chirpstack.api.gw;

/**
 * Protobuf type {@code gw.PerModulationCount}
 */
public final class PerModulationCount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gw.PerModulationCount)
    PerModulationCountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PerModulationCount.newBuilder() to construct.
  private PerModulationCount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PerModulationCount() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new PerModulationCount();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GatewayProto.internal_static_gw_PerModulationCount_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GatewayProto.internal_static_gw_PerModulationCount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            PerModulationCount.class, Builder.class);
  }

  public static final int MODULATION_FIELD_NUMBER = 1;
  private Modulation modulation_;
  /**
   * <pre>
   * Modulation.
   * </pre>
   *
   * <code>.gw.Modulation modulation = 1;</code>
   * @return Whether the modulation field is set.
   */
  @Override
  public boolean hasModulation() {
    return modulation_ != null;
  }
  /**
   * <pre>
   * Modulation.
   * </pre>
   *
   * <code>.gw.Modulation modulation = 1;</code>
   * @return The modulation.
   */
  @Override
  public Modulation getModulation() {
    return modulation_ == null ? Modulation.getDefaultInstance() : modulation_;
  }
  /**
   * <pre>
   * Modulation.
   * </pre>
   *
   * <code>.gw.Modulation modulation = 1;</code>
   */
  @Override
  public ModulationOrBuilder getModulationOrBuilder() {
    return getModulation();
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <pre>
   * Count.
   * </pre>
   *
   * <code>uint32 count = 2;</code>
   * @return The count.
   */
  @Override
  public int getCount() {
    return count_;
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
    if (modulation_ != null) {
      output.writeMessage(1, getModulation());
    }
    if (count_ != 0) {
      output.writeUInt32(2, count_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modulation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getModulation());
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, count_);
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
    if (!(obj instanceof PerModulationCount)) {
      return super.equals(obj);
    }
    PerModulationCount other = (PerModulationCount) obj;

    if (hasModulation() != other.hasModulation()) return false;
    if (hasModulation()) {
      if (!getModulation()
          .equals(other.getModulation())) return false;
    }
    if (getCount()
        != other.getCount()) return false;
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
    if (hasModulation()) {
      hash = (37 * hash) + MODULATION_FIELD_NUMBER;
      hash = (53 * hash) + getModulation().hashCode();
    }
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static PerModulationCount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PerModulationCount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PerModulationCount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PerModulationCount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PerModulationCount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static PerModulationCount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static PerModulationCount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PerModulationCount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static PerModulationCount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static PerModulationCount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static PerModulationCount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static PerModulationCount parseFrom(
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
  public static Builder newBuilder(PerModulationCount prototype) {
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
   * Protobuf type {@code gw.PerModulationCount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gw.PerModulationCount)
      PerModulationCountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GatewayProto.internal_static_gw_PerModulationCount_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GatewayProto.internal_static_gw_PerModulationCount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PerModulationCount.class, Builder.class);
    }

    // Construct using io.chirpstack.api.gw.PerModulationCount.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      if (modulationBuilder_ == null) {
        modulation_ = null;
      } else {
        modulation_ = null;
        modulationBuilder_ = null;
      }
      count_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GatewayProto.internal_static_gw_PerModulationCount_descriptor;
    }

    @Override
    public PerModulationCount getDefaultInstanceForType() {
      return PerModulationCount.getDefaultInstance();
    }

    @Override
    public PerModulationCount build() {
      PerModulationCount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public PerModulationCount buildPartial() {
      PerModulationCount result = new PerModulationCount(this);
      if (modulationBuilder_ == null) {
        result.modulation_ = modulation_;
      } else {
        result.modulation_ = modulationBuilder_.build();
      }
      result.count_ = count_;
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
      if (other instanceof PerModulationCount) {
        return mergeFrom((PerModulationCount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(PerModulationCount other) {
      if (other == PerModulationCount.getDefaultInstance()) return this;
      if (other.hasModulation()) {
        mergeModulation(other.getModulation());
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
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
              input.readMessage(
                  getModulationFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 16: {
              count_ = input.readUInt32();

              break;
            } // case 16
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

    private Modulation modulation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Modulation, Modulation.Builder, ModulationOrBuilder> modulationBuilder_;
    /**
     * <pre>
     * Modulation.
     * </pre>
     *
     * <code>.gw.Modulation modulation = 1;</code>
     * @return Whether the modulation field is set.
     */
    public boolean hasModulation() {
      return modulationBuilder_ != null || modulation_ != null;
    }
    /**
     * <pre>
     * Modulation.
     * </pre>
     *
     * <code>.gw.Modulation modulation = 1;</code>
     * @return The modulation.
     */
    public Modulation getModulation() {
      if (modulationBuilder_ == null) {
        return modulation_ == null ? Modulation.getDefaultInstance() : modulation_;
      } else {
        return modulationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Modulation.
     * </pre>
     *
     * <code>.gw.Modulation modulation = 1;</code>
     */
    public Builder setModulation(Modulation value) {
      if (modulationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modulation_ = value;
        onChanged();
      } else {
        modulationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Modulation.
     * </pre>
     *
     * <code>.gw.Modulation modulation = 1;</code>
     */
    public Builder setModulation(
        Modulation.Builder builderForValue) {
      if (modulationBuilder_ == null) {
        modulation_ = builderForValue.build();
        onChanged();
      } else {
        modulationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Modulation.
     * </pre>
     *
     * <code>.gw.Modulation modulation = 1;</code>
     */
    public Builder mergeModulation(Modulation value) {
      if (modulationBuilder_ == null) {
        if (modulation_ != null) {
          modulation_ =
            Modulation.newBuilder(modulation_).mergeFrom(value).buildPartial();
        } else {
          modulation_ = value;
        }
        onChanged();
      } else {
        modulationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Modulation.
     * </pre>
     *
     * <code>.gw.Modulation modulation = 1;</code>
     */
    public Builder clearModulation() {
      if (modulationBuilder_ == null) {
        modulation_ = null;
        onChanged();
      } else {
        modulation_ = null;
        modulationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Modulation.
     * </pre>
     *
     * <code>.gw.Modulation modulation = 1;</code>
     */
    public Modulation.Builder getModulationBuilder() {
      
      onChanged();
      return getModulationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Modulation.
     * </pre>
     *
     * <code>.gw.Modulation modulation = 1;</code>
     */
    public ModulationOrBuilder getModulationOrBuilder() {
      if (modulationBuilder_ != null) {
        return modulationBuilder_.getMessageOrBuilder();
      } else {
        return modulation_ == null ?
            Modulation.getDefaultInstance() : modulation_;
      }
    }
    /**
     * <pre>
     * Modulation.
     * </pre>
     *
     * <code>.gw.Modulation modulation = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Modulation, Modulation.Builder, ModulationOrBuilder>
        getModulationFieldBuilder() {
      if (modulationBuilder_ == null) {
        modulationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Modulation, Modulation.Builder, ModulationOrBuilder>(
                getModulation(),
                getParentForChildren(),
                isClean());
        modulation_ = null;
      }
      return modulationBuilder_;
    }

    private int count_ ;
    /**
     * <pre>
     * Count.
     * </pre>
     *
     * <code>uint32 count = 2;</code>
     * @return The count.
     */
    @Override
    public int getCount() {
      return count_;
    }
    /**
     * <pre>
     * Count.
     * </pre>
     *
     * <code>uint32 count = 2;</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count.
     * </pre>
     *
     * <code>uint32 count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      
      count_ = 0;
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


    // @@protoc_insertion_point(builder_scope:gw.PerModulationCount)
  }

  // @@protoc_insertion_point(class_scope:gw.PerModulationCount)
  private static final PerModulationCount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PerModulationCount();
  }

  public static PerModulationCount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PerModulationCount>
      PARSER = new com.google.protobuf.AbstractParser<PerModulationCount>() {
    @Override
    public PerModulationCount parsePartialFrom(
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

  public static com.google.protobuf.Parser<PerModulationCount> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<PerModulationCount> getParserForType() {
    return PARSER;
  }

  @Override
  public PerModulationCount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

