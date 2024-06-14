package me.clarkquente.market.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import me.clarkquente.market.models.User;

@Converter(autoApply = true)
public class RoleConverter implements AttributeConverter<User.Role, Integer> {

    @Override
    public Integer convertToDatabaseColumn(User.Role role) {
        return role.getValue();
    }

    @Override
    public User.Role convertToEntityAttribute(Integer integer) {
        return User.Role.getRole(integer);
    }

}
