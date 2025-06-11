package kr.co.miniflix.repository;

import kr.co.miniflix.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {
}
