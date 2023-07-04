package entity;

import java.math.BigDecimal;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal d = BigDecimal.valueOf(0.2079002079002079);
		BigDecimal c = BigDecimal.valueOf(d.doubleValue()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		BigDecimal a = new BigDecimal("10.0");
		BigDecimal b = d.setScale(2, BigDecimal.ROUND_HALF_EVEN);

		a = a.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		//b = b.setScale(2, BigDecimal.ROUND_HALF_EVEN);

		System.out.println(a);
		System.out.println(c);

	}

}
