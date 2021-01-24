package com.zhb.service;

import com.zhb.bean.Dept;

import java.util.List;

/**
 * @author zhb
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}
