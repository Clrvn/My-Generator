package com.dao;

import com.model.Record;

import java.util.List;
import java.util.Map;


/**
 * 分值记录DAO
 * @author Clrvn
 */
public interface RecordDao {

    /**
     * 通过id查询单个分值记录
     */
    Record findById(Integer id);

    /**
     * 通过map查询单个分值记录
     */
    Record findByMap(Map<String, Object> map);

    /**
     * 查询分值记录列表
     */
    List<Record> list(Map<String, Object> map);

    /**
     * 新增分值记录
     */
    int save(Record record);

    /**
     * 修改分值记录
     */
    int update(Record record);

    /**
     * 删除分值记录
     */
    int deleteById(Integer id);

}
