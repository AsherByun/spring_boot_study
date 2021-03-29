package com.test.config;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ConfigurationProperties("human")
@Getter
@Setter
@ToString
@Slf4j
public class HumanProperties {
	private String name;
	private int age;
	
	@PostConstruct
	public void init() {
		log.info("프로퍼티 생성"+name+age);
	}
}
