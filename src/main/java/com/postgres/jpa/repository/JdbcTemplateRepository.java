package com.postgres.jpa.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class JdbcTemplateRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public <T> T queryForObject(String sql, Object[] args, Class<T> clazz) {
		try {
			return jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(clazz));
		} catch (Exception e) {
			log.error("Error in getting object ", e.getMessage());
		}
		return null;
	}

	public <T> List<T> query(String sql, Class<T> clazz) {
		try {
			return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(clazz));
		} catch (Exception e) {
			log.error("Error in getting list ", e.getMessage());
		}
		return new ArrayList<>();
	}

}
