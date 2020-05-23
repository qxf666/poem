package com.poem.service;

import com.github.pagehelper.PageInfo;
import com.poem.pojo.ResultPoem;

public interface PoemService {
    public PageInfo<ResultPoem> selectByPoemName(String poemName, Integer pageNum, Integer pageSize);
}
