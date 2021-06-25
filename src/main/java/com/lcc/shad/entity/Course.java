package com.lcc.shad.entity;


import javax.persistence.*;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2021/6/24 17:07
 */
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    private String CHAME;

    private Long USER_ID;

    private String CSTATUS;


    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCHAME() {
        return CHAME;
    }

    public void setCHAME(String CHAME) {
        this.CHAME = CHAME;
    }

    public Long getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Long USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getCSTATUS() {
        return CSTATUS;
    }

    public void setCSTATUS(String CSTATUS) {
        this.CSTATUS = CSTATUS;
    }
}
