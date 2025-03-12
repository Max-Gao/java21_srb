package com.atguigu.srb.core.ServiceImp;

import com.atguigu.srb.core.pojo.entity.UserInfo;
import com.atguigu.srb.core.mapper.UserInfoMapper;
import com.atguigu.srb.core.Service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author Max
 * @since 2025-03-11
 */
@Service
public class UserInfoServiceImp extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
