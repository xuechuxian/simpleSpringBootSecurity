package com.wyy.simplespringboot.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    Integer testselect();
}
