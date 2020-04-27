package com.mani.soni.observer;

public class App {
	
	
	public static void main(String[] args) {
		
		WeatherStation station = new WeatherStation();
		
		WeatherObserver observer = new WeatherObserver(station);
		
		station.setHumidiy(23);
		station.setPressure(10);
		station.setTemperature(36);
	}

}
