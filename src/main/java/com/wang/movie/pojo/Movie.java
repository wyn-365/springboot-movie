package com.wang.movie.pojo;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author 王一宁
 * @date 2020/2/1 17:43
 */
public class Movie {
    private int id;
    private String movie_name;
    private String movie_desc;
    private String movie_pic;
    private String movie_time;
    private int movie_price;
    private int movie_piaofang;
    private int movie_flag;
    private int movie_catelog_id;
    private int movie_zone_id;
    private int movie_yingting_id;

    public int getId() {
        return id;
    }


    public Movie(int id, String movie_name, String movie_desc, String movie_pic, String movie_time, int movie_price, int movie_piaofang, int movie_flag, int movie_catelog_id, int movie_zone_id, int movie_yingting_id) {
        this.id = id;
        this.movie_name = movie_name;
        this.movie_desc = movie_desc;
        this.movie_pic = movie_pic;
        this.movie_time = movie_time;
        this.movie_price = movie_price;
        this.movie_piaofang = movie_piaofang;
        this.movie_flag = movie_flag;
        this.movie_catelog_id = movie_catelog_id;
        this.movie_zone_id = movie_zone_id;
        this.movie_yingting_id = movie_yingting_id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movie_name='" + movie_name + '\'' +
                ", movie_desc='" + movie_desc + '\'' +
                ", movie_pic='" + movie_pic + '\'' +
                ", movie_time='" + movie_time + '\'' +
                ", movie_price=" + movie_price +
                ", movie_piaofang=" + movie_piaofang +
                ", movie_flag=" + movie_flag +
                ", movie_catelog_id=" + movie_catelog_id +
                ", movie_zone_id=" + movie_zone_id +
                ", movie_yingting_id=" + movie_yingting_id +
                '}';
    }

    public void setMovie_piaofang(int movie_piaofang) {
        this.movie_piaofang = movie_piaofang;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_desc() {
        return movie_desc;
    }

    public void setMovie_desc(String movie_desc) {
        this.movie_desc = movie_desc;
    }

    public String getMovie_pic() {
        return movie_pic;
    }

    public void setMovie_pic(String movie_pic) {
        this.movie_pic = movie_pic;
    }

    public String getMovie_time() {
        return movie_time;
    }

    public void setMovie_time(String movie_time) {
        this.movie_time = movie_time;
    }

    public int getMovie_price() {
        return movie_price;
    }

    public void setMovie_price(int movie_price) {
        this.movie_price = movie_price;
    }

    public int getMovie_flag() {
        return movie_flag;
    }

    public void setMovie_flag(int movie_flag) {
        this.movie_flag = movie_flag;
    }

    public int getMovie_catelog_id() {
        return movie_catelog_id;
    }

    public void setMovie_catelog_id(int movie_catelog_id) {
        this.movie_catelog_id = movie_catelog_id;
    }

    public int getMovie_zone_id() {
        return movie_zone_id;
    }

    public void setMovie_zone_id(int movie_zone_id) {
        this.movie_zone_id = movie_zone_id;
    }

    public int getMovie_yingting_id() {
        return movie_yingting_id;
    }

    public void setMovie_yingting_id(int movie_yingting_id) {
        this.movie_yingting_id = movie_yingting_id;
    }

    public Movie(int id, String movie_name, String movie_desc, String movie_pic, String movie_time, int movie_price, int movie_flag, int movie_catelog_id, int movie_zone_id, int movie_yingting_id) {
        this.id = id;
        this.movie_name = movie_name;
        this.movie_desc = movie_desc;
        this.movie_pic = movie_pic;
        this.movie_time = movie_time;
        this.movie_price = movie_price;
        this.movie_flag = movie_flag;
        this.movie_catelog_id = movie_catelog_id;
        this.movie_zone_id = movie_zone_id;
        this.movie_yingting_id = movie_yingting_id;
    }

    public Movie() {
    }

    public void getMovie_piaofang() {
    }
}
