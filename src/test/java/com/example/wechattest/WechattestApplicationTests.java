package com.example.wechattest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

@SpringBootTest
class WechattestApplicationTests {

	@Resource
	private JdbcTemplate jdbcTemplate;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void mySqlTest(){
//		String sql = "select * from user";
//		List<User> userlist = (List<User>) jdbcTemplate.query(sql,new RowMapper<User>){
//			@Override
//			public
//		}
//	}

}
