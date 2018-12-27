package model;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {


    public User mapRow(ResultSet resultSet, int i) throws SQLException {

        User user = new User();
        user.setId(resultSet.getInt(1));
        user.setSurname(resultSet.getString(2));
        return user;
    }
}
