package org.zetkno.bootStart.dao;

import org.apache.ibatis.annotations.Mapper;
import org.zetkno.bootStart.pojo.User;
import java.util.List;

@Mapper
public interface UserMapper {
    User findUserByUsername(String username);

    void updateUserByUsername(User user);

    void deleteUserByUsername(String username);

    void saveUser(User user);

    List<User> getUserList();
}
