# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        String id = "id_example"; // String | collection id
        try {
            GeneralResponse result = apiInstance.delCollection(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#delCollection");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/alonecuzzo/LocationKit/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**delCollection**](docs/DefaultApi.md#delCollection) | **DELETE** /collection/{id} | 
*DefaultApi* | [**delLocation**](docs/DefaultApi.md#delLocation) | **DELETE** /location/{id} | 
*DefaultApi* | [**getAllCollections**](docs/DefaultApi.md#getAllCollections) | **GET** /collection | 
*DefaultApi* | [**getAllLocations**](docs/DefaultApi.md#getAllLocations) | **GET** /location | 
*DefaultApi* | [**getOneCollection**](docs/DefaultApi.md#getOneCollection) | **GET** /collection/{id} | 
*DefaultApi* | [**getOneLocation**](docs/DefaultApi.md#getOneLocation) | **GET** /location/{id} | 
*DefaultApi* | [**saveCollection**](docs/DefaultApi.md#saveCollection) | **POST** /collection | 
*DefaultApi* | [**saveLocation**](docs/DefaultApi.md#saveLocation) | **POST** /location | 
*DefaultApi* | [**updateCollection**](docs/DefaultApi.md#updateCollection) | **PUT** /collection/{id} | 
*DefaultApi* | [**updateLocation**](docs/DefaultApi.md#updateLocation) | **PUT** /location/{id} | 


## Documentation for Models

 - [Collection](docs/Collection.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [GeneralResponse](docs/GeneralResponse.md)
 - [GetCollectionResponse](docs/GetCollectionResponse.md)
 - [GetCollectionsListResponse](docs/GetCollectionsListResponse.md)
 - [GetLocationResponse](docs/GetLocationResponse.md)
 - [GetLocationsListResponse](docs/GetLocationsListResponse.md)
 - [Location](docs/Location.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



