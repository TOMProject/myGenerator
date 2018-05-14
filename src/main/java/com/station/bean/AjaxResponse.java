package com.station.bean;

import java.io.Serializable;

import com.station.common.Constant;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * ajax 返回数据
 * @author 
 *
 * @param <T>
 */
@ApiModel
public class AjaxResponse<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value = "错误编码", example = Constant.RS_CODE_SUCCESS, required = true)
	private String code;
	@ApiModelProperty(value = "提示信息", example = "成功", required = true)
	private String msg;
	@ApiModelProperty(value = "返回结果集")
	private T data;

	public AjaxResponse() {
		setCode(Constant.RS_CODE_SUCCESS);
		setMsg(Constant.RS_MSG_SUCCESS);
	}

	public AjaxResponse(String code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public AjaxResponse(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public AjaxResponse(T data) {
		setData(data);
		setCode(Constant.RS_CODE_SUCCESS);
		setMsg(Constant.RS_MSG_SUCCESS);
	}

	public void isError() {
		setCode(Constant.RS_CODE_ERROR);
		setMsg(Constant.RS_MSG_ERROR);
	}

	public void isSuccess() {
		setCode(Constant.RS_CODE_SUCCESS);
		setMsg(Constant.RS_MSG_SUCCESS);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}


	
	

	
}
