package com.bineesh.makersharksassignment.service;


import com.bineesh.makersharksassignment.entity.AppUser;
import com.bineesh.makersharksassignment.exception.UserNotFoundException;
import com.bineesh.makersharksassignment.repo.AppUserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;


@Service
public class AppUserService {

    @Autowired
    AppUserRepo appUserRepo;

    @Autowired
    PasswordEncoder passwordEncoder;


    public String registerUser(AppUser appUser){
        appUser.setUserPassword(passwordEncoder.encode(appUser.getUserPassword()));
        appUserRepo.save(appUser);
        return "user saved";
    }

    public AppUser fetchAppUser(String userEmail){
        return Optional.ofNullable(appUserRepo.findByUserEmail(userEmail)).orElseThrow(()->new UserNotFoundException("no such user found"));
    }

    public void clearDb(){
        appUserRepo.deleteAll();
    }







}
