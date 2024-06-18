package com.bineesh.makersharksassignment.service;


import com.bineesh.makersharksassignment.entity.AppUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;


public class AppUserDetails implements UserDetails {

    AppUser appUser;

    public AppUserDetails(AppUser appUser){
        this.appUser = appUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return Arrays.stream(this.appUser.getUserRoles().split(","))
                .map(t -> new SimpleGrantedAuthority("ROLE_"+t))
                .collect(Collectors.toList());

    }

    @Override
    public String getPassword() {
        return this.appUser.getUserPassword();
    }

    @Override
    public String getUsername() {
        return this.appUser.getUserEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
