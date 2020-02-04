package com.wang.movie.pojo;

/**
 * @author 王一宁
 * @date 2020/2/1 17:51
 */
public class YingTing {
    private int id;
    private int  number;

    public YingTing(int id, int number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "YingTing{" +
                "id=" + id +
                ", number=" + number +
                '}';
    }
}
