package com.laurel.jdbcTemplate.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-jdbcTemplate.xml"})

public class UserTest {
	@Autowired
	public DriverManagerDataSource driverManagerDataSource;
	@Test
	public void test01(){
		System.out.println(driverManagerDataSource.getUsername());
	}

}
