// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gw/gw.proto

package io.chirpstack.api.gw;

/**
 * Protobuf type {@code gw.ChannelConfiguration}
 */
public final class ChannelConfiguration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gw.ChannelConfiguration)
    ChannelConfigurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChannelConfiguration.newBuilder() to construct.
  private ChannelConfiguration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChannelConfiguration() {
    modulationLegacy_ = 0;
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChannelConfiguration();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return GatewayProto.internal_static_gw_ChannelConfiguration_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GatewayProto.internal_static_gw_ChannelConfiguration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ChannelConfiguration.class, Builder.class);
  }

  private int modulationConfigCase_ = 0;
  private Object modulationConfig_;
  public enum ModulationConfigCase
      implements com.google.protobuf.Internal.EnumLite,
          InternalOneOfEnum {
    LORA_MODULATION_CONFIG(3),
    FSK_MODULATION_CONFIG(4),
    MODULATIONCONFIG_NOT_SET(0);
    private final int value;
    private ModulationConfigCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static ModulationConfigCase valueOf(int value) {
      return forNumber(value);
    }

    public static ModulationConfigCase forNumber(int value) {
      switch (value) {
        case 3: return LORA_MODULATION_CONFIG;
        case 4: return FSK_MODULATION_CONFIG;
        case 0: return MODULATIONCONFIG_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ModulationConfigCase
  getModulationConfigCase() {
    return ModulationConfigCase.forNumber(
        modulationConfigCase_);
  }

  public static final int FREQUENCY_FIELD_NUMBER = 1;
  private int frequency_;
  /**
   * <pre>
   * Frequency (Hz).
   * </pre>
   *
   * <code>uint32 frequency = 1;</code>
   * @return The frequency.
   */
  @Override
  public int getFrequency() {
    return frequency_;
  }

  public static final int MODULATION_LEGACY_FIELD_NUMBER = 2;
  private int modulationLegacy_;
  /**
   * <pre>
   * Modulation (deprecated).
   * </pre>
   *
   * <code>.common.Modulation modulation_legacy = 2;</code>
   * @return The enum numeric value on the wire for modulationLegacy.
   */
  @Override public int getModulationLegacyValue() {
    return modulationLegacy_;
  }
  /**
   * <pre>
   * Modulation (deprecated).
   * </pre>
   *
   * <code>.common.Modulation modulation_legacy = 2;</code>
   * @return The modulationLegacy.
   */
  @Override public io.chirpstack.api.Modulation getModulationLegacy() {
    @SuppressWarnings("deprecation")
    io.chirpstack.api.Modulation result = io.chirpstack.api.Modulation.valueOf(modulationLegacy_);
    return result == null ? io.chirpstack.api.Modulation.UNRECOGNIZED : result;
  }

  public static final int LORA_MODULATION_CONFIG_FIELD_NUMBER = 3;
  /**
   * <pre>
   * LoRa modulation config.
   * </pre>
   *
   * <code>.gw.LoraModulationConfig lora_modulation_config = 3;</code>
   * @return Whether the loraModulationConfig field is set.
   */
  @Override
  public boolean hasLoraModulationConfig() {
    return modulationConfigCase_ == 3;
  }
  /**
   * <pre>
   * LoRa modulation config.
   * </pre>
   *
   * <code>.gw.LoraModulationConfig lora_modulation_config = 3;</code>
   * @return The loraModulationConfig.
   */
  @Override
  public LoraModulationConfig getLoraModulationConfig() {
    if (modulationConfigCase_ == 3) {
       return (LoraModulationConfig) modulationConfig_;
    }
    return LoraModulationConfig.getDefaultInstance();
  }
  /**
   * <pre>
   * LoRa modulation config.
   * </pre>
   *
   * <code>.gw.LoraModulationConfig lora_modulation_config = 3;</code>
   */
  @Override
  public LoraModulationConfigOrBuilder getLoraModulationConfigOrBuilder() {
    if (modulationConfigCase_ == 3) {
       return (LoraModulationConfig) modulationConfig_;
    }
    return LoraModulationConfig.getDefaultInstance();
  }

  public static final int FSK_MODULATION_CONFIG_FIELD_NUMBER = 4;
  /**
   * <pre>
   * FSK modulation config.
   * </pre>
   *
   * <code>.gw.FskModulationConfig fsk_modulation_config = 4;</code>
   * @return Whether the fskModulationConfig field is set.
   */
  @Override
  public boolean hasFskModulationConfig() {
    return modulationConfigCase_ == 4;
  }
  /**
   * <pre>
   * FSK modulation config.
   * </pre>
   *
   * <code>.gw.FskModulationConfig fsk_modulation_config = 4;</code>
   * @return The fskModulationConfig.
   */
  @Override
  public FskModulationConfig getFskModulationConfig() {
    if (modulationConfigCase_ == 4) {
       return (FskModulationConfig) modulationConfig_;
    }
    return FskModulationConfig.getDefaultInstance();
  }
  /**
   * <pre>
   * FSK modulation config.
   * </pre>
   *
   * <code>.gw.FskModulationConfig fsk_modulation_config = 4;</code>
   */
  @Override
  public FskModulationConfigOrBuilder getFskModulationConfigOrBuilder() {
    if (modulationConfigCase_ == 4) {
       return (FskModulationConfig) modulationConfig_;
    }
    return FskModulationConfig.getDefaultInstance();
  }

  public static final int BOARD_FIELD_NUMBER = 5;
  private int board_;
  /**
   * <pre>
   * Board index.
   * </pre>
   *
   * <code>uint32 board = 5;</code>
   * @return The board.
   */
  @Override
  public int getBoard() {
    return board_;
  }

  public static final int DEMODULATOR_FIELD_NUMBER = 6;
  private int demodulator_;
  /**
   * <pre>
   * Demodulator index (of the given board).
   * </pre>
   *
   * <code>uint32 demodulator = 6;</code>
   * @return The demodulator.
   */
  @Override
  public int getDemodulator() {
    return demodulator_;
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
    if (frequency_ != 0) {
      output.writeUInt32(1, frequency_);
    }
    if (modulationLegacy_ != io.chirpstack.api.Modulation.LORA.getNumber()) {
      output.writeEnum(2, modulationLegacy_);
    }
    if (modulationConfigCase_ == 3) {
      output.writeMessage(3, (LoraModulationConfig) modulationConfig_);
    }
    if (modulationConfigCase_ == 4) {
      output.writeMessage(4, (FskModulationConfig) modulationConfig_);
    }
    if (board_ != 0) {
      output.writeUInt32(5, board_);
    }
    if (demodulator_ != 0) {
      output.writeUInt32(6, demodulator_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (frequency_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, frequency_);
    }
    if (modulationLegacy_ != io.chirpstack.api.Modulation.LORA.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, modulationLegacy_);
    }
    if (modulationConfigCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (LoraModulationConfig) modulationConfig_);
    }
    if (modulationConfigCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, (FskModulationConfig) modulationConfig_);
    }
    if (board_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, board_);
    }
    if (demodulator_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, demodulator_);
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
    if (!(obj instanceof ChannelConfiguration)) {
      return super.equals(obj);
    }
    ChannelConfiguration other = (ChannelConfiguration) obj;

    if (getFrequency()
        != other.getFrequency()) return false;
    if (modulationLegacy_ != other.modulationLegacy_) return false;
    if (getBoard()
        != other.getBoard()) return false;
    if (getDemodulator()
        != other.getDemodulator()) return false;
    if (!getModulationConfigCase().equals(other.getModulationConfigCase())) return false;
    switch (modulationConfigCase_) {
      case 3:
        if (!getLoraModulationConfig()
            .equals(other.getLoraModulationConfig())) return false;
        break;
      case 4:
        if (!getFskModulationConfig()
            .equals(other.getFskModulationConfig())) return false;
        break;
      case 0:
      default:
    }
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
    hash = (37 * hash) + FREQUENCY_FIELD_NUMBER;
    hash = (53 * hash) + getFrequency();
    hash = (37 * hash) + MODULATION_LEGACY_FIELD_NUMBER;
    hash = (53 * hash) + modulationLegacy_;
    hash = (37 * hash) + BOARD_FIELD_NUMBER;
    hash = (53 * hash) + getBoard();
    hash = (37 * hash) + DEMODULATOR_FIELD_NUMBER;
    hash = (53 * hash) + getDemodulator();
    switch (modulationConfigCase_) {
      case 3:
        hash = (37 * hash) + LORA_MODULATION_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getLoraModulationConfig().hashCode();
        break;
      case 4:
        hash = (37 * hash) + FSK_MODULATION_CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getFskModulationConfig().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ChannelConfiguration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ChannelConfiguration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ChannelConfiguration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ChannelConfiguration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ChannelConfiguration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ChannelConfiguration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ChannelConfiguration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ChannelConfiguration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ChannelConfiguration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ChannelConfiguration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ChannelConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ChannelConfiguration parseFrom(
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
  public static Builder newBuilder(ChannelConfiguration prototype) {
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
   * Protobuf type {@code gw.ChannelConfiguration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gw.ChannelConfiguration)
      ChannelConfigurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GatewayProto.internal_static_gw_ChannelConfiguration_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GatewayProto.internal_static_gw_ChannelConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ChannelConfiguration.class, Builder.class);
    }

    // Construct using io.chirpstack.api.gw.ChannelConfiguration.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      frequency_ = 0;

      modulationLegacy_ = 0;

      if (loraModulationConfigBuilder_ != null) {
        loraModulationConfigBuilder_.clear();
      }
      if (fskModulationConfigBuilder_ != null) {
        fskModulationConfigBuilder_.clear();
      }
      board_ = 0;

      demodulator_ = 0;

      modulationConfigCase_ = 0;
      modulationConfig_ = null;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GatewayProto.internal_static_gw_ChannelConfiguration_descriptor;
    }

    @Override
    public ChannelConfiguration getDefaultInstanceForType() {
      return ChannelConfiguration.getDefaultInstance();
    }

    @Override
    public ChannelConfiguration build() {
      ChannelConfiguration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ChannelConfiguration buildPartial() {
      ChannelConfiguration result = new ChannelConfiguration(this);
      result.frequency_ = frequency_;
      result.modulationLegacy_ = modulationLegacy_;
      if (modulationConfigCase_ == 3) {
        if (loraModulationConfigBuilder_ == null) {
          result.modulationConfig_ = modulationConfig_;
        } else {
          result.modulationConfig_ = loraModulationConfigBuilder_.build();
        }
      }
      if (modulationConfigCase_ == 4) {
        if (fskModulationConfigBuilder_ == null) {
          result.modulationConfig_ = modulationConfig_;
        } else {
          result.modulationConfig_ = fskModulationConfigBuilder_.build();
        }
      }
      result.board_ = board_;
      result.demodulator_ = demodulator_;
      result.modulationConfigCase_ = modulationConfigCase_;
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
      if (other instanceof ChannelConfiguration) {
        return mergeFrom((ChannelConfiguration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ChannelConfiguration other) {
      if (other == ChannelConfiguration.getDefaultInstance()) return this;
      if (other.getFrequency() != 0) {
        setFrequency(other.getFrequency());
      }
      if (other.modulationLegacy_ != 0) {
        setModulationLegacyValue(other.getModulationLegacyValue());
      }
      if (other.getBoard() != 0) {
        setBoard(other.getBoard());
      }
      if (other.getDemodulator() != 0) {
        setDemodulator(other.getDemodulator());
      }
      switch (other.getModulationConfigCase()) {
        case LORA_MODULATION_CONFIG: {
          mergeLoraModulationConfig(other.getLoraModulationConfig());
          break;
        }
        case FSK_MODULATION_CONFIG: {
          mergeFskModulationConfig(other.getFskModulationConfig());
          break;
        }
        case MODULATIONCONFIG_NOT_SET: {
          break;
        }
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
              frequency_ = input.readUInt32();

              break;
            } // case 8
            case 16: {
              modulationLegacy_ = input.readEnum();

              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getLoraModulationConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              modulationConfigCase_ = 3;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getFskModulationConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              modulationConfigCase_ = 4;
              break;
            } // case 34
            case 40: {
              board_ = input.readUInt32();

              break;
            } // case 40
            case 48: {
              demodulator_ = input.readUInt32();

              break;
            } // case 48
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
    private int modulationConfigCase_ = 0;
    private Object modulationConfig_;
    public ModulationConfigCase
        getModulationConfigCase() {
      return ModulationConfigCase.forNumber(
          modulationConfigCase_);
    }

    public Builder clearModulationConfig() {
      modulationConfigCase_ = 0;
      modulationConfig_ = null;
      onChanged();
      return this;
    }


    private int frequency_ ;
    /**
     * <pre>
     * Frequency (Hz).
     * </pre>
     *
     * <code>uint32 frequency = 1;</code>
     * @return The frequency.
     */
    @Override
    public int getFrequency() {
      return frequency_;
    }
    /**
     * <pre>
     * Frequency (Hz).
     * </pre>
     *
     * <code>uint32 frequency = 1;</code>
     * @param value The frequency to set.
     * @return This builder for chaining.
     */
    public Builder setFrequency(int value) {
      
      frequency_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Frequency (Hz).
     * </pre>
     *
     * <code>uint32 frequency = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrequency() {
      
      frequency_ = 0;
      onChanged();
      return this;
    }

    private int modulationLegacy_ = 0;
    /**
     * <pre>
     * Modulation (deprecated).
     * </pre>
     *
     * <code>.common.Modulation modulation_legacy = 2;</code>
     * @return The enum numeric value on the wire for modulationLegacy.
     */
    @Override public int getModulationLegacyValue() {
      return modulationLegacy_;
    }
    /**
     * <pre>
     * Modulation (deprecated).
     * </pre>
     *
     * <code>.common.Modulation modulation_legacy = 2;</code>
     * @param value The enum numeric value on the wire for modulationLegacy to set.
     * @return This builder for chaining.
     */
    public Builder setModulationLegacyValue(int value) {
      
      modulationLegacy_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Modulation (deprecated).
     * </pre>
     *
     * <code>.common.Modulation modulation_legacy = 2;</code>
     * @return The modulationLegacy.
     */
    @Override
    public io.chirpstack.api.Modulation getModulationLegacy() {
      @SuppressWarnings("deprecation")
      io.chirpstack.api.Modulation result = io.chirpstack.api.Modulation.valueOf(modulationLegacy_);
      return result == null ? io.chirpstack.api.Modulation.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Modulation (deprecated).
     * </pre>
     *
     * <code>.common.Modulation modulation_legacy = 2;</code>
     * @param value The modulationLegacy to set.
     * @return This builder for chaining.
     */
    public Builder setModulationLegacy(io.chirpstack.api.Modulation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      modulationLegacy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Modulation (deprecated).
     * </pre>
     *
     * <code>.common.Modulation modulation_legacy = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearModulationLegacy() {
      
      modulationLegacy_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        LoraModulationConfig, LoraModulationConfig.Builder, LoraModulationConfigOrBuilder> loraModulationConfigBuilder_;
    /**
     * <pre>
     * LoRa modulation config.
     * </pre>
     *
     * <code>.gw.LoraModulationConfig lora_modulation_config = 3;</code>
     * @return Whether the loraModulationConfig field is set.
     */
    @Override
    public boolean hasLoraModulationConfig() {
      return modulationConfigCase_ == 3;
    }
    /**
     * <pre>
     * LoRa modulation config.
     * </pre>
     *
     * <code>.gw.LoraModulationConfig lora_modulation_config = 3;</code>
     * @return The loraModulationConfig.
     */
    @Override
    public LoraModulationConfig getLoraModulationConfig() {
      if (loraModulationConfigBuilder_ == null) {
        if (modulationConfigCase_ == 3) {
          return (LoraModulationConfig) modulationConfig_;
        }
        return LoraModulationConfig.getDefaultInstance();
      } else {
        if (modulationConfigCase_ == 3) {
          return loraModulationConfigBuilder_.getMessage();
        }
        return LoraModulationConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * LoRa modulation config.
     * </pre>
     *
     * <code>.gw.LoraModulationConfig lora_modulation_config = 3;</code>
     */
    public Builder setLoraModulationConfig(LoraModulationConfig value) {
      if (loraModulationConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modulationConfig_ = value;
        onChanged();
      } else {
        loraModulationConfigBuilder_.setMessage(value);
      }
      modulationConfigCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * LoRa modulation config.
     * </pre>
     *
     * <code>.gw.LoraModulationConfig lora_modulation_config = 3;</code>
     */
    public Builder setLoraModulationConfig(
        LoraModulationConfig.Builder builderForValue) {
      if (loraModulationConfigBuilder_ == null) {
        modulationConfig_ = builderForValue.build();
        onChanged();
      } else {
        loraModulationConfigBuilder_.setMessage(builderForValue.build());
      }
      modulationConfigCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * LoRa modulation config.
     * </pre>
     *
     * <code>.gw.LoraModulationConfig lora_modulation_config = 3;</code>
     */
    public Builder mergeLoraModulationConfig(LoraModulationConfig value) {
      if (loraModulationConfigBuilder_ == null) {
        if (modulationConfigCase_ == 3 &&
            modulationConfig_ != LoraModulationConfig.getDefaultInstance()) {
          modulationConfig_ = LoraModulationConfig.newBuilder((LoraModulationConfig) modulationConfig_)
              .mergeFrom(value).buildPartial();
        } else {
          modulationConfig_ = value;
        }
        onChanged();
      } else {
        if (modulationConfigCase_ == 3) {
          loraModulationConfigBuilder_.mergeFrom(value);
        } else {
          loraModulationConfigBuilder_.setMessage(value);
        }
      }
      modulationConfigCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * LoRa modulation config.
     * </pre>
     *
     * <code>.gw.LoraModulationConfig lora_modulation_config = 3;</code>
     */
    public Builder clearLoraModulationConfig() {
      if (loraModulationConfigBuilder_ == null) {
        if (modulationConfigCase_ == 3) {
          modulationConfigCase_ = 0;
          modulationConfig_ = null;
          onChanged();
        }
      } else {
        if (modulationConfigCase_ == 3) {
          modulationConfigCase_ = 0;
          modulationConfig_ = null;
        }
        loraModulationConfigBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * LoRa modulation config.
     * </pre>
     *
     * <code>.gw.LoraModulationConfig lora_modulation_config = 3;</code>
     */
    public LoraModulationConfig.Builder getLoraModulationConfigBuilder() {
      return getLoraModulationConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * LoRa modulation config.
     * </pre>
     *
     * <code>.gw.LoraModulationConfig lora_modulation_config = 3;</code>
     */
    @Override
    public LoraModulationConfigOrBuilder getLoraModulationConfigOrBuilder() {
      if ((modulationConfigCase_ == 3) && (loraModulationConfigBuilder_ != null)) {
        return loraModulationConfigBuilder_.getMessageOrBuilder();
      } else {
        if (modulationConfigCase_ == 3) {
          return (LoraModulationConfig) modulationConfig_;
        }
        return LoraModulationConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * LoRa modulation config.
     * </pre>
     *
     * <code>.gw.LoraModulationConfig lora_modulation_config = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        LoraModulationConfig, LoraModulationConfig.Builder, LoraModulationConfigOrBuilder>
        getLoraModulationConfigFieldBuilder() {
      if (loraModulationConfigBuilder_ == null) {
        if (!(modulationConfigCase_ == 3)) {
          modulationConfig_ = LoraModulationConfig.getDefaultInstance();
        }
        loraModulationConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            LoraModulationConfig, LoraModulationConfig.Builder, LoraModulationConfigOrBuilder>(
                (LoraModulationConfig) modulationConfig_,
                getParentForChildren(),
                isClean());
        modulationConfig_ = null;
      }
      modulationConfigCase_ = 3;
      onChanged();;
      return loraModulationConfigBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        FskModulationConfig, FskModulationConfig.Builder, FskModulationConfigOrBuilder> fskModulationConfigBuilder_;
    /**
     * <pre>
     * FSK modulation config.
     * </pre>
     *
     * <code>.gw.FskModulationConfig fsk_modulation_config = 4;</code>
     * @return Whether the fskModulationConfig field is set.
     */
    @Override
    public boolean hasFskModulationConfig() {
      return modulationConfigCase_ == 4;
    }
    /**
     * <pre>
     * FSK modulation config.
     * </pre>
     *
     * <code>.gw.FskModulationConfig fsk_modulation_config = 4;</code>
     * @return The fskModulationConfig.
     */
    @Override
    public FskModulationConfig getFskModulationConfig() {
      if (fskModulationConfigBuilder_ == null) {
        if (modulationConfigCase_ == 4) {
          return (FskModulationConfig) modulationConfig_;
        }
        return FskModulationConfig.getDefaultInstance();
      } else {
        if (modulationConfigCase_ == 4) {
          return fskModulationConfigBuilder_.getMessage();
        }
        return FskModulationConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * FSK modulation config.
     * </pre>
     *
     * <code>.gw.FskModulationConfig fsk_modulation_config = 4;</code>
     */
    public Builder setFskModulationConfig(FskModulationConfig value) {
      if (fskModulationConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modulationConfig_ = value;
        onChanged();
      } else {
        fskModulationConfigBuilder_.setMessage(value);
      }
      modulationConfigCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * FSK modulation config.
     * </pre>
     *
     * <code>.gw.FskModulationConfig fsk_modulation_config = 4;</code>
     */
    public Builder setFskModulationConfig(
        FskModulationConfig.Builder builderForValue) {
      if (fskModulationConfigBuilder_ == null) {
        modulationConfig_ = builderForValue.build();
        onChanged();
      } else {
        fskModulationConfigBuilder_.setMessage(builderForValue.build());
      }
      modulationConfigCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * FSK modulation config.
     * </pre>
     *
     * <code>.gw.FskModulationConfig fsk_modulation_config = 4;</code>
     */
    public Builder mergeFskModulationConfig(FskModulationConfig value) {
      if (fskModulationConfigBuilder_ == null) {
        if (modulationConfigCase_ == 4 &&
            modulationConfig_ != FskModulationConfig.getDefaultInstance()) {
          modulationConfig_ = FskModulationConfig.newBuilder((FskModulationConfig) modulationConfig_)
              .mergeFrom(value).buildPartial();
        } else {
          modulationConfig_ = value;
        }
        onChanged();
      } else {
        if (modulationConfigCase_ == 4) {
          fskModulationConfigBuilder_.mergeFrom(value);
        } else {
          fskModulationConfigBuilder_.setMessage(value);
        }
      }
      modulationConfigCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * FSK modulation config.
     * </pre>
     *
     * <code>.gw.FskModulationConfig fsk_modulation_config = 4;</code>
     */
    public Builder clearFskModulationConfig() {
      if (fskModulationConfigBuilder_ == null) {
        if (modulationConfigCase_ == 4) {
          modulationConfigCase_ = 0;
          modulationConfig_ = null;
          onChanged();
        }
      } else {
        if (modulationConfigCase_ == 4) {
          modulationConfigCase_ = 0;
          modulationConfig_ = null;
        }
        fskModulationConfigBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * FSK modulation config.
     * </pre>
     *
     * <code>.gw.FskModulationConfig fsk_modulation_config = 4;</code>
     */
    public FskModulationConfig.Builder getFskModulationConfigBuilder() {
      return getFskModulationConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * FSK modulation config.
     * </pre>
     *
     * <code>.gw.FskModulationConfig fsk_modulation_config = 4;</code>
     */
    @Override
    public FskModulationConfigOrBuilder getFskModulationConfigOrBuilder() {
      if ((modulationConfigCase_ == 4) && (fskModulationConfigBuilder_ != null)) {
        return fskModulationConfigBuilder_.getMessageOrBuilder();
      } else {
        if (modulationConfigCase_ == 4) {
          return (FskModulationConfig) modulationConfig_;
        }
        return FskModulationConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * FSK modulation config.
     * </pre>
     *
     * <code>.gw.FskModulationConfig fsk_modulation_config = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        FskModulationConfig, FskModulationConfig.Builder, FskModulationConfigOrBuilder>
        getFskModulationConfigFieldBuilder() {
      if (fskModulationConfigBuilder_ == null) {
        if (!(modulationConfigCase_ == 4)) {
          modulationConfig_ = FskModulationConfig.getDefaultInstance();
        }
        fskModulationConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            FskModulationConfig, FskModulationConfig.Builder, FskModulationConfigOrBuilder>(
                (FskModulationConfig) modulationConfig_,
                getParentForChildren(),
                isClean());
        modulationConfig_ = null;
      }
      modulationConfigCase_ = 4;
      onChanged();;
      return fskModulationConfigBuilder_;
    }

    private int board_ ;
    /**
     * <pre>
     * Board index.
     * </pre>
     *
     * <code>uint32 board = 5;</code>
     * @return The board.
     */
    @Override
    public int getBoard() {
      return board_;
    }
    /**
     * <pre>
     * Board index.
     * </pre>
     *
     * <code>uint32 board = 5;</code>
     * @param value The board to set.
     * @return This builder for chaining.
     */
    public Builder setBoard(int value) {
      
      board_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Board index.
     * </pre>
     *
     * <code>uint32 board = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBoard() {
      
      board_ = 0;
      onChanged();
      return this;
    }

    private int demodulator_ ;
    /**
     * <pre>
     * Demodulator index (of the given board).
     * </pre>
     *
     * <code>uint32 demodulator = 6;</code>
     * @return The demodulator.
     */
    @Override
    public int getDemodulator() {
      return demodulator_;
    }
    /**
     * <pre>
     * Demodulator index (of the given board).
     * </pre>
     *
     * <code>uint32 demodulator = 6;</code>
     * @param value The demodulator to set.
     * @return This builder for chaining.
     */
    public Builder setDemodulator(int value) {
      
      demodulator_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Demodulator index (of the given board).
     * </pre>
     *
     * <code>uint32 demodulator = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDemodulator() {
      
      demodulator_ = 0;
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


    // @@protoc_insertion_point(builder_scope:gw.ChannelConfiguration)
  }

  // @@protoc_insertion_point(class_scope:gw.ChannelConfiguration)
  private static final ChannelConfiguration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ChannelConfiguration();
  }

  public static ChannelConfiguration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChannelConfiguration>
      PARSER = new com.google.protobuf.AbstractParser<ChannelConfiguration>() {
    @Override
    public ChannelConfiguration parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChannelConfiguration> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ChannelConfiguration> getParserForType() {
    return PARSER;
  }

  @Override
  public ChannelConfiguration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

