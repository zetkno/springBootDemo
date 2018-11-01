package org.zetkno.bootStart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zetkno.bootStart.dao.UserMapper;
import org.zetkno.bootStart.pojo.User;
import java.util.*;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;


//
//    localhost:8080/getUser?username=xiaopengpeng
    @RequestMapping("/getUser")
    public String getUser(String username){
        User user = userMapper.findUserByUsername(username);
        System.out.println("getUser");
        return user!=null ? username+"的密码是："+user.getUser_password():"不存在用户名为"+username+"的用户";
    }
//
//   localhost:8080/updateUser?username=xiaojingjing&password=123456
    @RequestMapping("/updateUser")
    public String updateUser(String password,String username){
        User user = new User(username,password);
        userMapper.updateUserByUsername(user);
        return "更新密码success!";
    }

//   localhost:8080/addUser?username=xiaopengpeng&password=123
    @RequestMapping("/addUser")
    public String addUser(String username,String password){
        User user = new User(username,password);
        userMapper.saveUser(user);
        System.out.println("success");
        return "success!";
    }

//   localhost:8080/deleteUser?username=xiaopengpeng
    @RequestMapping("/deleteUser")
    public String deleteUser(String username){
        userMapper.deleteUserByUsername(username);
        return "deleteUser success!";
    }

    //  localhost:8888/getUserList
    @RequestMapping("/getUserList")
    public List getUserList(){
        return userMapper.getUserList();
    }



}
