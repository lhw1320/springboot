package com.spring.service;

import com.spring.domain.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 女神业务层测试类
 *
 * Created by lianhw on 2017/8/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void testGetGirlById(){
        Girl girl = girlService.getGirlById(11);
        Assert.assertEquals(new Integer(25), girl.getAge());
    }

}
