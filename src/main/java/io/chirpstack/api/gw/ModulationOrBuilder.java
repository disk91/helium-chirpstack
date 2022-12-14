// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gw/gw.proto

package io.chirpstack.api.gw;

public interface ModulationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gw.Modulation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * LoRa modulation information.
   * </pre>
   *
   * <code>.gw.LoraModulationInfo lora = 3;</code>
   * @return Whether the lora field is set.
   */
  boolean hasLora();
  /**
   * <pre>
   * LoRa modulation information.
   * </pre>
   *
   * <code>.gw.LoraModulationInfo lora = 3;</code>
   * @return The lora.
   */
  LoraModulationInfo getLora();
  /**
   * <pre>
   * LoRa modulation information.
   * </pre>
   *
   * <code>.gw.LoraModulationInfo lora = 3;</code>
   */
  LoraModulationInfoOrBuilder getLoraOrBuilder();

  /**
   * <pre>
   * FSK modulation information.
   * </pre>
   *
   * <code>.gw.FskModulationInfo fsk = 4;</code>
   * @return Whether the fsk field is set.
   */
  boolean hasFsk();
  /**
   * <pre>
   * FSK modulation information.
   * </pre>
   *
   * <code>.gw.FskModulationInfo fsk = 4;</code>
   * @return The fsk.
   */
  FskModulationInfo getFsk();
  /**
   * <pre>
   * FSK modulation information.
   * </pre>
   *
   * <code>.gw.FskModulationInfo fsk = 4;</code>
   */
  FskModulationInfoOrBuilder getFskOrBuilder();

  /**
   * <pre>
   * LR-FHSS modulation information.
   * </pre>
   *
   * <code>.gw.LrFhssModulationInfo lr_fhss = 5;</code>
   * @return Whether the lrFhss field is set.
   */
  boolean hasLrFhss();
  /**
   * <pre>
   * LR-FHSS modulation information.
   * </pre>
   *
   * <code>.gw.LrFhssModulationInfo lr_fhss = 5;</code>
   * @return The lrFhss.
   */
  LrFhssModulationInfo getLrFhss();
  /**
   * <pre>
   * LR-FHSS modulation information.
   * </pre>
   *
   * <code>.gw.LrFhssModulationInfo lr_fhss = 5;</code>
   */
  LrFhssModulationInfoOrBuilder getLrFhssOrBuilder();

  public Modulation.ParametersCase getParametersCase();
}
