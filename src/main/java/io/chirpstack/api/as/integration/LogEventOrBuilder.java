// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: integration/integration.proto

package io.chirpstack.api.as.integration;

public interface LogEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:integration.LogEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 1;</code>
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   * <pre>
   * Timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 1;</code>
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <pre>
   * Timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <pre>
   * Device info.
   * </pre>
   *
   * <code>.integration.DeviceInfo device_info = 2;</code>
   * @return Whether the deviceInfo field is set.
   */
  boolean hasDeviceInfo();
  /**
   * <pre>
   * Device info.
   * </pre>
   *
   * <code>.integration.DeviceInfo device_info = 2;</code>
   * @return The deviceInfo.
   */
  DeviceInfo getDeviceInfo();
  /**
   * <pre>
   * Device info.
   * </pre>
   *
   * <code>.integration.DeviceInfo device_info = 2;</code>
   */
  DeviceInfoOrBuilder getDeviceInfoOrBuilder();

  /**
   * <pre>
   * Log level.
   * </pre>
   *
   * <code>.integration.LogLevel level = 3;</code>
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   * <pre>
   * Log level.
   * </pre>
   *
   * <code>.integration.LogLevel level = 3;</code>
   * @return The level.
   */
  LogLevel getLevel();

  /**
   * <pre>
   * Log code.
   * </pre>
   *
   * <code>.integration.LogCode code = 4;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <pre>
   * Log code.
   * </pre>
   *
   * <code>.integration.LogCode code = 4;</code>
   * @return The code.
   */
  LogCode getCode();

  /**
   * <pre>
   * Description message.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The description.
   */
  String getDescription();
  /**
   * <pre>
   * Description message.
   * </pre>
   *
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Context map.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 6;</code>
   */
  int getContextCount();
  /**
   * <pre>
   * Context map.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 6;</code>
   */
  boolean containsContext(
      String key);
  /**
   * Use {@link #getContextMap()} instead.
   */
  @Deprecated
  java.util.Map<String, String>
  getContext();
  /**
   * <pre>
   * Context map.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 6;</code>
   */
  java.util.Map<String, String>
  getContextMap();
  /**
   * <pre>
   * Context map.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 6;</code>
   */

  /* nullable */
String getContextOrDefault(
      String key,
      /* nullable */
String defaultValue);
  /**
   * <pre>
   * Context map.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context = 6;</code>
   */

  String getContextOrThrow(
      String key);
}
