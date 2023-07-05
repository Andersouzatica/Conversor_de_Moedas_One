package entity;

import java.math.BigDecimal;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Conversor extends JDialog {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] msg = { "Conversor de Moeda", "Conversor de Temperatura" };
		String[] moeda = { "De Reais para Dólares", "De Reais para Euros", "De Dolares para Reais",
				"De Euros para Reais" };
		BigDecimal cotacao_dotar = BigDecimal.valueOf(4.81); // ----03/07/2023
		BigDecimal cotacao_euro = BigDecimal.valueOf(5.25); // -----03/07/2023
		Integer escolha = 0;
		do {
		String jcb = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE,
				null, msg, msg[0]);
		System.out.println(jcb);
		String vl = JOptionPane.showInputDialog("Insira um valor:");
		Integer valor = Integer.parseInt(vl);
			
		System.out.println("Valor inserido: " + valor);
		switch (jcb) {
		case "Conversor de Moeda":
			String selectedMoeda = (String) JOptionPane.showInputDialog(null, "Escolha a moeda que deseja converter.",
					"Moedas", JOptionPane.PLAIN_MESSAGE, null, moeda, moeda[0]);
				
			switch (selectedMoeda) {
			case "De Reais para Dólares":
				BigDecimal cot1 = BigDecimal.valueOf(valor / cotacao_dotar.doubleValue()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
				System.out.println("Valor convertido: R$ " + cot1);
				JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + cot1);
				break;
			case "De Reais para Euros":
				BigDecimal cot2 = BigDecimal.valueOf(valor / cotacao_euro.doubleValue()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
				System.out.println("Valor convertido: R$ " + cot2);
				JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + cot2);
				break;
			case "De Dolares para Reais":
				BigDecimal cot3 = BigDecimal.valueOf(valor * cotacao_dotar.doubleValue()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
				System.out.println("Valor convertido: R$ " + cot3);
				JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + cot3);
				break;
			case "De Euros para Reais":
				BigDecimal cot4 = BigDecimal.valueOf(valor * cotacao_euro.doubleValue()).setScale(2, BigDecimal.ROUND_HALF_EVEN);
				System.out.println("Valor convertido: R$ " + cot4);
				JOptionPane.showMessageDialog(null, "O valor da conversão é de R$ " + cot4);
				break;
			}
		}
		escolha = JOptionPane.showConfirmDialog(null, "Desejar continuar ?", "Pergunta ao Usuario", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
		} while ( escolha == 0);
		if(escolha == 1) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		} else if (escolha == 2) {
			JOptionPane.showMessageDialog(null, "Programa concluido");
		}
	}

}
