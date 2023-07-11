package entity;

import java.math.BigDecimal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Moeda {

	private BigDecimal euro = BigDecimal.valueOf(5.25);
	private BigDecimal dolar = BigDecimal.valueOf(4.81);
	private BigDecimal peso = BigDecimal.valueOf(0.019);

	ImageIcon icon5 = new ImageIcon("src/imagem/bolsa-de-dinheiro_1.png");
	ImageIcon icon6 = new ImageIcon("src/imagem/euro_3.png");
	ImageIcon icon11 = new ImageIcon("src/imagem/peso_48.png");
	ImageIcon icon7 = new ImageIcon("src/imagem/real-brasileiro_50.png");

	public void reaisParaDolar(Double c) {
		BigDecimal cot1 = BigDecimal.valueOf(c / dolar.doubleValue()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		BigDecimal b = BigDecimal.valueOf(c).setScale(2);
		JOptionPane.showMessageDialog(null, "       A Conversão de R$ " + b + "\n         deu US$ " + cot1 + " Dolares",
				"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon5);
	}

	public void reaisParaEuro(Double c) {
		BigDecimal cot2 = BigDecimal.valueOf(c / euro.doubleValue()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		BigDecimal g = BigDecimal.valueOf(c).setScale(2);
		JOptionPane.showMessageDialog(null, "      A Conversão de R$ " + g + "\n             deu " + cot2 + " € Euros",
				"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon6); 
	}

	public void reaisParaPeso(Double c) {
		BigDecimal cot5 = BigDecimal.valueOf(c / peso.doubleValue()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		BigDecimal f = BigDecimal.valueOf(c).setScale(2);
		JOptionPane.showMessageDialog(null, "    A Conversão de R$ " + f + " \n     deu em $ " + cot5 + " Peso",
				"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon11);
	}

	public void dolaresParaReais(Double c) {
		BigDecimal cot3 = BigDecimal.valueOf(c * dolar.doubleValue()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		BigDecimal d = BigDecimal.valueOf(c).setScale(2);
		JOptionPane.showMessageDialog(null, "    A Conversão de US$ " + d + "\n           deu R$ " + cot3 + " Reais",
				"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon7);
	}

	public void euroParaReais(Double c) {
		BigDecimal cot4 = BigDecimal.valueOf(c * euro.doubleValue()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		BigDecimal e = BigDecimal.valueOf(c).setScale(2);
		JOptionPane.showMessageDialog(null, "      A Conversão de " + e + " €\n         deu R$ " + cot4 + " Reais",
				"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon7);
	}

	public void pesoParaReais(Double c) {
		BigDecimal cot6 = BigDecimal.valueOf(c * peso.doubleValue()).setScale(3, BigDecimal.ROUND_HALF_EVEN);
		BigDecimal h = BigDecimal.valueOf(c).setScale(2);
		JOptionPane.showMessageDialog(null, "     A Conversão de $ " + h + " \n        deu R$ " + cot6 + " Reais",
				"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon7);
	}

	public Double getEuro() {
		return euro.doubleValue();
	}

	public Double getDolar() {
		return this.dolar.doubleValue();
	}

	public Double getPeso() {
		return peso.doubleValue();
	}

	@Override
	public String toString() {
		return "Moeda [euro=" + euro + ", dolar=" + dolar + ", peso=" + peso + "]";
	}

}
