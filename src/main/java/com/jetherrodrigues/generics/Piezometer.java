package com.jetherrodrigues.generics;

public class Piezometer {
	private String serial;
	private String clazz;

	public Piezometer(String serial) {
		this.serial = serial;
		this.clazz = this.getClass().getName();
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return GsonSingleton.getInstance().toJson(this);
	}
}
