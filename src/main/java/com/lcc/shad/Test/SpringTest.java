package com.lcc.shad.Test;

import com.alibaba.fastjson.JSONObject;
import com.lcc.shad.entity.Course;
import com.lcc.shad.mapper.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2021/6/25 15:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTest {
    //注入 mapper
    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void addCourse() {
        for (int i = 1; i <= 10; i++) {
            Course course = new Course();
            course.setCHAME("java" + i);
            course.setUSER_ID(120L);
            course.setCSTATUS("Normal" + i);
            courseMapper.save(course);
        }
    }


    @Test
    public void findCourse() {
        List<Course> course =courseMapper.findAll();
        System.out.println(JSONObject.toJSONString(course));
    }

}