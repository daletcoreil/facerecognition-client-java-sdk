

# Locator

Description of a file location according to the EBU FIMS specification in S3 storage.  Either httpEndpoint or (awsS3Bucker/awsS3Key) must be provided.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**awsS3Bucket** | **String** | Name of an AWS S3 bucket |  [optional]
**awsS3Key** | **String** | Name of a file in the AWS S3 bucket. For example, name of media file to be indexed in an Input Locator or name of a JSON file in an Output Locator. |  [optional]
**httpEndpoint** | **String** | Public URL to access the file in the bucket. Must be computed using the AWS SDK method &#x60;GeneratePresignedUrl&#x60; |  [optional]



