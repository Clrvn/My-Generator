package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.Clean;
import com.service.CleanService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 清洁服务Controller
 * @author Clrvn
 */
@RestController
@RequestMapping("/clean")
public class CleanController {

    @Autowired
    private CleanService cleanService;

    /**
     * 查询清洁服务页面
     * @return 分页清洁服务数据
     */
    @GetMapping("/page")
    public PageInfo<Clean> page() {
        return cleanService.page(new RequestParamsUtil());
    }

    /**
     * 查询清洁服务列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<Clean> cleanList = cleanService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(cleanList);
    }

    /**
     * 通过id查询单个清洁服务
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        Clean clean =cleanService.findById(id);
        return ResultVOUtil.success(clean);
    }

    /**
     * 通过map查询单个清洁服务
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        Clean clean =cleanService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(clean);
    }

    /**
     * 添加清洁服务
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody Clean clean) {
        cleanService.save(clean);
        return ResultVOUtil.success();
    }

    /**
     * 修改清洁服务
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody Clean clean) {
        cleanService.update(clean);
        return ResultVOUtil.success();
    }

    /**
     * 删除清洁服务
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        cleanService.deleteById(id);
        return ResultVOUtil.success();

    }

}