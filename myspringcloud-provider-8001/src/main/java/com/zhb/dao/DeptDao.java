package com.zhb.dao;

import com.zhb.bean.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhb
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
