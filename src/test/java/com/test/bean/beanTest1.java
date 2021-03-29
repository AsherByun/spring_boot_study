package com.test.bean;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.test.entity.Human;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class beanTest1 {
	@Autowired
	@Qualifier("man")
	private Human human;
	
	@Test
	void 빈테스트1() {
		System.out.println(human.getName());
//		System.out.println();
	}
}
