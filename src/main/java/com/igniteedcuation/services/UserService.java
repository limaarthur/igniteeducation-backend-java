package com.igniteedcuation.services;

import com.igniteedcuation.dtos.UserDTO;
import com.igniteedcuation.entities.User;
import com.igniteedcuation.repositories.UserRepository;
import com.igniteedcuation.services.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        User user = optionalUser.orElseThrow(() -> new ResourceNotFoundException("User not found"));
        return new UserDTO(user);
    }
}
