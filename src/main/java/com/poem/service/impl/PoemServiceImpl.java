package com.poem.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.poem.pojo.ResultPoem;
import com.poem.repository.PoemMapper;
import com.poem.service.PoemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoemServiceImpl implements PoemService {
    @Autowired
    private PoemMapper poemMapper;
    public PageInfo<ResultPoem> selectByPoemName(String poemName, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(poemMapper.selectByPoemName(poemName));
    }
}
