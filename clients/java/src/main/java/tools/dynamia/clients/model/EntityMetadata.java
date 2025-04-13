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
import tools.dynamia.clients.model.ActionMetadata;
import tools.dynamia.clients.model.ViewDescriptorMetadata;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EntityMetadata
 */
@JsonPropertyOrder({
  EntityMetadata.JSON_PROPERTY_ID,
  EntityMetadata.JSON_PROPERTY_NAME,
  EntityMetadata.JSON_PROPERTY_ENDPOINT,
  EntityMetadata.JSON_PROPERTY_DESCRIPTION,
  EntityMetadata.JSON_PROPERTY_ICON,
  EntityMetadata.JSON_PROPERTY_CLASS_NAME,
  EntityMetadata.JSON_PROPERTY_ACTIONS,
  EntityMetadata.JSON_PROPERTY_DESCRIPTORS,
  EntityMetadata.JSON_PROPERTY_ACTIONS_ENDPOINT,
  EntityMetadata.JSON_PROPERTY_VIEWS_ENDPOINT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-13T13:21:28.528898514-05:00[America/Bogota]", comments = "Generator version: 7.12.0")
public class EntityMetadata {
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

  public static final String JSON_PROPERTY_CLASS_NAME = "className";
  @jakarta.annotation.Nullable
  private String className;

  public static final String JSON_PROPERTY_ACTIONS = "actions";
  @jakarta.annotation.Nullable
  private List<ActionMetadata> actions = new ArrayList<>();

  public static final String JSON_PROPERTY_DESCRIPTORS = "descriptors";
  @jakarta.annotation.Nullable
  private List<ViewDescriptorMetadata> descriptors = new ArrayList<>();

  public static final String JSON_PROPERTY_ACTIONS_ENDPOINT = "actionsEndpoint";
  @jakarta.annotation.Nullable
  private String actionsEndpoint;

  public static final String JSON_PROPERTY_VIEWS_ENDPOINT = "viewsEndpoint";
  @jakarta.annotation.Nullable
  private String viewsEndpoint;

  public EntityMetadata() {
  }

  public EntityMetadata id(@jakarta.annotation.Nullable String id) {
    
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

  public EntityMetadata name(@jakarta.annotation.Nullable String name) {
    
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

  public EntityMetadata endpoint(@jakarta.annotation.Nullable String endpoint) {
    
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

  public EntityMetadata description(@jakarta.annotation.Nullable String description) {
    
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

  public EntityMetadata icon(@jakarta.annotation.Nullable String icon) {
    
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

  public EntityMetadata className(@jakarta.annotation.Nullable String className) {
    
    this.className = className;
    return this;
  }

  /**
   * Get className
   * @return className
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClassName() {
    return className;
  }


  @JsonProperty(JSON_PROPERTY_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClassName(@jakarta.annotation.Nullable String className) {
    this.className = className;
  }

  public EntityMetadata actions(@jakarta.annotation.Nullable List<ActionMetadata> actions) {
    
    this.actions = actions;
    return this;
  }

  public EntityMetadata addActionsItem(ActionMetadata actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   * @return actions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ActionMetadata> getActions() {
    return actions;
  }


  @JsonProperty(JSON_PROPERTY_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActions(@jakarta.annotation.Nullable List<ActionMetadata> actions) {
    this.actions = actions;
  }

  public EntityMetadata descriptors(@jakarta.annotation.Nullable List<ViewDescriptorMetadata> descriptors) {
    
    this.descriptors = descriptors;
    return this;
  }

  public EntityMetadata addDescriptorsItem(ViewDescriptorMetadata descriptorsItem) {
    if (this.descriptors == null) {
      this.descriptors = new ArrayList<>();
    }
    this.descriptors.add(descriptorsItem);
    return this;
  }

  /**
   * Get descriptors
   * @return descriptors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ViewDescriptorMetadata> getDescriptors() {
    return descriptors;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescriptors(@jakarta.annotation.Nullable List<ViewDescriptorMetadata> descriptors) {
    this.descriptors = descriptors;
  }

  public EntityMetadata actionsEndpoint(@jakarta.annotation.Nullable String actionsEndpoint) {
    
    this.actionsEndpoint = actionsEndpoint;
    return this;
  }

  /**
   * Get actionsEndpoint
   * @return actionsEndpoint
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIONS_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionsEndpoint() {
    return actionsEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_ACTIONS_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionsEndpoint(@jakarta.annotation.Nullable String actionsEndpoint) {
    this.actionsEndpoint = actionsEndpoint;
  }

  public EntityMetadata viewsEndpoint(@jakarta.annotation.Nullable String viewsEndpoint) {
    
    this.viewsEndpoint = viewsEndpoint;
    return this;
  }

  /**
   * Get viewsEndpoint
   * @return viewsEndpoint
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEWS_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getViewsEndpoint() {
    return viewsEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_VIEWS_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewsEndpoint(@jakarta.annotation.Nullable String viewsEndpoint) {
    this.viewsEndpoint = viewsEndpoint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityMetadata entityMetadata = (EntityMetadata) o;
    return Objects.equals(this.id, entityMetadata.id) &&
        Objects.equals(this.name, entityMetadata.name) &&
        Objects.equals(this.endpoint, entityMetadata.endpoint) &&
        Objects.equals(this.description, entityMetadata.description) &&
        Objects.equals(this.icon, entityMetadata.icon) &&
        Objects.equals(this.className, entityMetadata.className) &&
        Objects.equals(this.actions, entityMetadata.actions) &&
        Objects.equals(this.descriptors, entityMetadata.descriptors) &&
        Objects.equals(this.actionsEndpoint, entityMetadata.actionsEndpoint) &&
        Objects.equals(this.viewsEndpoint, entityMetadata.viewsEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, endpoint, description, icon, className, actions, descriptors, actionsEndpoint, viewsEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityMetadata {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    descriptors: ").append(toIndentedString(descriptors)).append("\n");
    sb.append("    actionsEndpoint: ").append(toIndentedString(actionsEndpoint)).append("\n");
    sb.append("    viewsEndpoint: ").append(toIndentedString(viewsEndpoint)).append("\n");
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

