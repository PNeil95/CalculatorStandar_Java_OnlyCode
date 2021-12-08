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
	JButton btnIgual = new JButton("=");
	
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
		btnOne.addActionListener(this);
		
		btnTwo.setBounds(87, 83, 60, 60);
		btnTwo.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnTwo);
		btnTwo.addActionListener(this);
		
		btnThree.setBounds(152, 83, 60, 60);
		btnThree.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnThree);
		btnThree.addActionListener(this);
		
		btnClear.setBounds(217, 83, 96, 60);
		btnClear.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnClear);
		btnClear.addActionListener(this);
		
		//Second Row
		btnFour.setBounds(22, 153, 60, 60);
		btnFour.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnFour);
		btnFour.addActionListener(this);
		
		btnFive.setBounds(87, 153, 60, 60);
		btnFive.setFont(new Font("tahoma",Font.ITALIC,20));
		add(btnFive);
		btnFive.addActionListener(this);
		
		btnSix.setBounds(152, 153, 60, 60);
		btnSix.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnSix);
		btnSix.addActionListener(this);

		btnSuma.setBounds(217, 153, 96, 60);
		btnSuma.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnSuma);
		btnSuma.addActionListener(this);
		
		//Third row
		btnSeven.setBounds(22, 223, 60, 60);
		btnSeven.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnSeven);
		btnSeven.addActionListener(this);
		
		btnEight.setBounds(87, 223, 60, 60);
		btnEight.setFont(new Font("tahoma",Font.ITALIC,20));
		add(btnEight);
		btnEight.addActionListener(this);
		
		btnNine.setBounds(152, 223, 60, 60);
		btnNine.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnNine);
		btnNine.addActionListener(this);

		btnRest.setBounds(217, 223, 96, 60);
		btnRest.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnRest);
		btnRest.addActionListener(this);
		
		//Four row
		btnMultiple.setBounds(22, 293, 60, 60);
		btnMultiple.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnMultiple);
		btnMultiple.addActionListener(this);
		
		btnCero.setBounds(87, 293, 60, 60);
		btnCero.setFont(new Font("tahoma",Font.ITALIC,20));
		add(btnCero);
		btnCero.addActionListener(this);
		
		btnDiv.setBounds(152, 293, 60, 60);
		btnDiv.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnDiv);
		btnDiv.addActionListener(this);

		btnPunto.setBounds(217, 293, 96, 60);
		btnPunto.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnPunto);
		btnPunto.addActionListener(this);
		
		//Five row
		btnIgual.setBounds(22,363,291,60);
		btnIgual.setFont(new Font ("tahoma",Font.ITALIC,20));
		add(btnIgual);
		btnIgual.addActionListener(this);
		
		
	}

	public static void main(String[] args) {
		//3.Instancia un objeto de tipo clase - esto nos permite ejecutar el programa
		new Calculator();  
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == btnOne) {
			if(pantalla.getText() == "") {
				pantalla.setText("1");
			}
			else {
				pantalla.setText(pantalla.getText() + "1");
			}
		}
		
		if(e.getSource() == btnTwo) {
			if(pantalla.getText() == "") {
				pantalla.setText("2");
			}
			else {
				pantalla.setText(pantalla.getText() + "2");
			}
		}
		
		if(e.getSource() == btnThree) {
			if(pantalla.getText() == "") {
				pantalla.setText("3");
			}
			else {
				pantalla.setText(pantalla.getText() + "3");
			}
		}
		
		if(e.getSource() == btnFour) {
			if(pantalla.getText() == "") {
				pantalla.setText("4");
			}
			else {
				pantalla.setText(pantalla.getText() + "1");
			}
		}
		
		if(e.getSource() == btnFive) {
			if(pantalla.getText() == "") {
				pantalla.setText("5");
			}
			else {
				pantalla.setText(pantalla.getText() + "5");
			}
		}
		
		if(e.getSource() == btnSix) {
			if(pantalla.getText() == "") {
				pantalla.setText("6");
			}
			else {
				pantalla.setText(pantalla.getText() + "6");
			}
		}
		
		if(e.getSource() == btnSeven) {
			if(pantalla.getText() == "") {
				pantalla.setText("7");
			}
			else {
				pantalla.setText(pantalla.getText() + "7");
			}
		}
		
		if(e.getSource() == btnEight) {
			if(pantalla.getText() == "") {
				pantalla.setText("8");
			}
			else {
				pantalla.setText(pantalla.getText() + "8");
			}
		}
		
		if(e.getSource() == btnNine) {
			if(pantalla.getText() == "") {
				pantalla.setText("9");
			}
			else {
				pantalla.setText(pantalla.getText() + "9");
			}
		}
		
		if(e.getSource() == btnCero) {
			if(pantalla.getText() == "") {
				pantalla.setText("0");
			}
			else {
				pantalla.setText(pantalla.getText() + "0");
			}
		}
		
		if(e.getSource() == btnSuma) {
			if(pantalla.getText() == "") {
				pantalla.setText("+");
			}
			else {
				pantalla.setText(pantalla.getText() + "+");
			}
		}
		
		if(e.getSource() == btnRest) {
			if(pantalla.getText() == "") {
				pantalla.setText("-");
			}
			else {
				pantalla.setText(pantalla.getText() + "-");
			}
		}
		
		if(e.getSource() == btnMultiple) {
			if(pantalla.getText() == "") {
				pantalla.setText("*");
			}
			else {
				pantalla.setText(pantalla.getText() + "*");
			}
		}
		
		if(e.getSource() == btnDiv) {
			if(pantalla.getText() == "") {
				pantalla.setText("/");
			}
			else {
				pantalla.setText(pantalla.getText() + "/");
			}
		}
		
		if(e.getSource() == btnPunto) {
			if(pantalla.getText() == "") {
				pantalla.setText(".");
			}
			else {
				pantalla.setText(pantalla.getText() + ".");
			}
		}
		
		if(e.getSource() == btnClear) {
			pantalla.setText("");
		}
		
		if(e.getSource() == btnIgual) {
			String cadena = pantalla.getText();
			
			for(int i = 0; i<cadena.length(); i++) {
				
				char caracter = cadena.charAt(i);
					//Los char va entre comillas simples
					if(caracter == '+') {
						String firstPart = cadena.substring(0,i);
						String secondPart = cadena.substring(i+1,cadena.length());
						
						double result = Double.parseDouble(firstPart)+Double.parseDouble(secondPart);
						pantalla.setText(Double.toString(result));
					}
					
					if(caracter == '-') {
						String firstPart = cadena.substring(0,i);
						String secondPart = cadena.substring(i+1,cadena.length());
						
						double result = Double.parseDouble(firstPart)-Double.parseDouble(secondPart);
						pantalla.setText(Double.toString(result));
					}
					
					if(caracter == '*') {
						String firstPart = cadena.substring(0,i);
						String secondPart = cadena.substring(i+1,cadena.length());
						
						double result = Double.parseDouble(firstPart)*Double.parseDouble(secondPart);
						pantalla.setText(Double.toString(result));
					}
					
					if(caracter == '/') {
						String firstPart = cadena.substring(0,i);
						String secondPart = cadena.substring(i+1,cadena.length());
						
						double result = Double.parseDouble(firstPart) / Double.parseDouble(secondPart);
						pantalla.setText(Double.toString(result));
					}

			}
			
		}
	}

}
