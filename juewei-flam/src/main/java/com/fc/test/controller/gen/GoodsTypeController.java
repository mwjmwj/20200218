package com.fc.test.controller.gen;

import com.fc.test.model.auto.GoodsType;
import com.fc.test.service.GoodsTypeService;
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

@Controller
@RequestMapping("GoodsTypeController")
@Api(value = "")
public class GoodsTypeController extends BaseController{
	
	private String prefix = "gen/goodsType";
	@Autowired
	private GoodsTypeService goodsTypeService;
	
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
		PageInfo<GoodsType> page=goodsTypeService.list(tablepar,searchText) ; 
		TableSplitResult<GoodsType> result=new TableSplitResult<GoodsType>(page.getPageNum(), page.getTotal(), page.getList());
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
	public AjaxResult add(GoodsType goodsType){
		int b=goodsTypeService.insertSelective(goodsType);
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
		int b=goodsTypeService.deleteByPrimaryKey(ids);
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
	public int checkNameUnique(GoodsType goodsType){
		int b=goodsTypeService.checkNameUnique(goodsType);
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
        mmap.put("GoodsType", goodsTypeService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "修改", action = "111")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GoodsType record)
    {
        return toAjax(goodsTypeService.updateByPrimaryKeySelective(record));
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
   	public GoodsType edit(@PathVariable("id") String id) {
   		return goodsTypeService.selectByPrimaryKey(id);
   	}
    

	
}
