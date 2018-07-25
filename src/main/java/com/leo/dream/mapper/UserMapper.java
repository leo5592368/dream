package com.leo.dream.mapper;

import com.leo.dream.SuperMapper;
import com.leo.dream.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends SuperMapper<User> {

    /**
     * 自定义注入方法
     */
    int deleteAll();

    @Select("select test_id as id, name, age, test_type from user")
    List<User> selectListBySQL();

    @Select("select user from user ")
    List<String> selectMysqlUser();
}