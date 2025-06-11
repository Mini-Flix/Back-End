package kr.co.miniflix.controller;

import java.util.List;
import kr.co.miniflix.domain.User;
import kr.co.miniflix.service.UserService;
import kr.co.miniflix.service.UserSignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("/users")
    public void saveUser(@RequestBody UserSignupRequest request) {
        userService.saveUser(request);
    }
}
