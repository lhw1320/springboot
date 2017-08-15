package com.spring.service.impl;

import com.spring.dao.GirlDao;
import com.spring.domain.Girl;
import com.spring.enums.ResultEnum;
import com.spring.exception.GirlException;
import com.spring.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Girl业务层接口实现
 *
 * Created by lianhw on 2017/8/13.
 */
@Service("girlService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class GirlServiceImpl implements GirlService {

    @Autowired
    private GirlDao girlDao;

    /**
     * 查询女神列表
     *
     * @return 女神列表
     */
    @Override
    public List<Girl> listGirl() {
        return girlDao.findAll();
    }

    /**
     * 添加女神
     *
     * @param girl 女神
     * @return 女神
     */
    @Transactional
    public Girl saveGirl(Girl girl){
        return girlDao.save(girl);
    }

    /**
     * 通过ID查询一个女神
     *
     * @param id 女神ID
     * @return 女神
     */
    @Override
    public Girl getGirlById(Integer id) {
        return girlDao.findOne(id);
    }

    /**
     * 通过ID修改一个女神
     *
     * @param girl 女神
     * @return 女神
     */
    @Transactional
    public Girl updateGirlById(Girl girl){
        return girlDao.save(girl);
    }

    /**
     * 通过ID删除一个女神
     *
     * @param id 女神ID
     */
    @Transactional
    public void removeGirlById(Integer id){
        girlDao.delete(id);
    }

    /**
     * 通过年龄查询年龄
     *
     * @param age 年龄
     * @return 年龄
     */
    @Override
    public List<Girl> listGirlByAge(Integer age) {
        return girlDao.findGirlByAge(age);
    }

    /**
     * 获取女神年龄
     *
     * @param id 女神ID
     */
    @Override
    public void getAge(Integer id) throws Exception {
        Integer age = girlDao.findOne(id).getAge();
        if (age <= 22) {
            throw new GirlException(ResultEnum.NEW);
        } else if (age > 22 && age <= 24){
            throw new GirlException(ResultEnum.MIDDLE);
        }
    }

}
