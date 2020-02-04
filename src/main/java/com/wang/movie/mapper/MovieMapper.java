package com.wang.movie.mapper;

import com.github.pagehelper.Page;
import com.wang.movie.pojo.Catelog;
import com.wang.movie.pojo.Movie;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 王一宁
 * @date 2020/2/1 19:43
 */
@Mapper
public interface MovieMapper {

    @Select("select * from movie where movie_flag=1 order by movie_time desc")
    Page<Movie> getMovieList();

    @Select("select * from movie where movie_flag=1 order by movie_piaofang desc limit 5")
    Page<Movie> getMovieList2();

    @Select("select * from catelog ")
    List<Catelog> getCatelogList();

    @Select("select * from movie where movie_catelog_id=#{id} and movie_flag=1 order by movie_time desc")
    Page<Movie> getMovieListByCatelog(Integer id);

    @Select("select * from movie where id=#{id}")
    Movie findMovieById(Integer id);

    @Insert("insert into movie(movie_name,movie_desc,movie_pic,movie_flag,movie_catelog_id,movie_zone_id,movie_time,movie_yingting_id,movie_price) values(#{movie_name},#{movie_desc},#{movie_pic},#{movie_flag},#{movie_catelog_id},#{movie_zone_id},#{movie_time},#{movie_yingting_id},#{movie_price})")
    void addMovie(Movie movie);

    @Delete("delete from movie where id = #{id}")
    void deleteMovie(int id);

    @Update("update movie set movie_flag=0 where id = #{id}")
    void downMovie(int id);

    @Select("select * from movie order by movie_time desc")
    Page<Movie> getMovieListHoutai();

    @Update("update movie set movie_flag=1 where id = #{id}")
    void upMovie(int id);
}
