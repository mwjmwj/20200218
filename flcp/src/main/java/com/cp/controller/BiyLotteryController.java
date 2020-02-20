package com.cp.controller;

import com.cp.bean.BiyLottery;
import com.cp.service.BiyLotteryService;
import com.cp.util.result.RSBuild;
import com.cp.util.result.ResponseEntity;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 彩票期详情
 */

@Controller
@RequestMapping("biyLottery")
public class BiyLotteryController {

    @Autowired
    private BiyLotteryService biyLotteryService;

    /**
     * 查询最新一期数据
     */
    public void getNextLottery(){
        //biyLotteryService.getNextLottery();
    }

    /**
     * 特码走势图
     * @param lotteryYear
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/getSpecialCodeTrendChart", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "特码走势图", notes = "特码走势图", httpMethod = "GET", response = ResponseEntity.class)
    public ResponseEntity getSpecialCodeTrendChart(@RequestParam(name="lotteryYear") @ApiParam(name="lotteryYear",value = "年份") String lotteryYear){
        List<BiyLottery> list = biyLotteryService.getSpecialCodeTrendChart(lotteryYear);
        Map<String,Object> map = new HashMap<>();
        map.put("year",lotteryYear);
        map.put("data",list);
        return RSBuild.ins().successForDataAndMsgs(map,"特码走势图获取成功");
    }
}
