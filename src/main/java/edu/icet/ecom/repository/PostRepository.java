package edu.icet.ecom.repository;

import edu.icet.ecom.model.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PostRepository  extends JpaRepository<PostEntity,Long> {

}
