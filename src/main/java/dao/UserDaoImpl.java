package dao;

import model.User;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User getUser(int id) {
        return null;
    }


}
