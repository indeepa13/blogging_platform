package edu.icet.ecom.model.dto;

import jakarta.persistence.Id;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {

    private int id;
    private String title;
    private String content;
    private String tags;
    private String category;
    private int  commentsCount;
    private Timestamp createdAt;
    private Timestamp updateAt;
    private String imageUrl;


}