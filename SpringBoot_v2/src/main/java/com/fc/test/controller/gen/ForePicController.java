package com.fc.test.controller.gen;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.github.pagehelper.PageInfo;
import com.fc.test.common.base.BaseController;
import com.fc.test.common.domain.AjaxResult;
import com.fc.test.model.auto.ForePic;
import com.fc.test.model.custom.TableSplitResult;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.custom.TitleVo;
import com.fc.test.service.ForePicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("ForePicController")
@Api(value = "图库表")
public class ForePicController extends BaseController {

    private String prefix = "gen/forePic";
    @Autowired
    private ForePicService forePicService;

    @GetMapping("view")
    @RequiresPermissions("gen:forePic:view")
    public String view(ModelMap model) {
        String str = "图库表";
        setTitle(model, new TitleVo("列表", str + "管理", true, "欢迎进入" + str + "页面", true, false));
        return prefix + "/list";
    }

    //@Log(title = "图库表集合查询", action = "111")
    @PostMapping("list")
    @RequiresPermissions("gen:forePic:list")
    @ResponseBody
    public Object list(Tablepar tablepar, String searchText) {
        PageInfo<ForePic> page = forePicService.list(tablepar, searchText);
        TableSplitResult<ForePic> result = new TableSplitResult<ForePic>(page.getPageNum(), page.getTotal(), page.getList());
        return result;
    }

    /**
     * 新增
     */

    @GetMapping("/add")
    public String add(ModelMap modelMap) {
        return prefix + "/add";
    }


    @Value("${pic}")
    public String path;

    //@Log(title = "图库表新增", action = "111")
    @PostMapping("add")
    @RequiresPermissions("gen:forePic:add")
    @ResponseBody
    public AjaxResult add(ForePic forePic, HttpServletRequest request) throws IOException {

        MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;

        MultipartFile file = mr.getFile("file");

        String fileName = UUID.randomUUID().toString().replaceAll("-", "").substring(0,10);

        String originFileName = file.getOriginalFilename();
        file.transferTo(new File(path + fileName + originFileName));

        forePic.setTail(originFileName);
        forePic.setUrl(fileName + originFileName);
        forePic.setName(request.getParameter("name")+"期");

        int b = forePicService.insertSelective(forePic);
        if (b > 0) {
            return success();
        } else {
            return error();
        }
    }

    /**
     * 删除用户
     *
     * @param ids
     * @return
     */
    //@Log(title = "图库表删除", action = "111")
    @PostMapping("remove")
    @RequiresPermissions("gen:forePic:remove")
    @ResponseBody
    public AjaxResult remove(String ids) {

        int b = forePicService.deleteByPrimaryKey(ids);
        if (b > 0) {
            return success();
        } else {
            return error();
        }
    }

    /**
     * 检查用户
     *
     * @param tsysUser
     * @return
     */
    @PostMapping("checkNameUnique")
    @ResponseBody
    public int checkNameUnique(ForePic forePic) {
        int b = forePicService.checkNameUnique(forePic);
        if (b > 0) {
            return 1;
        } else {
            return 0;
        }
    }


    /**
     * 修改跳转
     *
     * @param id
     * @param mmap
     * @return
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap) {
        mmap.put("ForePic", forePicService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }

    /**
     * 修改保存
     */
    //@Log(title = "图库表修改", action = "111")
    @RequiresPermissions("gen:forePic:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ForePic record) {
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
