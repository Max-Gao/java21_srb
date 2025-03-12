package com.atguigu.srb.core.ServiceImp;

import com.atguigu.srb.core.pojo.entity.BorrowInfo;
import com.atguigu.srb.core.mapper.BorrowInfoMapper;
import com.atguigu.srb.core.Service.BorrowInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 借款信息表 服务实现类
 * </p>
 *
 * @author Max
 * @since 2025-03-11
 */
@Service
public class BorrowInfoServiceImp extends ServiceImpl<BorrowInfoMapper, BorrowInfo> implements BorrowInfoService {

}
