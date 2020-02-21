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
import com.fc.test.model.auto.YearNum;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.YearNumService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("YearNumController")
@Api(value = "年份数字")
public class YearNumController extends BaseController{
	
	private String prefix = "gen/yearNum";
	@Autowired
	private YearNumService yearNumService;
	
	@GetMapping("view")
	@RequiresPermissions("gen:yearNum:view")
    public String view(ModelMap model)
    {	
		String str="年份数字";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	//@Log(title = "年份数字集合查询", action = "111")
	@PostMapping("list")
	@RequiresPermissions("gen:yearNum:list")
	@ResponseBody
	public Object list(Tablepar tablepar,String searchText){
		PageInfo<YearNum> page=yearNumService.list(tablepar,searchText) ; 
		TableSplitResult<YearNum> result=new TableSplitResult<YearNum>(page.getPageNum(), page.getTotal(), page.getList()); 
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
	
	//@Log(title = "年份数字新增", action = "111")
	@PostMapping("add")
	@RequiresPermissions("gen:yearNum:add")
	@ResponseBody
	public AjaxResult add(YearNum yearNum){
		int b=yearNumService.insertSelective(yearNum);
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
	//@Log(title = "年份数字删除", action = "111")
	@PostMapping("remove")
	@RequiresPermissions("gen:yearNum:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=yearNumService.deleteByPrimaryKey(ids);
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
	public int checkNameUnique(YearNum yearNum){
		int b=yearNumService.checkNameUnique(yearNum);
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
        mmap.put("YearNum", yearNumService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "年份数字修改", action = "111")
    @RequiresPermissions("gen:yearNum:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(YearNum record)
    {
        return toAjax(yearNumService.updateByPrimaryKeySelective(record));
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
   	public YearNum edit(@PathVariable("id") String id) {
   		return yearNumService.selectByPrimaryKey(id);
   	}
    

	
}
