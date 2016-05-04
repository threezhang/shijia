package com.shijia.service;

import com.shijia.entity.Twitter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author by jiuru on 16/5/4.
 */

public interface TwitterService {

    public List<Twitter> getAll();

}
