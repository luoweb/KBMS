package com.kbms_module.pojo;

import java.util.Date;
import java.util.List;

public class Group {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.create_id
     *
     * @mbggenerated
     */
    private Integer createId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.group_name
     *
     * @mbggenerated
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.group_nums
     *
     * @mbggenerated
     */
    private Integer groupNums;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.group_headimg
     *
     * @mbggenerated
     */
    private String groupHeadimg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.group_docnum
     *
     * @mbggenerated
     */
    private Integer groupDocnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.group_status
     *
     * @mbggenerated
     */
    private String groupStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.group_descirate
     *
     * @mbggenerated
     */
    private String groupDescirate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group.group_time
     *
     * @mbggenerated
     */
    private Date groupTime;

    //组员
    List<User> user;

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.id
     *
     * @return the value of group.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.id
     *
     * @param id the value for group.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.create_id
     *
     * @return the value of group.create_id
     *
     * @mbggenerated
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.create_id
     *
     * @param createId the value for group.create_id
     *
     * @mbggenerated
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.group_name
     *
     * @return the value of group.group_name
     *
     * @mbggenerated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.group_name
     *
     * @param groupName the value for group.group_name
     *
     * @mbggenerated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.group_nums
     *
     * @return the value of group.group_nums
     *
     * @mbggenerated
     */
    public Integer getGroupNums() {
        return groupNums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.group_nums
     *
     * @param groupNums the value for group.group_nums
     *
     * @mbggenerated
     */
    public void setGroupNums(Integer groupNums) {
        this.groupNums = groupNums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.group_headimg
     *
     * @return the value of group.group_headimg
     *
     * @mbggenerated
     */
    public String getGroupHeadimg() {
        return groupHeadimg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.group_headimg
     *
     * @param groupHeadimg the value for group.group_headimg
     *
     * @mbggenerated
     */
    public void setGroupHeadimg(String groupHeadimg) {
        this.groupHeadimg = groupHeadimg == null ? null : groupHeadimg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.group_docnum
     *
     * @return the value of group.group_docnum
     *
     * @mbggenerated
     */
    public Integer getGroupDocnum() {
        return groupDocnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.group_docnum
     *
     * @param groupDocnum the value for group.group_docnum
     *
     * @mbggenerated
     */
    public void setGroupDocnum(Integer groupDocnum) {
        this.groupDocnum = groupDocnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.group_status
     *
     * @return the value of group.group_status
     *
     * @mbggenerated
     */
    public String getGroupStatus() {
        return groupStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.group_status
     *
     * @param groupStatus the value for group.group_status
     *
     * @mbggenerated
     */
    public void setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus == null ? null : groupStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.group_descirate
     *
     * @return the value of group.group_descirate
     *
     * @mbggenerated
     */
    public String getGroupDescirate() {
        return groupDescirate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.group_descirate
     *
     * @param groupDescirate the value for group.group_descirate
     *
     * @mbggenerated
     */
    public void setGroupDescirate(String groupDescirate) {
        this.groupDescirate = groupDescirate == null ? null : groupDescirate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group.group_time
     *
     * @return the value of group.group_time
     *
     * @mbggenerated
     */
    public Date getGroupTime() {
        return groupTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group.group_time
     *
     * @param groupTime the value for group.group_time
     *
     * @mbggenerated
     */
    public void setGroupTime(Date groupTime) {
        this.groupTime = groupTime;
    }
}