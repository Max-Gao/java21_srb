package com.atguigu.srb.core;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

public class CodeGenerator {
    @Test
    public void codeGenerator() {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/srb_core?serverTimezone=GMT%2B8&characterEncoding=utf-8", "root", "123456")
                .globalConfig(builder -> builder
                        .author("Max")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java")
                        .commentDate("yyyy-MM-dd")
                        .disableOpenDir() // 允许自动打开输出目录
                )
                .packageConfig(builder -> builder
                        .parent("com.atguigu.srb.core")
                        .entity("pojo.entity")
                        .mapper("mapper")
                        .service("Service")
                        .serviceImpl("ServiceImp")
                        .xml("mapper.xml")
                )
                .strategyConfig(builder -> builder
                        .entityBuilder()
                        .enableFileOverride()
                        .enableLombok()
                        .enableRemoveIsPrefix()
                        .enableTableFieldAnnotation()
                        .logicDeleteColumnName("is_deleted")
                        .controllerBuilder()
                        .enableRestStyle() // 启用 REST 风格
                        .serviceBuilder()
                        .formatServiceFileName("%sService")
                        .formatServiceImplFileName("%sServiceImp")
                )
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
