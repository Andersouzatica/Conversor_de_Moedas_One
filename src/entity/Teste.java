package entity;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Teste {

	public static void main(String[] args) {

		ImageIcon icon4 = new ImageIcon("src/imagem/blocos-numericos_48.png");
		Double temp = 0.0;
		String vl = "";
		Celsius celsius = new Celsius();
		Fahrenheit fahrenheit = new Fahrenheit();

		ButtonGroup group = new ButtonGroup();
		String msgString1 = "       Escolha uma opção";
		JRadioButton opt1 = new javax.swing.JRadioButton("Celsius para Fahrenheit");
		JRadioButton opt2 = new javax.swing.JRadioButton("Fahrenheit para Celsius");
		opt1.setSelected(true);
		group.add(opt1);
		group.add(opt2);
		Object[] array = { msgString1, opt1, opt2 };

		Double c = Double.parseDouble(JOptionPane.showInputDialog("insira um valor"));

		int sel = JOptionPane.showConfirmDialog(null, array, "Pergunta ao Usuario", JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE,icon4);

		if (sel == 0) {
			if (opt1.isSelected()) {
				celsius.setT(temp);
				celsius.celsiusParaFahrenheit(temp);
				System.out.println(celsius.getT());
			} else if (opt2.isSelected()) {
				fahrenheit.setF(temp);
				fahrenheit.FahrenheitParaCelsius(temp);
				System.out.println(fahrenheit.getF());
			}

		}
	}
}
