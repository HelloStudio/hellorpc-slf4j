/*
 * Author: George <GeorgeNiceWorld@gmail.com> | <Georgeinfo@163.com>
 * Copyright (C) George (www.georgeinfo.com), All Rights Reserved.
 */
package test;

import com.github.hellorpc.logger.GeorgeLogger;
import com.github.hellorpc.logger.GeorgeLoggerFactory;
import org.junit.*;

/**
 * Hello RPC 日志代理测试(SLF4J)
 *
 * @author George <Georgeinfo@163.com>
 */
public class LoggerTest {
    private static final GeorgeLogger LOG = GeorgeLoggerFactory.getLogger(LoggerTest.class);

    public LoggerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @Test
    public void testLogger() throws Exception {
        LOG.debug("### 这是logback打印的日志");
    }

}
