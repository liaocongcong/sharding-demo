package com.lcc.shad.mapper;

import com.lcc.shad.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2021/6/24 17:36
 */
public interface CourseMapper extends JpaRepository<Course, Long>, JpaSpecificationExecutor<Course> {
}
