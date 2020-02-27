package com.fc.test.controller.gen;

import com.fc.test.model.auto.ForePic;
import com.fc.test.service.ForePicService;
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
@RequestMapping("ForePicController")
@Api(value = "图库表")
public class ForePicController extends BaseController{
	
	private String prefix = "gen/forePic";
	@Autowired
	private ForePicService forePicService;
	
	@GetMapping("view")
    public String view(ModelMap model)
    {	
		String str="图库表";
		setTitle(model, new TitleVo("列表", str+"管理", true,"欢迎进入"+str+"页面", true, false));
        return prefix + "/list";
    }
	
	//@Log(title = "图库表集合查询", action = "111")
	@PostMapping("list")
	@ResponseBody
	public Object list(Tablepar tablepar, String searchText){
		PageInfo<ForePic> page=forePicService.list(tablepar,searchText) ; 
		TableSplitResult<ForePic> result=new TableSplitResult<ForePic>(page.getPageNum(), page.getTotal(), page.getList());
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
	
	//@Log(title = "图库表新增", action = "111")
	@PostMapping("add")
	@ResponseBody
	public AjaxResult add(ForePic forePic){
		int b=forePicService.insertSelective(forePic);
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
	//@Log(title = "图库表删除", action = "111")
	@PostMapping("remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=forePicService.deleteByPrimaryKey(ids);
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
	public int checkNameUnique(ForePic forePic){
		int b=forePicService.checkNameUnique(forePic);
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
        mmap.put("ForePic", forePicService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "图库表修改", action = "111")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ForePic record)
    {
        return toAjax(forePicService.updateByPrimaryKeySelective(record));
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
   	public ForePic edit(@PathVariable("id") String id) {
   		return forePicService.selectByPrimaryKey(id);
   	}
    

	
}
