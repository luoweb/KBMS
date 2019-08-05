package com.generator.pojo;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_password
     *
     * @mbggenerated
     */
    private String userPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_sex
     *
     * @mbggenerated
     */
    private String userSex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_email
     *
     * @mbggenerated
     */
    private String userEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_acode
     *
     * @mbggenerated
     */
    private String userAcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_active
     *
     * @mbggenerated
     */
    private Integer userActive;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_imgid
     *
     * @mbggenerated
     */
    private String userImgid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_roleid
     *
     * @mbggenerated
     */
    private Integer userRoleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_sign
     *
     * @mbggenerated
     */
    private String userSign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.comments
     *
     * @mbggenerated
     */
    private Integer comments;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.knowledges
     *
     * @mbggenerated
     */
    private Integer knowledges;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.collections
     *
     * @mbggenerated
     */
    private Integer collections;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.follows
     *
     * @mbggenerated
     */
    private Integer follows;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.supports
     *
     * @mbggenerated
     */
    private Integer supports;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.c_time
     *
     * @mbggenerated
     */
    private Date cTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.l_time
     *
     * @mbggenerated
     */
    private Date lTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.department_id
     *
     * @mbggenerated
     */
    private Integer departmentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_password
     *
     * @return the value of user.user_password
     *
     * @mbggenerated
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_password
     *
     * @param userPassword the value for user.user_password
     *
     * @mbggenerated
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_sex
     *
     * @return the value of user.user_sex
     *
     * @mbggenerated
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_sex
     *
     * @param userSex the value for user.user_sex
     *
     * @mbggenerated
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_email
     *
     * @return the value of user.user_email
     *
     * @mbggenerated
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_email
     *
     * @param userEmail the value for user.user_email
     *
     * @mbggenerated
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_acode
     *
     * @return the value of user.user_acode
     *
     * @mbggenerated
     */
    public String getUserAcode() {
        return userAcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_acode
     *
     * @param userAcode the value for user.user_acode
     *
     * @mbggenerated
     */
    public void setUserAcode(String userAcode) {
        this.userAcode = userAcode == null ? null : userAcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_active
     *
     * @return the value of user.user_active
     *
     * @mbggenerated
     */
    public Integer getUserActive() {
        return userActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_active
     *
     * @param userActive the value for user.user_active
     *
     * @mbggenerated
     */
    public void setUserActive(Integer userActive) {
        this.userActive = userActive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_imgid
     *
     * @return the value of user.user_imgid
     *
     * @mbggenerated
     */
    public String getUserImgid() {
        return userImgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_imgid
     *
     * @param userImgid the value for user.user_imgid
     *
     * @mbggenerated
     */
    public void setUserImgid(String userImgid) {
        this.userImgid = userImgid == null ? null : userImgid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_roleid
     *
     * @return the value of user.user_roleid
     *
     * @mbggenerated
     */
    public Integer getUserRoleid() {
        return userRoleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_roleid
     *
     * @param userRoleid the value for user.user_roleid
     *
     * @mbggenerated
     */
    public void setUserRoleid(Integer userRoleid) {
        this.userRoleid = userRoleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_sign
     *
     * @return the value of user.user_sign
     *
     * @mbggenerated
     */
    public String getUserSign() {
        return userSign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_sign
     *
     * @param userSign the value for user.user_sign
     *
     * @mbggenerated
     */
    public void setUserSign(String userSign) {
        this.userSign = userSign == null ? null : userSign.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.comments
     *
     * @return the value of user.comments
     *
     * @mbggenerated
     */
    public Integer getComments() {
        return comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.comments
     *
     * @param comments the value for user.comments
     *
     * @mbggenerated
     */
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.knowledges
     *
     * @return the value of user.knowledges
     *
     * @mbggenerated
     */
    public Integer getKnowledges() {
        return knowledges;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.knowledges
     *
     * @param knowledges the value for user.knowledges
     *
     * @mbggenerated
     */
    public void setKnowledges(Integer knowledges) {
        this.knowledges = knowledges;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.collections
     *
     * @return the value of user.collections
     *
     * @mbggenerated
     */
    public Integer getCollections() {
        return collections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.collections
     *
     * @param collections the value for user.collections
     *
     * @mbggenerated
     */
    public void setCollections(Integer collections) {
        this.collections = collections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.follows
     *
     * @return the value of user.follows
     *
     * @mbggenerated
     */
    public Integer getFollows() {
        return follows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.follows
     *
     * @param follows the value for user.follows
     *
     * @mbggenerated
     */
    public void setFollows(Integer follows) {
        this.follows = follows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.supports
     *
     * @return the value of user.supports
     *
     * @mbggenerated
     */
    public Integer getSupports() {
        return supports;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.supports
     *
     * @param supports the value for user.supports
     *
     * @mbggenerated
     */
    public void setSupports(Integer supports) {
        this.supports = supports;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.c_time
     *
     * @return the value of user.c_time
     *
     * @mbggenerated
     */
    public Date getcTime() {
        return cTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.c_time
     *
     * @param cTime the value for user.c_time
     *
     * @mbggenerated
     */
    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.l_time
     *
     * @return the value of user.l_time
     *
     * @mbggenerated
     */
    public Date getlTime() {
        return lTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.l_time
     *
     * @param lTime the value for user.l_time
     *
     * @mbggenerated
     */
    public void setlTime(Date lTime) {
        this.lTime = lTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.department_id
     *
     * @return the value of user.department_id
     *
     * @mbggenerated
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.department_id
     *
     * @param departmentId the value for user.department_id
     *
     * @mbggenerated
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}