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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * An artifact that can be deployed in some runtime.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Deployable extends com.google.api.client.json.GenericJson {

  /**
   * Required. Resource URI for the artifact being deployed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourceUri;

  /**
   * Required. Resource URI for the artifact being deployed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourceUri() {
    return resourceUri;
  }

  /**
   * Required. Resource URI for the artifact being deployed.
   * @param resourceUri resourceUri or {@code null} for none
   */
  public Deployable setResourceUri(java.util.List<java.lang.String> resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

  @Override
  public Deployable set(String fieldName, Object value) {
    return (Deployable) super.set(fieldName, value);
  }

  @Override
  public Deployable clone() {
    return (Deployable) super.clone();
  }

}
