package ru.qlogistic.web.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.qlogistic.logic.model.Role;
import ru.qlogistic.logic.model.User;
import ru.qlogistic.logic.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class SecurityUserServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User currentUser = userService.findByUsername(email);
        if(currentUser != null){
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            for(Role role : currentUser.getRoles()){
                authorities.add(new SimpleGrantedAuthority(role.getRole()));
            }
            return new org.springframework.security.core.userdetails.User(currentUser.getUsername(), currentUser.getPassword(), authorities);
        }
        throw new UsernameNotFoundException(String.format("User with username:%s does not exist!", email));
    }
}
