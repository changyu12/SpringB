package com.example.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Override
	public void create(Question question) {
		
		questionRepository.save(question);
	}

	@Override
	public List<Question> readlist() {
		return  questionRepository.findAll();
		
	}

	@Override
	public Question readdetail(Integer id) {

		Optional<Question> oq = questionRepository.findById(id);
		Question q = oq.get();
		
		return q;
		
	}

	@Override
	public void update(Question question) {
		Integer id = question.getId();
		String subject = question.getSubject();
		String content = question.getContent();
		
		Optional<Question> oq = questionRepository.findById(id);
		Question q = oq.get();
		
		q.setSubject(subject);
		q.setContent(content);
		questionRepository.save(q);
		
	}
	
	@Override
	public void delete(Integer id) {
		Optional<Question> oq = questionRepository.findById(id);
		Question q = oq.get();
		questionRepository.delete(q);
		
		
		
	}


	

	

}