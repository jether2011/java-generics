package com.jetherrodrigues.generics;

public class DataProcessor {
	public static void main(String[] args) {
		Instrument<Pluviometer> pluviometer = new Instrument<>();
		pluviometer.add(new Pluviometer("123456"));
		pluviometer.add(new Pluviometer("123457"));
		pluviometer.add(new Pluviometer("123458"));
		pluviometer.add(new Pluviometer("123459"));
		
		Instrument<Piezometer> piezometer = new Instrument<>();
		piezometer.add(new Piezometer("123777"));
		piezometer.add(new Piezometer("123778"));
		piezometer.add(new Piezometer("123779"));
		piezometer.add(new Piezometer("123780"));
		
		int pluPosition = 0;
		while (pluviometer.hasInstrument()) {
			System.out.println("Pluviometer number [ " + pluviometer.getInstrument(pluPosition).getSerial() + " ]");
			pluPosition ++;
		}
		
		int piePosition = 0;
		while (piezometer.hasInstrument()) {
			System.out.println("Piezometer number [ " + piezometer.getInstrument(piePosition) + " ]");
			piePosition ++;
		}
		
	}
}
