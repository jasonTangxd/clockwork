package com.creditease.adx.clockwork.dao.mapper.clockwork;

import com.creditease.adx.clockwork.common.entity.gen.TbClockworkProject;
import com.creditease.adx.clockwork.common.entity.gen.TbClockworkProjectExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbClockworkProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_project
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    long countByExample(TbClockworkProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_project
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int deleteByExample(TbClockworkProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_project
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_project
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int insert(TbClockworkProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_project
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int insertSelective(TbClockworkProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_project
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    List<TbClockworkProject> selectByExample(TbClockworkProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_project
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    TbClockworkProject selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_project
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbClockworkProject record, @Param("example") TbClockworkProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_project
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByExample(@Param("record") TbClockworkProject record, @Param("example") TbClockworkProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_project
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByPrimaryKeySelective(TbClockworkProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_clockwork_project
     *
     * @mbg.generated Tue Aug 04 15:51:46 CST 2020
     */
    int updateByPrimaryKey(TbClockworkProject record);
}