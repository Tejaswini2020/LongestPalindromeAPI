package com.springboot.lpalindrome.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.lpalindrome.model.StringData;

public interface StringDataRepository extends JpaRepository<StringData,Integer> {
	List<StringData> findById(int id);

}
