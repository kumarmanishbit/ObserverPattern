package com.mani.soni.observer;

public class WeatherObserver implements Observer {

	private int pressure;

	private int temperature;

	private int humidity;

	private Subject subject;

	public WeatherObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update(int presuure, int temperatrure, int humidity) {

		this.pressure = presuure;
		this.temperature = temperatrure;
		this.humidity = humidity;

		System.out.println(showData());
	}

	public String showData() {
		return "WeatherObserver [pressure=" + pressure + ", temperature=" + temperature + ", humidity=" + humidity
				+ "]";
	}

}
