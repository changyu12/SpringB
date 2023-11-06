package com.example.notiexam.comment;

public interface CommentService {
    
    void create(Integer id, String content);

    void vote(Integer cid);
    
    Comment readdetail(Integer id);
}
