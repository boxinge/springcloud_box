package com.xczxbox.boxcontentapi.api;


import com.xczxbox.box_base.model.PageParams;
import com.xczxbox.box_base.model.PageResult;
import com.xczxbox.boxcontentmodel.dto.QueryCourseParamsDto;
import com.xczxbox.boxcontentmodel.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @description 课程信息编辑接口
 * @author Mr.M
 * @date 2022/9/6 11:29
 * @version 1.0
 */
@Api(value = "课程信息编辑接口",tags = "课程信息编辑接口")
@RestController
public class CourseBaseInfoController {

    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParams){
        CourseBase courseBase=new CourseBase();
        courseBase.setName("box");
        courseBase.setCreateDate(LocalDateTime.now());
        List<CourseBase> courseBases=new ArrayList<>();
        courseBases.add(courseBase);
        PageResult pageResult=new PageResult(courseBases,10,1,10);
        return pageResult;

    }

}