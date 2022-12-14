// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/internal.proto

package io.chirpstack.restapi;

public interface SettingsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.SettingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * OpenId Connect settings.
   * </pre>
   *
   * <code>.api.OpenIdConnect openid_connect = 1;</code>
   * @return Whether the openidConnect field is set.
   */
  boolean hasOpenidConnect();
  /**
   * <pre>
   * OpenId Connect settings.
   * </pre>
   *
   * <code>.api.OpenIdConnect openid_connect = 1;</code>
   * @return The openidConnect.
   */
  io.chirpstack.restapi.OpenIdConnect getOpenidConnect();
  /**
   * <pre>
   * OpenId Connect settings.
   * </pre>
   *
   * <code>.api.OpenIdConnect openid_connect = 1;</code>
   */
  io.chirpstack.restapi.OpenIdConnectOrBuilder getOpenidConnectOrBuilder();
}
