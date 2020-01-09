import java.util.Collections;

/**
 * A weather statistics app calculates the minimum, maximum, and average
 * temperature read so far from its subscribed weather station, if any.
 */
public class StatisticsApp extends WeatherObserver {

	/**
	 * Update the reading of this weather observer. Update the current temperature
	 * and the maximum, minimum, and average accordingly.
	 */
	WeatherStation ws;

	public void update() {
		/* Your Task */
	}

	/* See the method description in the parent class */
	public WeatherStation getWeatherStation() {
		/* Your Task */
		return this.ws;
	}

	/* See the method description in the parent class */
	public void setWeatherStation(WeatherStation ws) {
		/* Your Task */
		this.ws = ws;
	}

	/**
	 * Get the minimum temperature based on the readings so far.
	 * 
	 * @return minimum temperature based on the readings so far
	 */
	public double getMinTemperature() {
		/* Your Task */
		return Collections.min(this.ws.temper);
	}

	/**
	 * Get the maximum temperature based on the readings so far.
	 * 
	 * @return maximum temperature based on the readings so far
	 */
	public double getMaxTemperature() {
		/* Your Task */
		return Collections.max(ws.temper);
	}

	/**
	 * Get the average temperature based on the readings so far.
	 * 
	 * @return average temperature based on the readings so far
	 */
	public double getAverageTemperature() {
		/* Your Task */
		double sum = 0;
		int count = 0;
		for (int i = 0; i < this.ws.temper.size(); i++) {
			sum += ws.temper.get(i);
			count++;
		}
		double average = sum / count;
		return average;
	}
}
