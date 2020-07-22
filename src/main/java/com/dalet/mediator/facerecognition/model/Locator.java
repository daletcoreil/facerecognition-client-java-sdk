/*
 * Dalet Media Mediator API
 * # Scope Dalet Mediator API allows you to submit long running media jobs managed by Dalet services.  Long running media jobs include: - **Media processing** such as transcoding or automatic QC. - **Automatic metadata extraction** such as automatic speech transcription or face detection.  The Dalet Mediator API is a REST API with typed schema for the payload. # Architecture Job processing is performed on the cloud via dynamic combination of microservices. Dalet Mediator adopts the [EBU MCMA] architecture.  The key objectives of this architecture are to support: - Job management and monitoring - Long running transactions - Event based communication pattern - Service registration and discovery - Horizontal scalability in an elastic manner  The architecture is implemented using the serverless approach - relying on  independent microservices accessible through well documented REST endpoints and sharing a common object model. ## Roles The following services are involved in the processing of media jobs exposed through the Dalet Media Mediator API: - **Mediator**: this is the main entry point to the architecture; this API endpoint supports: 1. Checking authentication using an API key and a token mechanism 2. Verifying quota restrictions before accepting a submitted job 3. Keeping track of usage so that job processing can be tracked and billed 4. Keeping track of jobs metadata as a job repository - **Job Processor**: once a job request is accepted by the mediator, it is assigned to a Job Processor. The Job Processor dispatches the job to an appropriate Job Worker (depending on the job profile and other criteria such as load on the system and cost of operation).  It then keeps track of the progress of the job and its status until completion and possible failures and timeout.  It reports progress to the Mediator through notifications. - **Job Worker**: The Job Worker performs the actual work on the media object, for example, AI metadata extraction (AME) or essence transcoding.  It reports progress to the Job Processor through notifications. - **Service Registry**: The Service Registry keeps track of all active services in the architecture. It is queried by the Mediator and by Processors to discover candidate services to perform jobs.  It is updated whenever a new service is launched or stopped.  The Service Registry also stores the list of all job profiles supported by one of the Job Workers deployed in the architecture. The Dalet Mediator API abstracts away from the complexity of this orchestration and provides a simple endpoint to submit long running jobs and monitor the progress of their execution.  It serves as a facade for the additional technical services for authentication, usage monitoring and service registry.  [EBU MCMA]: /https://tech.ebu.ch/groups/mcma 'EBU MCMA' ## Job Lifecycle ![Job Lifecyle Diagram](./job_lifecycle.svg 'Job Lifecycle Diagram')  ## Authentication To use the Dalet Mediator API - you must obtain an APIKey from Dalet.  This key comes in the form of two parameters: * client ID * secret  Given these two parameters, a client program must first obtain an access token (GET /auth/access-token) and then associate this token to every subsequent calls.  When the token expires, the API will return a 401 error code.  In this case, the client must request a new token and resubmit the request. 
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: cortexsupport@dalet.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dalet.mediator.facerecognition.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Description of a file location according to the EBU FIMS specification in S3 storage.  Either httpEndpoint or (awsS3Bucker/awsS3Key) must be provided.
 */
@ApiModel(description = "Description of a file location according to the EBU FIMS specification in S3 storage.  Either httpEndpoint or (awsS3Bucker/awsS3Key) must be provided.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-22T16:35:31.447+08:00[GMT+08:00]")
public class Locator {
  public static final String SERIALIZED_NAME_AWS_S3_BUCKET = "awsS3Bucket";
  @SerializedName(SERIALIZED_NAME_AWS_S3_BUCKET)
  private String awsS3Bucket;

  public static final String SERIALIZED_NAME_AWS_S3_KEY = "awsS3Key";
  @SerializedName(SERIALIZED_NAME_AWS_S3_KEY)
  private String awsS3Key;

  public static final String SERIALIZED_NAME_HTTP_ENDPOINT = "httpEndpoint";
  @SerializedName(SERIALIZED_NAME_HTTP_ENDPOINT)
  private String httpEndpoint;


  public Locator awsS3Bucket(String awsS3Bucket) {
    
    this.awsS3Bucket = awsS3Bucket;
    return this;
  }

   /**
   * Name of an AWS S3 bucket
   * @return awsS3Bucket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dalet-AI-bucket", value = "Name of an AWS S3 bucket")

  public String getAwsS3Bucket() {
    return awsS3Bucket;
  }


  public void setAwsS3Bucket(String awsS3Bucket) {
    this.awsS3Bucket = awsS3Bucket;
  }


  public Locator awsS3Key(String awsS3Key) {
    
    this.awsS3Key = awsS3Key;
    return this;
  }

   /**
   * Name of a file in the AWS S3 bucket. For example, name of media file to be indexed in an Input Locator or name of a JSON file in an Output Locator.
   * @return awsS3Key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0000132.mp4", value = "Name of a file in the AWS S3 bucket. For example, name of media file to be indexed in an Input Locator or name of a JSON file in an Output Locator.")

  public String getAwsS3Key() {
    return awsS3Key;
  }


  public void setAwsS3Key(String awsS3Key) {
    this.awsS3Key = awsS3Key;
  }


  public Locator httpEndpoint(String httpEndpoint) {
    
    this.httpEndpoint = httpEndpoint;
    return this;
  }

   /**
   * Public URL to access the file in the bucket. Must be computed using the AWS SDK method &#x60;GeneratePresignedUrl&#x60;
   * @return httpEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Public URL to access the file in the bucket. Must be computed using the AWS SDK method `GeneratePresignedUrl`")

  public String getHttpEndpoint() {
    return httpEndpoint;
  }


  public void setHttpEndpoint(String httpEndpoint) {
    this.httpEndpoint = httpEndpoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Locator locator = (Locator) o;
    return Objects.equals(this.awsS3Bucket, locator.awsS3Bucket) &&
        Objects.equals(this.awsS3Key, locator.awsS3Key) &&
        Objects.equals(this.httpEndpoint, locator.httpEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsS3Bucket, awsS3Key, httpEndpoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Locator {\n");
    sb.append("    awsS3Bucket: ").append(toIndentedString(awsS3Bucket)).append("\n");
    sb.append("    awsS3Key: ").append(toIndentedString(awsS3Key)).append("\n");
    sb.append("    httpEndpoint: ").append(toIndentedString(httpEndpoint)).append("\n");
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

