package com.cheng.mybatis;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author create by Niancheng On 2021/1/15 22:24
 */
@Service
public class TestService extends ServiceImpl<TestDao, TSysConfig> {
    public void test(){
        int count = super.selectCount(new EntityWrapper<TSysConfig>());
        List<TSysConfig> configs = super.selectList(new EntityWrapper<TSysConfig>().eq("oid", "297e2c2f6b4adcac016b4ae946440000"));
        System.out.println(count);
        System.out.println(JSON.toJSONString(configs));
        System.out.println("==============================");
        Page<TSysConfig> page = super.selectPage(new Page<TSysConfig>(1, 5), new EntityWrapper<TSysConfig>());
        System.out.println(JSON.toJSONString(page));
    }
}
