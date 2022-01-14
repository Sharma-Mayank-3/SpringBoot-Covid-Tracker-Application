package com.example.SpringBootTestApiApp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SpringBootTestApiApp1.model.CovidModel;
import com.example.SpringBootTestApiApp1.service.ServiceClass;

@Controller
public class HomeController {
	
	@Autowired
	public ServiceClass serviceClass;
	
	@RequestMapping("/india")
	public String makeCall(Model model) {
		List<CovidModel> callApi = serviceClass.callApi();
		model.addAttribute("listUser", callApi);
		return "covid";
	}
	
}
