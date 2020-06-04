package ua.dp.michaellang.weather.data.entity.Location;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import ua.dp.michaellang.weather.data.entity.Metric;


public class Elevation {

    @SerializedName("Metric")
    @Expose
    private Metric metric;
    @SerializedName("Imperial")
    @Expose
    private Metric imperial;

    public Metric getMetric() {
        return metric;
    }

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    public Metric getImperial() {
        return imperial;
    }

    public void setImperial(Metric imperial) {
        this.imperial = imperial;
    }

}
