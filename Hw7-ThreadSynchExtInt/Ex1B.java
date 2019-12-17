//External Synch
import java.util.Random;

class Weather {

	public Weather() {
		super();
	}

	public int getTemp() {
		return new Random().nextInt(50);
	}

	public int windSpeed() {
		return new Random().nextInt(60);
	}

	public int humidity() {
		return new Random().nextInt(100);
	}

	public void printWeatherData(String city) {
		System.out.println("City = " + city);
		int temp = getTemp();
		deviceDelay(10);
		System.out.println("Temp = " + temp);
		int speed = windSpeed();
		deviceDelay(10);
		System.out.println("Wind speed =" + speed);
		int humid = humidity();
		deviceDelay(10);
		System.out.println("Humidity = " + humid);

	}

	public void deviceDelay(int msecs)// delay is in milli seconds
	{
		try {
			Thread.sleep(msecs);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class DisplayWeather implements Runnable {
	Weather weather;
	String city;

	public DisplayWeather(String city, Weather weather) {
		super();
		this.city = city;
		this.weather = weather;
	}

	public void run() {
		synchronized (Weather.class) { //lock access to weather class before printing
			weather.printWeatherData(city);
		}
	}

}

public class Ex1B {
	public static void main(String args[]) {
		Weather wd = new Weather();
		DisplayWeather sharjah = new DisplayWeather("Sharjah", wd);
		DisplayWeather dubai = new DisplayWeather("Dubai", wd);
		Thread t1 = new Thread(sharjah);
		Thread t2 = new Thread(dubai);
		t1.start();
		t2.start();
	}

}