package entity;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class One {
	
	private Integer input;
	public One() {
	};
	
	public Integer getInput() {
		return input;
	}

	public static void aluraOne() {
		
	ImageIcon icon = new ImageIcon("src/imagem/one_80.png");

	JPanel panel = new JPanel();
	panel.setBackground(new Color(102, 205, 170));
	panel.setSize(new Dimension(180, 40));
	panel.setLayout(null);

	JLabel label1 = new JLabel("Challenge ONE Back End.");
	label1.setVerticalAlignment(SwingConstants.BOTTOM);
	label1.setBounds(0, 0, 180, 32);
	label1.setFont(new Font("Arial", Font.BOLD, 12));
	label1.setHorizontalAlignment(SwingConstants.CENTER);
	panel.add(label1);

	JLabel label2 = new JLabel("Vamos iniciar o desafio!");
	label2.setVerticalAlignment(SwingConstants.TOP);
	label2.setHorizontalAlignment(SwingConstants.CENTER);
	label2.setFont(new Font("Arial", Font.BOLD, 10));
	label2.setBounds(0, 32, 180, 32);
	panel.add(label2);

	UIManager.put("OptionPane.minimumSize", new Dimension(300, 120));
	int input = JOptionPane.showConfirmDialog(null, panel, "Alura | Oracle",
			JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, icon);

	// 0=yes, 1=no, 2=cancel
	System.out.println(input);

	}
}
