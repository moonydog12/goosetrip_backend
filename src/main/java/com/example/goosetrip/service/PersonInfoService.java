package com.example.goosetrip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.goosetrip.dao.PersonInfoDao;
import com.example.goosetrip.vo.BasicRes;
import com.example.goosetrip.vo.CreateReq;

@Service
public class PersonInfoService {
	@Autowired
	PersonInfoDao personInfoDao;

	public BasicRes create(CreateReq req) {
		personInfoDao.addInfo(req.getId(), req.getName(), req.getAge(), req.getCity());
		return new BasicRes(200, "success");
	}

}
