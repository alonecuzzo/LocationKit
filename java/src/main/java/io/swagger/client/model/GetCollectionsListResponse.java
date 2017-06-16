package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Collection;
import java.util.ArrayList;
import java.util.List;

/**
 * GetCollectionsListResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-16T18:00:17.057Z")
public class GetCollectionsListResponse {
  @SerializedName("collections")
  private List<Collection> collections = new ArrayList<Collection>();

  public GetCollectionsListResponse collections(List<Collection> collections) {
    this.collections = collections;
    return this;
  }

  public GetCollectionsListResponse addCollectionsItem(Collection collectionsItem) {
    this.collections.add(collectionsItem);
    return this;
  }

   /**
   * Get collections
   * @return collections
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Collection> getCollections() {
    return collections;
  }

  public void setCollections(List<Collection> collections) {
    this.collections = collections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCollectionsListResponse getCollectionsListResponse = (GetCollectionsListResponse) o;
    return Objects.equals(this.collections, getCollectionsListResponse.collections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collections);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCollectionsListResponse {\n");
    
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
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

