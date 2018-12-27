package dao;

import model.User;
import model.UserMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User getUser(int id) {

        String sql="select * from users where id=?;";
        return jdbcTemplate.queryForObject(sql,new Integer[]{id}, new UserMapper());


    }


}
