package com.xiexin.service;

import com.xiexin.bean.Component;
import com.xiexin.bean.ComponentExample;
import com.xiexin.dao.ComponentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("componentDAOService")
public class ComponentServiceImpl implements ComponentService {
	@Autowired(required = false)
	private ComponentDAO componentDAODAO;
	public long countByExample(ComponentExample example){
    	return componentDAODAO.countByExample(example);
    }

	public int deleteByExample(ComponentExample example){
    	return componentDAODAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return componentDAODAO.deleteByPrimaryKey(id);
    }

	public int insert(Component record){
    	return componentDAODAO.insert(record);
    }

	public int insertSelective(Component record){
    	return componentDAODAO.insertSelective(record);
    }

	public List<Component> selectByExample(ComponentExample example){
    	return componentDAODAO.selectByExample(example);
    }

	public Component selectByPrimaryKey(Integer id){
    	return componentDAODAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Component record, ComponentExample example){
    	return componentDAODAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Component record, ComponentExample example){
    	return componentDAODAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Component record){
    	return componentDAODAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Component record){
    	return componentDAODAO.updateByPrimaryKey(record);
    }


}
