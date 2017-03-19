package science.zxc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * AUTH: Taosky
 * TIME: 2017/3/13 0013:下午 3:17.
 * MAIL: t@firefoxcn.net
 * DESC:
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
