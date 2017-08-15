package com.spring.service;

import com.spring.domain.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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

    @Test
    public void testSaveGirl() {
        Girl girl = new Girl();
        girl.setName("金所炫");
        girl.setAge(22);
        girl.setMoney(120.0);
        Girl dbGirl = girlService.saveGirl(girl);
        Assert.assertEquals(girl, dbGirl);
    }

}
