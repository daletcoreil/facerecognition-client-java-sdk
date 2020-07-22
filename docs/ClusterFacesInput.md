

# ClusterFacesInput

Analyze a FaceCollection and cluster faces by semantic similarity.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**faceExtractionId** | **String** | ID of a FaceCollection produced by an ExtractFaces job | 
**clusterCollectionId** | **String** | Optional field - if provided, cluster faces of the input collectionId into an existing clusterCollection, else create a new clusterCollection. |  [optional]
**minimumClusterSize** | [**java.lang.Double**](java.lang.Double.md) | Minimum number of images in a cluster.  Clusters with less candidates than this number will be filtered out. |  [optional]
**similarityThreshold** | [**java.lang.Double**](java.lang.Double.md) | Similarity threshold (from 0 to 1) over which face candidates are grouped into a cluster.  Higher value produces more smaller clusters with higher confidence. |  [optional]



