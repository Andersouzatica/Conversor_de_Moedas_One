package entity;

import java.math.BigDecimal;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageIcon icon = new ImageIcon("src/imagem/one_80.png");
		ImageIcon icon3 = new ImageIcon("src/imagem/Bank_icon.png");
		ImageIcon icon4 = new ImageIcon("src/imagem/blocos-numericos_48.png");
		ImageIcon icon5 = new ImageIcon("src/imagem/bolsa-de-dinheiro_1.png");
		ImageIcon icon6 = new ImageIcon("src/imagem/euro_3.png");
		ImageIcon icon7 = new ImageIcon("src/imagem/real-brasileiro_50.png");
		ImageIcon icon8 = new ImageIcon("src/imagem/pergunta_2.png");
		ImageIcon icon9 = new ImageIcon("src/imagem/trabalhador.png");
		ImageIcon icon10 = new ImageIcon("src/imagem/aplausos.png");
		ImageIcon icon11 = new ImageIcon("src/imagem/peso_48.png");
		ImageIcon icon12 = new ImageIcon("src/imagem/temperatura.png");
		ImageIcon icon13 = new ImageIcon("src/imagem/temperatura_2.png");
		ImageIcon icon14 = new ImageIcon("src/imagem/termometro.png");

		ButtonGroup group = new ButtonGroup();
		String msgString1 = "       Escolha uma opção";
		JRadioButton opt1 = new javax.swing.JRadioButton("Celsius para Fahrenheit");
		JRadioButton opt2 = new javax.swing.JRadioButton("Fahrenheit para Celsius");
		opt1.setSelected(true);
		group.add(opt1);
		group.add(opt2);
		Object[] array = { msgString1, opt1, opt2 };
		BigDecimal temp = new BigDecimal(0.0);

		Celsius celsius = new Celsius();
		Fahrenheit fahrenheit = new Fahrenheit();
		Moeda moeda = new Moeda();
		Double valorCotacao = 0.0;
		String opts = "", vlc;
		Integer escolha = 0;
		String[] msg = { "Conversor de Moeda", "Conversor de Temperatura" };
		String[] moedas = { "Reais para Dólares", "Reais para Euros", "Reais para Peso ARG", "Dolares para Reais",
				"Euros para Reais", "Peso ARG para Reais" };

		do {
			String jcb = (String) JOptionPane.showInputDialog(null, "           Escolha uma opção", "Alura | Oracle",
					JOptionPane.QUESTION_MESSAGE, icon, msg, msg[0]);
			if (jcb == null) {
				System.exit(0);
			} else if (jcb.equalsIgnoreCase("Conversor de Moeda")) {
				try {
					while (true) {
						vlc = (JOptionPane.showInputDialog(null, "Insira um valor", "Mensagem ao Usuário",
								JOptionPane.QUESTION_MESSAGE));
						if (vlc == null) {
							System.exit(0);
						}
						try {
							valorCotacao = Double.parseDouble(vlc);
							break;
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null,
									"            Entrada inválida.\n     Insira um valor numérico.",
									"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon4);
						}
					}
				} catch (Exception e) {
					return;
				}
			}

			switch (jcb) {
			case "Conversor de Moeda":
				String selectedMoeda = (String) JOptionPane.showInputDialog(null,
						"Escolha a moeda que deseja converter.", "Conversor de Moedas", JOptionPane.PLAIN_MESSAGE,
						icon3, moedas, moedas[0]);
				if (selectedMoeda == null) {
					System.exit(0);
				}
				switch (selectedMoeda) {
				case "Reais para Dólares":
					moeda.reaisParaDolar(valorCotacao);
					break;
				case "Reais para Euros":
					moeda.reaisParaEuro(valorCotacao);
					break;
				case "Reais para Peso ARG":
					moeda.reaisParaPeso(valorCotacao);
					break;
				case "Dolares para Reais":
					moeda.dolaresParaReais(valorCotacao);
					break;
				case "Euros para Reais":
					moeda.euroParaReais(valorCotacao);
					break;
				case "Peso ARG para Reais":
					moeda.pesoParaReais(valorCotacao);
					break;
				}
				break;
			case "Conversor de Temperatura":
				int sel = JOptionPane.showConfirmDialog(null, array, "Pergunta ao Usuario", JOptionPane.DEFAULT_OPTION,
						JOptionPane.QUESTION_MESSAGE, icon14);
				try {
					while (true) {
						vlc = (JOptionPane.showInputDialog(null, "Insira uma Temperatura", "Mensagem ao Usuário",
								JOptionPane.QUESTION_MESSAGE));
						if (vlc == null) {
							System.exit(0);
						}
						try {
							temp = BigDecimal.valueOf(Double.parseDouble(vlc));
							break;
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null,
									"            Entrada inválida.\n     Insira um valor numérico.",
									"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon4);
						}
					}
				} catch (Exception e) {
					return;
				}

				if (sel == 0) {
					if (opt1.isSelected()) {
						celsius.setT(temp.doubleValue());
						celsius.celsiusParaFahrenheit(temp.doubleValue());
						JOptionPane.showMessageDialog(null,
								"       A conversão de " + temp + " °C\n             deu em " + celsius.getT() + " °F",
								"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon12);
					} else if (opt2.isSelected()) {
						fahrenheit.setF(temp.doubleValue());
						fahrenheit.FahrenheitParaCelsius(temp.doubleValue());
						JOptionPane
								.showMessageDialog(null,
										"       A conversão de " + temp + " °F\n             deu em "
												+ fahrenheit.getF() + " °C",
										"Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE, icon13);
					}

				}

				break;
			}
			opt1.setSelected(true);
			escolha = JOptionPane.showConfirmDialog(null, "     Desejar continuar ?", "Pergunta ao Usuário",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon8);
		} while (escolha == 0);
		if (escolha == 1)

		{
			JOptionPane.showMessageDialog(null, "     Programa finalizado", "Mensagem ao Usuário",
					JOptionPane.INFORMATION_MESSAGE, icon10);
		} else if (escolha == 2) {
			JOptionPane.showMessageDialog(null, "     Programa concluido", "Mensagem ao Usuário",
					JOptionPane.INFORMATION_MESSAGE, icon9);
		}
	}

}
