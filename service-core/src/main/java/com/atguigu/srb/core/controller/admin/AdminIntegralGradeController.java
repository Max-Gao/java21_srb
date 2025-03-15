package com.atguigu.srb.core.controller.admin;
import com.atguigu.common.exception.Assert;
import com.atguigu.common.exception.BusinessException;
import com.atguigu.common.result.ResponseEnum;
import com.atguigu.srb.core.Service.IntegralGradeService;
import com.atguigu.srb.core.pojo.entity.IntegralGrade;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import com.atguigu.common.result.R;

import java.util.List;
@Tag(name="用户管理")
@CrossOrigin
@RestController
@RequestMapping({"/admin/core/integralGrade"})
public class AdminIntegralGradeController {
    
    @Resource
    private IntegralGradeService integralGradeService;

    @Operation(summary = "获取用户列表", description = "返回所有用户的详细信息")
    @GetMapping({"/list"})
    public R list() {
        List<IntegralGrade> list = integralGradeService.list();
        return R.ok().data("list",list);
    }
    @Operation(summary = "根据id删除积分等级", description = "逻辑删除")
    @DeleteMapping("/remove/{id}")
    public R remove(@PathVariable Integer id) {
        boolean result = integralGradeService.removeById(1L);
        if (result){
            return R.ok().message("删除成功");
        }else{
            return R.error().message("删除失败");
        }
    }

    @PostMapping({"/update"})
    public boolean updateList(){
        IntegralGrade integralGrade = new IntegralGrade();
        integralGrade.setId(1L);
        integralGrade.setIntegralStart(500);
        integralGrade.setIntegralEnd(600);
        return integralGradeService.updateById(integralGrade);
    }

    @PostMapping("/save")
    public R save(@RequestBody IntegralGrade integralGrade) {
        //如果借款额度为空就手动抛出一个自定义的异常！
        Assert.notNull(integralGrade.getBorrowAmount(), ResponseEnum.BORROW_AMOUNT_NULL_ERROR);

        boolean result = integralGradeService.save(integralGrade);
        if (result){
            return R.ok().message("保存成功");
        }else{
            return R.error().message("保存失败");
        }
    }

    @GetMapping("/get/{id}")
    public R getById(@PathVariable Long id) {
        IntegralGrade integralGrade = integralGradeService.getById(id);
        if(integralGrade != null){
            return R.ok().data("integralGrade",integralGrade);
        }else{
            return R.error().message("数据不存在");
        }
    }

    @PutMapping("/update")
    public R updateById (@RequestBody IntegralGrade integralGrade) {
        boolean result = integralGradeService.updateById(integralGrade);
        if (result){
            return R.ok().message("修改成功");
        }else{
            return R.error().message("修改失败");
        }
    }
}
