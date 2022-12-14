// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gw/gw.proto

package io.chirpstack.api.gw;

/**
 * Protobuf type {@code gw.LoraModulationConfig}
 */
public final class LoraModulationConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gw.LoraModulationConfig)
    LoraModulationConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoraModulationConfig.newBuilder() to construct.
  private LoraModulationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoraModulationConfig() {
    spreadingFactors_ = emptyIntList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new LoraModulationConfig();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GatewayProto.internal_static_gw_LoraModulationConfig_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GatewayProto.internal_static_gw_LoraModulationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            LoraModulationConfig.class, Builder.class);
  }

  public static final int BANDWIDTH_LEGACY_FIELD_NUMBER = 1;
  private int bandwidthLegacy_;
  /**
   * <pre>
   * Bandwidth (kHz).
   * Deprecated: use bandwidth.
   * </pre>
   *
   * <code>uint32 bandwidth_legacy = 1;</code>
   * @return The bandwidthLegacy.
   */
  @Override
  public int getBandwidthLegacy() {
    return bandwidthLegacy_;
  }

  public static final int BANDWIDTH_FIELD_NUMBER = 3;
  private int bandwidth_;
  /**
   * <pre>
   * Bandwidth (Hz).
   * </pre>
   *
   * <code>uint32 bandwidth = 3;</code>
   * @return The bandwidth.
   */
  @Override
  public int getBandwidth() {
    return bandwidth_;
  }

  public static final int SPREADING_FACTORS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList spreadingFactors_;
  /**
   * <pre>
   * Spreading-factors.
   * </pre>
   *
   * <code>repeated uint32 spreading_factors = 2;</code>
   * @return A list containing the spreadingFactors.
   */
  @Override
  public java.util.List<Integer>
      getSpreadingFactorsList() {
    return spreadingFactors_;
  }
  /**
   * <pre>
   * Spreading-factors.
   * </pre>
   *
   * <code>repeated uint32 spreading_factors = 2;</code>
   * @return The count of spreadingFactors.
   */
  public int getSpreadingFactorsCount() {
    return spreadingFactors_.size();
  }
  /**
   * <pre>
   * Spreading-factors.
   * </pre>
   *
   * <code>repeated uint32 spreading_factors = 2;</code>
   * @param index The index of the element to return.
   * @return The spreadingFactors at the given index.
   */
  public int getSpreadingFactors(int index) {
    return spreadingFactors_.getInt(index);
  }
  private int spreadingFactorsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (bandwidthLegacy_ != 0) {
      output.writeUInt32(1, bandwidthLegacy_);
    }
    if (getSpreadingFactorsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(spreadingFactorsMemoizedSerializedSize);
    }
    for (int i = 0; i < spreadingFactors_.size(); i++) {
      output.writeUInt32NoTag(spreadingFactors_.getInt(i));
    }
    if (bandwidth_ != 0) {
      output.writeUInt32(3, bandwidth_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bandwidthLegacy_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, bandwidthLegacy_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < spreadingFactors_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(spreadingFactors_.getInt(i));
      }
      size += dataSize;
      if (!getSpreadingFactorsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      spreadingFactorsMemoizedSerializedSize = dataSize;
    }
    if (bandwidth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, bandwidth_);
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
    if (!(obj instanceof LoraModulationConfig)) {
      return super.equals(obj);
    }
    LoraModulationConfig other = (LoraModulationConfig) obj;

    if (getBandwidthLegacy()
        != other.getBandwidthLegacy()) return false;
    if (getBandwidth()
        != other.getBandwidth()) return false;
    if (!getSpreadingFactorsList()
        .equals(other.getSpreadingFactorsList())) return false;
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
    hash = (37 * hash) + BANDWIDTH_LEGACY_FIELD_NUMBER;
    hash = (53 * hash) + getBandwidthLegacy();
    hash = (37 * hash) + BANDWIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getBandwidth();
    if (getSpreadingFactorsCount() > 0) {
      hash = (37 * hash) + SPREADING_FACTORS_FIELD_NUMBER;
      hash = (53 * hash) + getSpreadingFactorsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static LoraModulationConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LoraModulationConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LoraModulationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LoraModulationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LoraModulationConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static LoraModulationConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static LoraModulationConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LoraModulationConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static LoraModulationConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static LoraModulationConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static LoraModulationConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static LoraModulationConfig parseFrom(
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
  public static Builder newBuilder(LoraModulationConfig prototype) {
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
   * Protobuf type {@code gw.LoraModulationConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gw.LoraModulationConfig)
      LoraModulationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GatewayProto.internal_static_gw_LoraModulationConfig_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GatewayProto.internal_static_gw_LoraModulationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LoraModulationConfig.class, Builder.class);
    }

    // Construct using io.chirpstack.api.gw.LoraModulationConfig.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      bandwidthLegacy_ = 0;

      bandwidth_ = 0;

      spreadingFactors_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GatewayProto.internal_static_gw_LoraModulationConfig_descriptor;
    }

    @Override
    public LoraModulationConfig getDefaultInstanceForType() {
      return LoraModulationConfig.getDefaultInstance();
    }

    @Override
    public LoraModulationConfig build() {
      LoraModulationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public LoraModulationConfig buildPartial() {
      LoraModulationConfig result = new LoraModulationConfig(this);
      int from_bitField0_ = bitField0_;
      result.bandwidthLegacy_ = bandwidthLegacy_;
      result.bandwidth_ = bandwidth_;
      if (((bitField0_ & 0x00000001) != 0)) {
        spreadingFactors_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.spreadingFactors_ = spreadingFactors_;
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
      if (other instanceof LoraModulationConfig) {
        return mergeFrom((LoraModulationConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(LoraModulationConfig other) {
      if (other == LoraModulationConfig.getDefaultInstance()) return this;
      if (other.getBandwidthLegacy() != 0) {
        setBandwidthLegacy(other.getBandwidthLegacy());
      }
      if (other.getBandwidth() != 0) {
        setBandwidth(other.getBandwidth());
      }
      if (!other.spreadingFactors_.isEmpty()) {
        if (spreadingFactors_.isEmpty()) {
          spreadingFactors_ = other.spreadingFactors_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSpreadingFactorsIsMutable();
          spreadingFactors_.addAll(other.spreadingFactors_);
        }
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
              bandwidthLegacy_ = input.readUInt32();

              break;
            } // case 8
            case 16: {
              int v = input.readUInt32();
              ensureSpreadingFactorsIsMutable();
              spreadingFactors_.addInt(v);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureSpreadingFactorsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                spreadingFactors_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            } // case 18
            case 24: {
              bandwidth_ = input.readUInt32();

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
    private int bitField0_;

    private int bandwidthLegacy_ ;
    /**
     * <pre>
     * Bandwidth (kHz).
     * Deprecated: use bandwidth.
     * </pre>
     *
     * <code>uint32 bandwidth_legacy = 1;</code>
     * @return The bandwidthLegacy.
     */
    @Override
    public int getBandwidthLegacy() {
      return bandwidthLegacy_;
    }
    /**
     * <pre>
     * Bandwidth (kHz).
     * Deprecated: use bandwidth.
     * </pre>
     *
     * <code>uint32 bandwidth_legacy = 1;</code>
     * @param value The bandwidthLegacy to set.
     * @return This builder for chaining.
     */
    public Builder setBandwidthLegacy(int value) {
      
      bandwidthLegacy_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bandwidth (kHz).
     * Deprecated: use bandwidth.
     * </pre>
     *
     * <code>uint32 bandwidth_legacy = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBandwidthLegacy() {
      
      bandwidthLegacy_ = 0;
      onChanged();
      return this;
    }

    private int bandwidth_ ;
    /**
     * <pre>
     * Bandwidth (Hz).
     * </pre>
     *
     * <code>uint32 bandwidth = 3;</code>
     * @return The bandwidth.
     */
    @Override
    public int getBandwidth() {
      return bandwidth_;
    }
    /**
     * <pre>
     * Bandwidth (Hz).
     * </pre>
     *
     * <code>uint32 bandwidth = 3;</code>
     * @param value The bandwidth to set.
     * @return This builder for chaining.
     */
    public Builder setBandwidth(int value) {
      
      bandwidth_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bandwidth (Hz).
     * </pre>
     *
     * <code>uint32 bandwidth = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBandwidth() {
      
      bandwidth_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList spreadingFactors_ = emptyIntList();
    private void ensureSpreadingFactorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        spreadingFactors_ = mutableCopy(spreadingFactors_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Spreading-factors.
     * </pre>
     *
     * <code>repeated uint32 spreading_factors = 2;</code>
     * @return A list containing the spreadingFactors.
     */
    public java.util.List<Integer>
        getSpreadingFactorsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(spreadingFactors_) : spreadingFactors_;
    }
    /**
     * <pre>
     * Spreading-factors.
     * </pre>
     *
     * <code>repeated uint32 spreading_factors = 2;</code>
     * @return The count of spreadingFactors.
     */
    public int getSpreadingFactorsCount() {
      return spreadingFactors_.size();
    }
    /**
     * <pre>
     * Spreading-factors.
     * </pre>
     *
     * <code>repeated uint32 spreading_factors = 2;</code>
     * @param index The index of the element to return.
     * @return The spreadingFactors at the given index.
     */
    public int getSpreadingFactors(int index) {
      return spreadingFactors_.getInt(index);
    }
    /**
     * <pre>
     * Spreading-factors.
     * </pre>
     *
     * <code>repeated uint32 spreading_factors = 2;</code>
     * @param index The index to set the value at.
     * @param value The spreadingFactors to set.
     * @return This builder for chaining.
     */
    public Builder setSpreadingFactors(
        int index, int value) {
      ensureSpreadingFactorsIsMutable();
      spreadingFactors_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Spreading-factors.
     * </pre>
     *
     * <code>repeated uint32 spreading_factors = 2;</code>
     * @param value The spreadingFactors to add.
     * @return This builder for chaining.
     */
    public Builder addSpreadingFactors(int value) {
      ensureSpreadingFactorsIsMutable();
      spreadingFactors_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Spreading-factors.
     * </pre>
     *
     * <code>repeated uint32 spreading_factors = 2;</code>
     * @param values The spreadingFactors to add.
     * @return This builder for chaining.
     */
    public Builder addAllSpreadingFactors(
        Iterable<? extends Integer> values) {
      ensureSpreadingFactorsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, spreadingFactors_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Spreading-factors.
     * </pre>
     *
     * <code>repeated uint32 spreading_factors = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpreadingFactors() {
      spreadingFactors_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:gw.LoraModulationConfig)
  }

  // @@protoc_insertion_point(class_scope:gw.LoraModulationConfig)
  private static final LoraModulationConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new LoraModulationConfig();
  }

  public static LoraModulationConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoraModulationConfig>
      PARSER = new com.google.protobuf.AbstractParser<LoraModulationConfig>() {
    @Override
    public LoraModulationConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<LoraModulationConfig> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<LoraModulationConfig> getParserForType() {
    return PARSER;
  }

  @Override
  public LoraModulationConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

