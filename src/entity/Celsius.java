package entity;

import java.math.BigDecimal;

public class Celsius {

	private Double t;
	
	public Double celsiusParaFahrenheit(Double c) {
		BigDecimal result = BigDecimal.valueOf((c * 9 / 5) + 32).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		return result.doubleValue();
	}

	public Double getT() {
		this.t = celsiusParaFahrenheit(t);
		return t;
	}

	public void setT(Double temp) {
		this.t = temp;
	}

	@Override
	public String toString() {
		return "Temperatura [t=" + t + "]";
	}

}
