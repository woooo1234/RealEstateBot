
package _03_intro_to_authenticated_APIs.data_transfer_objects;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class MediaDetails {

    @SerializedName("has3DModel")
    @Expose
    private Boolean has3DModel;
    @SerializedName("hasVideo")
    @Expose
    private Boolean hasVideo;

    public Boolean getHas3DModel() {
        return has3DModel;
    }

    public void setHas3DModel(Boolean has3DModel) {
        this.has3DModel = has3DModel;
    }

    public Boolean getHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(Boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

}
