package com.fsalim.blogfsalim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fsalim.blogfsalim.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
