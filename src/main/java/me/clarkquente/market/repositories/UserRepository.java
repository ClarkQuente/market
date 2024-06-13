package me.clarkquente.market.repositories;

import me.clarkquente.market.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
