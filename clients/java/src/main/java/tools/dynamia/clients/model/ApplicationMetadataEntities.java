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
import tools.dynamia.clients.model.EntityMetadata;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApplicationMetadataEntities
 */
@JsonPropertyOrder({
  ApplicationMetadataEntities.JSON_PROPERTY_ENTITIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-13T13:27:54.300070628-05:00[America/Bogota]", comments = "Generator version: 7.12.0")
public class ApplicationMetadataEntities {
  public static final String JSON_PROPERTY_ENTITIES = "entities";
  @jakarta.annotation.Nullable
  private List<EntityMetadata> entities = new ArrayList<>();

  public ApplicationMetadataEntities() {
  }

  public ApplicationMetadataEntities entities(@jakarta.annotation.Nullable List<EntityMetadata> entities) {
    
    this.entities = entities;
    return this;
  }

  public ApplicationMetadataEntities addEntitiesItem(EntityMetadata entitiesItem) {
    if (this.entities == null) {
      this.entities = new ArrayList<>();
    }
    this.entities.add(entitiesItem);
    return this;
  }

  /**
   * Get entities
   * @return entities
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EntityMetadata> getEntities() {
    return entities;
  }


  @JsonProperty(JSON_PROPERTY_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntities(@jakarta.annotation.Nullable List<EntityMetadata> entities) {
    this.entities = entities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationMetadataEntities applicationMetadataEntities = (ApplicationMetadataEntities) o;
    return Objects.equals(this.entities, applicationMetadataEntities.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationMetadataEntities {\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

