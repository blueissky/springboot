package com.demo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface StudentMapper {
	@Select("select * from student")
	List<Student> findAll();
}
