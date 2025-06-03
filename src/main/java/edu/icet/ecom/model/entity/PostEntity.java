package edu.icet.ecom.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="blog_posts")

public class PostEntity {
    @Id
    private int id;
    private String title;
    private String content;
    private String tags;
    private String category;

    @Column(name = "comments_count")
    private int  commentsCount;

    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updateAt;
    private String imageUrl;



}