package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * GeneralResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-16T18:00:08.808Z")
public class GeneralResponse {
  @SerializedName("success")
  private BigDecimal success = null;

  @SerializedName("description")
  private String description = null;

  public GeneralResponse success(BigDecimal success) {
    this.success = success;
    return this;
  }

   /**
   * returns 1 if successful
   * @return success
  **/
  @ApiModelProperty(required = true, value = "returns 1 if successful")
  public BigDecimal getSuccess() {
    return success;
  }

  public void setSuccess(BigDecimal success) {
    this.success = success;
  }

  public GeneralResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * a short comment
   * @return description
  **/
  @ApiModelProperty(required = true, value = "a short comment")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralResponse generalResponse = (GeneralResponse) o;
    return Objects.equals(this.success, generalResponse.success) &&
        Objects.equals(this.description, generalResponse.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

