package entity;

import java.math.BigDecimal;

public class Fahrenheit {

	private Double f;

	public Double FahrenheitParaCelsius(Double f) {
		BigDecimal result = BigDecimal.valueOf((f - 32) * 5/9).setScale(2, BigDecimal.ROUND_HALF_EVEN); 
		return result.doubleValue();
	}

	public Double getF() {
		this.f = FahrenheitParaCelsius(f);
		return f;
	}

	public void setF(Double f) {
		this.f = f;
	}

	@Override
	public String toString() {
		return "Fahrenheit [f=" + f + "]";
	}

}
