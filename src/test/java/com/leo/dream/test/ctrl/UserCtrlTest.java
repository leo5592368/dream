package com.leo.dream.test.ctrl;

import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONObject;
import com.leo.dream.DreamApplication;
import com.leo.dream.test.ctrl.base.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>
 * 使用rest-assured框架，测试controller
 * </p>
 *
 * @author yuxiaobin
 * @date 2017/8/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DreamApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserCtrlTest extends TestBase {

    /**
     * sample：
     * <p>
     * 使用rest-assured框架，测试/user/test 这个URL的结果是否正确
     */
    @Test
    public void testUserListPage() {
        JSONObject result = httpGet("/user/test");
        Integer total = result.getInteger("total");
        Assert.assertTrue(0 != total);
        Assert.assertNotNull(result.get("records"));
        System.out.println(JSONUtil.toJsonStr(result));
    }

}
