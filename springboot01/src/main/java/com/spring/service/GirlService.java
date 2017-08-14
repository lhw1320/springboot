package com.spring.service;

import com.spring.domain.Girl;

import java.util.List;

/**
 * Girl业务层接口
 *
 * Created by lianhw on 2017/8/13.
 */
public interface GirlService {

    /**
     * 查询女神列表
     *
     * @return 女神列表
     */
    List<Girl> listGirl();

    /**
     * 添加女神
     *
     * @param girl 女神
     * @return 女神
     */
    Girl saveGirl(Girl girl);

    /**
     * 通过ID查询一个女神
     *
     * @param id 女神ID
     * @return 女神
     */
    Girl getGirlById(Integer id);

    /**
     * 通过ID修改一个女神
     *
     * @param girl 女神
     * @return 女神
     */
    Girl updateGirlById(Girl girl);

    /**
     * 通过ID修改一个女神
     *
     * @param id 女神ID
     */
    void removeGirlById(Integer id);

    /**
     * 通过年龄查询年龄
     *
     * @param age 年龄
     * @return 年龄
     */
    List<Girl> findGirlByAge(Integer age);

    /**
     *
     *
     * @param id
     */
    void getAge(Integer id) throws Exception;

}
