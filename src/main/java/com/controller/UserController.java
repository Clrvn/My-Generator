package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.User;
import com.service.UserService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户Controller
 *
 * @author Clrvn
 * @date 2020-05-01 17:18:25
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户页面
     * @return 分页用户数据
     */
    @GetMapping("/page")
    public PageInfo<User> page() {
        return userService.page(new RequestParamsUtil());
    }

    /**
     * 查询用户列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<User> userList = userService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(userList);
    }

    /**
     * 通过id查询单个用户
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        User user =userService.findById(id);
        return ResultVOUtil.success(user);
    }

    /**
     * 通过map查询单个用户
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        User user =userService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(user);
    }

    /**
     * 添加用户
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody User user) {
        userService.save(user);
        return ResultVOUtil.success();
    }

    /**
     * 修改用户
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody User user) {
        userService.update(user);
        return ResultVOUtil.success();
    }

    /**
     * 删除用户
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer  id) {
        userService.deleteById(id);
        return ResultVOUtil.success();

    }

}