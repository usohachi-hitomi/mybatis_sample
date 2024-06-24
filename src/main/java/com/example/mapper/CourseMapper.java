package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.entity.Course;

@Mapper
public interface CourseMapper {

	public List<Course> findAll(@Param("courseId") Integer courseId, @Param("courseName") String courseName);
	
	
	public void insert(Course course);
	//entityクラスを仮引数とする
	
	//テーブルからデータを一件取得する
	//ＵＲＬで入力されたidを基に取得する
	public Course findById(Integer id);
	
	//更新処理を行うメソッド
	//entityクラスを仮引数とする
	public void update(Course course);
	
	//削除処理
	public void deleteById(Integer id);
	
}
