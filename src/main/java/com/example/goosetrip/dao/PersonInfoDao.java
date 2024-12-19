package com.example.goosetrip.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper // 讓 Spring Boot 託管
public interface PersonInfoDao {
	void addInfo(//
			@Param("inputId") String id, //
			@Param("inputName") String userName, //
			@Param("inputAge") int userAge, //
			@Param("inputCity") String city);
}