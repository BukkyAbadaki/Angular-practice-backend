package com.example.angularpracticebackend.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users")
@Data

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
