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
        twitter.setBigimg("http://s16.mogucdn.com/p1/150710/17pnvc_ie2dizbvmjqwgzjugizdambqgiyde_960x1280.jpg_468x468.jpg");
        twitter.setTitle("喜欢");
        twitter.setDesc("你喜欢抹茶吗");
        twitter.setExtra("test");
        int i = twitterDao.insertTwitter(twitter);
        Assert.isTrue( i == 1);
    }

}
