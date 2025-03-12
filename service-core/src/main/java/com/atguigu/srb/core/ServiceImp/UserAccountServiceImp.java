package com.atguigu.srb.core.ServiceImp;

import com.atguigu.srb.core.pojo.entity.UserAccount;
import com.atguigu.srb.core.mapper.UserAccountMapper;
import com.atguigu.srb.core.Service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author Max
 * @since 2025-03-11
 */
@Service
public class UserAccountServiceImp extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
