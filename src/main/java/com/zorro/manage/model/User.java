package com.zorro.manage.model;

import java.time.LocalDateTime;
import java.util.Date;

public class User {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.uid
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	private Long uid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.nickname
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	private String nickname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.email
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.password
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.create_time
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.last_login_time
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	private Date lastLoginTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.uid
	 * @return  the value of user.uid
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	public Long getUid() {
		return uid;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.uid
	 * @param uid  the value for user.uid
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	public void setUid(Long uid) {
		this.uid = uid;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.nickname
	 * @return  the value of user.nickname
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.nickname
	 * @param nickname  the value for user.nickname
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.email
	 * @return  the value of user.email
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.email
	 * @param email  the value for user.email
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.password
	 * @return  the value of user.password
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.password
	 * @param password  the value for user.password
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.create_time
	 * @return  the value of user.create_time
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.create_time
	 * @param createTime  the value for user.create_time
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.last_login_time
	 * @return  the value of user.last_login_time
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.last_login_time
	 * @param lastLoginTime  the value for user.last_login_time
	 * @mbg.generated  Thu Sep 28 12:20:12 CST 2017
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
}
