package com.example.zjxtest;

import com.example.zjxtest.datamysql.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ZjxtestApplicationTests {

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
