package com.example.notiexam.comment;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notiexam.notice.Notice;
import com.example.notiexam.notice.NoticeService;
import com.example.notiexam.user.User;
import com.example.notiexam.user.UserService;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private NoticeService noticeService;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserService userService;

    @Override
    public void create(Integer id, String content) {
        
        Notice notice = noticeService.readdetail(id);

        Comment c = new Comment();
            c.setContent(content);
            c.setNotice(notice);
            c.setCreateDate(LocalDateTime.now());
            commentRepository.save(c);

    }

    @Override
    public void vote(Integer cid) {

        User user = userService.readdetailusername();

        Optional<Comment> oc = commentRepository.findById(cid);

        Comment comment = oc.get();

        comment.getVoter().add(user);

        commentRepository.save(comment);


    }

	@Override
	public Comment readdetail(Integer id) {
		Optional<Comment> oc = commentRepository.findById(id);
		return oc.get();
	}
    
}
