package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.PostDTO;
import edu.icet.ecom.model.entity.PostEntity;
import edu.icet.ecom.repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PostService {
    @Autowired
     PostRepository postRepository;

    ModelMapper mapper = new ModelMapper();

    public List<PostDTO> getAllPosts() {

        List<PostEntity> postEntities = postRepository.findAll();
        List<PostDTO> postDTOS = new ArrayList<>();
        for (PostEntity postEntity : postEntities) {


            postDTOS.add(mapper.map(postEntity,PostDTO.class));
        }
        return postDTOS;
    }
    public void createPost(PostDTO postDTO){
        PostEntity postEntity = mapper.map(postDTO,PostEntity.class);
        postRepository.save(postEntity);

    }


    public void updatePost(PostDTO postDTO) {
        PostEntity postEntity = new PostEntity(postDTO.getId(), postDTO.getTitle(), postDTO.getContent(), postDTO.getTags(), postDTO.getCategory(), postDTO.getCommentsCount(),postDTO.getCreatedAt(),postDTO.getUpdateAt(),postDTO.getImageUrl() );
        postRepository.save(postEntity);
    }

    public void deletePost(Long id) {
    postRepository.deleteById(id);
    }


//    public void deletePost(Integer id) {
//        postRepository.deleteById((id));
//    }
}



