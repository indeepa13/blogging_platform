package edu.icet.ecom.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostEntity {
    @Id
    private int id;
    private String title;
    private String content;
    private String text;
    private String category;
    private int  commentsCount;
    private Timestamp createdAt;
    private Timestamp updateAt;
    private String imageUrl;



}