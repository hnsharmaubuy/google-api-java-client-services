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

package com.google.api.services.dlp.v2.model;

/**
 * Row key for identifying a record in BigQuery table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2BigQueryKey extends com.google.api.client.json.GenericJson {

  /**
   * Absolute number of the row from the beginning of the table at the time of scanning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long rowNumber;

  /**
   * Complete BigQuery table reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2BigQueryTable tableReference;

  /**
   * Absolute number of the row from the beginning of the table at the time of scanning.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRowNumber() {
    return rowNumber;
  }

  /**
   * Absolute number of the row from the beginning of the table at the time of scanning.
   * @param rowNumber rowNumber or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryKey setRowNumber(java.lang.Long rowNumber) {
    this.rowNumber = rowNumber;
    return this;
  }

  /**
   * Complete BigQuery table reference.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryTable getTableReference() {
    return tableReference;
  }

  /**
   * Complete BigQuery table reference.
   * @param tableReference tableReference or {@code null} for none
   */
  public GooglePrivacyDlpV2BigQueryKey setTableReference(GooglePrivacyDlpV2BigQueryTable tableReference) {
    this.tableReference = tableReference;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2BigQueryKey set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2BigQueryKey) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2BigQueryKey clone() {
    return (GooglePrivacyDlpV2BigQueryKey) super.clone();
  }

}
