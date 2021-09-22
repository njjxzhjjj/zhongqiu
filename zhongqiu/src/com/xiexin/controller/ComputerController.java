package com.xiexin.controller;

import com.xiexin.bean.Computer;
import com.xiexin.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/computer")
public class ComputerController {
        @Autowired
        private ComputerService computerService;
        @RequestMapping("/selectAll")
        @ResponseBody
        public Map selectAll() {
            List<Computer> computers = computerService.selectByExample(null);
            Map map = new HashMap();
            map.put("code", 0);
            map.put("data", computers);
            return map;
        }

    //添加一张表数据
    @RequestMapping("/insert")
    @ResponseBody//没这个注解不返回给前端JSON数据
    public Map inter(@RequestBody Computer computer){
        System.out.println("computer = " + computer);
        Map codeMap=new HashMap();
        int i = computerService.insertSelective(computer);
        if(i==1){
            codeMap.put("code",0);
            codeMap.put("msg","添加成功！！");
        }else{
            codeMap.put("code",400);
            codeMap.put("msg","添加失败！！");
        }
        return codeMap;
    }
}
