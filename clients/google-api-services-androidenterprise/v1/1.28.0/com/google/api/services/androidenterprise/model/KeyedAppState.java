/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.androidenterprise.model;

/**
 * Represents a keyed app state containing a key, timestamp, severity level, optional description,
 * and optional data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KeyedAppState extends com.google.api.client.json.GenericJson {

  /**
   * Additional field intended for machine-readable data. For example, a number or JSON object. To
   * prevent XSS, we recommend removing any HTML from the data before displaying it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String data;

  /**
   * Key indicating what the app is providing a state for. The content of the key is set by the
   * app's developer. To prevent XSS, we recommend removing any HTML from the key before displaying
   * it. This field will always be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Free-form, human-readable message describing the app state. For example, an error message. To
   * prevent XSS, we recommend removing any HTML from the message before displaying it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * Severity of the app state. This field will always be present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * Timestamp of when the app set the state in milliseconds since epoch. This field will always be
   * present.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long stateTimestampMillis;

  /**
   * Additional field intended for machine-readable data. For example, a number or JSON object. To
   * prevent XSS, we recommend removing any HTML from the data before displaying it.
   * @return value or {@code null} for none
   */
  public java.lang.String getData() {
    return data;
  }

  /**
   * Additional field intended for machine-readable data. For example, a number or JSON object. To
   * prevent XSS, we recommend removing any HTML from the data before displaying it.
   * @param data data or {@code null} for none
   */
  public KeyedAppState setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  /**
   * Key indicating what the app is providing a state for. The content of the key is set by the
   * app's developer. To prevent XSS, we recommend removing any HTML from the key before displaying
   * it. This field will always be present.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Key indicating what the app is providing a state for. The content of the key is set by the
   * app's developer. To prevent XSS, we recommend removing any HTML from the key before displaying
   * it. This field will always be present.
   * @param key key or {@code null} for none
   */
  public KeyedAppState setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Free-form, human-readable message describing the app state. For example, an error message. To
   * prevent XSS, we recommend removing any HTML from the message before displaying it.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Free-form, human-readable message describing the app state. For example, an error message. To
   * prevent XSS, we recommend removing any HTML from the message before displaying it.
   * @param message message or {@code null} for none
   */
  public KeyedAppState setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * Severity of the app state. This field will always be present.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * Severity of the app state. This field will always be present.
   * @param severity severity or {@code null} for none
   */
  public KeyedAppState setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Timestamp of when the app set the state in milliseconds since epoch. This field will always be
   * present.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStateTimestampMillis() {
    return stateTimestampMillis;
  }

  /**
   * Timestamp of when the app set the state in milliseconds since epoch. This field will always be
   * present.
   * @param stateTimestampMillis stateTimestampMillis or {@code null} for none
   */
  public KeyedAppState setStateTimestampMillis(java.lang.Long stateTimestampMillis) {
    this.stateTimestampMillis = stateTimestampMillis;
    return this;
  }

  @Override
  public KeyedAppState set(String fieldName, Object value) {
    return (KeyedAppState) super.set(fieldName, value);
  }

  @Override
  public KeyedAppState clone() {
    return (KeyedAppState) super.clone();
  }

}
