// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: integration/integration.proto

package io.chirpstack.api.as.integration;

/**
 * Protobuf enum {@code integration.LogCode}
 */
public enum LogCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unknown type.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <pre>
   * Error related to the downlink payload size.
   * Usually seen when the payload exceeded the maximum allowed payload size.
   * </pre>
   *
   * <code>DOWNLINK_PAYLOAD_SIZE = 1;</code>
   */
  DOWNLINK_PAYLOAD_SIZE(1),
  /**
   * <pre>
   * Uplink codec error.
   * </pre>
   *
   * <code>UPLINK_CODEC = 2;</code>
   */
  UPLINK_CODEC(2),
  /**
   * <pre>
   * Downlink codec error.
   * </pre>
   *
   * <code>DOWNLINK_CODEC = 3;</code>
   */
  DOWNLINK_CODEC(3),
  /**
   * <pre>
   * OTAA error.
   * </pre>
   *
   * <code>OTAA = 4;</code>
   */
  OTAA(4),
  /**
   * <pre>
   * Uplink frame-counter was reset.
   * </pre>
   *
   * <code>UPLINK_F_CNT_RESET = 5;</code>
   */
  UPLINK_F_CNT_RESET(5),
  /**
   * <pre>
   * Uplink MIC error.
   * </pre>
   *
   * <code>UPLINK_MIC = 6;</code>
   */
  UPLINK_MIC(6),
  /**
   * <pre>
   * Uplink frame-counter retransmission.
   * </pre>
   *
   * <code>UPLINK_F_CNT_RETRANSMISSION = 7;</code>
   */
  UPLINK_F_CNT_RETRANSMISSION(7),
  /**
   * <pre>
   * Downlink gateway error.
   * </pre>
   *
   * <code>DOWNLINK_GATEWAY = 8;</code>
   */
  DOWNLINK_GATEWAY(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unknown type.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * Error related to the downlink payload size.
   * Usually seen when the payload exceeded the maximum allowed payload size.
   * </pre>
   *
   * <code>DOWNLINK_PAYLOAD_SIZE = 1;</code>
   */
  public static final int DOWNLINK_PAYLOAD_SIZE_VALUE = 1;
  /**
   * <pre>
   * Uplink codec error.
   * </pre>
   *
   * <code>UPLINK_CODEC = 2;</code>
   */
  public static final int UPLINK_CODEC_VALUE = 2;
  /**
   * <pre>
   * Downlink codec error.
   * </pre>
   *
   * <code>DOWNLINK_CODEC = 3;</code>
   */
  public static final int DOWNLINK_CODEC_VALUE = 3;
  /**
   * <pre>
   * OTAA error.
   * </pre>
   *
   * <code>OTAA = 4;</code>
   */
  public static final int OTAA_VALUE = 4;
  /**
   * <pre>
   * Uplink frame-counter was reset.
   * </pre>
   *
   * <code>UPLINK_F_CNT_RESET = 5;</code>
   */
  public static final int UPLINK_F_CNT_RESET_VALUE = 5;
  /**
   * <pre>
   * Uplink MIC error.
   * </pre>
   *
   * <code>UPLINK_MIC = 6;</code>
   */
  public static final int UPLINK_MIC_VALUE = 6;
  /**
   * <pre>
   * Uplink frame-counter retransmission.
   * </pre>
   *
   * <code>UPLINK_F_CNT_RETRANSMISSION = 7;</code>
   */
  public static final int UPLINK_F_CNT_RETRANSMISSION_VALUE = 7;
  /**
   * <pre>
   * Downlink gateway error.
   * </pre>
   *
   * <code>DOWNLINK_GATEWAY = 8;</code>
   */
  public static final int DOWNLINK_GATEWAY_VALUE = 8;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static LogCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LogCode forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return DOWNLINK_PAYLOAD_SIZE;
      case 2: return UPLINK_CODEC;
      case 3: return DOWNLINK_CODEC;
      case 4: return OTAA;
      case 5: return UPLINK_F_CNT_RESET;
      case 6: return UPLINK_MIC;
      case 7: return UPLINK_F_CNT_RETRANSMISSION;
      case 8: return DOWNLINK_GATEWAY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LogCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LogCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LogCode>() {
          public LogCode findValueByNumber(int number) {
            return LogCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return IntegrationProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final LogCode[] VALUES = values();

  public static LogCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LogCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:integration.LogCode)
}

