package edu.icet.ecom.model.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {

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