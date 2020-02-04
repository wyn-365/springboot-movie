package com.wang.movie.service;

import com.github.pagehelper.Page;
import com.wang.movie.mapper.MovieMapper;
import com.wang.movie.pojo.Catelog;
import com.wang.movie.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王一宁
 * @date 2020/2/1 19:41
 */
@Service
public class MovieService {

    @Autowired
    MovieMapper movieMapper;

    //分页查询所有的电影
    public Page<Movie> getMovieList() {
        return movieMapper.getMovieList();
    }

    public Page<Movie> getMovieListPaiHang() {
        return movieMapper.getMovieList2();
    }

    public List<Catelog> getCatelogList() {
        return movieMapper.getCatelogList();
    }

    public Page<Movie> getMovieListByCatelog(Integer id) {
        return movieMapper.getMovieListByCatelog(id);
    }

    public Movie findMovieById(Integer id) {
        return movieMapper.findMovieById(id);
    }

    //添加电影
    public void addMovie(Movie movie) {
        movieMapper.addMovie(movie);
    }

    public void deleteMovie(int id) {
        movieMapper.deleteMovie(id);
    }

    public void downMovie(int id) {
        movieMapper.downMovie(id);
    }

    public Page<Movie> getMovieList2() {
        return movieMapper.getMovieListHoutai();
    }

    public void upMovie(int id) {
        movieMapper.upMovie(id);
    }
}
