package com.atguigu.srb.core.controller.admin;

import com.atguigu.srb.core.Service.IntegralGradeService;
import com.atguigu.srb.core.pojo.entity.IntegralGrade;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

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
    public List<IntegralGrade> list() {
        return integralGradeService.list();
    }

    @DeleteMapping("/remove/{id}")
    public boolean remove(@PathVariable Integer id) {
        return integralGradeService.removeById(id);
    }

    @PostMapping({"/update"})
    public boolean updateList(){
        IntegralGrade integralGrade = new IntegralGrade();
        integralGrade.setId(1L);
        integralGrade.setIntegralStart(500);
        integralGrade.setIntegralEnd(600);
        return integralGradeService.updateById(integralGrade);
    }
}
