package entity;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] msg = {"Conversor de Moeda","Conversor de Temperatura"};

		Object nome = JOptionPane.showInputDialog(null, "Escolha uma opção","Menu",JOptionPane.PLAIN_MESSAGE,null,msg,"");

	}

}
