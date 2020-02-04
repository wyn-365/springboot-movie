package com.wang.movie.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wang.movie.pojo.Catelog;
import com.wang.movie.pojo.Movie;
import com.wang.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 王一宁
 * @date 2020/2/2 12:59
 */
@Controller
public class CatelogController {

    @Autowired
    MovieService movieService;

    /**
     * 查询前台的定义ing页面  index
     * @param id
     * @param pageNum
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("/findMovieByCatelog/{id}")
    public String findMovieByCatelog(@PathVariable("id") Integer id,Integer pageNum, Integer pageSize, Model model){
        //根据分类ID查询分类下的电影【带有分页】
        //1.查询所有的电影信息
        if (pageNum==null&&pageSize==null){
            pageNum=1;
            pageSize=5;
        }
        if (pageNum!=null&&pageSize==null){
            pageSize=3;
        }
        PageHelper.startPage(pageNum,pageSize);
        Page<Movie> movieList = movieService.getMovieListByCatelog(id);
        model.addAttribute("movieStat",movieList);
        return "front/movieByCatelog";
    }

    //根据分类查询电影 带有分页
    @RequestMapping("/findMovieByCatelog")
    public String findMovieByCatelog(HttpServletRequest request,Integer pageNum, Integer pageSize, Model model){
        //根据分类ID查询分类下的电影【带有分页】
        System.out.println("页码"+pageNum);
        //1.查询所有的电影信息
        if (pageNum==null&&pageSize==null){
            pageNum=1;
            pageSize=5;
        }
        if (pageNum!=null&&pageSize==null){
            pageSize=5;
        }
        String id1 = request.getParameter("id");
        int id = Integer.parseInt(id1);
        request.getSession().setAttribute("id",id1);

        PageHelper.startPage(pageNum,pageSize);
        Page<Movie> movieList = movieService.getMovieListByCatelog(id);
        model.addAttribute("movieStat",movieList);
        return "front/movieByCatelog";
    }

    //根据分类查询电影 带有分页
    @RequestMapping("/findMovieByCatelog2")
    public String findMovieByCatelog2(HttpServletRequest request,Integer pageNum, Integer pageSize, Model model){
        //根据分类ID查询分类下的电影【带有分页】
        System.out.println("页码"+pageNum);
        //1.查询所有的电影信息
        if (pageNum==null&&pageSize==null){
            pageNum=1;
            pageSize=5;
        }
        if (pageNum!=null&&pageSize==null){
            pageSize=5;
        }
        String id3 = (String) request.getSession().getAttribute("id");
        int id = Integer.parseInt(id3);
        PageHelper.startPage(pageNum,pageSize);
        Page<Movie> movieList = movieService.getMovieListByCatelog(id);
        model.addAttribute("movieStat",movieList);
        return "front/movieByCatelog";
    }
}
