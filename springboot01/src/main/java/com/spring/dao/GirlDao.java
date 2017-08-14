package com.spring.dao;

import com.spring.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Girl持久层接口
 *
 * Created by lianhw on 2017/8/12.
 */
public interface GirlDao extends JpaRepository<Girl, Integer> {

    /**
     * 通过年龄查询年龄
     *
     * @param age 年龄
     * @return 年龄
     */
    List<Girl> findGirlByAge(Integer age);

}
