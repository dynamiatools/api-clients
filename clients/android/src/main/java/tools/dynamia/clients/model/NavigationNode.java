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

import java.util.Map;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class NavigationNode {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("longName")
  private String longName = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("icon")
  private String icon = null;
  @SerializedName("internalPath")
  private String internalPath = null;
  @SerializedName("path")
  private String path = null;
  @SerializedName("position")
  private Double position = null;
  @SerializedName("featured")
  private Boolean featured = null;
  @SerializedName("attributes")
  private Map<String, Object> attributes = null;
  @SerializedName("file")
  private String file = null;

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
  public String getLongName() {
    return longName;
  }
  public void setLongName(String longName) {
    this.longName = longName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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
  public String getInternalPath() {
    return internalPath;
  }
  public void setInternalPath(String internalPath) {
    this.internalPath = internalPath;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPosition() {
    return position;
  }
  public void setPosition(Double position) {
    this.position = position;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFeatured() {
    return featured;
  }
  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFile() {
    return file;
  }
  public void setFile(String file) {
    this.file = file;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NavigationNode navigationNode = (NavigationNode) o;
    return (this.id == null ? navigationNode.id == null : this.id.equals(navigationNode.id)) &&
        (this.name == null ? navigationNode.name == null : this.name.equals(navigationNode.name)) &&
        (this.longName == null ? navigationNode.longName == null : this.longName.equals(navigationNode.longName)) &&
        (this.type == null ? navigationNode.type == null : this.type.equals(navigationNode.type)) &&
        (this.description == null ? navigationNode.description == null : this.description.equals(navigationNode.description)) &&
        (this.icon == null ? navigationNode.icon == null : this.icon.equals(navigationNode.icon)) &&
        (this.internalPath == null ? navigationNode.internalPath == null : this.internalPath.equals(navigationNode.internalPath)) &&
        (this.path == null ? navigationNode.path == null : this.path.equals(navigationNode.path)) &&
        (this.position == null ? navigationNode.position == null : this.position.equals(navigationNode.position)) &&
        (this.featured == null ? navigationNode.featured == null : this.featured.equals(navigationNode.featured)) &&
        (this.attributes == null ? navigationNode.attributes == null : this.attributes.equals(navigationNode.attributes)) &&
        (this.file == null ? navigationNode.file == null : this.file.equals(navigationNode.file));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.longName == null ? 0: this.longName.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.icon == null ? 0: this.icon.hashCode());
    result = 31 * result + (this.internalPath == null ? 0: this.internalPath.hashCode());
    result = 31 * result + (this.path == null ? 0: this.path.hashCode());
    result = 31 * result + (this.position == null ? 0: this.position.hashCode());
    result = 31 * result + (this.featured == null ? 0: this.featured.hashCode());
    result = 31 * result + (this.attributes == null ? 0: this.attributes.hashCode());
    result = 31 * result + (this.file == null ? 0: this.file.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NavigationNode {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  longName: ").append(longName).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  icon: ").append(icon).append("\n");
    sb.append("  internalPath: ").append(internalPath).append("\n");
    sb.append("  path: ").append(path).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  featured: ").append(featured).append("\n");
    sb.append("  attributes: ").append(attributes).append("\n");
    sb.append("  file: ").append(file).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
