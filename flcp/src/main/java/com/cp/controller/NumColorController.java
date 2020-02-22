package com.cp.controller;

import com.cp.bean.NumColor;
import com.cp.service.NumColorService;
import com.cp.util.result.RSBuild;
import com.cp.util.result.ResponseEntity;
import com.cp.util.tools.CommonUtils;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@RequestMapping("numColor")
@Controller
public class NumColorController {

    @Autowired
    private NumColorService numColorService;

    /**
     * 获取颜色对应的数字
     */
    @GetMapping("getNumColors")
    @ResponseBody
    @ApiOperation(value = "查询数字颜色信息",notes = "查询数字颜色信息",httpMethod = "GET",response = ResponseEntity.class)
    public ResponseEntity getNumColors(){
        List<NumColor> numColors = numColorService.listAll();
        PageInfo<List<NumColor>> pageInfo = new PageInfo(numColors);
        List<NumColor> result = CommonUtils.copyObjects(pageInfo.getList(), NumColor.class);
        ResponseEntity<List<NumColor>> responseEntity = RSBuild.ins().success();
        responseEntity.setPageInfo(CommonUtils.toPageObject(pageInfo));
        responseEntity.setData(result);
        return responseEntity;
    }

    /**
     * 获取颜色对应的生肖
     */
    @GetMapping("getNumColorOnAnimals")
    @ResponseBody
    @ApiOperation(value = "获取颜色对应的生肖",notes = "获取颜色对应的生肖",httpMethod = "GET",response = ResponseEntity.class)
    public ResponseEntity getNumColorOnAnimals(){
        List<Map<String,Object>> numColors = numColorService.getNumColorOnAnimals();
        PageInfo<List<Map<String,Object>>> pageInfo = new PageInfo(numColors);
        ResponseEntity<List<Map<String,Object>>> responseEntity = RSBuild.ins().success();
        responseEntity.setPageInfo(CommonUtils.toPageObject(pageInfo));
        responseEntity.setData(numColors);
        return responseEntity;
    }
}
