package com.wang.movie.controller.admin;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wang.movie.pojo.Catelog;
import com.wang.movie.pojo.Movie;
import com.wang.movie.service.MovieService;
import com.wang.movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 王一宁
 * @date 2020/2/2 18:51
 */
@Controller
public class IndexAdminController {

    @Autowired
    MovieService movieService;
    @Autowired
    UserService userService;
    //跳转到后台
    @RequestMapping("/indexAdmin")
    public String indexAdmin(){
        return "admin/index";
    }

    //后台查询所有的电影信息【带有分页】
    @RequestMapping("/admin/indexAdmin")
    public String movie(Integer pageNum, Integer pageSize, Model model){
        //1.查询所有的电影信息
        if (pageNum==null&&pageSize==null){
            pageNum=1;
            pageSize=5;
        }
        if (pageNum!=null&&pageSize==null){
            pageSize=5;
        }
        PageHelper.startPage(pageNum,pageSize);
        Page<Movie> movieList = movieService.getMovieList2();
        model.addAttribute("movieStat",movieList);

        return "admin/movie/list";
    }


    //条状添家电影的界面
    @RequestMapping("/admin/addMovie")
    public String adminAddMovie(Model model){
        //查询所有的分类
        List<Catelog> list = movieService.getCatelogList();
        model.addAttribute("catelogStat",list);
        return "admin/movie/add";
    }

    //真实的添家电影的界面
    @RequestMapping("/admin/addMovie2")
    public String adminAddMovie2(HttpServletRequest request,Movie movie){
        //把电影信息添加
        int catelogId = Integer.parseInt(request.getParameter("catelogId"));
        String movieName = request.getParameter("movieName");
        int moviePrice = Integer.parseInt(request.getParameter("moviePrice"));
        String movieTime = request.getParameter("movieTime");
        int movieZone = Integer.parseInt(request.getParameter("movieZone"));
        String moviePic = request.getParameter("moviePic");
        String movieDesc = request.getParameter("movieDesc");
        int movieFlag = Integer.parseInt(request.getParameter("movieFlag"));
        int movieYingTing = Integer.parseInt(request.getParameter("movieYingTing"));
        movie.setMovie_catelog_id(catelogId);
        movie.setMovie_name(movieName);
        movie.setMovie_price(moviePrice);
        movie.setMovie_time(movieTime);
        movie.setMovie_zone_id(movieZone);
        movie.setMovie_pic(moviePic);
        movie.setMovie_desc(movieDesc);
        movie.setMovie_flag(movieFlag);
        movie.setMovie_yingting_id(movieYingTing);

        //插入数据库 带哦应业务层
        movieService.addMovie(movie);

        return "redirect:/admin/indexAdmin";
    }


    //根据id删除电影
    @RequestMapping("/deleteMovie")
    public String deleteMovie(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("删除的电影编号是："+id);
        movieService.deleteMovie(id);
        return "redirect:/admin/indexAdmin";
    }

    //根据id下降电影
    @RequestMapping("/downMovie")
    public String downMovie(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("下架的电影编号是："+id);
        movieService.downMovie(id);
        return "redirect:/admin/indexAdmin";
    }

    //根据id上架电影
    @RequestMapping("/upMovie")
    public String upMovie(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("上架的电影编号是："+id);
        movieService.upMovie(id);
        return "redirect:/admin/indexAdmin";
    }
}
