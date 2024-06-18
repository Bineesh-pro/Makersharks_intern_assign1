package com.bineesh.makersharksassignment;


import com.bineesh.makersharksassignment.entity.AppUser;
import com.bineesh.makersharksassignment.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MakersharksassignmentApplication implements CommandLineRunner {

    @Autowired
    AppUserService appUserService;

    public static void main(String[] args) {
        SpringApplication.run(MakersharksassignmentApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {
        appUserService.clearDb();
        appUserService.registerUser(new AppUser(0,"MakerSharks","makersharks@gmail.com","makersharks@2025","ADMIN"));
        appUserService.registerUser(new AppUser(0,"Bineesh","bineesh@gmail.com","bineesh@2025","USER"));
    }
}
