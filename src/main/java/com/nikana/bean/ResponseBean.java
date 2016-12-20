package com.nikana.bean;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nikana.serializer.RespBeanSerializer;

/**
 * After Changing the bean attributes kindly update the same in JSON Serializer.
 * @author nikisrivastava
 *
 */
@JsonSerialize(using = RespBeanSerializer.class)
public class ResponseBean {
	private int errCode;
	private String errMsg;
	private Object payload;
	public int getErrCode() {
		return errCode;
	}
	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public Object getPayload() {
		return payload;
	}
	public void setPayload(Object payload) {
		this.payload = payload;
	}
}
