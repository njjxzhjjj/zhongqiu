package com.xiexin.controller;

import com.xiexin.bean.Component;
import com.xiexin.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//电脑配件
@Controller
/*/computer/compo*/
@RequestMapping("/component")
public class ComponentController {
    @Autowired
    private ComponentService componentService;
    @RequestMapping("/selectAll")
    @ResponseBody
    public  Map selectAll() {
        List<Component> components = componentService.selectByExample(null);
        Map map = new HashMap();
        map.put("code", 0);
        map.put("data", components);
        return map;
    }
}
