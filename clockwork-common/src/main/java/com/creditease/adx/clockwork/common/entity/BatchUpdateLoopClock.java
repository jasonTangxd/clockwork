package com.creditease.adx.clockwork.common.entity;

import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTask;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkTaskAndSlotRelation;

import java.util.List;

public class BatchUpdateLoopClock {

    // 需要删除的槽位
    private List<Integer> deleteSlotIds;

    // 需要添加的槽位
    private List<TbClockworkTaskAndSlotRelation> addSlotRelations;

    // 需要更新的触发时间
    private List<TbClockworkTask> updateTriggerTimes ;

    public List<Integer> getDeleteSlotIds() {
        return deleteSlotIds;
    }

    public void setDeleteSlotIds(List<Integer> deleteSlotIds) {
        this.deleteSlotIds = deleteSlotIds;
    }

    public List<TbClockworkTaskAndSlotRelation> getAddSlotRelations() {
        return addSlotRelations;
    }

    public void setAddSlotRelations(List<TbClockworkTaskAndSlotRelation> addSlotRelations) {
        this.addSlotRelations = addSlotRelations;
    }

    public List<TbClockworkTask> getUpdateTriggerTimes() {
        return updateTriggerTimes;
    }

    public void setUpdateTriggerTimes(List<TbClockworkTask> updateTriggerTimes) {
        this.updateTriggerTimes = updateTriggerTimes;
    }
}
