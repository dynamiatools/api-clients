/**
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

import java.util.*;
import tools.dynamia.clients.model.ActionMetadata;
import tools.dynamia.clients.model.ViewDescriptorMetadata;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EntityMetadata {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("endpoint")
  private String endpoint = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("icon")
  private String icon = null;
  @SerializedName("className")
  private String className = null;
  @SerializedName("actions")
  private List<ActionMetadata> actions = null;
  @SerializedName("descriptors")
  private List<ViewDescriptorMetadata> descriptors = null;
  @SerializedName("actionsEndpoint")
  private String actionsEndpoint = null;
  @SerializedName("viewsEndpoint")
  private String viewsEndpoint = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEndpoint() {
    return endpoint;
  }
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getIcon() {
    return icon;
  }
  public void setIcon(String icon) {
    this.icon = icon;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClassName() {
    return className;
  }
  public void setClassName(String className) {
    this.className = className;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ActionMetadata> getActions() {
    return actions;
  }
  public void setActions(List<ActionMetadata> actions) {
    this.actions = actions;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ViewDescriptorMetadata> getDescriptors() {
    return descriptors;
  }
  public void setDescriptors(List<ViewDescriptorMetadata> descriptors) {
    this.descriptors = descriptors;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getActionsEndpoint() {
    return actionsEndpoint;
  }
  public void setActionsEndpoint(String actionsEndpoint) {
    this.actionsEndpoint = actionsEndpoint;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getViewsEndpoint() {
    return viewsEndpoint;
  }
  public void setViewsEndpoint(String viewsEndpoint) {
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
    return (this.id == null ? entityMetadata.id == null : this.id.equals(entityMetadata.id)) &&
        (this.name == null ? entityMetadata.name == null : this.name.equals(entityMetadata.name)) &&
        (this.endpoint == null ? entityMetadata.endpoint == null : this.endpoint.equals(entityMetadata.endpoint)) &&
        (this.description == null ? entityMetadata.description == null : this.description.equals(entityMetadata.description)) &&
        (this.icon == null ? entityMetadata.icon == null : this.icon.equals(entityMetadata.icon)) &&
        (this.className == null ? entityMetadata.className == null : this.className.equals(entityMetadata.className)) &&
        (this.actions == null ? entityMetadata.actions == null : this.actions.equals(entityMetadata.actions)) &&
        (this.descriptors == null ? entityMetadata.descriptors == null : this.descriptors.equals(entityMetadata.descriptors)) &&
        (this.actionsEndpoint == null ? entityMetadata.actionsEndpoint == null : this.actionsEndpoint.equals(entityMetadata.actionsEndpoint)) &&
        (this.viewsEndpoint == null ? entityMetadata.viewsEndpoint == null : this.viewsEndpoint.equals(entityMetadata.viewsEndpoint));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.endpoint == null ? 0: this.endpoint.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.icon == null ? 0: this.icon.hashCode());
    result = 31 * result + (this.className == null ? 0: this.className.hashCode());
    result = 31 * result + (this.actions == null ? 0: this.actions.hashCode());
    result = 31 * result + (this.descriptors == null ? 0: this.descriptors.hashCode());
    result = 31 * result + (this.actionsEndpoint == null ? 0: this.actionsEndpoint.hashCode());
    result = 31 * result + (this.viewsEndpoint == null ? 0: this.viewsEndpoint.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityMetadata {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  endpoint: ").append(endpoint).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  icon: ").append(icon).append("\n");
    sb.append("  className: ").append(className).append("\n");
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("  descriptors: ").append(descriptors).append("\n");
    sb.append("  actionsEndpoint: ").append(actionsEndpoint).append("\n");
    sb.append("  viewsEndpoint: ").append(viewsEndpoint).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
