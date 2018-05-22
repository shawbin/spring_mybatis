package com.doushabao.commonUtils;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Properties;

/**
 * 系统配置config.properties
 */
public class Config {

    private static Logger logger = Logger.getLogger("sysErr");

    /**静态文件路径*/
    public static String RESOURCE_URL_PREFIX;
    /**项目访问路径*/
    public static String HOST_CONTEXT_PREFIX;

    /**启动加载*/
    static {
        Properties properties = new Properties();
        try {
            properties.load(Config.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("error,unloading config file!!!");
        }
        //初始化配置
        /**静态文件路径*/
        RESOURCE_URL_PREFIX = properties.getProperty("RESOURCE_URL_PREFIX");
        /**项目访问路径*/
        HOST_CONTEXT_PREFIX = properties.getProperty("HOST_CONTEXT_PREFIX");
    }
}
