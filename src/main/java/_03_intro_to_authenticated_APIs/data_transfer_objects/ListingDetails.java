
package _03_intro_to_authenticated_APIs.data_transfer_objects;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ListingDetails {

    @SerializedName("isFsba")
    @Expose
    private Boolean isFsba;

    public Boolean getIsFsba() {
        return isFsba;
    }

    public void setIsFsba(Boolean isFsba) {
        this.isFsba = isFsba;
    }

}
