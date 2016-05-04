package com.shijia.mapper;

import com.shijia.entity.Twitter;

import java.util.List;

/**
 * @author by jiuru on 16/5/4.
 */
public interface TwitterMapper {


    public List<Twitter> getAll();


    public int insertTwitter(Twitter twitter);

}
