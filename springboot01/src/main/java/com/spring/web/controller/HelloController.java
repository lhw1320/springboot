package com.spring.web.controller;

import com.spring.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * HelloController控制层
 *
 * Created by lianhw on 2017/8/12.
 */
@RestController("helloController")
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/girl", method = RequestMethod.GET)

    public String printGirlProperties(){
        return "girlProperties:" + girlProperties;
    }

    @RequestMapping(value = {"/hello", "/hi"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String print(){
        return "Hello Spring Boot!";
    }

    @RequestMapping(value = "/dataType1/{id}", method = RequestMethod.GET)
    public String dataType1(@PathVariable("id") Integer id){
        return "id:" + id;
    }

    @RequestMapping(value = "/dataType2", method = RequestMethod.GET)
    public String dataType2(@RequestParam("pid") Integer id){
        return "id:" + id;
    }

    @GetMapping(value = "/dataType3")
    public String dataType3(@RequestParam("pid") Integer id){
        return "id:" + id;
    }

    @PostMapping(value = "/dataType4")
    public String dataType4(@RequestParam("pid") Integer id){
        return "id:" + id;
    }

    //    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;

//    @Value("${content}")
//    private String content;

//    @RequestMapping(value = "/cupSize", method = RequestMethod.GET)
//    public String printCupSize(){
//        //return "CupSize:" + cupSize + "<br/>" + "age:" + age;
//        return "content:" + content;
//    }

}
