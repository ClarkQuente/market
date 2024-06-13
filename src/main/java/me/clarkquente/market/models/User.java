package me.clarkquente.market.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String username;
    private String password;

    private Role role;

    @AllArgsConstructor
    @Getter
    enum Role {

        NORMAL(0),
        ADMIN(1),
        OWNER(2);

        private final int value;

    }
}
