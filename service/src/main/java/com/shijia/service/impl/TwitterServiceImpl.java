package com.shijia.service.impl;

import com.shijia.dao.TwitterDao;
import com.shijia.entity.Twitter;
import com.shijia.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author by jiuru on 16/5/4.
 */
@Service("twitterService")
public class TwitterServiceImpl implements TwitterService {

    @Autowired
    private TwitterDao twitterDao;

    @Override
    public List<Twitter> getAll() {
        return twitterDao.getAll();
    }
}
