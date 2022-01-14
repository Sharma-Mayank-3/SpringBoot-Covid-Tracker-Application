package com.example.SpringBootTestApiApp1.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.SpringBootTestApiApp1.model.CovidModel;

@Service
public class ServiceClass {

	@Autowired
	private RestTemplate restTemplate;

	public List<CovidModel> callApi() {
		CovidModel[] forObject = restTemplate.getForObject("https://www.mohfw.gov.in/data/datanew.json",
				CovidModel[].class);
		return Arrays.asList(forObject);
	}
}
