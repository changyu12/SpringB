package com.example.y.board;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class BoardJDBCRepositoryImpl implements BoardRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void create(Map<String, Object> map) {
		String sql = "INSERT INTO board (bno, bwriter, bcontent, bimg) "
					+ "VALUES(#{bno}, #{bwriter}, #{bcontent}, #{bimg})";
		jdbcTemplate.update(sql,(String)map.get("bno"),
								(String)map.get("bwriter"),
								(String)map.get("bcontent"),
								(String)map.get("bimg")
								);
	}

	@Override
	public List<Board> readlist() {
		String sql = "SELECT * FROM board";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Board>(Board.class));
	}

	@Override
	public Board readdetail(String bno) {
		String sql = "SELECT * FROM board WHERE bno = " + bno;
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Board>(Board.class));
	}

	@Override
	public void update(Map<String, Object> map) {
		String sql = "UPDATE board SET bwriter= ?, bcontent= ?, bimg = ?  WHERE bno = ?";
		jdbcTemplate.update(sql,(String)map.get("bwriter"),
								(String)map.get("bcontent"),
								(String)map.get("bimg"),
								(String)map.get("bno")
								);
	

	}

	@Override
	public void delete(String bno) {
		String sql = "DELETE FROM board WHERE bno = ? ";
		jdbcTemplate.update(sql, bno);
	}

}
