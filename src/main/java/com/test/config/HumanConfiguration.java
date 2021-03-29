package com.test.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.test.entity.Human;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Configuration
@RequiredArgsConstructor
@Slf4j
@EnableConfigurationProperties(HumanProperties.class)
public class HumanConfiguration {
	
	@Qualifier("man")
	@Bean
	public Human human() {
		Human human = new Human();
		human.setAge(27);
		human.setName("성재");
		log.info("남자 생성");
		return human;
	}
	
	@Qualifier("woman")
	@Bean
	public Human human2() {
		Human human = new Human();
		human.setAge(27);
		human.setName("나연");
		log.info("여자 생성");
		return human;
	}
	
	@Primary
	@Bean
	public Human human3() {
		Human human = new Human();
		human.setAge(27);
		human.setName("석천");
		log.info("중성 생성");
		return human;
	}
}
