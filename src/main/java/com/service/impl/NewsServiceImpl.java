package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.News;
import com.service.NewsService;
import com.dao.NewsDao;
import com.utils.RequestParamsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 新闻信息ServiceImpl
 * @author Clrvn
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;

    /**
     * 查询新闻信息页面
     * @return 分页新闻信息数据
     */
    @Override
    public PageInfo<News> page(RequestParamsUtil requestParamsUtil) {
        PageHelper.startPage(requestParamsUtil.getPageNo(), requestParamsUtil.getPageSize());
        return new PageInfo<>(newsDao.list(requestParamsUtil.getParameters()));
    }

    /**
     * 查询新闻信息列表
     */
    @Override
    public List<News> list(Map<String, Object> map) {
        return newsDao.list(map);
    }


    /**
     * 通过id查询单个新闻信息
     */
    @Override
    public News findById(Integer id) {
        return newsDao.findById(id);
    }

    /**
     * 通过map查询单个新闻信息
     */
    @Override
    public News findByMap(Map<String, Object> map) {
        return newsDao.findByMap(map);
    }

    /**
     * 新增新闻信息
     */
    @Override
    public int save(News news) {
        return newsDao.save(news);
    }

    /**
     * 修改新闻信息
     */
    @Override
    public int update(News news) {
        return newsDao.update(news);
    }

    /**
     * 删除新闻信息
     */
    @Override
    public int deleteById(Integer id) {
        return newsDao.deleteById(id);
    }

}
