package com.jetherrodrigues.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Instrument<E> {
	
	private List<E> instruments = new ArrayList<>();
	
	public void add(E instrument) {
		instruments.add(instrument);
	}
	
	public E getInstrument(int position) {
		return instruments.get(position);
	}
	
	public boolean remove(E instrument) {
		return instruments.remove(instrument);
	}
	
	public boolean hasInstrument() {
		return !instruments.isEmpty();
	}
	
	public int getSize() {
		return instruments.size();
	}
	
	public void addAll(Collection<? extends E> instruments) {
		for (E e : instruments) {
			add(e);
		}
	}
}
