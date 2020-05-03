package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.Record;
import com.service.RecordService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 分值记录Controller
 * @author Clrvn
 */
@RestController
@RequestMapping("/record")
public class RecordController {

    @Autowired
    private RecordService recordService;

    /**
     * 查询分值记录页面
     * @return 分页分值记录数据
     */
    @GetMapping("/page")
    public PageInfo<Record> page() {
        return recordService.page(new RequestParamsUtil());
    }

    /**
     * 查询分值记录列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<Record> recordList = recordService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(recordList);
    }

    /**
     * 通过id查询单个分值记录
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        Record record =recordService.findById(id);
        return ResultVOUtil.success(record);
    }

    /**
     * 通过map查询单个分值记录
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        Record record =recordService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(record);
    }

    /**
     * 添加分值记录
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody Record record) {
        recordService.save(record);
        return ResultVOUtil.success();
    }

    /**
     * 修改分值记录
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody Record record) {
        recordService.update(record);
        return ResultVOUtil.success();
    }

    /**
     * 删除分值记录
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        recordService.deleteById(id);
        return ResultVOUtil.success();

    }

}