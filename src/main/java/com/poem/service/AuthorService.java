package com.poem.service;

import com.github.pagehelper.PageInfo;
import com.poem.entity.Author;

public interface AuthorService {
    public PageInfo<Author> SelectAuthorByName(String author, Integer pageNum, Integer pageSize);
}
