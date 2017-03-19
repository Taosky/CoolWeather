package science.zxc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * AUTH: Taosky
 * TIME: 2017/3/13 0013:下午 3:23.
 * MAIL: t@firefoxcn.net
 * DESC:
 */
public class Now {
   @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
