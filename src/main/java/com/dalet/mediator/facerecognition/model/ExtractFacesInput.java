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
import com.dalet.mediator.facerecognition.model.ExtractFacesInputAllOf;
import com.dalet.mediator.facerecognition.model.JobInput;
import com.dalet.mediator.facerecognition.model.Locator;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Analyze input video file to detect faces. Steps of analysis include frame extraction, selection of frames, detection of faces, encoding of the faces using a neural network encoder backbone, normalization of the extracted faces and storage of the result in a persistent FaceCollection.
 */
@ApiModel(description = "Analyze input video file to detect faces. Steps of analysis include frame extraction, selection of frames, detection of faces, encoding of the faces using a neural network encoder backbone, normalization of the extracted faces and storage of the result in a persistent FaceCollection.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-22T16:35:31.447+08:00[GMT+08:00]")
public class ExtractFacesInput extends JobInput {
  /**
   * How much effort should be invested in extracting faces from the video stream. More effort brings higher accuracy for higher cost.
   */
  @JsonAdapter(EffortEnum.Adapter.class)
  public enum EffortEnum {
    LOW("Low"),
    
    BASIC("Basic"),
    
    NORMAL("Normal"),
    
    HIGH("High"),
    
    EXTREME("Extreme");

    private String value;

    EffortEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EffortEnum fromValue(String value) {
      for (EffortEnum b : EffortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EffortEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EffortEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EffortEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EffortEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EFFORT = "effort";
  @SerializedName(SERIALIZED_NAME_EFFORT)
  private EffortEnum effort = EffortEnum.NORMAL;

  public static final String SERIALIZED_NAME_MINIMUM_FACESIZE = "minimumFacesize";
  @SerializedName(SERIALIZED_NAME_MINIMUM_FACESIZE)
  private java.lang.Double minimumFacesize = 40d;

  public static final String SERIALIZED_NAME_FACE_SIZE = "faceSize";
  @SerializedName(SERIALIZED_NAME_FACE_SIZE)
  private java.lang.Double faceSize = 160d;

  public static final String SERIALIZED_NAME_VIDEO = "video";
  @SerializedName(SERIALIZED_NAME_VIDEO)
  private Locator video;


  public ExtractFacesInput effort(EffortEnum effort) {
    
    this.effort = effort;
    return this;
  }

   /**
   * How much effort should be invested in extracting faces from the video stream. More effort brings higher accuracy for higher cost.
   * @return effort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Normal", value = "How much effort should be invested in extracting faces from the video stream. More effort brings higher accuracy for higher cost.")

  public EffortEnum getEffort() {
    return effort;
  }


  public void setEffort(EffortEnum effort) {
    this.effort = effort;
  }


  public ExtractFacesInput minimumFacesize(java.lang.Double minimumFacesize) {
    
    this.minimumFacesize = minimumFacesize;
    return this;
  }

   /**
   * Minimum size of face in pixel.  Only extract a face if its bounding box is larger than this size.
   * @return minimumFacesize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "40", value = "Minimum size of face in pixel.  Only extract a face if its bounding box is larger than this size.")

  public java.lang.Double getMinimumFacesize() {
    return minimumFacesize;
  }


  public void setMinimumFacesize(java.lang.Double minimumFacesize) {
    this.minimumFacesize = minimumFacesize;
  }


  public ExtractFacesInput faceSize(java.lang.Double faceSize) {
    
    this.faceSize = faceSize;
    return this;
  }

   /**
   * Extraction Image size in pixels.  Extracted faces are normalized as squared bitmaps with  this size.  Colors are also normalized.
   * @return faceSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extraction Image size in pixels.  Extracted faces are normalized as squared bitmaps with  this size.  Colors are also normalized.")

  public java.lang.Double getFaceSize() {
    return faceSize;
  }


  public void setFaceSize(java.lang.Double faceSize) {
    this.faceSize = faceSize;
  }


  public ExtractFacesInput video(Locator video) {
    
    this.video = video;
    return this;
  }

   /**
   * Get video
   * @return video
  **/
  @ApiModelProperty(required = true, value = "")

  public Locator getVideo() {
    return video;
  }


  public void setVideo(Locator video) {
    this.video = video;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtractFacesInput extractFacesInput = (ExtractFacesInput) o;
    return Objects.equals(this.effort, extractFacesInput.effort) &&
        Objects.equals(this.minimumFacesize, extractFacesInput.minimumFacesize) &&
        Objects.equals(this.faceSize, extractFacesInput.faceSize) &&
        Objects.equals(this.video, extractFacesInput.video) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effort, minimumFacesize, faceSize, video, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractFacesInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    effort: ").append(toIndentedString(effort)).append("\n");
    sb.append("    minimumFacesize: ").append(toIndentedString(minimumFacesize)).append("\n");
    sb.append("    faceSize: ").append(toIndentedString(faceSize)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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

