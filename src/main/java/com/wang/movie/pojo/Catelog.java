package com.wang.movie.pojo;

/**
 * @author 王一宁
 * @date 2020/2/1 17:48
 */
public class Catelog {
    private int id;
    private String catelog_name;
    private String catelog_desc;

    public Catelog(int id, String catelog_name, String catelog_desc) {
        this.id = id;
        this.catelog_name = catelog_name;
        this.catelog_desc = catelog_desc;
    }

    public Catelog() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatelog_name() {
        return catelog_name;
    }

    public void setCatelog_name(String catelog_name) {
        this.catelog_name = catelog_name;
    }

    public String getCatelog_desc() {
        return catelog_desc;
    }

    public void setCatelog_desc(String catelog_desc) {
        this.catelog_desc = catelog_desc;
    }

    @Override
    public String toString() {
        return "Catelog{" +
                "id=" + id +
                ", catelog_name='" + catelog_name + '\'' +
                ", catelog_desc='" + catelog_desc + '\'' +
                '}';
    }
}
