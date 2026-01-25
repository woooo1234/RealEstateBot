
package _03_intro_to_authenticated_APIs.data_transfer_objects;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Property {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("homeType")
    @Expose
    private String homeType;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("daysOnZillow")
    @Expose
    private Integer daysOnZillow;
    @SerializedName("area")
    @Expose
    private Integer area;
    @SerializedName("addressRaw")
    @Expose
    private String addressRaw;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("beds")
    @Expose
    private Integer beds;
    @SerializedName("baths")
    @Expose
    private Integer baths;
    @SerializedName("brokerName")
    @Expose
    private String brokerName;
    @SerializedName("brokerNameRaw")
    @Expose
    private String brokerNameRaw;
    @SerializedName("listingDetails")
    @Expose
    private ListingDetails listingDetails;
    @SerializedName("mediaDetails")
    @Expose
    private MediaDetails mediaDetails;
    @SerializedName("photos")
    @Expose
    private List<String> photos;
    @SerializedName("lotAreaValue")
    @Expose
    private Integer lotAreaValue;
    @SerializedName("lotAreaUnits")
    @Expose
    private String lotAreaUnits;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDaysOnZillow() {
        return daysOnZillow;
    }

    public void setDaysOnZillow(Integer daysOnZillow) {
        this.daysOnZillow = daysOnZillow;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getAddressRaw() {
        return addressRaw;
    }

    public void setAddressRaw(String addressRaw) {
        this.addressRaw = addressRaw;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Integer getBaths() {
        return baths;
    }

    public void setBaths(Integer baths) {
        this.baths = baths;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public String getBrokerNameRaw() {
        return brokerNameRaw;
    }

    public void setBrokerNameRaw(String brokerNameRaw) {
        this.brokerNameRaw = brokerNameRaw;
    }

    public ListingDetails getListingDetails() {
        return listingDetails;
    }

    public void setListingDetails(ListingDetails listingDetails) {
        this.listingDetails = listingDetails;
    }

    public MediaDetails getMediaDetails() {
        return mediaDetails;
    }

    public void setMediaDetails(MediaDetails mediaDetails) {
        this.mediaDetails = mediaDetails;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public Integer getLotAreaValue() {
        return lotAreaValue;
    }

    public void setLotAreaValue(Integer lotAreaValue) {
        this.lotAreaValue = lotAreaValue;
    }

    public String getLotAreaUnits() {
        return lotAreaUnits;
    }

    public void setLotAreaUnits(String lotAreaUnits) {
        this.lotAreaUnits = lotAreaUnits;
    }

}
