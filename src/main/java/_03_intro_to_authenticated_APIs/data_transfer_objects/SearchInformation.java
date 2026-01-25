
package _03_intro_to_authenticated_APIs.data_transfer_objects;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class SearchInformation {

    @SerializedName("totalResults")
    @Expose
    private Integer totalResults;

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

}
