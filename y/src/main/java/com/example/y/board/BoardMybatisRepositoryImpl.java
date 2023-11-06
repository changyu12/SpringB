package com.example.y.board;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class BoardMybatisRepositoryImpl implements BoardRepository {

    @Autowired
      private SqlSessionTemplate sqlSessionTemplate;

      @Override
      public void create(Map<String, Object> map) {
         
         sqlSessionTemplate.insert("board.create", map);
      }

      @Override
      public void update(Map<String, Object> map) {
         sqlSessionTemplate.update("board.update",map);
      }

      @Override
      public void delete(String bno) {
         sqlSessionTemplate.delete("board.delete", bno);

      }

	@Override
	public List<Board> readlist() {
		
		return sqlSessionTemplate.selectList("board.readlist");
	}

	@Override
	public Board readdetail(String bno) {
		  return sqlSessionTemplate.selectOne("board.readdetail",bno);
	}

   }