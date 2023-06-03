package com.example.springboot01_hw;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog4j1 {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(TestLog4j1.class);
        logger.fatal("致命_FATAL");
        logger.error("错误_ERROR");
        logger.warn("警告_ERROR");
        logger.info("信息_INFO");
        logger.debug("致命_DEBUG");
        logger.trace("致命_TRACE");
    }
}
