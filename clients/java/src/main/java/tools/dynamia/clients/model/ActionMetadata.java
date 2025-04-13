/*
 * DynamiaTools API
 * DynamiaTools Metadata API
 *
 * The version of the OpenAPI document: 5.3.6
 * Contact: mario@dynamiasoluciones.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package tools.dynamia.clients.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ActionMetadata
 */
@JsonPropertyOrder({
  ActionMetadata.JSON_PROPERTY_ID,
  ActionMetadata.JSON_PROPERTY_NAME,
  ActionMetadata.JSON_PROPERTY_ENDPOINT,
  ActionMetadata.JSON_PROPERTY_DESCRIPTION,
  ActionMetadata.JSON_PROPERTY_ICON,
  ActionMetadata.JSON_PROPERTY_GROUP,
  ActionMetadata.JSON_PROPERTY_RENDERER,
  ActionMetadata.JSON_PROPERTY_APPLICABLE_CLASSES,
  ActionMetadata.JSON_PROPERTY_APPLICABLE_STATES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ActionMetadata {
  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  @jakarta.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  @jakarta.annotation.Nullable
  private String endpoint;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @jakarta.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_ICON = "icon";
  @jakarta.annotation.Nullable
  private String icon;

  public static final String JSON_PROPERTY_GROUP = "group";
  @jakarta.annotation.Nullable
  private String group;

  public static final String JSON_PROPERTY_RENDERER = "renderer";
  @jakarta.annotation.Nullable
  private String renderer;

  public static final String JSON_PROPERTY_APPLICABLE_CLASSES = "applicableClasses";
  @jakarta.annotation.Nullable
  private List<String> applicableClasses = new ArrayList<>();

  public static final String JSON_PROPERTY_APPLICABLE_STATES = "applicableStates";
  @jakarta.annotation.Nullable
  private List<String> applicableStates = new ArrayList<>();

  public ActionMetadata() {
  }

  public ActionMetadata id(@jakarta.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@jakarta.annotation.Nullable String id) {
    this.id = id;
  }

  public ActionMetadata name(@jakarta.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@jakarta.annotation.Nullable String name) {
    this.name = name;
  }

  public ActionMetadata endpoint(@jakarta.annotation.Nullable String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndpoint() {
    return endpoint;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpoint(@jakarta.annotation.Nullable String endpoint) {
    this.endpoint = endpoint;
  }

  public ActionMetadata description(@jakarta.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@jakarta.annotation.Nullable String description) {
    this.description = description;
  }

  public ActionMetadata icon(@jakarta.annotation.Nullable String icon) {
    
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIcon() {
    return icon;
  }


  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcon(@jakarta.annotation.Nullable String icon) {
    this.icon = icon;
  }

  public ActionMetadata group(@jakarta.annotation.Nullable String group) {
    
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroup(@jakarta.annotation.Nullable String group) {
    this.group = group;
  }

  public ActionMetadata renderer(@jakarta.annotation.Nullable String renderer) {
    
    this.renderer = renderer;
    return this;
  }

  /**
   * Get renderer
   * @return renderer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RENDERER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRenderer() {
    return renderer;
  }


  @JsonProperty(JSON_PROPERTY_RENDERER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRenderer(@jakarta.annotation.Nullable String renderer) {
    this.renderer = renderer;
  }

  public ActionMetadata applicableClasses(@jakarta.annotation.Nullable List<String> applicableClasses) {
    
    this.applicableClasses = applicableClasses;
    return this;
  }

  public ActionMetadata addApplicableClassesItem(String applicableClassesItem) {
    if (this.applicableClasses == null) {
      this.applicableClasses = new ArrayList<>();
    }
    this.applicableClasses.add(applicableClassesItem);
    return this;
  }

  /**
   * Get applicableClasses
   * @return applicableClasses
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICABLE_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getApplicableClasses() {
    return applicableClasses;
  }


  @JsonProperty(JSON_PROPERTY_APPLICABLE_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicableClasses(@jakarta.annotation.Nullable List<String> applicableClasses) {
    this.applicableClasses = applicableClasses;
  }

  public ActionMetadata applicableStates(@jakarta.annotation.Nullable List<String> applicableStates) {
    
    this.applicableStates = applicableStates;
    return this;
  }

  public ActionMetadata addApplicableStatesItem(String applicableStatesItem) {
    if (this.applicableStates == null) {
      this.applicableStates = new ArrayList<>();
    }
    this.applicableStates.add(applicableStatesItem);
    return this;
  }

  /**
   * Get applicableStates
   * @return applicableStates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICABLE_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getApplicableStates() {
    return applicableStates;
  }


  @JsonProperty(JSON_PROPERTY_APPLICABLE_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicableStates(@jakarta.annotation.Nullable List<String> applicableStates) {
    this.applicableStates = applicableStates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionMetadata actionMetadata = (ActionMetadata) o;
    return Objects.equals(this.id, actionMetadata.id) &&
        Objects.equals(this.name, actionMetadata.name) &&
        Objects.equals(this.endpoint, actionMetadata.endpoint) &&
        Objects.equals(this.description, actionMetadata.description) &&
        Objects.equals(this.icon, actionMetadata.icon) &&
        Objects.equals(this.group, actionMetadata.group) &&
        Objects.equals(this.renderer, actionMetadata.renderer) &&
        Objects.equals(this.applicableClasses, actionMetadata.applicableClasses) &&
        Objects.equals(this.applicableStates, actionMetadata.applicableStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, endpoint, description, icon, group, renderer, applicableClasses, applicableStates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionMetadata {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    renderer: ").append(toIndentedString(renderer)).append("\n");
    sb.append("    applicableClasses: ").append(toIndentedString(applicableClasses)).append("\n");
    sb.append("    applicableStates: ").append(toIndentedString(applicableStates)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

