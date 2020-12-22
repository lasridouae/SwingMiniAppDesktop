package com.app.AppDesktop;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

	public class DoYouKnow implements ActionListener {

	    private static JLabel label2;
	    private static JFrame frame;
	    private static JPanel panel;
	    private static JButton button;

	    public static void main(String[] args) {
	        frame = new JFrame();
	        frame.setSize(600, 700);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setTitle("Le Saviez-vous?");
	        frame.setFont(Font.getFont("Comic Sans MS"));


	        panel = new JPanel();
	        frame.getContentPane().add(panel);
	        panel.setLayout(null);
	        panel.setBackground(Color.PINK);

	        JLabel label1 = new JLabel("Le Saviez-vous?");
	        label1.setBounds(20, 20, 500, 25);
	        panel.add(label1);
	        label1.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
	        label1.setForeground(UIManager.getColor("Button.light"));


	        label2 = new JLabel("");
	        label2.setBounds(20, 300, 900, 50);
	        panel.add(label2);
	        label2.setFont(new Font("Comic Sans MS",Font.PLAIN,19));
	        label2.setForeground(Color.WHITE);

	        button = new JButton("MONTRER UN AUTRE FAIT");
	        button.setFont(new Font("Verdana", Font.BOLD, 15));
	        button.setBounds(43, 600, 488, 40);
	        button.addActionListener(new DoYouKnow());
	        panel.add(button);





	        frame.setVisible(true);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {

	        ArrayList<String> quotes = new ArrayList<>();
	        quotes.add("La bière ne fait pas prendre du ventre!!");
	        quotes.add("Somthing");
	        quotes.add("Somthing1");
	        quotes.add("Somthing2");
	        quotes.add("Somthing3");
	        quotes.add("Somthing4");
	        quotes.add("Somthing5");
	        quotes.add("Somthing6");
	        quotes.add("Somthing7");


	        int indx = (int) (Math.random()* (quotes.size()  - 1) + 0);
	        Random loun = new Random();
	        // Java 'Color' class takes 3 floats, from 0 to 1.
	        float r = loun.nextFloat();
	        float g = loun.nextFloat();
	        float b = loun.nextFloat();
	        Color randomColor = new Color(r, g, b);
	        panel.setBackground(randomColor);
	        button.setForeground(randomColor);

	        label2.setText(quotes.get(indx));
	    }
}
