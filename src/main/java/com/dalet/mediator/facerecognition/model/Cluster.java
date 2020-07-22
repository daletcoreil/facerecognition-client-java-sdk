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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Cluster
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-22T16:35:31.447+08:00[GMT+08:00]")
public class Cluster {
  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_IDENTIFIED_AT = "identifiedAt";
  @SerializedName(SERIALIZED_NAME_IDENTIFIED_AT)
  private OffsetDateTime identifiedAt;

  public static final String SERIALIZED_NAME_IDENTIFIED_BY = "identifiedBy";
  @SerializedName(SERIALIZED_NAME_IDENTIFIED_BY)
  private String identifiedBy;

  public static final String SERIALIZED_NAME_CURATED_AT = "curatedAt";
  @SerializedName(SERIALIZED_NAME_CURATED_AT)
  private OffsetDateTime curatedAt;

  public static final String SERIALIZED_NAME_CURATED_BY = "curatedBy";
  @SerializedName(SERIALIZED_NAME_CURATED_BY)
  private String curatedBy;

  public static final String SERIALIZED_NAME_FACE_IDS = "faceIds";
  @SerializedName(SERIALIZED_NAME_FACE_IDS)
  private List<String> faceIds = null;


  public Cluster uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Unique ID to retrieve the content of a cluster or its metadata
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "Unique ID to retrieve the content of a cluster or its metadata")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public Cluster createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Cluster jobId(String jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * Clustering job which created this cluster
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Clustering job which created this cluster")

  public String getJobId() {
    return jobId;
  }


  public void setJobId(String jobId) {
    this.jobId = jobId;
  }


  public Cluster identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Name of person recognized in cluster
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of person recognized in cluster")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public Cluster identifiedAt(OffsetDateTime identifiedAt) {
    
    this.identifiedAt = identifiedAt;
    return this;
  }

   /**
   * Date when the identity was associated to the cluster.
   * @return identifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the identity was associated to the cluster.")

  public OffsetDateTime getIdentifiedAt() {
    return identifiedAt;
  }


  public void setIdentifiedAt(OffsetDateTime identifiedAt) {
    this.identifiedAt = identifiedAt;
  }


  public Cluster identifiedBy(String identifiedBy) {
    
    this.identifiedBy = identifiedBy;
    return this;
  }

   /**
   * Who set the identity - automatic/person.
   * @return identifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Who set the identity - automatic/person.")

  public String getIdentifiedBy() {
    return identifiedBy;
  }


  public void setIdentifiedBy(String identifiedBy) {
    this.identifiedBy = identifiedBy;
  }


  public Cluster curatedAt(OffsetDateTime curatedAt) {
    
    this.curatedAt = curatedAt;
    return this;
  }

   /**
   * When verified manually
   * @return curatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When verified manually")

  public OffsetDateTime getCuratedAt() {
    return curatedAt;
  }


  public void setCuratedAt(OffsetDateTime curatedAt) {
    this.curatedAt = curatedAt;
  }


  public Cluster curatedBy(String curatedBy) {
    
    this.curatedBy = curatedBy;
    return this;
  }

   /**
   * Who verified manually.
   * @return curatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Who verified manually.")

  public String getCuratedBy() {
    return curatedBy;
  }


  public void setCuratedBy(String curatedBy) {
    this.curatedBy = curatedBy;
  }


  public Cluster faceIds(List<String> faceIds) {
    
    this.faceIds = faceIds;
    return this;
  }

  public Cluster addFaceIdsItem(String faceIdsItem) {
    if (this.faceIds == null) {
      this.faceIds = new ArrayList<String>();
    }
    this.faceIds.add(faceIdsItem);
    return this;
  }

   /**
   * UIDs of the faces in the collection
   * @return faceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UIDs of the faces in the collection")

  public List<String> getFaceIds() {
    return faceIds;
  }


  public void setFaceIds(List<String> faceIds) {
    this.faceIds = faceIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cluster cluster = (Cluster) o;
    return Objects.equals(this.uid, cluster.uid) &&
        Objects.equals(this.createdAt, cluster.createdAt) &&
        Objects.equals(this.jobId, cluster.jobId) &&
        Objects.equals(this.identity, cluster.identity) &&
        Objects.equals(this.identifiedAt, cluster.identifiedAt) &&
        Objects.equals(this.identifiedBy, cluster.identifiedBy) &&
        Objects.equals(this.curatedAt, cluster.curatedAt) &&
        Objects.equals(this.curatedBy, cluster.curatedBy) &&
        Objects.equals(this.faceIds, cluster.faceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, createdAt, jobId, identity, identifiedAt, identifiedBy, curatedAt, curatedBy, faceIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cluster {\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    identifiedAt: ").append(toIndentedString(identifiedAt)).append("\n");
    sb.append("    identifiedBy: ").append(toIndentedString(identifiedBy)).append("\n");
    sb.append("    curatedAt: ").append(toIndentedString(curatedAt)).append("\n");
    sb.append("    curatedBy: ").append(toIndentedString(curatedBy)).append("\n");
    sb.append("    faceIds: ").append(toIndentedString(faceIds)).append("\n");
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

