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
 * ApplicationMetadata
 */
@JsonPropertyOrder({
  ApplicationMetadata.JSON_PROPERTY_ID,
  ApplicationMetadata.JSON_PROPERTY_NAME,
  ApplicationMetadata.JSON_PROPERTY_ENDPOINT,
  ApplicationMetadata.JSON_PROPERTY_DESCRIPTION,
  ApplicationMetadata.JSON_PROPERTY_ICON,
  ApplicationMetadata.JSON_PROPERTY_TITLE,
  ApplicationMetadata.JSON_PROPERTY_VERSION,
  ApplicationMetadata.JSON_PROPERTY_LOGO,
  ApplicationMetadata.JSON_PROPERTY_TEMPLATE,
  ApplicationMetadata.JSON_PROPERTY_AUTHOR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ApplicationMetadata {
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

  public static final String JSON_PROPERTY_TITLE = "title";
  @jakarta.annotation.Nullable
  private String title;

  public static final String JSON_PROPERTY_VERSION = "version";
  @jakarta.annotation.Nullable
  private String version;

  public static final String JSON_PROPERTY_LOGO = "logo";
  @jakarta.annotation.Nullable
  private String logo;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  @jakarta.annotation.Nullable
  private String template;

  public static final String JSON_PROPERTY_AUTHOR = "author";
  @jakarta.annotation.Nullable
  private String author;

  public ApplicationMetadata() {
  }

  public ApplicationMetadata id(@jakarta.annotation.Nullable String id) {
    
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

  public ApplicationMetadata name(@jakarta.annotation.Nullable String name) {
    
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

  public ApplicationMetadata endpoint(@jakarta.annotation.Nullable String endpoint) {
    
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

  public ApplicationMetadata description(@jakarta.annotation.Nullable String description) {
    
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

  public ApplicationMetadata icon(@jakarta.annotation.Nullable String icon) {
    
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

  public ApplicationMetadata title(@jakarta.annotation.Nullable String title) {
    
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(@jakarta.annotation.Nullable String title) {
    this.title = title;
  }

  public ApplicationMetadata version(@jakarta.annotation.Nullable String version) {
    
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@jakarta.annotation.Nullable String version) {
    this.version = version;
  }

  public ApplicationMetadata logo(@jakarta.annotation.Nullable String logo) {
    
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogo() {
    return logo;
  }


  @JsonProperty(JSON_PROPERTY_LOGO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogo(@jakarta.annotation.Nullable String logo) {
    this.logo = logo;
  }

  public ApplicationMetadata template(@jakarta.annotation.Nullable String template) {
    
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTemplate() {
    return template;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplate(@jakarta.annotation.Nullable String template) {
    this.template = template;
  }

  public ApplicationMetadata author(@jakarta.annotation.Nullable String author) {
    
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthor() {
    return author;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthor(@jakarta.annotation.Nullable String author) {
    this.author = author;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationMetadata applicationMetadata = (ApplicationMetadata) o;
    return Objects.equals(this.id, applicationMetadata.id) &&
        Objects.equals(this.name, applicationMetadata.name) &&
        Objects.equals(this.endpoint, applicationMetadata.endpoint) &&
        Objects.equals(this.description, applicationMetadata.description) &&
        Objects.equals(this.icon, applicationMetadata.icon) &&
        Objects.equals(this.title, applicationMetadata.title) &&
        Objects.equals(this.version, applicationMetadata.version) &&
        Objects.equals(this.logo, applicationMetadata.logo) &&
        Objects.equals(this.template, applicationMetadata.template) &&
        Objects.equals(this.author, applicationMetadata.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, endpoint, description, icon, title, version, logo, template, author);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationMetadata {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
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

