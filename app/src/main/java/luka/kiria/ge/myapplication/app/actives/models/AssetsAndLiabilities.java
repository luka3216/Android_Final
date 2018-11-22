
package luka.kiria.ge.myapplication.app.actives.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AssetsAndLiabilities {

    @SerializedName("Points")
    @Expose
    private List<Point> points = null;
    @SerializedName("Assets")
    @Expose
    private List<Asset> assets = null;
    @SerializedName("Liabilities")
    @Expose
    private List<Liability> liabilities = null;
    @SerializedName("AvailableAmounts")
    @Expose
    private List<AvailableAmount> availableAmounts = null;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public List<Liability> getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(List<Liability> liabilities) {
        this.liabilities = liabilities;
    }

    public List<AvailableAmount> getAvailableAmounts() {
        return availableAmounts;
    }

    public void setAvailableAmounts(List<AvailableAmount> availableAmounts) {
        this.availableAmounts = availableAmounts;
    }

}
