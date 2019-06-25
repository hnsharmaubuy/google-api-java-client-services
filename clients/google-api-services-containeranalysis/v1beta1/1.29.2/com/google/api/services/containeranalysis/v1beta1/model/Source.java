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
 * Source describes the location of the source used for the build.
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
public final class Source extends com.google.api.client.json.GenericJson {

  /**
   * If provided, some of the source code used for the build may be found in these locations, in the
   * case where the source repository had multiple remotes or submodules. This list will not include
   * the context specified in the context field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SourceContext> additionalContexts;

  /**
   * If provided, the input binary artifacts for the build came from this location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String artifactStorageSourceUri;

  /**
   * If provided, the source code used for the build came from this location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceContext context;

  /**
   * Hash(es) of the build source, which can be used to verify that the original source integrity
   * was maintained in the build.
   *
   * The keys to this map are file paths used as build source and the values contain the hash values
   * for those files.
   *
   * If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash
   * will be for the single path to that file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, FileHashes> fileHashes;

  static {
    // hack to force ProGuard to consider FileHashes used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FileHashes.class);
  }

  /**
   * If provided, some of the source code used for the build may be found in these locations, in the
   * case where the source repository had multiple remotes or submodules. This list will not include
   * the context specified in the context field.
   * @return value or {@code null} for none
   */
  public java.util.List<SourceContext> getAdditionalContexts() {
    return additionalContexts;
  }

  /**
   * If provided, some of the source code used for the build may be found in these locations, in the
   * case where the source repository had multiple remotes or submodules. This list will not include
   * the context specified in the context field.
   * @param additionalContexts additionalContexts or {@code null} for none
   */
  public Source setAdditionalContexts(java.util.List<SourceContext> additionalContexts) {
    this.additionalContexts = additionalContexts;
    return this;
  }

  /**
   * If provided, the input binary artifacts for the build came from this location.
   * @return value or {@code null} for none
   */
  public java.lang.String getArtifactStorageSourceUri() {
    return artifactStorageSourceUri;
  }

  /**
   * If provided, the input binary artifacts for the build came from this location.
   * @param artifactStorageSourceUri artifactStorageSourceUri or {@code null} for none
   */
  public Source setArtifactStorageSourceUri(java.lang.String artifactStorageSourceUri) {
    this.artifactStorageSourceUri = artifactStorageSourceUri;
    return this;
  }

  /**
   * If provided, the source code used for the build came from this location.
   * @return value or {@code null} for none
   */
  public SourceContext getContext() {
    return context;
  }

  /**
   * If provided, the source code used for the build came from this location.
   * @param context context or {@code null} for none
   */
  public Source setContext(SourceContext context) {
    this.context = context;
    return this;
  }

  /**
   * Hash(es) of the build source, which can be used to verify that the original source integrity
   * was maintained in the build.
   *
   * The keys to this map are file paths used as build source and the values contain the hash values
   * for those files.
   *
   * If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash
   * will be for the single path to that file.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, FileHashes> getFileHashes() {
    return fileHashes;
  }

  /**
   * Hash(es) of the build source, which can be used to verify that the original source integrity
   * was maintained in the build.
   *
   * The keys to this map are file paths used as build source and the values contain the hash values
   * for those files.
   *
   * If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash
   * will be for the single path to that file.
   * @param fileHashes fileHashes or {@code null} for none
   */
  public Source setFileHashes(java.util.Map<String, FileHashes> fileHashes) {
    this.fileHashes = fileHashes;
    return this;
  }

  @Override
  public Source set(String fieldName, Object value) {
    return (Source) super.set(fieldName, value);
  }

  @Override
  public Source clone() {
    return (Source) super.clone();
  }

}
