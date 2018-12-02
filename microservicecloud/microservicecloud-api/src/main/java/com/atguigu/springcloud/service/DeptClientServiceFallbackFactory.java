package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;


@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
