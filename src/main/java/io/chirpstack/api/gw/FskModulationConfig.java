// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gw/gw.proto

package io.chirpstack.api.gw;

/**
 * Protobuf type {@code gw.FskModulationConfig}
 */
public final class FskModulationConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gw.FskModulationConfig)
    FskModulationConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FskModulationConfig.newBuilder() to construct.
  private FskModulationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FskModulationConfig() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new FskModulationConfig();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GatewayProto.internal_static_gw_FskModulationConfig_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GatewayProto.internal_static_gw_FskModulationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            FskModulationConfig.class, Builder.class);
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

  public static final int BITRATE_FIELD_NUMBER = 2;
  private int bitrate_;
  /**
   * <pre>
   * Bitrate.
   * </pre>
   *
   * <code>uint32 bitrate = 2;</code>
   * @return The bitrate.
   */
  @Override
  public int getBitrate() {
    return bitrate_;
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
    if (bandwidthLegacy_ != 0) {
      output.writeUInt32(1, bandwidthLegacy_);
    }
    if (bitrate_ != 0) {
      output.writeUInt32(2, bitrate_);
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
    if (bitrate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, bitrate_);
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
    if (!(obj instanceof FskModulationConfig)) {
      return super.equals(obj);
    }
    FskModulationConfig other = (FskModulationConfig) obj;

    if (getBandwidthLegacy()
        != other.getBandwidthLegacy()) return false;
    if (getBandwidth()
        != other.getBandwidth()) return false;
    if (getBitrate()
        != other.getBitrate()) return false;
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
    hash = (37 * hash) + BITRATE_FIELD_NUMBER;
    hash = (53 * hash) + getBitrate();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static FskModulationConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FskModulationConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FskModulationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FskModulationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FskModulationConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static FskModulationConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static FskModulationConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FskModulationConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static FskModulationConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static FskModulationConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static FskModulationConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static FskModulationConfig parseFrom(
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
  public static Builder newBuilder(FskModulationConfig prototype) {
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
   * Protobuf type {@code gw.FskModulationConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gw.FskModulationConfig)
      FskModulationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GatewayProto.internal_static_gw_FskModulationConfig_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GatewayProto.internal_static_gw_FskModulationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FskModulationConfig.class, Builder.class);
    }

    // Construct using io.chirpstack.api.gw.FskModulationConfig.newBuilder()
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

      bitrate_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GatewayProto.internal_static_gw_FskModulationConfig_descriptor;
    }

    @Override
    public FskModulationConfig getDefaultInstanceForType() {
      return FskModulationConfig.getDefaultInstance();
    }

    @Override
    public FskModulationConfig build() {
      FskModulationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public FskModulationConfig buildPartial() {
      FskModulationConfig result = new FskModulationConfig(this);
      result.bandwidthLegacy_ = bandwidthLegacy_;
      result.bandwidth_ = bandwidth_;
      result.bitrate_ = bitrate_;
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
      if (other instanceof FskModulationConfig) {
        return mergeFrom((FskModulationConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(FskModulationConfig other) {
      if (other == FskModulationConfig.getDefaultInstance()) return this;
      if (other.getBandwidthLegacy() != 0) {
        setBandwidthLegacy(other.getBandwidthLegacy());
      }
      if (other.getBandwidth() != 0) {
        setBandwidth(other.getBandwidth());
      }
      if (other.getBitrate() != 0) {
        setBitrate(other.getBitrate());
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
              bitrate_ = input.readUInt32();

              break;
            } // case 16
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

    private int bitrate_ ;
    /**
     * <pre>
     * Bitrate.
     * </pre>
     *
     * <code>uint32 bitrate = 2;</code>
     * @return The bitrate.
     */
    @Override
    public int getBitrate() {
      return bitrate_;
    }
    /**
     * <pre>
     * Bitrate.
     * </pre>
     *
     * <code>uint32 bitrate = 2;</code>
     * @param value The bitrate to set.
     * @return This builder for chaining.
     */
    public Builder setBitrate(int value) {
      
      bitrate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bitrate.
     * </pre>
     *
     * <code>uint32 bitrate = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBitrate() {
      
      bitrate_ = 0;
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


    // @@protoc_insertion_point(builder_scope:gw.FskModulationConfig)
  }

  // @@protoc_insertion_point(class_scope:gw.FskModulationConfig)
  private static final FskModulationConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new FskModulationConfig();
  }

  public static FskModulationConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FskModulationConfig>
      PARSER = new com.google.protobuf.AbstractParser<FskModulationConfig>() {
    @Override
    public FskModulationConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<FskModulationConfig> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<FskModulationConfig> getParserForType() {
    return PARSER;
  }

  @Override
  public FskModulationConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

