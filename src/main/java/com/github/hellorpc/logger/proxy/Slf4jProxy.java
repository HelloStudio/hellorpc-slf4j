package com.github.hellorpc.logger.proxy;


import com.github.hellorpc.logger.GeorgeLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;


/**
 * 通用日志接口的slf4j代理实现类
 *
 * @author George (GeorgeWorld@qq.com)
 **/
public class Slf4jProxy implements GeorgeLogger, Serializable {
    private Logger logger = null;

    public Slf4jProxy() {
    }

    @Override
    public Object bindingClassInitLogger(Class<?> clazz) {
        logger = LoggerFactory.getLogger(clazz);
        return logger;
    }

    public boolean isTraceEnabled() {
        return this.logger.isTraceEnabled();
    }

    public void trace(String msg) {
        this.logger.trace(msg);
    }

    public void trace(String msg, Throwable t) {
        this.logger.trace(msg, t);
    }

    public void trace(Throwable t) {
        this.logger.trace(t.getMessage(), t);
    }

    public boolean isDebugEnabled() {
        return this.logger.isDebugEnabled();
    }

    public void debug(String msg) {
        this.logger.debug(msg);
    }

    public void debug(String msg, Throwable t) {
        this.logger.debug(msg, t);
    }

    public void debug(Throwable t) {
        this.logger.debug(t.getMessage(), t);
    }

    public boolean isInfoEnabled() {
        return this.logger.isInfoEnabled();
    }

    public void info(String msg) {
        this.logger.info(msg);
    }

    public void info(String msg, Throwable t) {
        this.logger.info(msg, t);
    }

    public void info(Throwable t) {
        this.logger.info(t.getMessage(), t);
    }

    public boolean isWarnEnabled() {
        return this.logger.isWarnEnabled();
    }

    public void warn(String msg) {
        this.logger.warn(msg);
    }

    public void warn(String msg, Throwable t) {
        this.logger.warn(msg, t);
    }

    public void warn(Throwable t) {
        this.logger.warn(t.getMessage(), t);
    }

    public boolean isErrorEnabled() {
        return this.logger.isErrorEnabled();
    }

    public void error(String msg) {
        this.logger.error(msg);
    }

    public void error(String msg, Throwable t) {
        this.logger.error(msg, t);
    }

    public void error(Throwable t) {
        this.logger.error(t.getMessage(), t);
    }
}

