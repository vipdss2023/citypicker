package com.lljjcoder.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义数据源需要的数据model,自定义的话需要继承该数据model
 */
public class CustomCityData {
    private String id; /*110101*/

    private String name; /*东城区*/

    //数据层级
    private int level;

    private List<CustomCityData> list = new ArrayList<>();

    public CustomCityData() {

    }

    @Override
    public String toString() {
        return name;
    }

    public CustomCityData(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public CustomCityData(String id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<CustomCityData> getList() {
        return list;
    }

    public void setList(List<CustomCityData> list) {
        this.list = list;
    }


}
