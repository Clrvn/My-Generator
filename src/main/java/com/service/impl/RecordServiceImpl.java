package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Record;
import com.service.RecordService;
import com.dao.RecordDao;
import com.utils.RequestParamsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 分值记录ServiceImpl
 * @author Clrvn
 */
@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordDao recordDao;

    /**
     * 查询分值记录页面
     * @return 分页分值记录数据
     */
    @Override
    public PageInfo<Record> page(RequestParamsUtil requestParamsUtil) {
        PageHelper.startPage(requestParamsUtil.getPageNo(), requestParamsUtil.getPageSize());
        return new PageInfo<>(recordDao.list(requestParamsUtil.getParameters()));
    }

    /**
     * 查询分值记录列表
     */
    @Override
    public List<Record> list(Map<String, Object> map) {
        return recordDao.list(map);
    }


    /**
     * 通过id查询单个分值记录
     */
    @Override
    public Record findById(Integer id) {
        return recordDao.findById(id);
    }

    /**
     * 通过map查询单个分值记录
     */
    @Override
    public Record findByMap(Map<String, Object> map) {
        return recordDao.findByMap(map);
    }

    /**
     * 新增分值记录
     */
    @Override
    public int save(Record record) {
        return recordDao.save(record);
    }

    /**
     * 修改分值记录
     */
    @Override
    public int update(Record record) {
        return recordDao.update(record);
    }

    /**
     * 删除分值记录
     */
    @Override
    public int deleteById(Integer id) {
        return recordDao.deleteById(id);
    }

}
