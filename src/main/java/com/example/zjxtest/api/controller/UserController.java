package com.example.zjxtest.api.controller;

import com.example.zjxtest.datamysql.User;
//import com.example.zjxtest.datamysql.UserRepository;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController// This means that this class is a Controller
@RequestMapping(path="/test") // This means URL's start with /demo (after Application path)
public class UserController {
//    @Autowired // This means to get the bean called userRepository
//    // Which is auto-generated by Spring, we will use it to handle the data
//    private UserRepository userRepository;
//
//
    @RequestMapping(value={"/add"},method = RequestMethod.POST) // Map ONLY POST Requests
    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    public String addNewUser (@RequestBody User user) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

//        User n = new User();
//        n.setName(user.getName());
//        n.setGender(user.getGender());
//        n.setAge(user.getAge());
//        n.setSeat(user.getSeat());
//        userRepository.save(n);
        System.out.println(user);
        return "Saved";
    }
//
//    @RequestMapping(value={"/all"},method = RequestMethod.GET)
//    public @ResponseBody Iterable<User> getAllUsers() {
//        // This returns a JSON or XML with the users
//        return userRepository.findAll();
//    }
}