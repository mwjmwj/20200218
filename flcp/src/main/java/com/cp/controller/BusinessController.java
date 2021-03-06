package com.cp.controller;


import cn.hutool.core.util.NumberUtil;
import com.cp.bean.*;
import com.cp.dao.ForePicMapper;
import com.cp.dao.IndexNoticeMapper;
import com.cp.util.result.RSBuild;
import com.cp.util.result.ResponseEntity;
import com.cp.util.tools.CommonUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class BusinessController {


    @Autowired
    private ForePicMapper forePicMapper;


    @Autowired
    private IndexNoticeMapper indexNoticeMapper;

    @Value("${server.port}")
    public String port;

    @Value("${pic_ip}")
    public String pic_ip;

    /**
     *  首页图片数据 显示最新的4条
     * @return
     */
    @RequestMapping("/forepic/list")
    public Object listForePic() throws UnknownHostException {
        ResponseEntity<List<ForePic>> responseEntity = RSBuild.ins().success();
        List<ForePic> data = forePicMapper.indexPicList();

        if(CollectionUtils.isEmpty(data)){
            return responseEntity;
        }
        InetAddress address = InetAddress.getLocalHost();
        for (ForePic datum : data) {
            datum.setUrl("http://"+pic_ip+":"+port+"/file/upload?filePath="+datum.getUrl());
        }
        responseEntity.setData(data);
        return responseEntity;
    }



    /**
     *  所有的图片
     * return
     */
    @RequestMapping("/forepic/listdetail")
    public Object listForePics(@RequestBody Map<String,Object> map) throws UnknownHostException {
        ResponseEntity<List<ForePic>> responseEntity = RSBuild.ins().success();
        ForePicExample para = new  ForePicExample();
        para.setOrderByClause(" `name` desc ");
        // 设置分页
        PageHelper.startPage(NumberUtil.parseInt(String.valueOf(map.get("page"))),NumberUtil.parseInt(String.valueOf(map.get("pageSize"))));
        List<ForePic> forePics = forePicMapper.selectByExample(para);

        if(CollectionUtils.isEmpty(forePics)){
            return responseEntity;
        }
        InetAddress address = InetAddress.getLocalHost();
        for (ForePic datum : forePics) {
            datum.setUrl("http://"+pic_ip+":"+port+"/file/upload?filePath="+datum.getUrl());
        }
        PageInfo<List<ForePic>> pageInfo = new PageInfo(forePics);
        responseEntity.setPageInfo(CommonUtils.toPageObject(pageInfo));
        List<ForePic> lotteries = CommonUtils.copyObjects(pageInfo.getList(), ForePic.class);
        responseEntity.setData(forePics);
        return responseEntity;
    }

    @RequestMapping("/notice/list")
    public Object listIndexNotice(){
        ResponseEntity<IndexNotice> responseEntity = RSBuild.ins().success();
        IndexNotice data = indexNoticeMapper.selectByExample(new IndexNoticeExample()).get(0);
        data.setContactInfos(Arrays.asList(data.getContactInfo().split(",")));
        responseEntity.setData(data);
        return responseEntity;
    }


}
