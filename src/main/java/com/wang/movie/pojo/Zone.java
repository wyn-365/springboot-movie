package com.wang.movie.pojo;

/**
 * @author 王一宁
 * @date 2020/2/1 17:50
 */
public class Zone {
    private int id;
    private String zone_name;

    public Zone(int id, String zone_name) {
        this.id = id;
        this.zone_name = zone_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZone_name() {
        return zone_name;
    }

    public void setZone_name(String zone_name) {
        this.zone_name = zone_name;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "id=" + id +
                ", zone_name='" + zone_name + '\'' +
                '}';
    }
}
