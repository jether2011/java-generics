package com.jetherrodrigues.generics;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
	public static void main(String[] args) {
		Instrument<Pluviometer> pluviometer = new Instrument<>();
		pluviometer.add(new Pluviometer("123456"));
		pluviometer.add(new Pluviometer("123457"));
		pluviometer.add(new Pluviometer("123458"));
		pluviometer.add(new Pluviometer("123459"));
		
		List<PluviometerStation> pluviometers = new ArrayList<>();
		pluviometers.add(new PluviometerStation("111111", "CHUVA"));
		pluviometers.add(new PluviometerStation("111122", "TEMPERATURA"));
		pluviometers.add(new PluviometerStation("111133", "VENTO"));
		
		pluviometer.addAll(pluviometers);
		
		Instrument<Piezometer> piezometer = new Instrument<>();
		piezometer.add(new Piezometer("123777"));
		piezometer.add(new Piezometer("123778"));
		piezometer.add(new Piezometer("123779"));
		piezometer.add(new Piezometer("123780"));
		
		int pluPosition = 0;
		while (pluPosition < pluviometer.getSize()) {
			System.out.printf(" %s \n", pluviometer.getInstrument(pluPosition).toString());
			pluPosition ++;
		}
		
		int piePosition = 0;
		while (piePosition < piezometer.getSize()) {
			System.out.printf(" %s \n", piezometer.getInstrument(piePosition).toString());
			piePosition ++;
		}
		
	}
}
