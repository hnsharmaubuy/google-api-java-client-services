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

package com.google.api.services.translate.v3.model;

/**
 * Response message for ListGlossaries.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Translation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListGlossariesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of glossaries for a project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Glossary> glossaries;

  static {
    // hack to force ProGuard to consider Glossary used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Glossary.class);
  }

  /**
   * A token to retrieve a page of results. Pass this value in the
   * [ListGlossariesRequest.page_token] field in the subsequent call to `ListGlossaries` method to
   * retrieve the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of glossaries for a project.
   * @return value or {@code null} for none
   */
  public java.util.List<Glossary> getGlossaries() {
    return glossaries;
  }

  /**
   * The list of glossaries for a project.
   * @param glossaries glossaries or {@code null} for none
   */
  public ListGlossariesResponse setGlossaries(java.util.List<Glossary> glossaries) {
    this.glossaries = glossaries;
    return this;
  }

  /**
   * A token to retrieve a page of results. Pass this value in the
   * [ListGlossariesRequest.page_token] field in the subsequent call to `ListGlossaries` method to
   * retrieve the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve a page of results. Pass this value in the
   * [ListGlossariesRequest.page_token] field in the subsequent call to `ListGlossaries` method to
   * retrieve the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListGlossariesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListGlossariesResponse set(String fieldName, Object value) {
    return (ListGlossariesResponse) super.set(fieldName, value);
  }

  @Override
  public ListGlossariesResponse clone() {
    return (ListGlossariesResponse) super.clone();
  }

}