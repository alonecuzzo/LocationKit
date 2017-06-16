# DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/alonecuzzo/LocationKit/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delCollection**](DefaultApi.md#delCollection) | **DELETE** /collection/{id} | 
[**delLocation**](DefaultApi.md#delLocation) | **DELETE** /location/{id} | 
[**getAllCollections**](DefaultApi.md#getAllCollections) | **GET** /collection | 
[**getAllLocations**](DefaultApi.md#getAllLocations) | **GET** /location | 
[**getOneCollection**](DefaultApi.md#getOneCollection) | **GET** /collection/{id} | 
[**getOneLocation**](DefaultApi.md#getOneLocation) | **GET** /location/{id} | 
[**saveCollection**](DefaultApi.md#saveCollection) | **POST** /collection | 
[**saveLocation**](DefaultApi.md#saveLocation) | **POST** /location | 
[**updateCollection**](DefaultApi.md#updateCollection) | **PUT** /collection/{id} | 
[**updateLocation**](DefaultApi.md#updateLocation) | **PUT** /location/{id} | 


<a name="delCollection"></a>
# **delCollection**
> GeneralResponse delCollection(id)



delete a collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | collection id
try {
    GeneralResponse result = apiInstance.delCollection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#delCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| collection id |

### Return type

[**GeneralResponse**](GeneralResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delLocation"></a>
# **delLocation**
> GeneralResponse delLocation(id)



delete a location

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | location id
try {
    GeneralResponse result = apiInstance.delLocation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#delLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| location id |

### Return type

[**GeneralResponse**](GeneralResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllCollections"></a>
# **getAllCollections**
> GetCollectionsListResponse getAllCollections()



add a collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    GetCollectionsListResponse result = apiInstance.getAllCollections();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllCollections");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetCollectionsListResponse**](GetCollectionsListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllLocations"></a>
# **getAllLocations**
> GetLocationsListResponse getAllLocations()



get locations list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    GetLocationsListResponse result = apiInstance.getAllLocations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllLocations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetLocationsListResponse**](GetLocationsListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOneCollection"></a>
# **getOneCollection**
> GetCollectionResponse getOneCollection(id)



get a single collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | collection id
try {
    GetCollectionResponse result = apiInstance.getOneCollection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getOneCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| collection id |

### Return type

[**GetCollectionResponse**](GetCollectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOneLocation"></a>
# **getOneLocation**
> GetLocationResponse getOneLocation(id)



get a location

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    GetLocationResponse result = apiInstance.getOneLocation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getOneLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**GetLocationResponse**](GetLocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveCollection"></a>
# **saveCollection**
> GeneralResponse saveCollection(collection)



add a collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Collection collection = new Collection(); // Collection | collection that is being added
try {
    GeneralResponse result = apiInstance.saveCollection(collection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#saveCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collection** | [**Collection**](Collection.md)| collection that is being added |

### Return type

[**GeneralResponse**](GeneralResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveLocation"></a>
# **saveLocation**
> GeneralResponse saveLocation(location)



add location to the list

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Location location = new Location(); // Location | Location properties
try {
    GeneralResponse result = apiInstance.saveLocation(location);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#saveLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **location** | [**Location**](Location.md)| Location properties |

### Return type

[**GeneralResponse**](GeneralResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCollection"></a>
# **updateCollection**
> GeneralResponse updateCollection(id, collection)



update a collection

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | collection id
Collection collection = new Collection(); // Collection | collection to update
try {
    GeneralResponse result = apiInstance.updateCollection(id, collection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| collection id |
 **collection** | [**Collection**](Collection.md)| collection to update |

### Return type

[**GeneralResponse**](GeneralResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLocation"></a>
# **updateLocation**
> GeneralResponse updateLocation(id, location)



update a location

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | location id
Location location = new Location(); // Location | location data
try {
    GeneralResponse result = apiInstance.updateLocation(id, location);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| location id |
 **location** | [**Location**](Location.md)| location data |

### Return type

[**GeneralResponse**](GeneralResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

