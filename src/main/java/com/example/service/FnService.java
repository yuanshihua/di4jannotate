package com.example.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FnService {
	public int add(int i, int j) {
		return i+j;
	}
	

	
	
}
