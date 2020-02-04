package com.wang.movie.pojo;

import java.util.Date;

/**
 * @author 王一宁
 * @date 2020/2/3 16:14
 */
public class Order {
    private int id;//订单编号
    private int user_id;//用户信息
    private int movie_id;//电影信息
    private int yingting_id;//影厅
    private Date order_time;//订单时间
    private int count;//电影数量
    private int order_money;//总金额
    private String seats;//座位

    public Order() {
    }


}
