// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: meta/meta.proto

package io.chirpstack.api.meta;

public interface DownlinkMetaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:meta.DownlinkMeta)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Device EUI (EUI64).
   * </pre>
   *
   * <code>string dev_eui = 1;</code>
   * @return The devEui.
   */
  String getDevEui();
  /**
   * <pre>
   * Device EUI (EUI64).
   * </pre>
   *
   * <code>string dev_eui = 1;</code>
   * @return The bytes for devEui.
   */
  com.google.protobuf.ByteString
      getDevEuiBytes();

  /**
   * <pre>
   * Multicast Group ID (UUID).
   * </pre>
   *
   * <code>string multicast_group_id = 2;</code>
   * @return The multicastGroupId.
   */
  String getMulticastGroupId();
  /**
   * <pre>
   * Multicast Group ID (UUID).
   * </pre>
   *
   * <code>string multicast_group_id = 2;</code>
   * @return The bytes for multicastGroupId.
   */
  com.google.protobuf.ByteString
      getMulticastGroupIdBytes();

  /**
   * <pre>
   * TX meta-data.
   * </pre>
   *
   * <code>.gw.DownlinkTxInfo tx_info = 3;</code>
   * @return Whether the txInfo field is set.
   */
  boolean hasTxInfo();
  /**
   * <pre>
   * TX meta-data.
   * </pre>
   *
   * <code>.gw.DownlinkTxInfo tx_info = 3;</code>
   * @return The txInfo.
   */
  io.chirpstack.api.gw.DownlinkTxInfo getTxInfo();
  /**
   * <pre>
   * TX meta-data.
   * </pre>
   *
   * <code>.gw.DownlinkTxInfo tx_info = 3;</code>
   */
  io.chirpstack.api.gw.DownlinkTxInfoOrBuilder getTxInfoOrBuilder();

  /**
   * <pre>
   * PHYPayload byte count.
   * </pre>
   *
   * <code>uint32 phy_payload_byte_count = 4;</code>
   * @return The phyPayloadByteCount.
   */
  int getPhyPayloadByteCount();

  /**
   * <pre>
   * MAC-Command byte count.
   * </pre>
   *
   * <code>uint32 mac_command_byte_count = 5;</code>
   * @return The macCommandByteCount.
   */
  int getMacCommandByteCount();

  /**
   * <pre>
   * Application payload byte count.
   * </pre>
   *
   * <code>uint32 application_payload_byte_count = 6;</code>
   * @return The applicationPayloadByteCount.
   */
  int getApplicationPayloadByteCount();

  /**
   * <pre>
   * Message type.
   * </pre>
   *
   * <code>.common.MType message_type = 7;</code>
   * @return The enum numeric value on the wire for messageType.
   */
  int getMessageTypeValue();
  /**
   * <pre>
   * Message type.
   * </pre>
   *
   * <code>.common.MType message_type = 7;</code>
   * @return The messageType.
   */
  io.chirpstack.api.MType getMessageType();

  /**
   * <pre>
   * Gateway ID (EUI64).
   * </pre>
   *
   * <code>string gateway_id = 8;</code>
   * @return The gatewayId.
   */
  String getGatewayId();
  /**
   * <pre>
   * Gateway ID (EUI64).
   * </pre>
   *
   * <code>string gateway_id = 8;</code>
   * @return The bytes for gatewayId.
   */
  com.google.protobuf.ByteString
      getGatewayIdBytes();
}
