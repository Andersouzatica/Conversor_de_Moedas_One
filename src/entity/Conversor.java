package entity;

import java.math.BigDecimal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ImageIcon icon = new ImageIcon("src/imagem/one_80.png");
//		ImageIcon icon3 = new ImageIcon("src/imagem/Bank_icon.png");
//		ImageIcon icon4 = new ImageIcon("src/imagem/blocos-numericos_48.png");
//		ImageIcon icon5 = new ImageIcon("src/imagem/bolsa-de-dinheiro_1.png");
//		ImageIcon icon6 = new ImageIcon("src/imagem/euro_3.png");
//		ImageIcon icon7 = new ImageIcon("src/imagem/real-brasileiro_50.png");
//		ImageIcon icon8 = new ImageIcon("src/imagem/pergunta_2.png");
//		ImageIcon icon9 = new ImageIcon("src/imagem/trabalhador.png");
//		ImageIcon icon10 = new ImageIcon("src/imagem/aplausos.png");
//		ImageIcon icon11 = new ImageIcon("src/imagem/peso_48.png");
//
//		Celsius temperatura = new Celsius();
//		Integer valor = 0;
//		Double temp = 0.0;
//		String vl = "";
//		Integer escolha = 0;
//		String[] msg = { "Conversor de Moeda", "Conversor de Temperatura" };
//		String[] moeda = { "Reais para Dólares", "Reais para Euros", "Reais para Peso ARG", "Dolares para Reais",
//				"Euros para Reais", "Peso ARG para Reais" };
//		BigDecimal cotacao_dolar = BigDecimal.valueOf(4.81); // ----03/07/2023
//		BigDecimal cotacao_euro = BigDecimal.valueOf(5.25); // -----03/07/2023
//		BigDecimal cotacao_peso = BigDecimal.valueOf(0.0187); // ----08/07/2023
//
//		do {
//			String jcb = (String) JOptionPane.showInputDialog(null, "           Escolha uma opção", "Alura + Oracle",
//					JOptionPane.QUESTION_MESSAGE, icon, msg, msg[0]);
//			if (jcb == null) {
//				System.exit(0);
//			} else if (jcb.equalsIgnoreCase("Conversor de Moeda")) {
//
//				try {
//					while (true) {
//						vl = (JOptionPane.showInputDialog(null, "Insira um valor", "Mensagem ao Usuário",
//								JOptionPane.QUESTION_MESSAGE));
//						if (vl == null) {
//							System.exit(0);
//						}
//						try {
//							valor = Integer.parseInt(vl);
//							break;
//						} catch (NumberFormatException e) {
//							JOptionPane.showMessageDialog(null,
//									"            Entrada inválida.\n     Insira um valor numérico.",
//									"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon4);
//						}
//					}
//				} catch (Exception e) {
//					return;
//				}
//			} else if (jcb.equalsIgnoreCase("Conversor de Temperatura")){
//				try {
//					while (true) {
//						vl = (JOptionPane.showInputDialog(null, "Informe uma Temperadura", "Mensagem ao Usuário",
//								JOptionPane.QUESTION_MESSAGE));
//						if (vl == null) {
//							System.exit(0);
//						}
//						try {
//							temp = Double.parseDouble(vl);
//							break;
//						} catch (NumberFormatException e) {
//							JOptionPane.showMessageDialog(null,
//									"            Entrada inválida.\n     Insira um valor numérico.",
//									"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon4);
//						}
//					}
//				} catch (Exception e) {
//					return;
//				}
//			}
//			switch (jcb) {
//			case "Conversor de Moeda":
//				String selectedMoeda = (String) JOptionPane.showInputDialog(null,
//						"Escolha a moeda que deseja converter.", "Conversor de Moedas", JOptionPane.PLAIN_MESSAGE,
//						icon3, moeda, moeda[0]);
//				if (selectedMoeda == null) {
//					System.exit(0);
//				}
//
//				switch (selectedMoeda) {
//				case "Reais para Dólares":
//					BigDecimal cot1 = BigDecimal.valueOf(valor / cotacao_dolar.doubleValue()).setScale(2,
//							BigDecimal.ROUND_HALF_EVEN);
//					BigDecimal b = BigDecimal.valueOf(valor).setScale(2);
//					JOptionPane.showMessageDialog(null,
//							"          Convertido R$ " + b + "\n        em US$ " + cot1 + " Dolares",
//							"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon5);
//					break;
//				case "Reais para Euros":
//					BigDecimal cot2 = BigDecimal.valueOf(valor / cotacao_euro.doubleValue()).setScale(2,
//							BigDecimal.ROUND_HALF_EVEN);
//					BigDecimal c = BigDecimal.valueOf(valor).setScale(2);
//					JOptionPane.showMessageDialog(null,
//							"          Convertido R$ " + c + "\n            em " + cot2 + " € Euros",
//							"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon6);
//					break;
//				case "Dolares para Reais":
//					BigDecimal cot3 = BigDecimal.valueOf(valor * cotacao_dolar.doubleValue()).setScale(2,
//							BigDecimal.ROUND_HALF_EVEN);
//					BigDecimal d = BigDecimal.valueOf(valor).setScale(2);
//					JOptionPane.showMessageDialog(null,
//							"       Convertido US$ " + d + "\n          em R$ " + cot3 + " Reais",
//							"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon7);
//					break;
//				case "Euros para Reais":
//					BigDecimal cot4 = BigDecimal.valueOf(valor * cotacao_euro.doubleValue()).setScale(2,
//							BigDecimal.ROUND_HALF_EVEN);
//					BigDecimal e = BigDecimal.valueOf(valor).setScale(2);
//					JOptionPane.showMessageDialog(null,
//							"       Convertido " + e + " €\n       em R$ " + cot4 + " Reais", "Mensagem ao Usuário",
//							JOptionPane.INFORMATION_MESSAGE, icon7);
//					break;
//				case "Reais para Peso ARG":
//					BigDecimal cot5 = BigDecimal.valueOf(valor / cotacao_peso.doubleValue()).setScale(2,
//							BigDecimal.ROUND_HALF_EVEN);
//					BigDecimal f = BigDecimal.valueOf(valor).setScale(2);
//					JOptionPane.showMessageDialog(null,
//							"       Convertido R$ " + f + " \n         em $ " + cot5 + " Peso", "Mensagem ao Usuário",
//							JOptionPane.INFORMATION_MESSAGE, icon11);
//					break;
//				case "Peso ARG para Reais":
//					BigDecimal cot6 = BigDecimal.valueOf(valor * cotacao_peso.doubleValue()).setScale(2,
//							BigDecimal.ROUND_HALF_EVEN);
//					BigDecimal g = BigDecimal.valueOf(valor).setScale(2);
//					JOptionPane.showMessageDialog(null,
//							"       Convertido $ " + g + " \n       em R$ " + cot6 + " Reais", "Mensagem ao Usuário",
//							JOptionPane.INFORMATION_MESSAGE, icon7);
//					break;
//				}
//			case "Conversor de Temperatura":
////				Teste teste = new Teste();
////				teste.cel();
////				temperatura.setT(temp);
////				temperatura.celsiusParaFahrenheit(temperatura.getT());
////				System.out.println("Valor da conversao: " + temp);
////				System.out.println(temperatura);
//				System.out.println("Passei aqui");
//				break;
//			}
//
//			escolha = JOptionPane.showConfirmDialog(null, "     Desejar continuar ?", "Pergunta ao Usuário",
//					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon8);
//		} while (escolha == 0);
//		if (escolha == 1)
//
//		{
//			JOptionPane.showMessageDialog(null, "     Programa finalizado", "Mensagem ao Usuário",
//					JOptionPane.INFORMATION_MESSAGE, icon10);
//		} else if (escolha == 2) {
//			JOptionPane.showMessageDialog(null, "     Programa concluido", "Mensagem ao Usuário",
//					JOptionPane.INFORMATION_MESSAGE, icon9);
//		}
	}
}
