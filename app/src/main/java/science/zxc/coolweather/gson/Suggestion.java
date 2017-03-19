package science.zxc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * AUTH: Taosky
 * TIME: 2017/3/13 0013:下午 3:25.
 * MAIL: t@firefoxcn.net
 * DESC:
 */
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carwash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
