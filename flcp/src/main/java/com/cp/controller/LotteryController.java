package com.cp.controller;

import com.cp.bean.Lottery;
import com.cp.service.LotteryService;
import com.cp.util.result.RSBuild;
import com.cp.util.result.ResponseEntity;
import com.cp.util.tools.CommonUtils;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 彩票信息
 */
@RequestMapping("lottery")
@Controller
public class LotteryController {

    @Autowired
    private LotteryService lotteryService;

    @PostMapping("lotteryRecordListCommon")
    @ResponseBody
    @ApiOperation(value = "中奖记录列表",notes = "中奖记录列表",httpMethod = "POST",response = ResponseEntity.class)
    public Object lotteryRecordListCommon(@RequestBody Map<String,Object> map){
        PageInfo<List<Lottery>> pageInfo = lotteryService.lotteryRecordListCommon(map);
        ResponseEntity<List<Lottery>> responseEntity = RSBuild.ins().success();
        responseEntity.setPageInfo(CommonUtils.toPageObject(pageInfo));
        List<Lottery> lotteries = CommonUtils.copyObjects(pageInfo.getList(), Lottery.class);
        responseEntity.setData(lotteries);
        return responseEntity;
    }

    /**
     * 获取最后一个中奖信息和下一次开奖时间
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/getNextLottery", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "获取下次中奖时间", notes = "获取下次中奖时间", httpMethod = "GET", response = ResponseEntity.class)
    public ResponseEntity getNextLottery(){
        List<Lottery> lotterys = lotteryService.getNextLottery();
        return RSBuild.ins().successForDataAndMsgs(lotterys,"获取下次中奖时间成功");
    }
}
