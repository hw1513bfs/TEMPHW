package com.example.w3hw.mapperdemo;

import com.example.w3hw.mapperdemo.annotation.Mapper;

/*
* mapper
 *          @Mapper
 *  *      interface StuMapper {
 *  *          Object convert(Student stu, Class<?> target);
 *  *      }
 *  *
 *  *      @Inject
 *  *      StuMapper stuM; <- inject proxy instance
 *  *
 *  *      Object obj = stuM.convert(obj, class);
 * */
@Mapper
public interface StuMapper {
    Object convert(Student stu, Class<?> target);
}
