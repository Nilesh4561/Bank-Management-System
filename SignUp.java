package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class SignUp extends JFrame implements ActionListener {
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
	JRadioButton r1, r2, r3, r4, r5;
	JButton b1;
	JComboBox c1, c2, c3;
	
	Random ran = new Random();
	long first4 = (ran.nextLong() % 9000L) + 1000L;
	long first = Math.abs(first4);
	
	SignUp() {
		setFont(new Font("System", Font.BOLD, 28));
		Font f = getFont();
		FontMetrics fm = getFontMetrics(f);
		int x = fm.stringWidth("New Account Application Form - Page 1");
		int y = fm.stringWidth(" ");
		int z = getWidth() - x;
		int w = z/y;
		String pad = "";
		
		pad = String.format("%"+w+"s", pad);
		setTitle(pad+"New Account Application Form - Page 1");
		
		
		
		l1 = new JLabel("Application Form No. "+ first);
		l1.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l2 = new JLabel("Page 1: Personal Details");
		l2.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l3 = new JLabel("Name: ");
		l3.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l4 = new JLabel("Father's Name: ");
		l4.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l5 = new JLabel("Date of Birth: ");
		l5.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l6 = new JLabel("Gender: ");
		l6.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l7 = new JLabel("Email Id: ");
		l7.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l8 = new JLabel("Marital Status: ");
		l8.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l9 = new JLabel("Address: ");
		l9.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l10 = new JLabel("City: ");
		l10.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l11 = new JLabel("Pin Code: ");
		l11.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l12 = new JLabel("State: ");
		l12.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l13 = new JLabel("Date: ");
		l13.setFont(new Font("Raleway", Font.BOLD, 12));
		
		l14 = new JLabel("Month: ");
		l14.setFont(new Font("Raleway", Font.BOLD, 12));
		
		l15 = new JLabel("Year: ");
		l15.setFont(new Font("Raleway", Font.BOLD, 12));
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Raleway", Font.BOLD, 18));
		
		tf2 = new JTextField();
		tf2.setFont(new Font("Raleway", Font.BOLD, 18));
		
		tf3 = new JTextField();
		tf3.setFont(new Font("Raleway", Font.BOLD, 18));
		
		tf4 = new JTextField();
		tf4.setFont(new Font("Raleway", Font.BOLD, 18));
		
		tf5 = new JTextField();
		tf5.setFont(new Font("Raleway", Font.BOLD, 18));
		
		tf6 = new JTextField();
		tf6.setFont(new Font("Raleway", Font.BOLD, 18));
		
		tf7 = new JTextField();
		tf7.setFont(new Font("Raleway", Font.BOLD, 18));
		
		b1 = new JButton("Next");
		b1.setFont(new Font("Arial", Font.BOLD, 20));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		r1 = new JRadioButton("Male");
		r1.setFont(new Font("Arial", Font.BOLD, 16));
		r1.setBackground(Color.WHITE);
		
		r2 = new JRadioButton("Female");
		r2.setFont(new Font("Arial", Font.BOLD, 16));
		r2.setBackground(Color.WHITE);
		
		r3 = new JRadioButton("Married");
		r3.setFont(new Font("Arial", Font.BOLD, 16));
		r3.setBackground(Color.WHITE);
		
		r4 = new JRadioButton("Unmarried");
		r4.setFont(new Font("Arial", Font.BOLD, 14));
		r4.setBackground(Color.WHITE);
		
		r5 = new JRadioButton("Other");
		r5.setFont(new Font("Arial", Font.BOLD, 16));
		r5.setBackground(Color.WHITE);
		
		String date[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
						"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
						"30", "31"};
		c1 = new JComboBox(date);
		c1.setFont(new Font("Arial", Font.BOLD, 10));
		c1.setBackground(Color.WHITE);
		
		String months[] = {"January", "Febuary", "March", "April", "May", "June",
						"July", "August", "September", "October", "November", "December"};
		c2 = new JComboBox(months);
		c2.setFont(new Font("Arial", Font.BOLD, 10));
		c2.setBackground(Color.WHITE);
		
		String years[] = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
						"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
						"2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
						"2020"};
		c3 = new JComboBox(years);
		c3.setFont(new Font("Arial", Font.BOLD, 10));
		c3.setBackground(Color.WHITE);
		
		setLayout(null);
		
		l1.setBounds(140, 20, 600, 40);
		add(l1);
		
		l2.setBounds(290, 70, 600, 30);
		add(l2);
		
		l3.setBounds(100, 140, 100, 30);
		add(l3);
		
		tf1.setBounds(300, 140, 400, 30);
		add(tf1);
		
		l4.setBounds(100, 190, 200, 30);
		add(l4);
		
		tf2.setBounds(300, 190, 400, 30);
		add(tf2);
		
		l5.setBounds(100,240,200,30);
        add(l5);
        
        l13.setBounds(300,240,40,30);
        add(l13);
        
        c1.setBounds(340,240,60,30);
        add(c1);
        
        l14.setBounds(410,240,50,30);
        add(l14);
        
        c2.setBounds(460,240,100,30);
        add(c2);
        
        l15.setBounds(570,240,40,30);
        add(l15);
        
        c3.setBounds(610,240,90,30);
        add(c3);
        
        l6.setBounds(100,290,200,30);
        add(l6);
        
        r1.setBounds(300,290,60,30);
        add(r1);
        
        r2.setBounds(450,290,90,30);
        add(r2);
        
        l7.setBounds(100,340,200,30);
        add(l7);
        
        tf3.setBounds(300,340,400,30);
        add(tf3);
        
        l8.setBounds(100,390,200,30);
        add(l8);
        
        r3.setBounds(300,390,100,30);
        add(r3);
        
        r4.setBounds(450,390,100,30);
        add(r4);
        
        r5.setBounds(635,390,100,30);
        add(r5);
        
        l9.setBounds(100,440,200,30);
        add(l9);
        
        tf4.setBounds(300,440,400,30);
        add(tf4);
        
        l10.setBounds(100,490,200,30);
        add(l10);
        
        tf5.setBounds(300,490,400,30);
        add(tf5);
        
        l11.setBounds(100,540,200,30);
        add(l11);
        
        tf6.setBounds(300,540,400,30);
        add(tf6);
        
        l12.setBounds(100,590,200,30);
        add(l12);
        
        tf7.setBounds(300,590,400,30);
        add(tf7);
        
        b1.setBounds(620,660,80,30);
        add(b1);
        
        b1.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String a = tf1.getText().trim();
		String b = tf2.getText().trim();
		
		String ac = ((String) c1.getSelectedItem()).trim();
		String bc = ((String)c2.getSelectedItem()).trim();
		String cc = ((String)c3.getSelectedItem()).trim();
		
		String d = "";
		if(r1.isSelected()) {
			d = "Male";
		}
		else if (r2.isSelected()) {
			d = "Female";
		}
		
		String e = "";
		if(r3.isSelected()) {
			e = "Married";
		}
		else if (r4.isSelected()) {
			e = "Unmarried";
		}
		else if (r5.isSelected()) {
			e = "Other";
		}
		
		String g = tf3.getText().trim();
		String h = tf4.getText().trim();
		String i = tf5.getText().trim();
		String j = tf6.getText().trim();
		String k = tf7.getText().trim();
		
		try {
			if(tf1.getText().equals("") || tf2.getText().equals("") || tf3.getText().equals("") || tf4.getText().equals("") 
					|| tf5.getText().equals("") || tf6.getText().equals("") || tf7.getText().equals("") || d.equals("") 
					|| e.equals("") || ac.equals("") || bc.equals("") || cc.equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the required fields");
			}
			else {
				Conn c1 = new Conn();
				String q = "insert into tblSignUp values('"+first+"', '"+a+"', '"+b+"', '"+ac+"', '"+bc+"', '"+cc+"', '"+d+"', '"+g+"', '"+e+"', '"+h+"', '"+i+"', '"+j+"', '"+k+"')";
				c1.s.executeUpdate(q);
				
				new SignUp2().setVisible(true);
				setVisible(false);
			}
		} 
		catch (Exception e2) {
			e2.printStackTrace();
			System.out.println(e2);
		}
	}
	
	public static void main(String[] args) {
		new SignUp().setVisible(true);
	}
}
