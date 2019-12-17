import java.util.Random;

class Weather {

	public Weather() {
		super();
		// TODO Auto-generated constructor stub
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
		synchronized (this.getClass()) {
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
	}

	public void deviceDelay(int msecs)// delay is in milli seconds
	{
		try {
			Thread.sleep(msecs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
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

	@Override
	public void run() {

		weather.printWeatherData(city);

	}

}

public class PrintWeather {
	public static void main(String args[]) {
		Weather wd = new Weather();
		Weather wd2 = new Weather();
		DisplayWeather sharjah = new DisplayWeather("Sharjah", wd);
		DisplayWeather dubai = new DisplayWeather("Dubai", wd2);
		Thread t1 = new Thread(sharjah);
		Thread t2 = new Thread(dubai);
		t1.start();
		t2.start();
	}

}