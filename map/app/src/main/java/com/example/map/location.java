package com.example.map;

import androidx.appcompat.app.AppCompatActivity;

import com.mapbox.mapboxsdk.geometry.LatLng;

public class location extends AppCompatActivity {


    location(String _cityname,LatLng _lg){
        lng=_lg;
        cityname=_cityname;
    }
    LatLng  lng;
    String cityname;
}
