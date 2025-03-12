package com.atguigu.srb.core.ServiceImp;

import com.atguigu.srb.core.pojo.entity.Borrower;
import com.atguigu.srb.core.mapper.BorrowerMapper;
import com.atguigu.srb.core.Service.BorrowerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 借款人 服务实现类
 * </p>
 *
 * @author Max
 * @since 2025-03-11
 */
@Service
public class BorrowerServiceImp extends ServiceImpl<BorrowerMapper, Borrower> implements BorrowerService {

}
