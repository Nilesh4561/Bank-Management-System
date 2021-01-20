package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class SignUp2 extends JFrame implements ActionListener {

	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	JButton b1;
	JRadioButton r1, r2, r3, r4;
	JTextField t1, t2, t3;
	JComboBox c1, c2, c3, c4, c5;
	
	SignUp2()
	{
		setFont(new Font("System", Font.BOLD, 28));
		Font f = getFont();
		FontMetrics fm = getFontMetrics(f);
		int x = fm.stringWidth("New Account Application Form - Page 2");
		int y = fm.stringWidth(" ");
		int z = getWidth() - x;
		int w = z/y;
		String pad = "";
		
		pad = String.format("%"+w+"s", pad);
		setTitle(pad+"New Account Application Form - Page 2");
		
		l1 = new JLabel("Page 2: Additional Details");
		l1.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l2 = new JLabel("Religion: ");
		l2.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l3 = new JLabel("Category: ");
		l3.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l4 = new JLabel("Income: ");
		l4.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l5 = new JLabel("Eduactional ");
		l5.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l6 = new JLabel("Qualification: ");
		l6.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l7 = new JLabel("Occupation: ");
		l7.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l8 = new JLabel("Pan Number: ");
		l8.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l9 = new JLabel("Aadhar Number: ");
		l9.setFont(new Font("Raleway", Font.BOLD, 18));
		
		l10 = new JLabel("Senior Citizen: ");
		l10.setFont(new Font("Raleway", Font.BOLD, 20));
		
		l11 = new JLabel("Existing Account: ");
		l11.setFont(new Font("Raleway", Font.BOLD, 16));
		
		l12 = new JLabel("Form No. ");
		l12.setFont(new Font("Raleway", Font.BOLD, 12));
		
		b1 = new JButton("Next");
		b1.setFont(new Font("Arial", Font.BOLD, 20));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		t1 = new JTextField();
		t1.setFont(new Font("Raleway", Font.BOLD, 18));
		
		t2 = new JTextField();
		t2.setFont(new Font("Raleway", Font.BOLD, 18));
		
		t3 = new JTextField();
		t3.setFont(new Font("Raleway", Font.BOLD, 18));
		
		r1 = new JRadioButton("Yes");
		r1.setFont(new Font("Arial", Font.BOLD, 16));
		r1.setBackground(Color.WHITE);
		
		r2 = new JRadioButton("No");
		r2.setFont(new Font("Arial", Font.BOLD, 16));
		r2.setBackground(Color.WHITE);
		
		r3 = new JRadioButton("Yes");
		r3.setFont(new Font("Arial", Font.BOLD, 16));
		r3.setBackground(Color.WHITE);
		
		r4 = new JRadioButton("No");
		r4.setFont(new Font("Arial", Font.BOLD, 14));
		r4.setBackground(Color.WHITE);
		
		String religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
		c1 = new JComboBox(religion);
		c1.setFont(new Font("Arial", Font.BOLD, 10));
		c1.setBackground(Color.WHITE);
		
		String category[] = {"General", "OBC", "Sc", "St", "Other"};
		c2 = new JComboBox(category);
		c2.setFont(new Font("Arial", Font.BOLD, 10));
		c2.setBackground(Color.WHITE);
		
		String income[] = {"None", "< 1,50,000", "< 2,50,000", "< 5,00,000", "upto 10,00,000", "above 10,00,000"};
		c3 = new JComboBox(income);
		c3.setFont(new Font("Arial", Font.BOLD, 10));
		c3.setBackground(Color.WHITE);
		
		String education[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other"};
		c4 = new JComboBox(education);
		c4.setFont(new Font("Arial", Font.BOLD, 10));
		c4.setBackground(Color.WHITE);
		
		String occupation[] = {"salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other"};
		c5 = new JComboBox(occupation);
		c5.setFont(new Font("Arial", Font.BOLD, 10));
		c5.setBackground(Color.WHITE);
		
		setLayout(null);
		
		l12.setBounds(700, 10, 60, 30);
		add(l12);
		
		t3.setBounds(760, 10, 60, 30);
		add(t3);
		
		l1.setBounds(280,30,600,40);
        add(l1);
        
        l2.setBounds(100,120,100,30);
        add(l2);
        
        c1.setBounds(350,120,320,30);
        add(c1);
        
        l3.setBounds(100,170,100,30);
        add(l3);
        
        c2.setBounds(350,170,320,30);
        add(c2);
        
        l4.setBounds(100,220,100,30);
        add(l4);
        
        c3.setBounds(350,220,320,30);
        add(c3);
        
        l5.setBounds(100,260,150,30);
        add(l5);
        l6.setBounds(100,290,150,30);
        add(l6);
        c4.setBounds(350,270,320,30);
        add(c4);
        
        
        l7.setBounds(100,340,150,30);
        add(l7);
        
        c5.setBounds(350,340,320,30);
        add(c5);
        
        l8.setBounds(100,390,180,30);
        add(l8);
        
        t1.setBounds(350,390,320,30);
        add(t1);
        
        l9.setBounds(100,440,150,30);
        add(l9);
        
        t2.setBounds(350,440,320,30);
        add(t2);
        
        l10.setBounds(100,490,180,30);
        add(l10);
        
        r1.setBounds(350,490,100,30);
        add(r1);
        
        r2.setBounds(460,490,100,30);
        add(r2);
        
        l11.setBounds(100,540,150,30);
        add(l11);
        
        r3.setBounds(350,540,100,30);
        add(r3);
        
        r4.setBounds(460,540,100,30);
        add(r4);
        
        b1.setBounds(570,600,100,30);
        add(b1);
        
        b1.addActionListener(this);
		
		getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String a = (String)c1.getSelectedItem();
		String b = (String)c2.getSelectedItem();
		String c = (String)c3.getSelectedItem();
		String d = (String)c4.getSelectedItem();
		String e = (String)c5.getSelectedItem();
		
		String f = t1.getText();
		String g = t2.getText();
		
		String h = "";
		if(r1.isSelected()) {
			h = "Yes";
		}
		else if (r2.isSelected()) {
			h = "No";
		}
		
		String i = "";
		if(r3.isSelected()) {
			i = "Yes";
		}
		else if (r4.isSelected()) {
			i = "No";
		}
		
		String j = t3.getText();
		
		try {
			if(t2.getText().equals("") || t1.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the required fields");
			}
			if(t3.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "please enter form number");
			}
			else {
				Conn c1 = new Conn();
				String query = "insert into tblSignUp2 values('"+j+"', '"+a+"', '"+b+"', '"+c+"', '"+d+"', '"+e+"', '"+f+"', '"+g+"', '"+h+"', '"+i+"')";
				c1.s.executeUpdate(query);
				
				new SignUp3().setVisible(true);
				setVisible(false);
			}
		} 
		catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SignUp2().setVisible(true);
	}

}
