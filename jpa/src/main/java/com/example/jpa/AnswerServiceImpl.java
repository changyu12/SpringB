package com.example.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService {

	@Autowired
	private AnswerRepository answerRepository;
	
	@Override
	public void create(Answer answer) {
		answerRepository.save(answer);

	}

	@Override
	public List<Answer> readlist() {
		
		return answerRepository.findAll();
	}

	@Override
	public Answer readdetail(Integer id) {
		
		Optional<Answer> oq = answerRepository.findById(id);
		Answer q = oq.get();
		
		return q;
	}

	@Override
	public void update(Answer answer) {
		Integer id = answer.getId();
		String subject = answer.getSubject();
		String content = answer.getContent();
		
		Optional<Answer> oq = answerRepository.findById(id);
		Answer q= oq.get();
		
		q.setSubject(subject);
		q.setContent(content);
		answerRepository.save(q);
		

	}

	@Override
	public void delete(Integer id) {
		Optional<Answer> oq = answerRepository.findById(id);
		Answer q = oq.get();
		answerRepository.delete(q);

	}

}
