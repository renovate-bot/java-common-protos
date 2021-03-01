/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/backend.proto

package com.google.api;

public interface BackendRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.BackendRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   *
   * @return The selector.
   */
  java.lang.String getSelector();
  /**
   *
   *
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   *
   * @return The bytes for selector.
   */
  com.google.protobuf.ByteString getSelectorBytes();

  /**
   *
   *
   * <pre>
   * The address of the API backend.
   * The scheme is used to determine the backend protocol and security.
   * The following schemes are accepted:
   *    SCHEME        PROTOCOL    SECURITY
   *    http://       HTTP        None
   *    https://      HTTP        TLS
   *    grpc://       gRPC        None
   *    grpcs://      gRPC        TLS
   * It is recommended to explicitly include a scheme. Leaving out the scheme
   * may cause constrasting behaviors across platforms.
   * If the port is unspecified, the default is:
   * - 80 for schemes without TLS
   * - 443 for schemes with TLS
   * For HTTP backends, use [protocol][google.api.BackendRule.protocol]
   * to specify the protocol version.
   * </pre>
   *
   * <code>string address = 2;</code>
   *
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   *
   *
   * <pre>
   * The address of the API backend.
   * The scheme is used to determine the backend protocol and security.
   * The following schemes are accepted:
   *    SCHEME        PROTOCOL    SECURITY
   *    http://       HTTP        None
   *    https://      HTTP        TLS
   *    grpc://       gRPC        None
   *    grpcs://      gRPC        TLS
   * It is recommended to explicitly include a scheme. Leaving out the scheme
   * may cause constrasting behaviors across platforms.
   * If the port is unspecified, the default is:
   * - 80 for schemes without TLS
   * - 443 for schemes with TLS
   * For HTTP backends, use [protocol][google.api.BackendRule.protocol]
   * to specify the protocol version.
   * </pre>
   *
   * <code>string address = 2;</code>
   *
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString getAddressBytes();

  /**
   *
   *
   * <pre>
   * The number of seconds to wait for a response from a request. The default
   * varies based on the request protocol and deployment environment.
   * </pre>
   *
   * <code>double deadline = 3;</code>
   *
   * @return The deadline.
   */
  double getDeadline();

  /**
   *
   *
   * <pre>
   * Minimum deadline in seconds needed for this method. Calls having deadline
   * value lower than this will be rejected.
   * </pre>
   *
   * <code>double min_deadline = 4;</code>
   *
   * @return The minDeadline.
   */
  double getMinDeadline();

  /**
   *
   *
   * <pre>
   * The number of seconds to wait for the completion of a long running
   * operation. The default is no deadline.
   * </pre>
   *
   * <code>double operation_deadline = 5;</code>
   *
   * @return The operationDeadline.
   */
  double getOperationDeadline();

  /**
   * <code>.google.api.BackendRule.PathTranslation path_translation = 6;</code>
   *
   * @return The enum numeric value on the wire for pathTranslation.
   */
  int getPathTranslationValue();
  /**
   * <code>.google.api.BackendRule.PathTranslation path_translation = 6;</code>
   *
   * @return The pathTranslation.
   */
  com.google.api.BackendRule.PathTranslation getPathTranslation();

  /**
   *
   *
   * <pre>
   * The JWT audience is used when generating a JWT ID token for the backend.
   * This ID token will be added in the HTTP "authorization" header, and sent
   * to the backend.
   * </pre>
   *
   * <code>string jwt_audience = 7;</code>
   *
   * @return Whether the jwtAudience field is set.
   */
  boolean hasJwtAudience();
  /**
   *
   *
   * <pre>
   * The JWT audience is used when generating a JWT ID token for the backend.
   * This ID token will be added in the HTTP "authorization" header, and sent
   * to the backend.
   * </pre>
   *
   * <code>string jwt_audience = 7;</code>
   *
   * @return The jwtAudience.
   */
  java.lang.String getJwtAudience();
  /**
   *
   *
   * <pre>
   * The JWT audience is used when generating a JWT ID token for the backend.
   * This ID token will be added in the HTTP "authorization" header, and sent
   * to the backend.
   * </pre>
   *
   * <code>string jwt_audience = 7;</code>
   *
   * @return The bytes for jwtAudience.
   */
  com.google.protobuf.ByteString getJwtAudienceBytes();

  /**
   *
   *
   * <pre>
   * When disable_auth is true, a JWT ID token won't be generated and the
   * original "Authorization" HTTP header will be preserved. If the header is
   * used to carry the original token and is expected by the backend, this
   * field must be set to true to preserve the header.
   * </pre>
   *
   * <code>bool disable_auth = 8;</code>
   *
   * @return Whether the disableAuth field is set.
   */
  boolean hasDisableAuth();
  /**
   *
   *
   * <pre>
   * When disable_auth is true, a JWT ID token won't be generated and the
   * original "Authorization" HTTP header will be preserved. If the header is
   * used to carry the original token and is expected by the backend, this
   * field must be set to true to preserve the header.
   * </pre>
   *
   * <code>bool disable_auth = 8;</code>
   *
   * @return The disableAuth.
   */
  boolean getDisableAuth();

  /**
   *
   *
   * <pre>
   * The protocol used for sending a request to the backend.
   * The supported values are "http/1.1" and "h2".
   * The default value is inferred from the scheme in the
   * [address][google.api.BackendRule.address] field:
   *    SCHEME        PROTOCOL
   *    http://       http/1.1
   *    https://      http/1.1
   *    grpc://       h2
   *    grpcs://      h2
   * For secure HTTP backends (https://) that support HTTP/2, set this field
   * to "h2" for improved performance.
   * Configuring this field to non-default values is only supported for secure
   * HTTP backends. This field will be ignored for all other backends.
   * See
   * https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids
   * for more details on the supported values.
   * </pre>
   *
   * <code>string protocol = 9;</code>
   *
   * @return The protocol.
   */
  java.lang.String getProtocol();
  /**
   *
   *
   * <pre>
   * The protocol used for sending a request to the backend.
   * The supported values are "http/1.1" and "h2".
   * The default value is inferred from the scheme in the
   * [address][google.api.BackendRule.address] field:
   *    SCHEME        PROTOCOL
   *    http://       http/1.1
   *    https://      http/1.1
   *    grpc://       h2
   *    grpcs://      h2
   * For secure HTTP backends (https://) that support HTTP/2, set this field
   * to "h2" for improved performance.
   * Configuring this field to non-default values is only supported for secure
   * HTTP backends. This field will be ignored for all other backends.
   * See
   * https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids
   * for more details on the supported values.
   * </pre>
   *
   * <code>string protocol = 9;</code>
   *
   * @return The bytes for protocol.
   */
  com.google.protobuf.ByteString getProtocolBytes();

  public com.google.api.BackendRule.AuthenticationCase getAuthenticationCase();
}
