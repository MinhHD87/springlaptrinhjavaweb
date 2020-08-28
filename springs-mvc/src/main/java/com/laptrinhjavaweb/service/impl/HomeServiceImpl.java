package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService{

	@Override
	public List<String> loadMenu() {
		List<String> menu = new ArrayList<>();
		menu.add("giới thiệu");
		menu.add("about");
		menu.add("contact");
		menu.add("service");
		
		return menu;
	}

}
