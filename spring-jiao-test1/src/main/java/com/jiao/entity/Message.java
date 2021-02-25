package com.jiao.entity;

/**
 * @author 老焦
 */
public class Message {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Message(String msg) {
		this.msg = msg;
	}

	public Message() {
	}
	public void printMessage(){
		System.out.println("Message:"+msg);
	}
}
