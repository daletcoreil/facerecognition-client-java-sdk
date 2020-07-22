

# ExtractFacesInputAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effort** | [**EffortEnum**](#EffortEnum) | How much effort should be invested in extracting faces from the video stream. More effort brings higher accuracy for higher cost. |  [optional]
**minimumFacesize** | [**java.lang.Double**](java.lang.Double.md) | Minimum size of face in pixel.  Only extract a face if its bounding box is larger than this size. |  [optional]
**faceSize** | [**java.lang.Double**](java.lang.Double.md) | Extraction Image size in pixels.  Extracted faces are normalized as squared bitmaps with  this size.  Colors are also normalized. |  [optional]
**video** | [**Locator**](Locator.md) |  | 



## Enum: EffortEnum

Name | Value
---- | -----
LOW | &quot;Low&quot;
BASIC | &quot;Basic&quot;
NORMAL | &quot;Normal&quot;
HIGH | &quot;High&quot;
EXTREME | &quot;Extreme&quot;



