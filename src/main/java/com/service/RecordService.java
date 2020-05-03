package com.service;

import com.model.Record;
import com.github.pagehelper.PageInfo;
import com.utils.RequestParamsUtil;

import java.util.List;
import java.util.Map;

/**
 * 分值记录Service
 * @author Clrvn
 */
public interface RecordService {

	/**
	 * 查询分值记录页面
	 * @return 分页分值记录数据
	 */
	PageInfo<Record> page(RequestParamsUtil requestParamsUtil);

	/**
	 * 查询分值记录列表
	 */
	List<Record> list(Map<String, Object> map);

	/**
	 * 通过id查询单个分值记录
	 */
    Record findById(Integer id);

	/**
	 * 通过map查询单个分值记录
	 */
	Record findByMap(Map<String, Object> map);

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
