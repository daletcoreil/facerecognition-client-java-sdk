# FaceRecognitionApi

All URIs are relative to *https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClusterCollection**](FaceRecognitionApi.md#getClusterCollection) | **GET** /face-recognition/cluster-collection/{uid} | 
[**getFace**](FaceRecognitionApi.md#getFace) | **GET** /face-recognition/face/{uid} | 
[**getFaceExtractionCollection**](FaceRecognitionApi.md#getFaceExtractionCollection) | **GET** /face-recognition/face-extraction-collection/{uid} | 


<a name="getClusterCollection"></a>
# **getClusterCollection**
> ClusterCollection getClusterCollection(projectServiceId, uid)



Retrieve metadata about clusters stored in a clusterCollection created by a ClusterFaces jobs

### Example
```java
// Import classes:
import com.dalet.mediator.facerecognition.ApiClient;
import com.dalet.mediator.facerecognition.ApiException;
import com.dalet.mediator.facerecognition.Configuration;
import com.dalet.mediator.facerecognition.auth.*;
import com.dalet.mediator.facerecognition.models.*;
import com.dalet.mediator.facerecognition.api.FaceRecognitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod");
    
    // Configure API key authorization: tokenSignature
    ApiKeyAuth tokenSignature = (ApiKeyAuth) defaultClient.getAuthentication("tokenSignature");
    tokenSignature.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenSignature.setApiKeyPrefix("Token");

    FaceRecognitionApi apiInstance = new FaceRecognitionApi(defaultClient);
    String projectServiceId = "projectServiceId_example"; // String | Project service id of the client associated to the request
    String uid = "uid_example"; // String | Cluster Collection Id
    try {
      ClusterCollection result = apiInstance.getClusterCollection(projectServiceId, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FaceRecognitionApi#getClusterCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectServiceId** | **String**| Project service id of the client associated to the request |
 **uid** | **String**| Cluster Collection Id |

### Return type

[**ClusterCollection**](ClusterCollection.md)

### Authorization

[tokenSignature](../README.md#tokenSignature)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success response |  -  |
**400** | Bad request |  -  |
**401** | Authorization request fail |  -  |
**502** | Failed request.  Reason is most likely quota violation. |  -  |

<a name="getFace"></a>
# **getFace**
> Face getFace(projectServiceId, uid)



Retrieve information for given extracted face id.

### Example
```java
// Import classes:
import com.dalet.mediator.facerecognition.ApiClient;
import com.dalet.mediator.facerecognition.ApiException;
import com.dalet.mediator.facerecognition.Configuration;
import com.dalet.mediator.facerecognition.auth.*;
import com.dalet.mediator.facerecognition.models.*;
import com.dalet.mediator.facerecognition.api.FaceRecognitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod");
    
    // Configure API key authorization: tokenSignature
    ApiKeyAuth tokenSignature = (ApiKeyAuth) defaultClient.getAuthentication("tokenSignature");
    tokenSignature.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenSignature.setApiKeyPrefix("Token");

    FaceRecognitionApi apiInstance = new FaceRecognitionApi(defaultClient);
    String projectServiceId = "projectServiceId_example"; // String | Project service id of the client associated to the request
    String uid = "uid_example"; // String | Face Id
    try {
      Face result = apiInstance.getFace(projectServiceId, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FaceRecognitionApi#getFace");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectServiceId** | **String**| Project service id of the client associated to the request |
 **uid** | **String**| Face Id |

### Return type

[**Face**](Face.md)

### Authorization

[tokenSignature](../README.md#tokenSignature)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success response |  -  |
**400** | Bad request |  -  |
**401** | Authorization request fail |  -  |
**502** | Failed request. |  -  |

<a name="getFaceExtractionCollection"></a>
# **getFaceExtractionCollection**
> FaceExtractionCollection getFaceExtractionCollection(projectServiceId, uid)



Retrieve the list of FaceIds found in a collection of faces obtained by one extraction job.

### Example
```java
// Import classes:
import com.dalet.mediator.facerecognition.ApiClient;
import com.dalet.mediator.facerecognition.ApiException;
import com.dalet.mediator.facerecognition.Configuration;
import com.dalet.mediator.facerecognition.auth.*;
import com.dalet.mediator.facerecognition.models.*;
import com.dalet.mediator.facerecognition.api.FaceRecognitionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://svi6ps1cih.execute-api.us-east-1.amazonaws.com/preprod");
    
    // Configure API key authorization: tokenSignature
    ApiKeyAuth tokenSignature = (ApiKeyAuth) defaultClient.getAuthentication("tokenSignature");
    tokenSignature.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //tokenSignature.setApiKeyPrefix("Token");

    FaceRecognitionApi apiInstance = new FaceRecognitionApi(defaultClient);
    String projectServiceId = "projectServiceId_example"; // String | Project service id of the client associated to the request
    String uid = "uid_example"; // String | Face Collection Extraction Id
    try {
      FaceExtractionCollection result = apiInstance.getFaceExtractionCollection(projectServiceId, uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FaceRecognitionApi#getFaceExtractionCollection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectServiceId** | **String**| Project service id of the client associated to the request |
 **uid** | **String**| Face Collection Extraction Id |

### Return type

[**FaceExtractionCollection**](FaceExtractionCollection.md)

### Authorization

[tokenSignature](../README.md#tokenSignature)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success response |  -  |
**400** | Bad request |  -  |
**401** | Authorization request fail |  -  |
**502** | Failed request.  Reason is most likely quota violation. |  -  |

