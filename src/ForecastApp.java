
/**
 * A weather forecast app determines if the pressure readings from its
 * subscribed weather station, if any, indicate it is likely to rain due to a
 * reduction on the pressure level.
 */
public class ForecastApp extends WeatherObserver {

	/**
	 * Update the reading of this weather observer. Update the current and last
	 * readings of pressure.
	 */
	WeatherStation ws;

	public void update() {
		/* Your Task */
	}

	/* See the method description in the parent class */
	public WeatherStation getWeatherStation() {
		/* Your Task */
		return ws;
	}

	/* See the method description in the parent class */
	public void setWeatherStation(WeatherStation ws) {
		/* Your Task */
		this.ws = ws;
	}

	/**
	 * Get the pressure level read from the last update.
	 * 
	 * @return pressure level read from the last update
	 */
	public double getCurrentPressure() {
		/* Your Task */
		double p = ws.press.get(this.ws.press.size() - 1);
		return p;
	}

	/**
	 * Get the pressure level read from the second last update.
	 * 
	 * @return pressure level read from the second last update
	 */
	public double getLastPressure() {
		/* Your Task */
		if (this.ws.press.size() > 1) {
			return this.ws.press.get(ws.press.size() - 2);
		} else {
			return this.ws.press.get(ws.press.size() - 1);
		}
	}

	/**
	 * Based on the last and second last readings of the pressure level, it is
	 * determined as likely to rain if there is a reduction on the pressure level;
	 * otherwise it is unlikely to rain.
	 * 
	 * @return whether or not it is likely to rain.
	 */
	public boolean isLikelyToRain() {
		/* Your Task */
		boolean result;
		if (this.getCurrentPressure() < this.getLastPressure()) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}