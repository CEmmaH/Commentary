package com.cemmah.commentary.service;

import com.cemmah.commentary.po.Comment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentServiceTest {
    @Autowired
    private CommentService commentService;

    @Test
    public void testSaveComment(){
        Comment comment = new Comment();
        comment.setArticleid("1");
        comment.setUserid("user1");
        comment.setContent("This is the first comment.");
        comment.setPublishtime(LocalDate.now());
        comment.setNickname("Emma");
        comment.setReplynum(Integer.valueOf(0));
        commentService.saveComment(comment);
        System.out.println("saved");
    }
    @Test
    public void testFindCommentById(){
        String id = "672bc302c403903c7e15a15a";
        Comment comment = commentService.findCommentById(id);
        System.out.println("comment's content is : "+comment.getContent());
    }
    @Test
    public void testFindCommentListByParentid(){
        Page<Comment> page = commentService.findCommentListByParentid("3",2,2);
        System.out.println(page.getTotalElements());
        System.out.println(page.getContent());
    }
    @Test
    public  void testUpdateCommentLikenumById(){
        commentService.updateCommentLikenumById("672bc302c403903c7e15a15a");

    }
}
