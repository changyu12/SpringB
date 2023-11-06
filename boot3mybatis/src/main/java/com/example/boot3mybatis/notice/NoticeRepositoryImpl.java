package com.example.boot3mybatis.notice;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeRepositoryImpl implements NoticeRepository {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void create(Notice notice) {
		sqlSessionTemplate.insert("notice.create", notice);
		
	}

	@Override
	public List<Notice> readlist() {
		return sqlSessionTemplate.selectList("notice.readlist");
	}

	@Override
	public Notice readdetail(String nid) {
		return sqlSessionTemplate.selectOne("notice.readdetail", nid);
	}

	@Override
	public void update(Notice notice) {
		sqlSessionTemplate.update("notice.update", notice);

	}

	@Override
	public void delete(String nid) {
		sqlSessionTemplate.delete("notice.delete", nid);

	}

}
