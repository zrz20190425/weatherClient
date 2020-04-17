package com.example.demo;

import new_src.cn.com.webxml.ArrayOfString;
import new_src.cn.com.webxml.WeatherWS;
import new_src.cn.com.webxml.WeatherWSSoap;
import org.springframework.boot.test.context.SpringBootTest;
import src.com.MatrixResult;
import src.com.Service;
import src.com.ServiceSoap;

import java.util.List;


/**
 * Created by sjgtw-zzr on 2020/4/16.
 */
@SpringBootTest
public class ZCYWSClient {
    public static void main(String[] args) {
        Service factory = new Service();
        ServiceSoap zcyWSSoap = factory
                .getServiceSoap();
        MatrixResult matrixResult = zcyWSSoap.invokeLogin("input_goods1","input_goods1","",1);
        System.out.println(matrixResult.getSResult());
        System.out.println("------------------------");
    }
}
