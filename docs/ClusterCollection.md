

# ClusterCollection

Collection of clusters within which searches can be executed
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uid** | **String** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**projectServiceId** | **String** |  |  [optional]
**jobId** | **String** | Cluster collections are initially created by a Cluster job - they can be then curated manually |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdBy** | **String** | if created by a job - jobId else name of person who created the clusterCollection |  [optional]
**modifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**modifiedBy** | **String** |  |  [optional]
**name** | **String** | descriptive name of the cluster collection |  [optional]
**clusters** | [**List&lt;Cluster&gt;**](Cluster.md) | metadata about cluster found in the ClusterCollection | 



