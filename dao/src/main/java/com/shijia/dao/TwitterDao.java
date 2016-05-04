package com.shijia.dao;

import com.shijia.entity.Twitter;

import java.util.List;

/**
 * @author by jiuru on 16/5/4.
 */

public interface TwitterDao {

    public List<Twitter> getAll();


    public int insertTwitter(Twitter twitter);

}
