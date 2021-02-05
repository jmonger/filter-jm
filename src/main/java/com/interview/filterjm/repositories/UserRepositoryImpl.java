package com.interview.filterjm.repositories;

//import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.interview.filterjm.domain.User;
import com.interview.filterjm.exceptions.UserException;
import com.interview.filterjm.exceptions.UserResourceNotFoundException;

@Repository
public class UserRepositoryImpl implements UserRepository{
	private static final String SQL_CREATE = "insert into users (id, firstname, surname, role, age) values (nextval('users_id_seq'),?,?,?,?)";
	private static final String SQL_COUNT_BY_FIRST_SUR = "select count(*) from users where firstname=? and surname=?";
	private static final String SQL_FIND_BY_ID = "select id, firstname, surname, role, age from users where id=?";
	private static final String SQL_GET_ALL = "select id, firstname, surname, role, age from users";
	private static final String SQL_GET_BY_FIRST = "select id, firstname, surname, role, age from users where firstname=?";
	private static final String SQL_GET_BY_SUR = "select id, firstname, surname, role, age from users where surname=?";
	private static final String SQL_GET_BY_ROLE = "select id, firstname, surname, role, age from users where role=?";
	private static final String SQL_GET_BY_AGE = "select id, firstname, surname, role, age from users where age=?";


	
	
	
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
	public List<User> getAllUsers() throws UserException {		
		return jdbcTemplate.query(SQL_GET_ALL, userRowMapper);
	}

	@Override
	public User getUserById(Integer id) throws UserResourceNotFoundException {
		try {
			return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, userRowMapper, id);
		} catch (Exception e) {
			throw new UserResourceNotFoundException("User Not found.");
		}
	}
	
	@Override
	public Integer getCountByFirstNameAndSurname(String firstName, String surName) {
		return jdbcTemplate.queryForObject(SQL_COUNT_BY_FIRST_SUR, Integer.class, firstName,surName);
	}
	
	private RowMapper<User> userRowMapper = ((rs, rowNum) -> {
		return new User(rs.getInt("id"),
				rs.getString("firstname"),
				rs.getString("surname"),
				rs.getString("role"),
				rs.getInt("age"));
				
				});

	@Override
	public List<User> getUsersBySurName(String surName) throws UserException {
		return jdbcTemplate.query(SQL_GET_BY_SUR, userRowMapper, surName);
	}

	@Override
	public List<User> getUsersByAge(Integer age) throws UserException {
		return jdbcTemplate.query(SQL_GET_BY_AGE, userRowMapper,age);
	}

	@Override
	public List<User> getUsersByFirstName(String firstName) throws UserException {
		return jdbcTemplate.query(SQL_GET_BY_FIRST, userRowMapper,firstName);
	}

	@Override
	public List<User> getUsersByRole(String role) throws UserException {
		return jdbcTemplate.query(SQL_GET_BY_ROLE, userRowMapper, role);
	}

	
}
