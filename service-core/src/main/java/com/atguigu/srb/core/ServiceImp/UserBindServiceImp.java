package com.atguigu.srb.core.ServiceImp;

import com.atguigu.srb.core.pojo.entity.UserBind;
import com.atguigu.srb.core.mapper.UserBindMapper;
import com.atguigu.srb.core.Service.UserBindService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户绑定表 服务实现类
 * </p>
 *
 * @author Max
 * @since 2025-03-11
 */
@Service
public class UserBindServiceImp extends ServiceImpl<UserBindMapper, UserBind> implements UserBindService {

}
