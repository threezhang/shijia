package com.shijia.service;

import com.shijia.entity.Twitter;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author by jiuru on 16/5/4.
 */
public class TwitterServiceTest extends BaseTest {

    @Autowired
    private TwitterService twitterService;

    @Test
    public void testGetAll() {
        List<Twitter> twitters = twitterService.getAll();
        System.out.println();
    }
}
