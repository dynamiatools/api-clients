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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ViewDescriptorMetadata
 */
@JsonPropertyOrder({
  ViewDescriptorMetadata.JSON_PROPERTY_ID,
  ViewDescriptorMetadata.JSON_PROPERTY_NAME,
  ViewDescriptorMetadata.JSON_PROPERTY_ENDPOINT,
  ViewDescriptorMetadata.JSON_PROPERTY_DESCRIPTION,
  ViewDescriptorMetadata.JSON_PROPERTY_ICON,
  ViewDescriptorMetadata.JSON_PROPERTY_VIEW,
  ViewDescriptorMetadata.JSON_PROPERTY_DEVICE,
  ViewDescriptorMetadata.JSON_PROPERTY_BEAN_CLASS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ViewDescriptorMetadata {
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

  public static final String JSON_PROPERTY_VIEW = "view";
  @jakarta.annotation.Nullable
  private String view;

  public static final String JSON_PROPERTY_DEVICE = "device";
  @jakarta.annotation.Nullable
  private String device;

  public static final String JSON_PROPERTY_BEAN_CLASS = "beanClass";
  @jakarta.annotation.Nullable
  private String beanClass;

  public ViewDescriptorMetadata() {
  }

  public ViewDescriptorMetadata id(@jakarta.annotation.Nullable String id) {
    
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

  public ViewDescriptorMetadata name(@jakarta.annotation.Nullable String name) {
    
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

  public ViewDescriptorMetadata endpoint(@jakarta.annotation.Nullable String endpoint) {
    
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

  public ViewDescriptorMetadata description(@jakarta.annotation.Nullable String description) {
    
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

  public ViewDescriptorMetadata icon(@jakarta.annotation.Nullable String icon) {
    
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

  public ViewDescriptorMetadata view(@jakarta.annotation.Nullable String view) {
    
    this.view = view;
    return this;
  }

  /**
   * Get view
   * @return view
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getView() {
    return view;
  }


  @JsonProperty(JSON_PROPERTY_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setView(@jakarta.annotation.Nullable String view) {
    this.view = view;
  }

  public ViewDescriptorMetadata device(@jakarta.annotation.Nullable String device) {
    
    this.device = device;
    return this;
  }

  /**
   * Get device
   * @return device
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDevice() {
    return device;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevice(@jakarta.annotation.Nullable String device) {
    this.device = device;
  }

  public ViewDescriptorMetadata beanClass(@jakarta.annotation.Nullable String beanClass) {
    
    this.beanClass = beanClass;
    return this;
  }

  /**
   * Get beanClass
   * @return beanClass
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEAN_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBeanClass() {
    return beanClass;
  }


  @JsonProperty(JSON_PROPERTY_BEAN_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeanClass(@jakarta.annotation.Nullable String beanClass) {
    this.beanClass = beanClass;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewDescriptorMetadata viewDescriptorMetadata = (ViewDescriptorMetadata) o;
    return Objects.equals(this.id, viewDescriptorMetadata.id) &&
        Objects.equals(this.name, viewDescriptorMetadata.name) &&
        Objects.equals(this.endpoint, viewDescriptorMetadata.endpoint) &&
        Objects.equals(this.description, viewDescriptorMetadata.description) &&
        Objects.equals(this.icon, viewDescriptorMetadata.icon) &&
        Objects.equals(this.view, viewDescriptorMetadata.view) &&
        Objects.equals(this.device, viewDescriptorMetadata.device) &&
        Objects.equals(this.beanClass, viewDescriptorMetadata.beanClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, endpoint, description, icon, view, device, beanClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewDescriptorMetadata {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    beanClass: ").append(toIndentedString(beanClass)).append("\n");
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

