//package top.flcp;
//
//
//import com.alibaba.fastjson.JSONObject;
//import com.cp.FlcpApplication;
//import com.cp.bean.Lottery;
//import com.cp.bean.NumColor;
//import com.cp.dao.LotteryMapper;
//import com.cp.dao.NumColorMapper;
//import com.cp.service.LotteryService;
//import com.cp.service.NumColorService;
//import com.cp.util.result.RSBuild;
//import com.cp.util.result.ResponseEntity;
//import com.cp.util.tools.ColorEnum;
//import com.cp.util.tools.CommonUtils;
//import com.github.pagehelper.PageInfo;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = FlcpApplication.class)
//public class FlcpApplicationTests {
//
//
//    @Autowired
//    private NumColorMapper mapper;
//
//    @Autowired
//    private NumColorService numColorService;
//
//    @Autowired
//    private LotteryService lotteryService;
//
//    @Test
//    public void contextLoads() {
//        mapper.listAll();
//    }
//
//    @Test
//    public void lotteryRecordListCommon(){
//        PageInfo<List<Lottery>> pageInfo = lotteryService.lotteryRecordListCommon(null);
//        ResponseEntity<List<Lottery>> responseEntity = RSBuild.ins().success();
//        responseEntity.setPageInfo(CommonUtils.toPageObject(pageInfo));
//        List<Lottery> lotteries = CommonUtils.copyObjects(pageInfo.getList(), Lottery.class);
//        responseEntity.setData(lotteries);
//        System.out.println(JSONObject.toJSON(responseEntity));
//    }
//
//    @Test
//    public void getNumColors(){
//        List<NumColor> numColors = numColorService.listAll();
//        PageInfo<List<NumColor>> pageInfo = new PageInfo(numColors);
//        List<NumColor> result = CommonUtils.copyObjects(pageInfo.getList(), NumColor.class);
//        ResponseEntity<List<NumColor>> responseEntity = RSBuild.ins().success();
//        responseEntity.setPageInfo(CommonUtils.toPageObject(pageInfo));
//        responseEntity.setData(result);
//        System.out.println(JSONObject.toJSON(responseEntity));
//    }
//}
