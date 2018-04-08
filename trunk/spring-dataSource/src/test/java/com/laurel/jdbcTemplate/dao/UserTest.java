package com.laurel.jdbcTemplate.dao;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import  com.mysql.jdbc.Driver;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-jdbcTemplate.xml"})

public class UserTest {
	@Autowired
	public DriverManagerDataSource driverManagerDataSource;
	@Test
	public void testNotNull(){
		System.out.println(driverManagerDataSource.getUsername());
	}
	@Test
	public void selectInt (){

		JdbcTemplate jdbcTemplate = new JdbcTemplate(driverManagerDataSource);

		String SQL = "select count(*) from student";

		int rowCount = jdbcTemplate.queryForInt(SQL);
		Assert.assertNotNull(rowCount);
	}

}
