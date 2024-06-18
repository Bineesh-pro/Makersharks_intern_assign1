package com.bineesh.makersharksassignment;


import com.bineesh.makersharksassignment.entity.AppUser;
import com.bineesh.makersharksassignment.service.AppUserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MakersharksassignmentApplicationTests {


    @Autowired
    AppUserService appUserService;

    @Test
    void testRegistration() {
        String expectedOutput1 = "user saved";
        String actualOutput1 =   appUserService.registerUser(new AppUser(0,"test1","test1@gmail.com","test1@2025","USER"));
        Assertions.assertEquals(expectedOutput1,actualOutput1);

    }

}
