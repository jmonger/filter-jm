package com.interview.filterjm.repositories;

//import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.interview.filterjm.domain.User;
import com.interview.filterjm.exceptions.UserException;

@Repository
public class UserRepositoryImpl implements UserRepository{
	private static final String SQL_CREATE = "insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'),?,?,?,?)";
	private static final String SQL_COUNT_BY_FIRST_SUR = "select count(*) from users where firstname=? and surname=?";
	private static final String SQL_FIND_BY_ID = "select id, firstname, surname, role, age from users where id=?";
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Integer create(String firstName, String surName, String role, Integer age) throws UserException {
		try {
			KeyHolder keyHolder = new GeneratedKeyHolder();
			
			jdbcTemplate.update(connection -> {
				PreparedStatement ps = connection.prepareStatement(SQL_CREATE, Statement.RETURN_GENERATED_KEYS);
				
				ps.setString(1, firstName);
				ps.setString(2, surName);
				ps.setString(3, role);
				ps.setInt(4, age);
				return ps;
			}, keyHolder);
			
			return (Integer) keyHolder.getKeys().get("id");
			
		} catch (Exception e) {
			throw new UserException("Invalid details. Failed to create User.");
		}
	}

	@Override
	public User findByFirstNameAndSurName(String firstName, String surName) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCountByAge(Integer age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(Integer id) {
		return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new Object[] {id}, userRowMapper);
	}

	@Override
	public Integer getCountByFirstNameAndSurname(String firstName, String surName) {
		return jdbcTemplate.queryForObject(SQL_COUNT_BY_FIRST_SUR, new Object[] {firstName,surName}, Integer.class);
	}
	
	private RowMapper<User> userRowMapper = ((rs, rowNum) -> {
		return new User(rs.getInt("id"),
				rs.getString("firstname"),
				rs.getString("surname"),
				rs.getString("role"),
				rs.getInt("age"));
				
				});
	

}
