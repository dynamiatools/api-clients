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
import tools.dynamia.clients.model.NavigationNode;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NavigationTree
 */
@JsonPropertyOrder({
  NavigationTree.JSON_PROPERTY_NAVIGATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-13T13:27:54.300070628-05:00[America/Bogota]", comments = "Generator version: 7.12.0")
public class NavigationTree {
  public static final String JSON_PROPERTY_NAVIGATION = "navigation";
  @jakarta.annotation.Nullable
  private List<NavigationNode> navigation = new ArrayList<>();

  public NavigationTree() {
  }

  public NavigationTree navigation(@jakarta.annotation.Nullable List<NavigationNode> navigation) {
    
    this.navigation = navigation;
    return this;
  }

  public NavigationTree addNavigationItem(NavigationNode navigationItem) {
    if (this.navigation == null) {
      this.navigation = new ArrayList<>();
    }
    this.navigation.add(navigationItem);
    return this;
  }

  /**
   * Get navigation
   * @return navigation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAVIGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NavigationNode> getNavigation() {
    return navigation;
  }


  @JsonProperty(JSON_PROPERTY_NAVIGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNavigation(@jakarta.annotation.Nullable List<NavigationNode> navigation) {
    this.navigation = navigation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NavigationTree navigationTree = (NavigationTree) o;
    return Objects.equals(this.navigation, navigationTree.navigation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(navigation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NavigationTree {\n");
    sb.append("    navigation: ").append(toIndentedString(navigation)).append("\n");
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

