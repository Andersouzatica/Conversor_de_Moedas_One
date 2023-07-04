package view;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ConversorFmlr extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;

	private final JPanel contentPanel = new JPanel();
	private JButton okButton;
	private JComboBox comboBox;
	private JButton cancelButton;
	private static ConversorFmlr dialog;
	String[] moeda = { "De Reais para Dólares", "De Reais para Euros", "De Dolares para Reais", "De Euros para Reais" };

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dialog = new ConversorFmlr();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConversorFmlr() {
		setResizable(false);
		setTitle("Conversor de Moedas");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\Anderson\\Downloads\\look_finance_eye_view_business_money_vision_icon_254037.png"));
		setBounds(100, 100, 271, 137);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Escolha uma op\u00E7\u00E3o");
			lblNewLabel.setBounds(10, 11, 137, 14);
			contentPanel.add(lblNewLabel);
		}

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Conversor de Moeda", "Conversor de Temperatura" }));
		comboBox.setBounds(10, 36, 207, 22);
		contentPanel.add(comboBox);

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.addActionListener(this);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(this);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cancelButton) {
			actionPerformedCancelButtonJButton(e);
		}
		if (e.getSource() == okButton) {
			actionPerformedOkButtonJButton(e);

		}
	}

	protected void actionPerformedOkButtonJButton(ActionEvent e) {
		Moeda moedas = new Moeda();
		moedas.setVisible(true);
		dialog.setVisible(false);
		
		int msg = comboBox.getSelectedIndex();
		System.out.println(msg);

		switch (msg) {
		case 0:
			String selectedMoeda = (String) JOptionPane.showInputDialog(null, "Escolha a moeda que deseja converter.",
					"Moedas", JOptionPane.PLAIN_MESSAGE, null, moeda, moeda[0]);
			String vl = JOptionPane.showInputDialog("Insira um valor:");
			Integer valor = Integer.parseInt(vl);
			System.out.println(valor);
			switch (selectedMoeda) {
			case "De Reais para Dólares":
				System.out.println(valor / 4.81);
				break;
			case "De Reais para Euros":
				System.out.println(valor / 5.25);
				break;
			case "De Dolares para Reais":
				System.out.println(valor * 4.81);
				break;
			case "De Euros para Reais":
				System.out.println(valor * 5.25);
				break;

			default:
				break;
			}

			break;

		default:
			break;
		}
	}

	protected void actionPerformedCancelButtonJButton(ActionEvent e) {
		System.exit(EXIT_ON_CLOSE);
	}
}
