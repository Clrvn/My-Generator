package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.News;
import com.service.NewsService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 新闻信息Controller
 * @author Clrvn
 */
@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    /**
     * 查询新闻信息页面
     * @return 分页新闻信息数据
     */
    @GetMapping("/page")
    public PageInfo<News> page() {
        return newsService.page(new RequestParamsUtil());
    }

    /**
     * 查询新闻信息列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<News> newsList = newsService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(newsList);
    }

    /**
     * 通过id查询单个新闻信息
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        News news =newsService.findById(id);
        return ResultVOUtil.success(news);
    }

    /**
     * 通过map查询单个新闻信息
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        News news =newsService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(news);
    }

    /**
     * 添加新闻信息
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody News news) {
        newsService.save(news);
        return ResultVOUtil.success();
    }

    /**
     * 修改新闻信息
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody News news) {
        newsService.update(news);
        return ResultVOUtil.success();
    }

    /**
     * 删除新闻信息
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        newsService.deleteById(id);
        return ResultVOUtil.success();

    }

}