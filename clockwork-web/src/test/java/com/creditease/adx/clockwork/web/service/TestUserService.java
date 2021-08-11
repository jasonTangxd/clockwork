/*-
 *  
 * Clockwork
 *  
 * Copyright (C) 2019 - 2020 adx
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *  
 */

package com.creditease.adx.clockwork.web.service;

import com.creditease.adx.clockwork.common.entity.gen.TbClockworkUser;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkUserExample;
import com.creditease.adx.clockwork.dao.mapper.clockwork.TbClockworkUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @ Author     ：XuanDongTang
 * @ Date       ：Created in 13:26 2020-02-07
 * @ Description：TestUserService
 * @ Modified By：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {

    @Resource(name = "userService")
    private IUserService userService;

    @Autowired
    private TbClockworkUserMapper userMapper;


    @Test
    public void setMobileNumberTest() {
        HashMap<String, String> maps = new HashMap<>();
        maps.put("xuandongtang", "150xxxx");

        for (String userName : maps.keySet()) {

            TbClockworkUserExample example = new TbClockworkUserExample();
            example.createCriteria().andUserNameEqualTo(userName);
            List<TbClockworkUser> clockworkUsers = userMapper.selectByExample(example);
            if (clockworkUsers != null && clockworkUsers.size() > 0) {
                TbClockworkUser record = new TbClockworkUser();
                record.setId(clockworkUsers.get(0).getId());
                record.setMobileNumber(maps.get(userName));
                userMapper.updateByPrimaryKeySelective(record);
            } else {
                TbClockworkUser record = new TbClockworkUser();
                record.setUserName(userName);
                record.setCreateTime(new Date());
                record.setIsActive(true);
                record.setMobileNumber(maps.get(userName));

                userMapper.insertSelective(record);
            }
        }


    }


}
