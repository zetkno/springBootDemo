package org.zetkno.bootStart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zetkno.bootStart.dao.UserMapper;
import org.zetkno.bootStart.pojo.User;

import java.util.*;

@RestController
//@RequestMapping(value="/users")  //使下面的映射都在/users下
public class UserController {

    @RequestMapping("/user")
    public String index() {
        return "user";
    }

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public List<User> getUserList() {
        // 处理"/users/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }
    public
//
//    //http://localhost:8888/getUser?username=xiaoli2
//    @RequestMapping("/getUser")
//    public String getUser(String username){
//        User user =userMapper.findUserByUsername(username);
//        return user!=null ? username+"的密码是："+user.getUser_password():"不存在用户名为"+username+"的用户";
//    }
//
//    //http://localhost:8888/updateUser?username=xiaoli2&password=123
//    @RequestMapping("/updateUser")
//    public String updateUser(String password,String username){
//        User user = new User(username,password);
//        userMapper.updateUserByUsername(user);
//        return "success!";
//    }
//
//
//    //http://localhost:8888/addUser?username=xiaoli2&password=123
//    @RequestMapping("/addUser")
//    public String addUser(String username,String password){
//        User user = new User(username,password);
//        userMapper.saveUser(user);
//        return "success!";
//    }
//
//    //http://localhost:8888/addUser?username=xiaoli2
//    @RequestMapping("/deleteUser")
//    public String deleteUser(String username){
//        userMapper.deleteUserByUsername(username);
//        return "success!";
//    }
//
//    //http://localhost:8888/getUserList
//    @RequestMapping("/getUserList")
//    public List getUserList(String username, String password){
//        return userMapper.getUserList();
//    }



}
