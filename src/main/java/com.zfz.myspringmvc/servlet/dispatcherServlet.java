package com.zfz.myspringmvc.servlet;

import javax.jws.WebService;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name ="dispatchServlet",urlPatterns = "/*",loadOnStartup = 1,
initParams = {@WebInitParam(name="base-package",value = "com.zfz.myspringmvc")})
public class dispatcherServlet extends HttpServlet {
   //扫描的基包
    private  String basePackage="";
    //基包下面所有的带包权限定类名
    private List<String> packageNames =new ArrayList<String>();
    //注解实例化  注解上的名称：实例化对象
    private Map<String,Object> instanceMap =new HashMap<String,Object>();
    //带包路径的权限定名称：注解上的名称
    private  Map<String,Object> nameMap=new HashMap<String, Object>();
    //URL地址和方法的映射关系 springMVC就是方法调用链
    private Map<String,Object> urlMethodMap =new HashMap<String ,Object>();
    //Method和权限定类名映射关系  主要是通过Method找到该方法的对象反向执行
    private Map<String,Object> methodpackageMap =new HashMap<String ,Object>();

    /**
     * init初始化处理
     * @param config
     * @throws ServletException
     */
    @Override
    public void  init(ServletConfig config) throws ServletException {
    basePackage =config.getInitParameter("base-package");
    try{
       //1、扫描基包得到全部的带包路径权限定名
       scanBasePackage(basePackage);
       //2、把带有@controller/@Service/@Repository的类实例化放入Map中，key为注解上的名称
        instance(packageNames);
       //3、Spring IOC注入
        springIOC();
        //4、完成URL地址与方法的映射关系
        handlerUrlMethodMap();

       }catch (ClassNotFoundException e){
        e.printStackTrace();
       }catch (InstantiationException e){
        e.printStackTrace();
       }catch (IllegalAccessException e){
        e.printStackTrace();
       }
    }

    public void instance(String basePackage){


    }

    public void scanBasePackage(List<String> packageNames){


    }

    public void springIOC(){


    }

    public void handlerUrlMethodMap(){


    }

}
