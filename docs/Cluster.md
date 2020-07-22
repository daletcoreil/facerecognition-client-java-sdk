

# Cluster

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uid** | **String** | Unique ID to retrieve the content of a cluster or its metadata | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**jobId** | **String** | Clustering job which created this cluster |  [optional]
**identity** | **String** | Name of person recognized in cluster |  [optional]
**identifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the identity was associated to the cluster. |  [optional]
**identifiedBy** | **String** | Who set the identity - automatic/person. |  [optional]
**curatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When verified manually |  [optional]
**curatedBy** | **String** | Who verified manually. |  [optional]
**faceIds** | **List&lt;String&gt;** | UIDs of the faces in the collection |  [optional]



