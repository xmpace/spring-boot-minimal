package com.demo.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DatabaseMapper {
    @Select("SHOW TABLES")
    List<String> showTables();
}
