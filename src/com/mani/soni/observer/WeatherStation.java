package com.mani.soni.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

	private int pressure;

	private int temperature;

	private int humidiy;

	private List<Observer> observerList;

	public WeatherStation() {

		this.observerList = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer o) {
		this.observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {

		this.observerList.remove(o);
	}

	@Override
	public void notifyAllObservers() {
		for (Observer o : observerList) {
			o.update(pressure, temperature, humidiy);

		}
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyAllObservers();
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyAllObservers();
	}

	public void setHumidiy(int humidiy) {
		this.humidiy = humidiy;
		notifyAllObservers();
	}

}
