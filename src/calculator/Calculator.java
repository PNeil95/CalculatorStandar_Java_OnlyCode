package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator extends JFrame implements ActionListener{
	
	//1.Creación del formulario
	JPanel base = (JPanel) this.getContentPane();
	
	//3.Creando la pantalla TextField
	JTextField pantalla = new JTextField();
	
	//5.Creando los Botones
	JButton btnOne = new JButton("1");
	JButton btnTwo = new JButton("2");
	JButton btnThree = new JButton("3");
	JButton btnClear = new JButton("Borrar");
	JButton btnFour = new JButton("4");
	JButton btnFive = new JButton("5");
	JButton btnSix = new JButton("6");
	JButton btnSuma = new JButton("+");
	JButton btnSeven = new JButton("7");
	JButton btnEight = new JButton("8");
	JButton btnNine = new JButton("9");
	JButton btnRest = new JButton("-");
	JButton btnMultiple = new JButton("x");
	JButton btnCero = new JButton("0");
	JButton btnDiv = new JButton("/");
	JButton btnPunto = new JButton(".");
	
	public Calculator() {
		//2.Propiedades del formulario
		base.setLayout(null);
		setSize(350,400);
		setTitle("Calculator Standar");
		setVisible(true);
		
		//4.Propiedades de la pantalla
		pantalla.setBounds(22, 8, 290, 70);
		add(pantalla); //para que aparezca en la vista
		
		//6.Propiedades de los Botones
		btnOne.setBounds(22, 83, 60, 60);
		btnOne.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnOne);
		
		btnTwo.setBounds(87, 83, 60, 60);
		btnTwo.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnTwo);
		
		btnThree.setBounds(152, 83, 60, 60);
		btnThree.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnThree);

		btnClear.setBounds(217, 83, 96, 60);
		btnClear.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnClear);

	}

	public static void main(String[] args) {
		//3.Instancia un objeto de tipo clase - esto nos permite ejecutar el programa
		new Calculator();  
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
