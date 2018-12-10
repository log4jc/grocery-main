package com.jwebcoder.grocerymain.common.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "SYSTEM_USER")
public class SystemUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.ID
     *
     * @mbggenerated
     */
    @Id
    @Column(name = "ID")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.VERSION
     *
     * @mbggenerated
     */
    @Column(name = "VERSION")
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.USER_NAME
     *
     * @mbggenerated
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.PASSWORD
     *
     * @mbggenerated
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.TYPE
     *
     * @mbggenerated
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.EMAIL
     *
     * @mbggenerated
     */
    @Column(name = "EMAIL")
    private String email;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.EMAIL
     *
     * @mbggenerated
     */
    /*@Column(name = "PERSONAL_INFO_ID")
    private String personalInfoId;*/

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.CREATE_DATETIME
     *
     * @mbggenerated
     */
    @Column(name = "CREATE_DATETIME")
    private String createDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.LAST_LOGIN_DATETIME
     *
     * @mbggenerated
     */
    @Column(name = "LAST_LOGIN_DATETIME")
    private String lastLoginDatetime;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PERSONAL_INFO_ID", referencedColumnName = "ID")
    private PersonalInfo personalInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.CUSTOM1
     *
     * @mbggenerated
     */
    @Column(name = "CUSTOM1")
    private String custom1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.CUSTOM2
     *
     * @mbggenerated
     */
    @Column(name = "CUSTOM2")
    private String custom2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.CUSTOM3
     *
     * @mbggenerated
     */
    @Column(name = "CUSTOM3")
    private String custom3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.CUSTOM4
     *
     * @mbggenerated
     */
    @Column(name = "CUSTOM4")
    private String custom4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYSTEM_USER.CUSTOM5
     *
     * @mbggenerated
     */
    @Column(name = "CUSTOM5")
    private String custom5;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USER.ID
     *
     * @return the value of SYSTEM_USER.ID
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USER.ID
     *
     * @param id the value for SYSTEM_USER.ID
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USER.VERSION
     *
     * @return the value of SYSTEM_USER.VERSION
     * @mbggenerated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USER.VERSION
     *
     * @param version the value for SYSTEM_USER.VERSION
     * @mbggenerated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USER.USER_NAME
     *
     * @return the value of SYSTEM_USER.USER_NAME
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USER.USER_NAME
     *
     * @param userName the value for SYSTEM_USER.USER_NAME
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USER.PASSWORD
     *
     * @return the value of SYSTEM_USER.PASSWORD
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USER.PASSWORD
     *
     * @param password the value for SYSTEM_USER.PASSWORD
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USER.TYPE
     *
     * @return the value of SYSTEM_USER.TYPE
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USER.TYPE
     *
     * @param type the value for SYSTEM_USER.TYPE
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USER.EMAIL
     *
     * @return the value of SYSTEM_USER.EMAIL
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USER.EMAIL
     *
     * @param email the value for SYSTEM_USER.EMAIL
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USER.CREATE_DATETIME
     *
     * @return the value of SYSTEM_USER.CREATE_DATETIME
     * @mbggenerated
     */
    public String getCreateDatetime() {
        return createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USER.CREATE_DATETIME
     *
     * @param createDatetime the value for SYSTEM_USER.CREATE_DATETIME
     * @mbggenerated
     */
    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime == null ? null : createDatetime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USER.LAST_LOGIN_DATETIME
     *
     * @return the value of SYSTEM_USER.LAST_LOGIN_DATETIME
     * @mbggenerated
     */
    public String getLastLoginDatetime() {
        return lastLoginDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USER.LAST_LOGIN_DATETIME
     *
     * @param lastLoginDatetime the value for SYSTEM_USER.LAST_LOGIN_DATETIME
     * @mbggenerated
     */
    public void setLastLoginDatetime(String lastLoginDatetime) {
        this.lastLoginDatetime = lastLoginDatetime == null ? null : lastLoginDatetime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USER.CUSTOM1
     *
     * @return the value of SYSTEM_USER.CUSTOM1
     * @mbggenerated
     */
    public String getCustom1() {
        return custom1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USER.CUSTOM1
     *
     * @param custom1 the value for SYSTEM_USER.CUSTOM1
     * @mbggenerated
     */
    public void setCustom1(String custom1) {
        this.custom1 = custom1 == null ? null : custom1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USER.CUSTOM2
     *
     * @return the value of SYSTEM_USER.CUSTOM2
     * @mbggenerated
     */
    public String getCustom2() {
        return custom2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USER.CUSTOM2
     *
     * @param custom2 the value for SYSTEM_USER.CUSTOM2
     * @mbggenerated
     */
    public void setCustom2(String custom2) {
        this.custom2 = custom2 == null ? null : custom2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USER.CUSTOM3
     *
     * @return the value of SYSTEM_USER.CUSTOM3
     * @mbggenerated
     */
    public String getCustom3() {
        return custom3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USER.CUSTOM3
     *
     * @param custom3 the value for SYSTEM_USER.CUSTOM3
     * @mbggenerated
     */
    public void setCustom3(String custom3) {
        this.custom3 = custom3 == null ? null : custom3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USER.CUSTOM4
     *
     * @return the value of SYSTEM_USER.CUSTOM4
     * @mbggenerated
     */
    public String getCustom4() {
        return custom4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USER.CUSTOM4
     *
     * @param custom4 the value for SYSTEM_USER.CUSTOM4
     * @mbggenerated
     */
    public void setCustom4(String custom4) {
        this.custom4 = custom4 == null ? null : custom4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYSTEM_USER.CUSTOM5
     *
     * @return the value of SYSTEM_USER.CUSTOM5
     * @mbggenerated
     */
    public String getCustom5() {
        return custom5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYSTEM_USER.CUSTOM5
     *
     * @param custom5 the value for SYSTEM_USER.CUSTOM5
     * @mbggenerated
     */
    public void setCustom5(String custom5) {
        this.custom5 = custom5 == null ? null : custom5.trim();
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    /*public String getPersonalInfoId() {
        return personalInfoId;
    }

    public void setPersonalInfoId(String personalInfoId) {
        this.personalInfoId = personalInfoId;
    }*/
}