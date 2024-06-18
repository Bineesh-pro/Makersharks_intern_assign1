package com.bineesh.makersharksassignment.repo;

import com.bineesh.makersharksassignment.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AppUserRepo extends JpaRepository<AppUser,Integer>{
    AppUser findByUserEmail(String userEmail);
}
