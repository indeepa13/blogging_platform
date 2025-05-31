package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.PostDTO;
import edu.icet.ecom.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value ="api/blogs" )
public class PostController {
    @Autowired
    private PostService postService;

    //Get all blogs
    @GetMapping("/createblog")
    public List<PostDTO> getAllBlogs(){
        return PostService.getAllPosts();
    }


}