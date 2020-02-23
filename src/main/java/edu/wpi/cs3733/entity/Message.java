package edu.wpi.cs3733.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Message class to hold clear text; you must implement the rest of the class
 */
public class Message implements Observable {
	private List<Observer> observers = new ArrayList<Observer>();
	private String message;

	public void setText(String text){
		this.message = message;
		notifyObservers();
	}

	public String getText(){
		return message;
	}

	@Override
	public void register(Observer o){
		observers.add(o);
	}

	@Override
	public void notifyObservers(){
		for (Observer observer: observers) {
			observer.notify();
		}
	}
}
