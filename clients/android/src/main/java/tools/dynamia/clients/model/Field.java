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
import tools.dynamia.clients.model.ActionRef;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Field {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("label")
  private String label = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("component")
  private String component = null;
  @SerializedName("params")
  private Map<String, Object> params = null;
  @SerializedName("visible")
  private Boolean visible = null;
  @SerializedName("index")
  private Integer index = null;
  @SerializedName("required")
  private Boolean required = null;
  @SerializedName("action")
  private ActionRef action = null;
  @SerializedName("icon")
  private String icon = null;
  @SerializedName("showIconOnly")
  private Boolean showIconOnly = null;
  @SerializedName("optional")
  private Boolean optional = null;
  @SerializedName("path")
  private String path = null;
  @SerializedName("variable")
  private String variable = null;
  @SerializedName("readOnly")
  private Boolean readOnly = null;
  @SerializedName("collection")
  private Boolean collection = null;
  @SerializedName("entity")
  private Boolean entity = null;
  @SerializedName("localizedDescription")
  private String localizedDescription = null;
  @SerializedName("localizedLabel")
  private String localizedLabel = null;
  @SerializedName("property")
  private Boolean property = null;
  @SerializedName("readWrite")
  private Boolean readWrite = null;
  @SerializedName("writeOnly")
  private Boolean writeOnly = null;

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
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
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
  public String getComponent() {
    return component;
  }
  public void setComponent(String component) {
    this.component = component;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getParams() {
    return params;
  }
  public void setParams(Map<String, Object> params) {
    this.params = params;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getVisible() {
    return visible;
  }
  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ActionRef getAction() {
    return action;
  }
  public void setAction(ActionRef action) {
    this.action = action;
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
  public Boolean getShowIconOnly() {
    return showIconOnly;
  }
  public void setShowIconOnly(Boolean showIconOnly) {
    this.showIconOnly = showIconOnly;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getOptional() {
    return optional;
  }
  public void setOptional(Boolean optional) {
    this.optional = optional;
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
  public String getVariable() {
    return variable;
  }
  public void setVariable(String variable) {
    this.variable = variable;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getReadOnly() {
    return readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getCollection() {
    return collection;
  }
  public void setCollection(Boolean collection) {
    this.collection = collection;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEntity() {
    return entity;
  }
  public void setEntity(Boolean entity) {
    this.entity = entity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLocalizedDescription() {
    return localizedDescription;
  }
  public void setLocalizedDescription(String localizedDescription) {
    this.localizedDescription = localizedDescription;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLocalizedLabel() {
    return localizedLabel;
  }
  public void setLocalizedLabel(String localizedLabel) {
    this.localizedLabel = localizedLabel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getProperty() {
    return property;
  }
  public void setProperty(Boolean property) {
    this.property = property;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getReadWrite() {
    return readWrite;
  }
  public void setReadWrite(Boolean readWrite) {
    this.readWrite = readWrite;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getWriteOnly() {
    return writeOnly;
  }
  public void setWriteOnly(Boolean writeOnly) {
    this.writeOnly = writeOnly;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return (this.name == null ? field.name == null : this.name.equals(field.name)) &&
        (this.label == null ? field.label == null : this.label.equals(field.label)) &&
        (this.description == null ? field.description == null : this.description.equals(field.description)) &&
        (this.component == null ? field.component == null : this.component.equals(field.component)) &&
        (this.params == null ? field.params == null : this.params.equals(field.params)) &&
        (this.visible == null ? field.visible == null : this.visible.equals(field.visible)) &&
        (this.index == null ? field.index == null : this.index.equals(field.index)) &&
        (this.required == null ? field.required == null : this.required.equals(field.required)) &&
        (this.action == null ? field.action == null : this.action.equals(field.action)) &&
        (this.icon == null ? field.icon == null : this.icon.equals(field.icon)) &&
        (this.showIconOnly == null ? field.showIconOnly == null : this.showIconOnly.equals(field.showIconOnly)) &&
        (this.optional == null ? field.optional == null : this.optional.equals(field.optional)) &&
        (this.path == null ? field.path == null : this.path.equals(field.path)) &&
        (this.variable == null ? field.variable == null : this.variable.equals(field.variable)) &&
        (this.readOnly == null ? field.readOnly == null : this.readOnly.equals(field.readOnly)) &&
        (this.collection == null ? field.collection == null : this.collection.equals(field.collection)) &&
        (this.entity == null ? field.entity == null : this.entity.equals(field.entity)) &&
        (this.localizedDescription == null ? field.localizedDescription == null : this.localizedDescription.equals(field.localizedDescription)) &&
        (this.localizedLabel == null ? field.localizedLabel == null : this.localizedLabel.equals(field.localizedLabel)) &&
        (this.property == null ? field.property == null : this.property.equals(field.property)) &&
        (this.readWrite == null ? field.readWrite == null : this.readWrite.equals(field.readWrite)) &&
        (this.writeOnly == null ? field.writeOnly == null : this.writeOnly.equals(field.writeOnly));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.label == null ? 0: this.label.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.component == null ? 0: this.component.hashCode());
    result = 31 * result + (this.params == null ? 0: this.params.hashCode());
    result = 31 * result + (this.visible == null ? 0: this.visible.hashCode());
    result = 31 * result + (this.index == null ? 0: this.index.hashCode());
    result = 31 * result + (this.required == null ? 0: this.required.hashCode());
    result = 31 * result + (this.action == null ? 0: this.action.hashCode());
    result = 31 * result + (this.icon == null ? 0: this.icon.hashCode());
    result = 31 * result + (this.showIconOnly == null ? 0: this.showIconOnly.hashCode());
    result = 31 * result + (this.optional == null ? 0: this.optional.hashCode());
    result = 31 * result + (this.path == null ? 0: this.path.hashCode());
    result = 31 * result + (this.variable == null ? 0: this.variable.hashCode());
    result = 31 * result + (this.readOnly == null ? 0: this.readOnly.hashCode());
    result = 31 * result + (this.collection == null ? 0: this.collection.hashCode());
    result = 31 * result + (this.entity == null ? 0: this.entity.hashCode());
    result = 31 * result + (this.localizedDescription == null ? 0: this.localizedDescription.hashCode());
    result = 31 * result + (this.localizedLabel == null ? 0: this.localizedLabel.hashCode());
    result = 31 * result + (this.property == null ? 0: this.property.hashCode());
    result = 31 * result + (this.readWrite == null ? 0: this.readWrite.hashCode());
    result = 31 * result + (this.writeOnly == null ? 0: this.writeOnly.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  label: ").append(label).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  component: ").append(component).append("\n");
    sb.append("  params: ").append(params).append("\n");
    sb.append("  visible: ").append(visible).append("\n");
    sb.append("  index: ").append(index).append("\n");
    sb.append("  required: ").append(required).append("\n");
    sb.append("  action: ").append(action).append("\n");
    sb.append("  icon: ").append(icon).append("\n");
    sb.append("  showIconOnly: ").append(showIconOnly).append("\n");
    sb.append("  optional: ").append(optional).append("\n");
    sb.append("  path: ").append(path).append("\n");
    sb.append("  variable: ").append(variable).append("\n");
    sb.append("  readOnly: ").append(readOnly).append("\n");
    sb.append("  collection: ").append(collection).append("\n");
    sb.append("  entity: ").append(entity).append("\n");
    sb.append("  localizedDescription: ").append(localizedDescription).append("\n");
    sb.append("  localizedLabel: ").append(localizedLabel).append("\n");
    sb.append("  property: ").append(property).append("\n");
    sb.append("  readWrite: ").append(readWrite).append("\n");
    sb.append("  writeOnly: ").append(writeOnly).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
