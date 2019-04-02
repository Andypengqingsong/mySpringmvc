package peng.com.webmvc.service;

import peng.com.webmvc.annotation.Service;

import java.util.Map;

@Service("SpringmvcServiceImpl")
public class SpringmvcServiceImpl implements SpringmvcService {
    @Override
    public int insert(Map map) {
        System.out.println("彭青松SpringmvcServiceImpl:" + "insert");
        return 0;
    }

    @Override
    public int delete(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "delete");
        return 0;
    }

    @Override
    public int update(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "update");
        return 0;
    }

    @Override
    public int select(Map map) {
        System.out.println("SpringmvcServiceImpl:" + "select");
        return 0;
    }

    @Override
    public String check() {
        return "sjiisbdssifsdf'sd豆腐脑大部分都不方便接";
    }

}