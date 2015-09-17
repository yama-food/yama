package com.valentine.yama.gettersandsetters;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by valentine on 9/17/15.
 */
@ParseClassName("Neighbourhoods")
public class Neighbor extends ParseObject{
    public Neighbor(){

    }

    public String getType(){
        return getString("location");
    }

    public void setType(String location){
        put("location", location);
    }
}
