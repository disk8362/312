package springBoot.Task3.dao;


import springBoot.Task3.model.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(int id);
    public void updateUser(User user);
    public void deleteUser(int id);
}
