package com.example.w3hw.mapperdemo;

public class StuMapperImpl implements  StuMapper{

    @Override
    public Object convert(Student stu, Class<?> target) {
        if(stu == null) return  null;
        if(target == StudentDTO.class){
            StudentDTO dto = new StudentDTO();
            dto.setStudentName(stu.getName());
            dto.setStudentId(stu.getId());
            return dto;
        }
        else throw new NoSuchFieldError();
    }
}
