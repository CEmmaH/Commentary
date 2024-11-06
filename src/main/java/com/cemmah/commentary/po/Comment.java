package com.cemmah.commentary.po;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * This class related to MongoDB collection - comment
 * Author：Emma
 * Date：11/6/2024
 * Version: 1.0
 */
@Document(collection = "comment")
@CompoundIndex(def = "{'userid': 1, 'nickname': -1}")
public class Comment implements Serializable {
    @Id
    private String id;
    @Field("content")
    private String content;
    private LocalDate publishtime;
    @Indexed
    private String userid;
    private String nickname;
    private LocalDateTime createdatetime;
    private Integer likenum;
    private Integer replynum;
    private String state;
    private String parentid;
    private String articleid;

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getPublishtime() {
        return publishtime;
    }

    public String getUserid() {
        return userid;
    }

    public String getNickname() {
        return nickname;
    }

    public LocalDateTime getCreatedatetime() {
        return createdatetime;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public Integer getReplynum() {
        return replynum;
    }

    public String getState() {
        return state;
    }

    public String getParentid() {
        return parentid;
    }

    public String getArticleid() {
        return articleid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublishtime(LocalDate publishtime) {
        this.publishtime = publishtime;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setCreatedatetime(LocalDateTime createdatetime) {
        this.createdatetime = createdatetime;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    public void setReplynum(Integer replynum) {
        this.replynum = replynum;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid;
    }
    @Override
    public String toString(){
        return "Comment {" +
                "id = '"+id+"'" +
                ", content = '" + content + '\'' +
                ", publishtime = " + publishtime +
                ", userid = '" + userid + "'" +
                ", nickname = '" + nickname + "'" +
                ", createdatetime = "+ createdatetime +
                ", likenum = " +likenum +
                ", replynum = "+replynum +
                ", state = '" + state + "'" +
                ", pratentid = '" + parentid +"'" +
                ", articleid = '" + articleid +"'" +
                "}";
    }
}
