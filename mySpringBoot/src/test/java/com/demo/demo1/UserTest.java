package com.demo.demo1;

import com.demo.demo1.Models.User;
import com.demo.demo1.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qianweijie on 2019/6/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Resource
    private UserController userController;

    @Test
    public void testAddUser() {
        User user = new User();
        user.setName("SpringBoot");
        user.setAge(8);
        user.setId(1L);
        userController.addUser(1L,user);
        System.out.println(user);
    }

    @Test
    public void testUser() {
        User user = userController.getUser(1L);
        System.out.println(user);
    }

    @Test
    public void testDeleteUser() {
        userController.deleteUser(1L);
        System.out.println("删除成功");
    }

    @Test
    public void testPostUser() {
        User user = new User();
        user.setName("SpringBoot2");
        user.setAge(9);
        user.setId(2L);
        userController.postUser(user);
        System.out.println("创建用户成功");
    }

    @Test
    public void testUserList() {
        List<User> users = userController.getUserList();
        System.out.println(users);
    }

}
