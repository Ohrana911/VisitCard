package com.example.marketreg.repositories;

import com.example.marketreg.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Long> {
}
