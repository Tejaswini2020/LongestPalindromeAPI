package com.springboot.lpalindrome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.lpalindrome.model.StringData;
import com.springboot.lpalindrome.service.SpringDataService;

@RestController
@RequestMapping("/stringpalindrome")
public class StringDataController {
	
	@Autowired
	private SpringDataService dataservice;
	
	@PostMapping("/savepalindrome/{str}")
	public String savePalindrome(@PathVariable String str) {
		return dataservice.getLongestPalindrome(str);
		
	}
	
	
	@SuppressWarnings("unchecked")
	@GetMapping("/getpalindrome/{id}")
	public List<StringData> getPalindromeById(@PathVariable int id) {
		return dataservice.findById(id);
	}
	
	@GetMapping("/getAllsavedData")
	public List<StringData> getAll() {
		return dataservice.findAll();
	}

	

}
