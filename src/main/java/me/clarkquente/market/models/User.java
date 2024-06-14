package me.clarkquente.market.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.clarkquente.market.converters.RoleConverter;

import java.util.Arrays;

@Getter
@Setter
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String username;
    private String password;

    @Convert(converter = RoleConverter.class)
    @Column(columnDefinition = "TINYINT(1)")
    private Role role;

    @AllArgsConstructor
    @Getter
    public enum Role {

        USER(0),
        ADMIN(1),
        OWNER(2);

        private final int value;

        public static Role getRole(int value) {
            return Arrays.stream(values())
                    .filter(role -> role.getValue() == value)
                    .findFirst()
                    .orElse(null);
        }

    }
}
