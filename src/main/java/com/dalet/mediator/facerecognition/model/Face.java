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
import com.dalet.mediator.facerecognition.model.FaceBbox;
import com.dalet.mediator.facerecognition.model.FaceDetectedEntity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Face
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-22T16:35:31.447+08:00[GMT+08:00]")
public class Face {
  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_SOURCE_EXTRACTION = "sourceExtraction";
  @SerializedName(SERIALIZED_NAME_SOURCE_EXTRACTION)
  private String sourceExtraction;

  public static final String SERIALIZED_NAME_FRAME_IN_SOURCE = "frameInSource";
  @SerializedName(SERIALIZED_NAME_FRAME_IN_SOURCE)
  private Integer frameInSource;

  public static final String SERIALIZED_NAME_BBOX = "bbox";
  @SerializedName(SERIALIZED_NAME_BBOX)
  private FaceBbox bbox;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_DETECTED_ENTITY = "detectedEntity";
  @SerializedName(SERIALIZED_NAME_DETECTED_ENTITY)
  private FaceDetectedEntity detectedEntity;


  public Face uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public Face sourceExtraction(String sourceExtraction) {
    
    this.sourceExtraction = sourceExtraction;
    return this;
  }

   /**
   * UID of FaceExtractionCollection in which this face was detected
   * @return sourceExtraction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UID of FaceExtractionCollection in which this face was detected")

  public String getSourceExtraction() {
    return sourceExtraction;
  }


  public void setSourceExtraction(String sourceExtraction) {
    this.sourceExtraction = sourceExtraction;
  }


  public Face frameInSource(Integer frameInSource) {
    
    this.frameInSource = frameInSource;
    return this;
  }

   /**
   * Frame number in source video file
   * @return frameInSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Frame number in source video file")

  public Integer getFrameInSource() {
    return frameInSource;
  }


  public void setFrameInSource(Integer frameInSource) {
    this.frameInSource = frameInSource;
  }


  public Face bbox(FaceBbox bbox) {
    
    this.bbox = bbox;
    return this;
  }

   /**
   * Get bbox
   * @return bbox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FaceBbox getBbox() {
    return bbox;
  }


  public void setBbox(FaceBbox bbox) {
    this.bbox = bbox;
  }


  public Face imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Presigned URL to retrive the face image.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Presigned URL to retrive the face image.")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public Face detectedEntity(FaceDetectedEntity detectedEntity) {
    
    this.detectedEntity = detectedEntity;
    return this;
  }

   /**
   * Get detectedEntity
   * @return detectedEntity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FaceDetectedEntity getDetectedEntity() {
    return detectedEntity;
  }


  public void setDetectedEntity(FaceDetectedEntity detectedEntity) {
    this.detectedEntity = detectedEntity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Face face = (Face) o;
    return Objects.equals(this.uid, face.uid) &&
        Objects.equals(this.sourceExtraction, face.sourceExtraction) &&
        Objects.equals(this.frameInSource, face.frameInSource) &&
        Objects.equals(this.bbox, face.bbox) &&
        Objects.equals(this.imageUrl, face.imageUrl) &&
        Objects.equals(this.detectedEntity, face.detectedEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, sourceExtraction, frameInSource, bbox, imageUrl, detectedEntity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Face {\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    sourceExtraction: ").append(toIndentedString(sourceExtraction)).append("\n");
    sb.append("    frameInSource: ").append(toIndentedString(frameInSource)).append("\n");
    sb.append("    bbox: ").append(toIndentedString(bbox)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    detectedEntity: ").append(toIndentedString(detectedEntity)).append("\n");
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

