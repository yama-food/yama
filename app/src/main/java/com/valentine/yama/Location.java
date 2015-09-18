package com.valentine.yama;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by valentine on 9/18/15.
 */
@ParseClassName("Task")

public class Location extends ParseObject {
    public Location(){

    }

    public String getType(){
        return getString("location");
    }

    public void setType(String location){
        put("location", location);
    }
}
