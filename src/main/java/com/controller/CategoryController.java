package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.Category;
import com.service.CategoryService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 服务分类Controller
 * @author Clrvn
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 查询服务分类页面
     * @return 分页服务分类数据
     */
    @GetMapping("/page")
    public PageInfo<Category> page() {
        return categoryService.page(new RequestParamsUtil());
    }

    /**
     * 查询服务分类列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<Category> categoryList = categoryService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(categoryList);
    }

    /**
     * 通过id查询单个服务分类
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        Category category =categoryService.findById(id);
        return ResultVOUtil.success(category);
    }

    /**
     * 通过map查询单个服务分类
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        Category category =categoryService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(category);
    }

    /**
     * 添加服务分类
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody Category category) {
        categoryService.save(category);
        return ResultVOUtil.success();
    }

    /**
     * 修改服务分类
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody Category category) {
        categoryService.update(category);
        return ResultVOUtil.success();
    }

    /**
     * 删除服务分类
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        categoryService.deleteById(id);
        return ResultVOUtil.success();

    }

}