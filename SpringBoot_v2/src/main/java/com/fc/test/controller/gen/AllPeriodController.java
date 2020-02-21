package com.fc.test.controller.gen;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseController;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.model.auto.AllPeriod;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.AllPeriodService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("AllPeriodController")
@Api(value = "")
public class AllPeriodController extends BaseController{
	
	private String prefix = "gen/allPeriod";
	@Autowired
	private AllPeriodService allPeriodService;
	
	@GetMapping("view")
	@RequiresPermissions("gen:allPeriod:view")
    public String view(ModelMap model)
    {	
		String str="";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	//@Log(title = "集合查询", action = "111")
	@PostMapping("list")
	@RequiresPermissions("gen:allPeriod:list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchText){
		PageInfo<AllPeriod> page=allPeriodService.list(tablepar,searchText) ; 
		TableSplitResult<AllPeriod> result=new TableSplitResult<AllPeriod>(page.getPageNum(), page.getTotal(), page.getList()); 
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
	@RequiresPermissions("gen:allPeriod:add")
	@ResponseBody
	public AjaxResult add(AllPeriod allPeriod){
		int b=allPeriodService.insertSelective(allPeriod);
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
	@RequiresPermissions("gen:allPeriod:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=allPeriodService.deleteByPrimaryKey(ids);
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
	public int checkNameUnique(AllPeriod allPeriod){
		int b=allPeriodService.checkNameUnique(allPeriod);
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
        mmap.put("AllPeriod", allPeriodService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "修改", action = "111")
    @RequiresPermissions("gen:allPeriod:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AllPeriod record)
    {
        return toAjax(allPeriodService.updateByPrimaryKeySelective(record));
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
   	public AllPeriod edit(@PathVariable("id") String id) {
   		return allPeriodService.selectByPrimaryKey(id);
   	}
    

	
}
