package com.frodel.services;

import com.frodel.model.Comment;
import com.frodel.model.User;
import com.frodel.repositories.CommentRepository;
import com.frodel.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hichem on 30/03/2018.
 */
@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository ;

    /**
     * Save the given utilisateur
     * @param comment the utilisateur
     * @return the saved utilisateur
     */
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment) ;
    }
}
