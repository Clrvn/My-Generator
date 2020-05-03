package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Category;
import com.service.CategoryService;
import com.dao.CategoryDao;
import com.utils.RequestParamsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 服务分类ServiceImpl
 * @author Clrvn
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    /**
     * 查询服务分类页面
     * @return 分页服务分类数据
     */
    @Override
    public PageInfo<Category> page(RequestParamsUtil requestParamsUtil) {
        PageHelper.startPage(requestParamsUtil.getPageNo(), requestParamsUtil.getPageSize());
        return new PageInfo<>(categoryDao.list(requestParamsUtil.getParameters()));
    }

    /**
     * 查询服务分类列表
     */
    @Override
    public List<Category> list(Map<String, Object> map) {
        return categoryDao.list(map);
    }


    /**
     * 通过id查询单个服务分类
     */
    @Override
    public Category findById(Integer id) {
        return categoryDao.findById(id);
    }

    /**
     * 通过map查询单个服务分类
     */
    @Override
    public Category findByMap(Map<String, Object> map) {
        return categoryDao.findByMap(map);
    }

    /**
     * 新增服务分类
     */
    @Override
    public int save(Category category) {
        return categoryDao.save(category);
    }

    /**
     * 修改服务分类
     */
    @Override
    public int update(Category category) {
        return categoryDao.update(category);
    }

    /**
     * 删除服务分类
     */
    @Override
    public int deleteById(Integer id) {
        return categoryDao.deleteById(id);
    }

}
