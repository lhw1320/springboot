package com.spring.web.controller;

import com.spring.domain.Girl;
import com.spring.domain.Result;
import com.spring.service.GirlService;
import com.spring.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Girl控制层
 *
 * Created by lianhw on 2017/8/12.
 */
@RestController("girlController")
public class GirlController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GirlController.class);

    @Autowired
    private GirlService girlService;

    /**
     * 查询女神列表
     *
     * @return 女神列表
     */
    @GetMapping(value = "/girls")
    public List<Girl> listGirl(){
        LOGGER.info("查询女神列表方法执行");
        return girlService.listGirl();
    }

    /**
     * 添加女神
     *
     * @param girl 女神年龄
     * @return 女神
     */
    @PostMapping(value = "/girls")
    public Result<Girl> saveGirl(@Valid Girl girl, BindingResult bindingResult){
        LOGGER.info("添加女神方法执行");
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(girlService.saveGirl(girl));
    }

    /**
     * 通过ID查询一个女神
     *
     * @param id 女神ID
     * @return 女神
     */
    @GetMapping(value = "/girls/{id}")
    public Girl getGirlById(@PathVariable(value = "id") Integer id){
        LOGGER.info("根据ID查询女神方法执行");
        return girlService.getGirlById(id);
    }

    /**
     * 通过ID修改一个女神
     *
     * @param id 女神ID
     * @param girl 女神
     * @return 女神
     */
    @PutMapping(value = "/girls/{id}")
    public Girl updateGirlById(@PathVariable(value = "id") Integer id, Girl girl){
        LOGGER.info("修改女神方法执行");
        girl.setId(id);
        return girlService.updateGirlById(girl);
    }

    /**
     * 通过ID删除一个女神
     *
     * @param id 女神ID
     */
    @DeleteMapping(value = "/girls/{id}")
    public void removeGirlById(@PathVariable(value = "id") Integer id){
        LOGGER.info("删除女神方法执行");
        girlService.removeGirlById(id);
    }

    /**
     * 通过年龄查询女神列表
     *
     * @param age 年龄
     * @return 女神列表
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> listGirlByAge(@PathVariable(value = "age") Integer age){
        LOGGER.info("通过年龄查询女神列表方法执行");
        return girlService.findGirlByAge(age);
    }

    @GetMapping(value = "/girls/getAge/{id}")
    public void getAge(@PathVariable(value = "id") Integer id) throws Exception {
        girlService.getAge(id);
    }

}
