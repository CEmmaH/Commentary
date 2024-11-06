package com.cemmah.commentary.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.cemmah.commentary.po.Comment;

/**
 * CommentRepository provides methods for CRUD operations on Comment documents in MongoDB.
 * Extends MongoRepository to inherit basic database operations.
 * Author：Emma
 * Date：11/6/2024
 * Version: 1.0
 * @see  MongoRepository
 */
public interface CommentRepository extends MongoRepository<Comment, String>{
    /**
     * Finds a page of comments by the specified parent ID.
     *
     * @param parentid the ID of the parent comment to filter by
     * @param pageable the pagination information
     * @return a Page of comments associated with the given parent ID
     */
    Page<Comment> findByParentid(String parentid, Pageable pageable);
}
