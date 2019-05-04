package com.hcl.templet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.templet.repositories.TempletRepository;

@Service
public class ServiceTempletImpl implements ServiceTemplet {

@Autowired
TempletRepository templetRepository;
	@Override
	public void m1(String s) {
		
		
	}

	@Override
	public void m2(String s) {
		
		
	}
	

}
