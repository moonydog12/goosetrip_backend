package com.example.goosetrip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.goosetrip.service.PersonInfoService;
import com.example.goosetrip.vo.BasicRes;
import com.example.goosetrip.vo.CreateReq;

@RestController
public class PersonInfoServiceController {
	@Autowired
	PersonInfoService personInfoService;

	@PostMapping(value = "goosetrip/create")
	public BasicRes create(@RequestBody CreateReq req) {
		return personInfoService.create(req);
	}
}
