package example.com.greatweather.gson;

/**
 * Created by asus on 2018/3/25.
 */

public class AQI {
    public AQICity city;

    public class AQICity
    {
        public String aqi;
        public String pm25;
    }
}
