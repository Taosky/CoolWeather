package science.zxc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * AUTH: Taosky
 * TIME: 2017/3/13 0013:下午 3:29.
 * MAIL: t@firefoxcn.net
 * DESC:
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;


    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
