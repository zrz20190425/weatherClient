package com.example.demo;

import new_src.cn.com.webxml.ArrayOfString;
import new_src.cn.com.webxml.WeatherWS;
import new_src.cn.com.webxml.WeatherWSSoap;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


/**
 * Created by sjgtw-zzr on 2020/4/16.
 */
@SpringBootTest
public class WeatherWSClientNew {
    public static void main(String[] args) {
        WeatherWS factory = new WeatherWS();
        WeatherWSSoap weatherWSSoap = factory
                .getWeatherWSSoap();
        ArrayOfString weatherInfo = weatherWSSoap.getSupportCityString("311101");
        List<String> lstWeatherInfo = weatherInfo.getString();
        for (String string : lstWeatherInfo) {
            System.out.println(string);
            System.out.println("------------------------");
        }
    }
}
