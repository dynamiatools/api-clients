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
 * DataPaginator
 */
@JsonPropertyOrder({
  DataPaginator.JSON_PROPERTY_TOTAL_SIZE,
  DataPaginator.JSON_PROPERTY_PAGE_SIZE,
  DataPaginator.JSON_PROPERTY_FIRST_RESULT,
  DataPaginator.JSON_PROPERTY_PAGE,
  DataPaginator.JSON_PROPERTY_PAGES_NUMBER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-13T13:27:54.300070628-05:00[America/Bogota]", comments = "Generator version: 7.12.0")
public class DataPaginator {
  public static final String JSON_PROPERTY_TOTAL_SIZE = "totalSize";
  @jakarta.annotation.Nullable
  private Long totalSize;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  @jakarta.annotation.Nullable
  private Integer pageSize;

  public static final String JSON_PROPERTY_FIRST_RESULT = "firstResult";
  @jakarta.annotation.Nullable
  private Integer firstResult;

  public static final String JSON_PROPERTY_PAGE = "page";
  @jakarta.annotation.Nullable
  private Integer page;

  public static final String JSON_PROPERTY_PAGES_NUMBER = "pagesNumber";
  @jakarta.annotation.Nullable
  private Integer pagesNumber;

  public DataPaginator() {
  }

  public DataPaginator totalSize(@jakarta.annotation.Nullable Long totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

  /**
   * Get totalSize
   * @return totalSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalSize() {
    return totalSize;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalSize(@jakarta.annotation.Nullable Long totalSize) {
    this.totalSize = totalSize;
  }

  public DataPaginator pageSize(@jakarta.annotation.Nullable Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   * @return pageSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(@jakarta.annotation.Nullable Integer pageSize) {
    this.pageSize = pageSize;
  }

  public DataPaginator firstResult(@jakarta.annotation.Nullable Integer firstResult) {
    
    this.firstResult = firstResult;
    return this;
  }

  /**
   * Get firstResult
   * @return firstResult
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFirstResult() {
    return firstResult;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstResult(@jakarta.annotation.Nullable Integer firstResult) {
    this.firstResult = firstResult;
  }

  public DataPaginator page(@jakarta.annotation.Nullable Integer page) {
    
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPage() {
    return page;
  }


  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPage(@jakarta.annotation.Nullable Integer page) {
    this.page = page;
  }

  public DataPaginator pagesNumber(@jakarta.annotation.Nullable Integer pagesNumber) {
    
    this.pagesNumber = pagesNumber;
    return this;
  }

  /**
   * Get pagesNumber
   * @return pagesNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGES_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPagesNumber() {
    return pagesNumber;
  }


  @JsonProperty(JSON_PROPERTY_PAGES_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagesNumber(@jakarta.annotation.Nullable Integer pagesNumber) {
    this.pagesNumber = pagesNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataPaginator dataPaginator = (DataPaginator) o;
    return Objects.equals(this.totalSize, dataPaginator.totalSize) &&
        Objects.equals(this.pageSize, dataPaginator.pageSize) &&
        Objects.equals(this.firstResult, dataPaginator.firstResult) &&
        Objects.equals(this.page, dataPaginator.page) &&
        Objects.equals(this.pagesNumber, dataPaginator.pagesNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSize, pageSize, firstResult, page, pagesNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPaginator {\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    firstResult: ").append(toIndentedString(firstResult)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pagesNumber: ").append(toIndentedString(pagesNumber)).append("\n");
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

