package com.qjava.qlog;

import com.blxt.utils.check.CheckUtils;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * @Author: Zhang.Jialei
 * @Date: 2020/9/26 11:15
 */
public class QLog {
    public static Logger logger = null;

    static {
        init("system");
    }

    public static void init(String name){
        logger = LoggerFactory.getLogger(name);
    }

    /**
     * 指定配置文件,默认路径 src/main/resources下
     * @param file  文件路径
     */
    public static void loadConfigure(File file){
        CheckUtils.objectCheckNull(file, "文件不存在:" + file.getPath(), "1001", "");
        PropertyConfigurator.configure(file.getPath());
    }

}
