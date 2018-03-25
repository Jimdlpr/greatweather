package example.com.greatweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus on 2018/3/25.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More
    {
        @SerializedName("txt")
        public String info;
    }
}
