package com.accp.domain;

public class Department {
    private Integer id;

    private String departmentname;

    private String departmenttypename;

    private Integer parentid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDepartmenttypename() {
        return departmenttypename;
    }

    public void setDepartmenttypename(String departmenttypename) {
        this.departmenttypename = departmenttypename;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}