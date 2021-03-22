package com.springboot.lpalindrome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.lpalindrome.model.StringData;
import com.springboot.lpalindrome.repository.StringDataRepository;
@Service
public class SpringDataService {

	@Autowired
	private StringDataRepository repository;

		public String getLongestPalindrome(String str) {
			//validation
			if(str.isEmpty())
				return "Enter valid String data";
			if(str.length()==1)
				return str;
			
			String longest = str.substring(0,1);
			for (int i = 0; i < str.length(); i++) {
				
					//odd check
			String temp = checkEquality(str,i,i);
			if (longest.length()<temp.length()) {
				longest=temp;
						}
			
			//even check
			temp=checkEquality(str, i, i+1);
			if (longest.length()<temp.length()) {
				longest=temp;
						}
			}
			
			StringData data = new StringData();
			data.setStr(longest);
			repository.save(data);	
			return longest;
			
		}
		
		public  String checkEquality(String str, int start, int end) {
			while(start>=0 && end<=str.length()-1 && str.charAt(start)==str.charAt(end)) {
				start--;
				end++;
			}
			return str.substring(start+1,end);
			}

		public List<StringData> findById(int id) {
			return repository.findById(id);
		}

		public List<StringData> findAll() {
			return repository.findAll();
		}
}


