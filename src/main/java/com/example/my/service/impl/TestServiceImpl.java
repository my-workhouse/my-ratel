package com.example.my.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.my.entity.TestDO;
import com.example.my.mapper.TestMapper;
import com.example.my.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, TestDO> implements TestService  {
}
