package com.cp.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseMapper<T,T1> {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    long countByExample(T example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    int deleteByExample(T example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    int insert(T1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    int insertSelective(T1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    List<T1> selectByExample(T example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    T1 selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") T1 record, @Param("example") T example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") T1 record, @Param("example") T example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(T1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_base_animal
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(T1 record);
}
