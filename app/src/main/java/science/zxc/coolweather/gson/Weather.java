package science.zxc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * AUTH: Taosky
 * TIME: 2017/3/13 0013:下午 3:32.
 * MAIL: t@firefoxcn.net
 * DESC:
 */
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastlist;
}
