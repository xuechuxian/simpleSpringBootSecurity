package com.wyy.simplespringboot.service.impl;

import com.wyy.simplespringboot.entity.SysUser;
import com.wyy.simplespringboot.mapper.SysUserMapper;
import com.wyy.simplespringboot.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2021-01-14
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
