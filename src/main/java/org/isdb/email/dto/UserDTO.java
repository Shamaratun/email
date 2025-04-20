package org.isdb.email.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Role;

@Getter
@Setter
public record UserDTO {
    private Long id;
    private String email;
    private Role role;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}