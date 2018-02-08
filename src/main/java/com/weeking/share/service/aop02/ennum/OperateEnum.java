package com.weeking.share.service.aop02.ennum;


public enum OperateEnum {

	USERNAME("username");
	private String type;
    OperateEnum(String type) {
        this.type = type;
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
