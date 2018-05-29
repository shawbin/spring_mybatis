package com.doushabao.framework.listener;


import com.doushabao.commonUtils.Config;
import com.mysql.jdbc.AbandonedConnectionCleanupThread;
import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

/**
 * 项目监听器
 */
public class ServletContextListener implements javax.servlet.ServletContextListener{
    private static final Logger logger = Logger.getLogger(ServletContextListener.class);

    public void contextInitialized(ServletContextEvent sce) {
        //设置静态文件访问路径
        sce.getServletContext().setAttribute("resourceUrlPrefix", Config.RESOURCE_URL_PREFIX);
        //设置项目访问路径
        sce.getServletContext().setAttribute("hostContextPrefix", Config.HOST_CONTEXT_PREFIX);
    }

    public void contextDestroyed(ServletContextEvent sce) {
        final Enumeration<Driver> drivers = DriverManager.getDrivers();
        while (drivers.hasMoreElements()) {
            try {
                final Driver driver = drivers.nextElement();
                DriverManager.deregisterDriver(driver);
            } catch (final SQLException e) {
                logger.warn("Unable to de-register driver", e);
            }
        }

        try {
            AbandonedConnectionCleanupThread.shutdown();
        } catch (final InterruptedException e) {
            logger.warn("Unable to shutdown MySQL threads" , e);

        }
    }
}
