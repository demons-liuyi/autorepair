package com.accp.domain;

import java.util.Date;

public class Dimission {
    private Integer id;

    private Integer staffid;

    private Date dimissiondate;

    private byte[] dimissioncause;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public Date getDimissiondate() {
        return dimissiondate;
    }

    public void setDimissiondate(Date dimissiondate) {
        this.dimissiondate = dimissiondate;
    }

    public byte[] getDimissioncause() {
        return dimissioncause;
    }

    public void setDimissioncause(byte[] dimissioncause) {
        this.dimissioncause = dimissioncause;
    }
}