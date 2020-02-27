package com.fc.test.controller.gen;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fc.test.consts.OrderStatus;
import com.fc.test.model.auto.Order;
import com.fc.test.model.auto.OrderDetail;
import com.fc.test.service.OrderDetailService;
import com.fc.test.service.OrderService;
import com.fc.test.util.AjaxResult;
import com.fc.test.util.TableSplitResult;
import com.fc.test.util.Tablepar;
import com.fc.test.util.TitleVo;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("OrderController")
@Api(value = "")
public class OrderController extends BaseController{
	
	private String prefix = "gen/order";
	@Autowired
	private OrderService orderService;

	@Autowired
	private OrderDetailService orderDetailService;

	@GetMapping("view")
    public String view(ModelMap model)
    {	
		String str="";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	//@Log(title = "集合查询", action = "111")
	@PostMapping("list")
	@ResponseBody
	public Object list(Tablepar tablepar, String wechat_id,String status){
		PageInfo<Order> page =orderService.list(tablepar,wechat_id,status);
		if(CollectionUtil.isNotEmpty(page.getList())){
			for (Order order : page.getList()) {
				Tablepar table = new Tablepar();
				table.setPageNum(1);
				table.setPageSize(1000);
				order.setOrderDetails(orderDetailService.list(table,order.getId()).getList());
			}
		}
		TableSplitResult<Order> result=new TableSplitResult<Order>(page.getPageNum(), page.getTotal(), page.getList());
		return  result;
	}
	
	/**
     * 新增
     */

    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
        return prefix + "/add";
    }
	
	//@Log(title = "新增", action = "111")
	@PostMapping("add")
	@ResponseBody
	public AjaxResult add(Order order){
		int b=orderService.insertSelective(order);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 删除用户
	 * @param ids
	 * @return
	 */
	//@Log(title = "删除", action = "111")
	@PostMapping("remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=orderService.deleteByPrimaryKey(ids);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 检查用户
	 * @param tsysUser
	 * @return
	 */
	@PostMapping("checkNameUnique")
	@ResponseBody
	public int checkNameUnique(Order order){
		int b=orderService.checkNameUnique(order);
		if(b>0){
			return 1;
		}else{
			return 0;
		}
	}
	
	
	/**
	 * 修改跳转
	 * @param id
	 * @param mmap
	 * @return
	 */
	@GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        mmap.put("Order", orderService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "修改", action = "111")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Order record)
    {
        return toAjax(orderService.updateByPrimaryKeySelective(record));
    }

    
    /**
   	 * 根据主键查询
   	 * 
   	 * @param id
   	 * @param mmap
   	 * @return
   	 */
   	@PostMapping("/get/{id}")
   	@ApiOperation(value = "根据id查询唯一", notes = "根据id查询唯一")
   	public Order edit(@PathVariable("id") String id) {
   		return orderService.selectByPrimaryKey(id);
   	}



	@RequestMapping("/generatororder")
	public Object generatororder(@RequestBody JSONObject jsonObject){

		JSONArray list = jsonObject.getJSONArray("goods");
		Order order = new  Order();
		UUID.randomUUID().toString();
		order.setOrderNo(DateUtil.format(new Date(),"yyyyMMddHHmmssSSS")+UUID.randomUUID().toString().replaceAll("-",""));
		order.setoStatus(OrderStatus.CREATE);
		order.setcTm(new Date());
		order.setAmount(jsonObject.getBigDecimal("amount"));
		order.setRemarks(jsonObject.getString("remarks"));
		order.setWechatId(jsonObject.getString("openid"));
		orderService.insertSelective(order);
		for (Object o : list) {
			OrderDetail detail = JSONObject.parseObject(((JSONObject)o).toJSONString(), OrderDetail.class);
			detail.setOrderId(order.getId());
			orderDetailService.insertSelective(detail);
		}
		return jsonObject;
	}



}
