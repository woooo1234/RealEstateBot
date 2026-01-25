
package _03_intro_to_authenticated_APIs.data_transfer_objects;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Pagination {

    @SerializedName("currentPage")
    @Expose
    private Integer currentPage;
    @SerializedName("nextPage")
    @Expose
    private String nextPage;
    @SerializedName("otherPages")
    @Expose
    private OtherPages otherPages;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    public OtherPages getOtherPages() {
        return otherPages;
    }

    public void setOtherPages(OtherPages otherPages) {
        this.otherPages = otherPages;
    }

}
