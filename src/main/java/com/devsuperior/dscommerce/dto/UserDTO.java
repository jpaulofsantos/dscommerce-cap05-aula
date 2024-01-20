package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Role;
import com.devsuperior.dscommerce.entities.User;
import jakarta.persistence.Column;
import org.springframework.security.core.GrantedAuthority;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;

    private List<String> roles = new ArrayList<>();

    public UserDTO(User user) {
        id = user.getId();
        name = user.getUsername();
        email = user.getEmail();
        phone = user.getPhone();
        birthDate = user.getBirthDate();
        for (GrantedAuthority item : user.getRoles()) {
            roles.add(item.getAuthority());
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getRoles() {
        return roles;
    }
}
