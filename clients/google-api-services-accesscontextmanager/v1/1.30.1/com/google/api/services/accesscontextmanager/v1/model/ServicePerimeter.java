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

package com.google.api.services.accesscontextmanager.v1.model;

/**
 * `ServicePerimeter` describes a set of GCP resources which can freely import and export data
 * amongst themselves, but not export outside of the `ServicePerimeter`. If a request with a source
 * within this `ServicePerimeter` has a target outside of the `ServicePerimeter`, the request will
 * be blocked. Otherwise the request is allowed. There are two types of Service Perimeter - Regular
 * and Bridge. Regular Service Perimeters cannot overlap, a single GCP project can only belong to a
 * single regular Service Perimeter. Service Perimeter Bridges can contain only GCP projects as
 * members, a single GCP project may belong to multiple Service Perimeter Bridges.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Context Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServicePerimeter extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Time the `ServicePerimeter` was created in UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Description of the `ServicePerimeter` and its use. Does not affect behavior.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. Resource name for the ServicePerimeter.  The `short_name` component must begin with a
   * letter and only include alphanumeric and '_'. Format:
   * `accessPolicies/{policy_id}/servicePerimeters/{short_name}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Perimeter type indicator. A single project is allowed to be a member of single regular
   * perimeter, but multiple service perimeter bridges. A project cannot be a included in a
   * perimeter bridge without being included in regular perimeter. For perimeter bridges, the
   * restricted service list as well as access level lists must be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String perimeterType;

  /**
   * Current ServicePerimeter configuration. Specifies sets of resources, restricted services and
   * access levels that determine perimeter content and boundaries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ServicePerimeterConfig status;

  /**
   * Human readable title. Must be unique within the Policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Output only. Time the `ServicePerimeter` was updated in UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Time the `ServicePerimeter` was created in UTC.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time the `ServicePerimeter` was created in UTC.
   * @param createTime createTime or {@code null} for none
   */
  public ServicePerimeter setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Description of the `ServicePerimeter` and its use. Does not affect behavior.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the `ServicePerimeter` and its use. Does not affect behavior.
   * @param description description or {@code null} for none
   */
  public ServicePerimeter setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. Resource name for the ServicePerimeter.  The `short_name` component must begin with a
   * letter and only include alphanumeric and '_'. Format:
   * `accessPolicies/{policy_id}/servicePerimeters/{short_name}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Resource name for the ServicePerimeter.  The `short_name` component must begin with a
   * letter and only include alphanumeric and '_'. Format:
   * `accessPolicies/{policy_id}/servicePerimeters/{short_name}`
   * @param name name or {@code null} for none
   */
  public ServicePerimeter setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Perimeter type indicator. A single project is allowed to be a member of single regular
   * perimeter, but multiple service perimeter bridges. A project cannot be a included in a
   * perimeter bridge without being included in regular perimeter. For perimeter bridges, the
   * restricted service list as well as access level lists must be empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getPerimeterType() {
    return perimeterType;
  }

  /**
   * Perimeter type indicator. A single project is allowed to be a member of single regular
   * perimeter, but multiple service perimeter bridges. A project cannot be a included in a
   * perimeter bridge without being included in regular perimeter. For perimeter bridges, the
   * restricted service list as well as access level lists must be empty.
   * @param perimeterType perimeterType or {@code null} for none
   */
  public ServicePerimeter setPerimeterType(java.lang.String perimeterType) {
    this.perimeterType = perimeterType;
    return this;
  }

  /**
   * Current ServicePerimeter configuration. Specifies sets of resources, restricted services and
   * access levels that determine perimeter content and boundaries.
   * @return value or {@code null} for none
   */
  public ServicePerimeterConfig getStatus() {
    return status;
  }

  /**
   * Current ServicePerimeter configuration. Specifies sets of resources, restricted services and
   * access levels that determine perimeter content and boundaries.
   * @param status status or {@code null} for none
   */
  public ServicePerimeter setStatus(ServicePerimeterConfig status) {
    this.status = status;
    return this;
  }

  /**
   * Human readable title. Must be unique within the Policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Human readable title. Must be unique within the Policy.
   * @param title title or {@code null} for none
   */
  public ServicePerimeter setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Output only. Time the `ServicePerimeter` was updated in UTC.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time the `ServicePerimeter` was updated in UTC.
   * @param updateTime updateTime or {@code null} for none
   */
  public ServicePerimeter setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public ServicePerimeter set(String fieldName, Object value) {
    return (ServicePerimeter) super.set(fieldName, value);
  }

  @Override
  public ServicePerimeter clone() {
    return (ServicePerimeter) super.clone();
  }

}
