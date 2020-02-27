package com.fc.test.controller.gen;

import com.fc.test.model.auto.GoodsDetail;
import com.fc.test.service.GoodsDetailService;
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
@RequestMapping("GoodsDetailController")
@Api(value = "")
public class GoodsDetailController extends BaseController{
	
	private String prefix = "gen/goodsDetail";
	@Autowired
	private GoodsDetailService goodsDetailService;
	
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
		PageInfo<GoodsDetail> page=goodsDetailService.list(tablepar,searchText) ; 
		TableSplitResult<GoodsDetail> result=new TableSplitResult<GoodsDetail>(page.getPageNum(), page.getTotal(), page.getList());
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
	public AjaxResult add(GoodsDetail goodsDetail){
		int b=goodsDetailService.insertSelective(goodsDetail);
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
		int b=goodsDetailService.deleteByPrimaryKey(ids);
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
	public int checkNameUnique(GoodsDetail goodsDetail){
		int b=goodsDetailService.checkNameUnique(goodsDetail);
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
        mmap.put("GoodsDetail", goodsDetailService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "修改", action = "111")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GoodsDetail record)
    {
        return toAjax(goodsDetailService.updateByPrimaryKeySelective(record));
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
   	public GoodsDetail edit(@PathVariable("id") String id) {
   		return goodsDetailService.selectByPrimaryKey(id);
   	}
    

	
}
