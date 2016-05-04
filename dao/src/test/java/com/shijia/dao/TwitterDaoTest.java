package com.shijia.dao;

import com.shijia.entity.Twitter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author by jiuru on 16/5/4.
 */
public class TwitterDaoTest extends BaseTest {

    private Logger logger = LoggerFactory.getLogger(TwitterDaoTest.class);

    @Autowired
    private TwitterDao twitterDao;

    @Test
    public void testGetAll() {
        List<Twitter> list = twitterDao.getAll();
        Assert.notNull(list);
    }

    @Test
    public void testInsert() {
        Twitter twitter = new Twitter();
        twitter.setBigimg("http://img4q.duitang.com/uploads/people/201604/29/20160429164235_JGhzY.thumb.224_224_c.jpeg");
        twitter.setDesc("你喜欢抹茶吗");
        twitter.setExtra("test");
        int i = twitterDao.insertTwitter(twitter);
        Assert.isTrue( i == 1);
    }

}
