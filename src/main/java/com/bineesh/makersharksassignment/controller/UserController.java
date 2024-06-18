package com.bineesh.makersharksassignment.controller;

import com.bineesh.makersharksassignment.entity.AppUser;
import com.bineesh.makersharksassignment.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    AppUserService appUserService;

    @PostMapping("register")
    public String registerUser(@RequestBody AppUser appUser){
        return appUserService.registerUser(appUser);
    }

    @GetMapping("fetch")
    public AppUser fetchUser(@RequestParam("mail") String userEmail){
        return appUserService.fetchAppUser(userEmail);
    }

}
