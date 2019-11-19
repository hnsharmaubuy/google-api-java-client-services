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

package com.google.api.services.dataproc.model;

/**
 * A Cloud Dataproc job for running Apache SparkR (https://spark.apache.org/docs/latest/sparkr.html)
 * applications on YARN.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SparkRJob extends com.google.api.client.json.GenericJson {

  /**
   * Optional. HCFS URIs of archives to be extracted in the working directory of Spark drivers and
   * tasks. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> archiveUris;

  /**
   * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that
   * can be set as job properties, since a collision may occur that causes an incorrect job
   * submission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> args;

  /**
   * Optional. HCFS URIs of files to be copied to the working directory of R drivers and distributed
   * tasks. Useful for naively parallel tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> fileUris;

  /**
   * Optional. The runtime log config for job execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LoggingConfig loggingConfig;

  /**
   * Required. The HCFS URI of the main R file to use as the driver. Must be a .R file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mainRFileUri;

  /**
   * Optional. A mapping of property names to values, used to configure SparkR. Properties that
   * conflict with values set by the Cloud Dataproc API may be overwritten. Can include properties
   * set in /etc/spark/conf/spark-defaults.conf and classes in user code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> properties;

  /**
   * Optional. HCFS URIs of archives to be extracted in the working directory of Spark drivers and
   * tasks. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getArchiveUris() {
    return archiveUris;
  }

  /**
   * Optional. HCFS URIs of archives to be extracted in the working directory of Spark drivers and
   * tasks. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
   * @param archiveUris archiveUris or {@code null} for none
   */
  public SparkRJob setArchiveUris(java.util.List<java.lang.String> archiveUris) {
    this.archiveUris = archiveUris;
    return this;
  }

  /**
   * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that
   * can be set as job properties, since a collision may occur that causes an incorrect job
   * submission.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getArgs() {
    return args;
  }

  /**
   * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that
   * can be set as job properties, since a collision may occur that causes an incorrect job
   * submission.
   * @param args args or {@code null} for none
   */
  public SparkRJob setArgs(java.util.List<java.lang.String> args) {
    this.args = args;
    return this;
  }

  /**
   * Optional. HCFS URIs of files to be copied to the working directory of R drivers and distributed
   * tasks. Useful for naively parallel tasks.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFileUris() {
    return fileUris;
  }

  /**
   * Optional. HCFS URIs of files to be copied to the working directory of R drivers and distributed
   * tasks. Useful for naively parallel tasks.
   * @param fileUris fileUris or {@code null} for none
   */
  public SparkRJob setFileUris(java.util.List<java.lang.String> fileUris) {
    this.fileUris = fileUris;
    return this;
  }

  /**
   * Optional. The runtime log config for job execution.
   * @return value or {@code null} for none
   */
  public LoggingConfig getLoggingConfig() {
    return loggingConfig;
  }

  /**
   * Optional. The runtime log config for job execution.
   * @param loggingConfig loggingConfig or {@code null} for none
   */
  public SparkRJob setLoggingConfig(LoggingConfig loggingConfig) {
    this.loggingConfig = loggingConfig;
    return this;
  }

  /**
   * Required. The HCFS URI of the main R file to use as the driver. Must be a .R file.
   * @return value or {@code null} for none
   */
  public java.lang.String getMainRFileUri() {
    return mainRFileUri;
  }

  /**
   * Required. The HCFS URI of the main R file to use as the driver. Must be a .R file.
   * @param mainRFileUri mainRFileUri or {@code null} for none
   */
  public SparkRJob setMainRFileUri(java.lang.String mainRFileUri) {
    this.mainRFileUri = mainRFileUri;
    return this;
  }

  /**
   * Optional. A mapping of property names to values, used to configure SparkR. Properties that
   * conflict with values set by the Cloud Dataproc API may be overwritten. Can include properties
   * set in /etc/spark/conf/spark-defaults.conf and classes in user code.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getProperties() {
    return properties;
  }

  /**
   * Optional. A mapping of property names to values, used to configure SparkR. Properties that
   * conflict with values set by the Cloud Dataproc API may be overwritten. Can include properties
   * set in /etc/spark/conf/spark-defaults.conf and classes in user code.
   * @param properties properties or {@code null} for none
   */
  public SparkRJob setProperties(java.util.Map<String, java.lang.String> properties) {
    this.properties = properties;
    return this;
  }

  @Override
  public SparkRJob set(String fieldName, Object value) {
    return (SparkRJob) super.set(fieldName, value);
  }

  @Override
  public SparkRJob clone() {
    return (SparkRJob) super.clone();
  }

}