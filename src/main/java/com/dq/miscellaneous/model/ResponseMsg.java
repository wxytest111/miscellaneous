package com.dq.miscellaneous.model;


import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

public class ResponseMsg implements Serializable {


    private String code = StringUtils.EMPTY;
    private Object result = StringUtils.EMPTY;
    private String state;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getState() {
        return state;
    }

    public void setState(boolean flag) {
        this.state = String.valueOf(flag);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}

