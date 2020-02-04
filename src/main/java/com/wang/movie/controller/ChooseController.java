package com.wang.movie.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wang.movie.pojo.Movie;
import com.wang.movie.pojo.Order;
import com.wang.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 王一宁
 * @date 2020/2/2 16:28
 */
@Controller
public class ChooseController {

    @Autowired
    MovieService movieService;

    //跳转到选座页面
    @RequestMapping("/choose")
    public String choose(HttpServletRequest request, Model model){
        int id = Integer.parseInt(request.getParameter("movieId"));
        System.out.println("得到选座电影ID："+ id);
        //根据ID查询电影
        Movie movie = movieService.findMovieById(id);
        model.addAttribute("movieInfo",movie);
        //把电影的详细信息发送到choose页面
        return "front/choose";
    }

    //下单[待完成]
    @PostMapping("/submitOrder")
    @ResponseBody
    public void submitOrder(String total3, HttpServletRequest request, Order order){
        /*String movieName = request.getParameter("movieName");

        JSONObject jsonObject = JSON.parseObject(total3);
        total3 = jsonObject.getString("total3");
        System.out.println("将要存储的电影名称："+movieName);
        System.out.println("将要存储的电影金额："+total3);*/

    }
}
