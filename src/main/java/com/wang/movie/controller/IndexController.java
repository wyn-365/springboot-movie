package com.wang.movie.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wang.movie.pojo.Catelog;
import com.wang.movie.pojo.Movie;
import com.wang.movie.pojo.User;
import com.wang.movie.service.MovieService;
import com.wang.movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 王一宁
 * @date 2020/2/1 17:41
 */
@Controller
public class IndexController {

    @Autowired
    MovieService movieService;
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(Integer pageNum, Integer pageSize, Model model){
        //1.查询所有的电影信息
        if (pageNum==null&&pageSize==null){
            pageNum=1;
            pageSize=5;
        }
        if (pageNum!=null&&pageSize==null){
            pageSize=3;
        }
        PageHelper.startPage(pageNum,pageSize);
        Page<Movie> movieList = movieService.getMovieList();
        model.addAttribute("movieStat",movieList);

        //2.查询票房排行榜
        Page<Movie> movieList2 = movieService.getMovieListPaiHang();
        model.addAttribute("movieStat2",movieList2);

        //3.查询所有的分类信息
        List<Catelog> list = movieService.getCatelogList();
        model.addAttribute("catelogStat",list);

        return "index";

    }

    //跳转登录页面
    @RequestMapping("/userLogin")
    public String login(){
        return "login";
    }

    //正正的登录
    @RequestMapping("/login")
    public String userLogin(HttpServletRequest request,Model model){
        String username = request.getParameter("userName");
        String password = request.getParameter("userPw");
        System.out.println(username+password);
        //判断后台的密码正确吗
        User user1 = userService.findUser(username,password);

        String username1 = user1.getUser_name();
        String password1 = user1.getUser_password();
        System.out.println("数据库"+username1+password1);

        if(!(username1 == username) && !(password1 == password)){
            //登录成功 放入session
            request.setAttribute("user",user1.getUser_name());
            return "redirect:/";
        }else {
            System.out.println("登陆失败");
            return "login";
        }
    }

    //跳转注册页面
    @RequestMapping("/userRegister")
    public String register(){
        return "register";
    }

    //真正的注册
    @RequestMapping("/register")
    public String register2(HttpServletRequest request){
        String username = request.getParameter("userName");
        String password = request.getParameter("userPw");
        String userRealname = request.getParameter("userRealname");
        String userTel = request.getParameter("userTel");
        String userEmail = request.getParameter("userEmail");
        String userQq = request.getParameter("userQq");
        User user = new User();
        user.setUser_name(username);
        user.setUser_password(password);
        user.setUser_email(userEmail);
        user.setUser_realName(userRealname);
        user.setUser_tel(userTel);
        user.setUser_qq(userQq);
        user.setUser_age(23);
        user.setUser_img("/img/qiantai/login.png");
        user.setUser_flag(1);
        user.setUser_sex("男");
        userService.register(user);

        return "login";
    }

    //跳转电影详细信息页面 并查询所有的详细信息
    @RequestMapping("/findMovieById/{id}")
    public String findMovieById(@PathVariable("id") Integer id,Model model){
        System.out.println("得到的电影的ID是："+id);
        //根据ID查询电影
        Movie movie = movieService.findMovieById(id);
        model.addAttribute("movieInfo",movie);
        return "front/movieDetail";
    }

}
