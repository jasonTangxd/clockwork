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

package com.creditease.adx.clockwork.master.service;

import com.creditease.adx.clockwork.common.pojo.TbClockworkTaskLogPojo;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkNode;

/**
 * @author Muyuan Sun
 * @email sunmuyuans@163.com
 * @date 2019-09-10
 */
public interface ITaskLogService {

    /**
     * 判断进程是否存在
     */
    boolean isExistRunningProcess(TbClockworkTaskLogPojo taskLog, TbClockworkNode tbClockworkNode);
}
