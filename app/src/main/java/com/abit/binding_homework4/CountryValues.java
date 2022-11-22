package com.abit.binding_homework4;

public class CountryValues {
    private String name;
    private String flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public CountryValues(String name, String flag) {
        this.name = name;
        this.flag = flag;
    }
}
