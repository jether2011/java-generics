package com.jetherrodrigues.generics;

public class PluviometerStation extends Pluviometer{
	private String sensor;
	
	public PluviometerStation(String serial, String sensor) {
		this.serial = serial;
		this.sensor = sensor;
		this.clazz = this.getClass().getName();
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getSensor() {
		return sensor;
	}

	public void setSensor(String sensor) {
		this.sensor = sensor;
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
