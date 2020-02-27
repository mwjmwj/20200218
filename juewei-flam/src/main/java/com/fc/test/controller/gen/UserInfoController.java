package com.fc.test.controller.gen;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fc.test.annotation.IgnoreAuth;
import com.fc.test.model.auto.LoginInfo;
import com.fc.test.model.auto.UserInfo;
import com.fc.test.service.UserInfoService;
import com.fc.test.util.*;
import com.github.pagehelper.PageInfo;
import com.mysql.jdbc.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("UserInfoController")
@Api(value = "")
public class UserInfoController extends BaseController{

	private Logger logger = Logger.getLogger(getClass());

	private String prefix = "gen/userInfo";
	@Autowired
	private UserInfoService userInfoService;

	@Autowired
	private RestTemplate restTemplate;

	
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
	public Object list(Tablepar tablepar, String searchText){
		PageInfo<UserInfo> page=userInfoService.list(tablepar,searchText) ; 
		TableSplitResult<UserInfo> result=new TableSplitResult<UserInfo>(page.getPageNum(), page.getTotal(), page.getList());
		return  result;
	}


	/**
	 * 登录
	 */
	@ApiOperation(value = "登录")
	@IgnoreAuth
	@PostMapping("login_by_weixin")
	public Object loginByWeixin(@RequestBody LoginInfo loginInfo, HttpServletRequest request) {

		//获取openid
		String requestUrl = ApiUserUtils.getWebAccess(loginInfo.getCode());//通过自定义工具类组合出小程序需要的登录凭证 code
		logger.info("》》》组合token为：" + requestUrl);
		String res = restTemplate.getForObject(requestUrl, String.class);
		logger.info("res=="+res);
		JSONObject sessionData = JSON.parseObject(res);
		String openid=sessionData.getString("openid");
		logger.info("》》》promoterId：" + loginInfo.getPromoterId());
		String session_key=sessionData.getString("session_key");//不知道啥用。
		if (null == sessionData || StringUtils.isNullOrEmpty(openid)) {
			return toResponsFail("登录失败");
		}
		//验证用户信息完整性 防止攻击
//        String sha1 = CommonUtil.getSha1(fullUserInfo.getRawData() + sessionData.getString("session_key"));
//        if (!fullUserInfo.getSignature().equals(sha1)) {
//        	 logger.info("登录失败---验证用户信息完整性"+fullUserInfo.getSignature());
//        	 logger.info("登录失败---验证用户信息完整性 sha1"+sha1);
//            return toResponsFail("登录失败");
//        }
		Date nowTime = new Date();

		UserInfo userVo = userInfoService.queryByOpenId(openid);
		if (null == userVo) {
			userVo = new UserInfo();

			userVo.setName(Base64.encode(loginInfo.getNickName()));
			userVo.setWechatId(openid);
			userVo.setcTm(nowTime);

			userVo.setAvatar(loginInfo.getAvatarUrl());
			userVo.setGender(loginInfo.getGender()); // //性别 0：未知、1：男、2：女

			userInfoService.insertSelective(userVo);
		}

		userVo.setAvatar(loginInfo.getAvatarUrl());
		userVo.setGender(loginInfo.getGender()); // //性别 0：未知、1：男、2：女

		Map<String, Object> resultObj = new HashMap<String, Object>();
		//resultObj.put("openid", openid);
		resultObj.put("userVo",userVo);
		return toResponsSuccess(resultObj);
	}

	/**
	 * @param requestCode
	 * @param msg
	 * @param data
	 * @return Map<String,Object>
	 * @throws
	 * @Description:构建统一格式返回对象
	 * @date 2016年9月2日
	 * @author zhuliyun
	 */
	public Map<String, Object> toResponsObject(int requestCode, String msg, Object data) {
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("errno", requestCode);
		obj.put("errmsg", msg);
		if (data != null)
			obj.put("data", data);
		return obj;
	}

	public Map<String, Object> toResponsSuccess(Object data) {
		Map<String, Object> rp = toResponsObject(0, "执行成功", data);
//        logger.info("response:" + rp);
		return rp;
	}

	public Map<String, Object> toResponsMsgSuccess(String msg) {
		return toResponsObject(0, msg, "");
	}

	public Map<String, Object> toResponsSuccessForSelect(Object data) {
		Map<String, Object> result = new HashMap<>(2);
		result.put("list", data);
		return toResponsObject(0, "执行成功", result);
	}

	public Map<String, Object> toResponsFail(String msg) {
		return toResponsObject(1, msg, null);
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
	public AjaxResult add(UserInfo userInfo){
		int b=userInfoService.insertSelective(userInfo);
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
		int b=userInfoService.deleteByPrimaryKey(ids);
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
	public int checkNameUnique(UserInfo userInfo){
		int b=userInfoService.checkNameUnique(userInfo);
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
        mmap.put("UserInfo", userInfoService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "修改", action = "111")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(UserInfo record)
    {
        return toAjax(userInfoService.updateByPrimaryKeySelective(record));
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
   	public UserInfo edit(@PathVariable("id") String id) {
   		return userInfoService.selectByPrimaryKey(id);
   	}
    

	
}
