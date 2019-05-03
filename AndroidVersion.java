package com.example.finalyearproject;

public class AndroidVersion {

    private String act_id;
    private String area;
    private String category;
    private String desc;
    private String file;
    private String i_o;
    private String name;

    public AndroidVersion(String act_id, String area, String category, String desc, String file, String i_o, String name) {
        this.act_id = act_id;
        this.area = area;
        this.category = category;
        this.desc = desc;
        this.file = file;
        this.i_o = i_o;
        this.name = name;
    }

    public String getAct_id() {
        return act_id;
    }

    public String getArea() {
        return area;
    }

    public String getCategory() {
        return category;
    }

    public String getDesc() {
        return desc;
    }

    public String getFile() {
        return file;
    }

    public String getI_o() {
        return i_o;
    }

    public String getName() {
        return name;
    }
}
