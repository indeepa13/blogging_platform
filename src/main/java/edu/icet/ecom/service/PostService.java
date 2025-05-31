package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.PostDTO;
import edu.icet.ecom.model.entity.PostEntity;
import edu.icet.ecom.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PostService {
    @Autowired
    static PostRepository postRepository;

    public static List<PostDTO> getAllPosts() {




        List<PostEntity> postEntities = postRepository.findAll();
        List<PostDTO> postDTOS = new ArrayList<>();
        for (PostEntity postEntity : postEntities) {
            PostDTO postDTO = new PostDTO();

            postDTO.setId(postEntity.getId());
            postDTO.setTitle(postEntity.getTitle());
            postDTO.setContent(postEntity.getContent());
            postDTO.setText(postEntity.getText());
            postDTO.setCategory(postDTO.getCategory());
            postDTO.setCommentsCount(postEntity.getCommentsCount());
            postDTO.setCreatedAt(postEntity.getCreatedAt());
            postDTO.setUpdateAt(postEntity.getUpdateAt());
            postDTO.setImageUrl(postEntity.getImageUrl());

            postDTOS.add(postDTO);
        }
        return postDTOS;
    }



        }



