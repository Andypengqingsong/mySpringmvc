package peng.com.webmvc.controller;

import peng.com.webmvc.annotation.Controller;
import peng.com.webmvc.annotation.Quatifier;
import peng.com.webmvc.annotation.RequestMapping;
import peng.com.webmvc.service.MyService;
import peng.com.webmvc.service.SpringmvcService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller("/peng")
public class SpringmvcController {
    @Quatifier("MyServiceImpl")
    MyService myService;
    @Quatifier("SpringmvcServiceImpl")
    SpringmvcService smService;

    @RequestMapping("/hello")
    public String index(HttpServletRequest request, HttpServletResponse response, String param) {
        String check =smService.check();
        request.setAttribute("peng" ,check);
        return "main/mian";
    }
    @RequestMapping("/insert")
    public String insert(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.insert(null);
        smService.insert(null);
        return null;
    }

    @RequestMapping("/delete")
    public String delete(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.delete(null);
        smService.delete(null);
        return null;
    }

    @RequestMapping("/update")
    public String update(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.update(null);
        smService.update(null);
        return null;
    }

    @RequestMapping("/select")
    public String select(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.select(null);
        smService.select(null);
        return null;
    }
}