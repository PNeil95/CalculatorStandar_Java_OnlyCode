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
	JButton btnMultiple = new JButton("*");
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
		
		//First row
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
		
		//Second Row
		btnFour.setBounds(22, 153, 60, 60);
		btnFour.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnFour);
		
		btnFive.setBounds(87, 153, 60, 60);
		btnFive.setFont(new Font("tahoma",Font.ITALIC,20));
		add(btnFive);
		
		btnSix.setBounds(152, 153, 60, 60);
		btnSix.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnSix);

		btnSuma.setBounds(217, 153, 96, 60);
		btnSuma.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnSuma);
		
		//Third row
		btnSeven.setBounds(22, 223, 60, 60);
		btnSeven.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnSeven);
		
		btnEight.setBounds(87, 223, 60, 60);
		btnEight.setFont(new Font("tahoma",Font.ITALIC,20));
		add(btnEight);
		
		btnNine.setBounds(152, 223, 60, 60);
		btnNine.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnNine);

		btnRest.setBounds(217, 223, 96, 60);
		btnRest.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnRest);
		
		//Four row
		btnMultiple.setBounds(22, 293, 60, 60);
		btnMultiple.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnMultiple);
		
		btnCero.setBounds(87, 293, 60, 60);
		btnCero.setFont(new Font("tahoma",Font.ITALIC,20));
		add(btnCero);
		
		btnDiv.setBounds(152, 293, 60, 60);
		btnDiv.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnDiv);

		btnPunto.setBounds(217, 293, 96, 60);
		btnPunto.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnPunto);
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
