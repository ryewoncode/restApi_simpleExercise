package com.ryewon.demoApi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demoApi")
public class demo {
	@GetMapping(value = "/data")
	public Map<String, Object> getDemoData(@RequestParam("apiKey") String apiKey) {
		Map<String, Object> map = new HashMap<>();
		map.put("apiKey", apiKey);
		map.put("firstName", "Ryewon");
		map.put("LastName", "Kim");
		map.put("Position", "BackEnd");
		return map;
	}
}
