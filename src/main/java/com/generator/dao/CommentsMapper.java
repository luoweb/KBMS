package com.generator.dao;

import com.generator.pojo.Comments;

public interface CommentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated
     */
    int insert(Comments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated
     */
    int insertSelective(Comments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated
     */
    Comments selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Comments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comments
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Comments record);
}