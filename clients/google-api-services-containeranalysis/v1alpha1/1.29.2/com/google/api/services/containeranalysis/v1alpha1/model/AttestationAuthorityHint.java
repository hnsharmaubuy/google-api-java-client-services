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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * This submessage provides human-readable hints about the purpose of the AttestationAuthority.
 * Because the name of a Note acts as its resource reference, it is important to disambiguate the
 * canonical name of the Note (which might be a UUID for security purposes) from "readable" names
 * more suitable for debug output.  Note that these hints should NOT be used to look up
 * AttestationAuthorities in security sensitive contexts, such as when looking up Attestations to
 * verify.
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
public final class AttestationAuthorityHint extends com.google.api.client.json.GenericJson {

  /**
   * The human readable name of this Attestation Authority, for example "qa".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String humanReadableName;

  /**
   * The human readable name of this Attestation Authority, for example "qa".
   * @return value or {@code null} for none
   */
  public java.lang.String getHumanReadableName() {
    return humanReadableName;
  }

  /**
   * The human readable name of this Attestation Authority, for example "qa".
   * @param humanReadableName humanReadableName or {@code null} for none
   */
  public AttestationAuthorityHint setHumanReadableName(java.lang.String humanReadableName) {
    this.humanReadableName = humanReadableName;
    return this;
  }

  @Override
  public AttestationAuthorityHint set(String fieldName, Object value) {
    return (AttestationAuthorityHint) super.set(fieldName, value);
  }

  @Override
  public AttestationAuthorityHint clone() {
    return (AttestationAuthorityHint) super.clone();
  }

}
