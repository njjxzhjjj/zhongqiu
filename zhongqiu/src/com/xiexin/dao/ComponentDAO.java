package com.xiexin.dao;

import com.xiexin.bean.Component;
import com.xiexin.bean.ComponentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComponentDAO {
    long countByExample(ComponentExample example);

    int deleteByExample(ComponentExample example);

    int deleteByPrimaryKey(Integer componentId);

    int insert(Component record);

    int insertSelective(Component record);

    List<Component> selectByExample(ComponentExample example);

    Component selectByPrimaryKey(Integer componentId);

    int updateByExampleSelective(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByExample(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByPrimaryKeySelective(Component record);

    int updateByPrimaryKey(Component record);
}