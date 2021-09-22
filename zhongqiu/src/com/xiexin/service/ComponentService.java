package com.xiexin.service;

import com.xiexin.bean.Component;
import com.xiexin.bean.ComponentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComponentService {
   
    long countByExample(ComponentExample example);

    int deleteByExample(ComponentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Component record);

    int insertSelective(Component record);

    List<Component> selectByExample(ComponentExample example);

    Component selectByPrimaryKey(Integer id);
  
    int updateByExampleSelective(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByExample(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByPrimaryKeySelective(Component record);

    int updateByPrimaryKey(Component record);

}
