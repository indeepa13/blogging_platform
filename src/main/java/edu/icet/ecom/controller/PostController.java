package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.PostDTO;
import edu.icet.ecom.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PostController {
    @Autowired
     PostService postService;

    @GetMapping("/get-all-posts")
    public List<PostDTO> getAllPosts(){
        return postService.getAllPosts();
    }
    @PostMapping("/add")
    public void createPost(@RequestBody PostDTO postDTO){
        postService.createPost(postDTO);
    }
    @PutMapping("/update")
    public void updatePost(@RequestBody PostDTO postDTO){
        postService.updatePost(postDTO);
    }
    @DeleteMapping("delete/{id}")
    public void deletePost(@PathVariable Long id){
        postService.deletePost(id);
    }




}