package net.coderchen.dubbo.service;

import net.coderchen.dubbo.interfaces.DemoService;

/**
 * Created by Liuyuchen on 2017/12/25.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello:" + name + "!";
    }
}
