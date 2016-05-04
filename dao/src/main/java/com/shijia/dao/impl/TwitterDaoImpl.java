package com.shijia.dao.impl;

import com.shijia.dao.TwitterDao;
import com.shijia.entity.Twitter;
import com.shijia.mapper.TwitterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author by jiuru on 16/5/4.
 */
@Service("twitterDao")
public class TwitterDaoImpl implements TwitterDao {

    @Autowired
    private TwitterMapper twitterMapper;

    public List<Twitter> getAll() {
        return twitterMapper.getAll();
    }

    public int insertTwitter(Twitter twitter) {
        return twitterMapper.insertTwitter(twitter);
    }


}
