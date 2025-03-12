package com.atguigu.srb.core.ServiceImp;

import com.atguigu.srb.core.pojo.entity.UserLoginRecord;
import com.atguigu.srb.core.mapper.UserLoginRecordMapper;
import com.atguigu.srb.core.Service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author Max
 * @since 2025-03-11
 */
@Service
public class UserLoginRecordServiceImp extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
