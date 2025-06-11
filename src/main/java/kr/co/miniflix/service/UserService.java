package kr.co.miniflix.service;

import java.util.List;
import kr.co.miniflix.domain.User;
import kr.co.miniflix.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void saveUser(UserSignupRequest requset) {
        userRepository.save(new User(requset.getUserId(), requset.getPassword()));
    }

}
