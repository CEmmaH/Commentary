package com.cemmah.commentary.service;

import com.cemmah.commentary.dao.CommentRepository;
import com.cemmah.commentary.po.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * CommentService provides business logic and operations related to Comment entities.
 * This service handles actions such as saving, updating, and retrieving comments,
 * and interacts with the CommentRepository for database operations.
 *
 * <p>This class is annotated with @Service, indicating that it's a Spring service component
 * which can be injected into other parts of the application.
 *
 * Author：Emma
 * Date：11/6/2024
 * Version: 1.0
 */
@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * Save a comment to MongoDB
     * @param comment
     */
    public void saveComment(Comment comment){
        commentRepository.save(comment);
    }

    /**
     * update a comment to MongoDB
     * @param comment
     */
    public void updateComment(Comment comment){
        commentRepository.save(comment);
    }

    /**
     * delete a comment filter by id
     * @param id
     */
    public void deleteCommentById(String id){
        commentRepository.deleteById(id);
    }

    /**
     * Fing all comments
     * @return
     */
    public List<Comment> findCommentList(){
        return commentRepository.findAll();
    }

    /**
     * Find a comment filter by id
     * @param id
     * @return
     */
    public Comment findCommentById(String id){
        return commentRepository.findById(id).get();
    }

    /**
     * Finds a page of comments by the specified parent ID.
     * @param parentid
     * @param page
     * @param size
     * @return
     */
    public Page<Comment> findCommentListByParentid(String parentid, int page, int size){
        return commentRepository.findByParentid(parentid, PageRequest.of(page-1, size));
    }

    /**
     * Update a comment's like number filter by id
     * @param id
     */
    public void updateCommentLikenumById(String id){
        // set query where _id = id
        Query query = Query.query(Criteria.where("_id").is(id));
        // increase likenum by 1
        Update update = new Update();
        update.inc("likenum");
        mongoTemplate.updateFirst(query,update,Comment.class);
    }
}
