package com.atguigu.srb.core.ServiceImp;

import com.atguigu.srb.core.pojo.entity.Dict;
import com.atguigu.srb.core.mapper.DictMapper;
import com.atguigu.srb.core.Service.DictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据字典 服务实现类
 * </p>
 *
 * @author Max
 * @since 2025-03-11
 */
@Service
public class DictServiceImp extends ServiceImpl<DictMapper, Dict> implements DictService {

}
