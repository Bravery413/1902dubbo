package pojo.service.impl;

import pojo.User;
import pojo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User selectById(String id) {
        User user = new User();
        user.setId(1);
        user.setName("py");
        return user;
    }
}
