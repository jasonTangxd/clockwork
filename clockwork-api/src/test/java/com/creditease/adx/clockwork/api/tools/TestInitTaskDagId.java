package com.creditease.adx.clockwork.api.tools;

import com.creditease.adx.clockwork.api.service.impl.DagService;
import com.creditease.adx.clockwork.api.service.impl.LoopClockService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * @ Author     ：XuanDongTang
 * @ Date       ：Created in 1:16 下午 2020/12/4
 * @ Description：
 * @ Modified By：
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TestInitTaskDagId {

    protected static final Logger LOG = LoggerFactory.getLogger(TestInitTaskDagId.class);

    @Autowired
    private DagService dagService;

    /**
     * 构建环形时钟，更新下次执行时间
     *
     * @throws IOException
     */
    @Test
    public void initTaskDagIdTest() throws IOException {
        long start = System.currentTimeMillis();
        boolean b = dagService.initTaskDagId();
        System.out.println(b);
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "毫秒");
    }


    @Test
    public void buildDagIdForTaskIdTest() throws IOException {
        long start = System.currentTimeMillis();
        // 18117
        int dagId = dagService.buildDagIdForTaskId(26801);
        System.out.println(dagId);
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "毫秒");
    }

}
