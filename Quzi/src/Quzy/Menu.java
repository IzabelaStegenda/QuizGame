package Quzy;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Menu implements ActionListener{
	
	JFrame frame = new JFrame("Menu");
	JTextField textfield  = new JTextField();
	JTextField textfield2  = new JTextField();
	JButton buttonGegrafia = new JButton();
	JButton buttonInformatyka = new JButton();
	JButton buttonChemia = new JButton();
	JButton buttonFizyka = new JButton();
	
	public Menu()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(null);
		frame.setResizable(false);
		
		textfield.setBounds(0,10,650,70);
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(25,255,0));
		textfield.setFont(new Font("Ink Free",Font.BOLD,30));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setText("Witaj w Quizie!!");
		textfield.setEditable(false);
		
		textfield2.setBounds(0,80,650,70);
		textfield2.setBackground(new Color(25,25,25));
		textfield2.setForeground(new Color(25,255,0));
		textfield2.setFont(new Font("Ink Free",Font.BOLD,30));
		textfield2.setBorder(BorderFactory.createBevelBorder(1));
		textfield2.setHorizontalAlignment(JTextField.CENTER);
		textfield2.setText("Wybierz kategorie pytan");
		textfield2.setEditable(false);
		
		buttonGegrafia.setBounds(70,200,200,100);
		buttonGegrafia.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonGegrafia.setFocusable(false);
		buttonGegrafia.addActionListener(this);
		buttonGegrafia.setText("Geografia");
		
		buttonChemia.setBounds(350,200,200,100);
		buttonChemia.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonChemia.setFocusable(false);
		buttonChemia.addActionListener(this);
		buttonChemia.setText("Chemia");
		
		buttonInformatyka.setBounds(70,320,250,100);
		buttonInformatyka.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonInformatyka.setFocusable(false);
		buttonInformatyka.addActionListener(this);
		buttonInformatyka.setText("Informatyka");
		
		buttonFizyka.setBounds(350,320,200,100);
		buttonFizyka.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonFizyka.setFocusable(false);
		buttonFizyka.addActionListener(this);
		buttonFizyka.setText("Fizyka");
		
		frame.add(textfield2);
		frame.add(textfield);
		frame.add(buttonGegrafia);
		frame.add(buttonChemia);
		frame.add(buttonInformatyka);
		frame.add(buttonFizyka);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		buttonInformatyka.setEnabled(false);
		buttonChemia.setEnabled(false);
		buttonGegrafia.setEnabled(false);
		buttonFizyka.setEnabled(false);
		
		if(e.getSource()==buttonGegrafia) {
			Geografia geografia = new Geografia();
			frame.setVisible(false);
		}
		if(e.getSource()==buttonChemia) {
			Chemia chemia = new Chemia();
			frame.setVisible(false);
		}
		if(e.getSource()==buttonInformatyka) {
			Informatyka informatyka = new Informatyka();
			frame.setVisible(false);
		}
		if(e.getSource()==buttonFizyka) {
			Fizyka fizyka = new Fizyka();
			frame.setVisible(false);
		}
		
	}
	

}
