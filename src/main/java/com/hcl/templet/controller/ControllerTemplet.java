package com.hcl.templet.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.templet.service.ServiceTemplet;

@RestController
@RequestMapping("/templet")
public class ControllerTemplet {
	@Autowired
	ServiceTemplet serviceTemplet;
	
	@PostMapping("/post")
	public void postMethod(@RequestBody String s){
		serviceTemplet.m1(s);
		
	}
	@GetMapping("/get/{id}")
	public void getMethod(@PathParam("s") String s){
		serviceTemplet.m2(s);
		
	}

}
