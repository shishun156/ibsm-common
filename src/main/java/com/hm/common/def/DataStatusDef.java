package com.hm.common.def;

/**
 * @author shishun.wang
 * @date 下午10:41:28 2017年2月1日
 * @version 1.0
 * @describe 数据状态
 */
public enum DataStatusDef {

	/**
	 * 禁用（已删除）
	 */
	DISABLE(0, "禁用（已删除）"),

	/**
	 * 启用（正在使用）
	 */
	ENABLE(1, "启用（正在使用）");

	private int value;

	private String desc;

	private DataStatusDef(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public String desc() {
		return this.desc;
	}

	public int value() {
		return this.value;
	}
}
