package com.ty.springbootcrudoperation.exception;

public class IdNotFoundException extends RuntimeException {

	private String msg;
	
	public IdNotFoundException(String msg) {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
