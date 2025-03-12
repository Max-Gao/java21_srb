package com.atguigu.srb.core.ServiceImp;

import com.atguigu.srb.core.pojo.entity.LendItem;
import com.atguigu.srb.core.mapper.LendItemMapper;
import com.atguigu.srb.core.Service.LendItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标的出借记录表 服务实现类
 * </p>
 *
 * @author Max
 * @since 2025-03-11
 */
@Service
public class LendItemServiceImp extends ServiceImpl<LendItemMapper, LendItem> implements LendItemService {

}
