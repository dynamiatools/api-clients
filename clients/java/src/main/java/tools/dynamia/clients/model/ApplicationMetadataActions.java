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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApplicationMetadataActions
 */
@JsonPropertyOrder({
  ApplicationMetadataActions.JSON_PROPERTY_ACTIONS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class ApplicationMetadataActions {
  public static final String JSON_PROPERTY_ACTIONS = "actions";
  @jakarta.annotation.Nullable
  private List<ActionMetadata> actions = new ArrayList<>();

  public ApplicationMetadataActions() {
  }

  public ApplicationMetadataActions actions(@jakarta.annotation.Nullable List<ActionMetadata> actions) {
    
    this.actions = actions;
    return this;
  }

  public ApplicationMetadataActions addActionsItem(ActionMetadata actionsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationMetadataActions applicationMetadataActions = (ApplicationMetadataActions) o;
    return Objects.equals(this.actions, applicationMetadataActions.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationMetadataActions {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

