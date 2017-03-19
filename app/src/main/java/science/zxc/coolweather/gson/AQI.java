package science.zxc.coolweather.gson;

/**
 * AUTH: Taosky
 * TIME: 2017/3/13 0013:下午 3:22.
 * MAIL: t@firefoxcn.net
 * DESC:
 */
public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
