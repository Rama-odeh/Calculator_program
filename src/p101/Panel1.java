//Calculator program
package p101;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import event101.Example101;

public class Panel1 extends JFrame implements ActionListener  {
	 
	 //define JButton and TextField
	 JButton buttons[]=new JButton[9];
     TextField textfield=new TextField();
     JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
      
	JButton button1,button2,button3,button4;
     
     //constructor
	public Panel1() { 
		
		//properties JFrame
		setTitle("panel2");
        setSize(400,300);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	    //define JPanel
	    JPanel p1=new JPanel(new GridLayout(4,4));
	   
	    
	    //define four buttons 
//	    JButton button1,button2,button3,button4;
	    button1=new JButton("C");
	    button2=new JButton("0");
	    button3=new JButton("=");
	    button4=new JButton("/");
	    
	    button1.setBackground(Color.RED);
	    button3.setBackground(Color.BLUE);
	    
	    
	    //define nine buttons
	   // JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	    b1=new JButton("1");
	    b2=new JButton("2");
	    b3=new JButton("3");
	    b4=new JButton("4");
	    b5=new JButton("5");
	    b6=new JButton("6");
	    b7=new JButton("7");
	    b8=new JButton("8");
	    b9=new JButton("9");
	    
	    //define three buttons
	    JButton B1,B2,B3;
	    B1=new JButton("-");
	    B2=new JButton("+");
	    B3=new JButton("*");
	    
	    //add buttons to panel
	    p1.add(b1);	  
	    p1.add(b2);	
	    p1.add(b3);	
	    p1.add(B1);
	    p1.add(b4);	
	    p1.add(b5);	
	    p1.add(b6);
	    p1.add(B2);
	    p1.add(b7);	
	    p1.add(b8);	
	    p1.add(b9);
	    p1.add(B3);
	    p1.add(button1);
	    p1.add(button2);
	    p1.add(button3);
	    p1.add(button4);
	    
	  //add panel and textfield to JFrame
	    add(p1);
	    add(textfield,BorderLayout.NORTH);
	    setVisible(true);
	    
	    
	    button1.addActionListener(new Panel1());
	    button2.addActionListener(new Panel1());
	    button3.addActionListener(new Panel1());
	    button4.addActionListener(new Panel1());
	    b1.addActionListener(new Panel1());
	    b2.addActionListener(new Panel1());
	    b3.addActionListener(new Panel1());
	    b4.addActionListener(new Panel1());
	    b5.addActionListener(new Panel1());
	    b6.addActionListener(new Panel1());
	    b7.addActionListener(new Panel1());
	    b8.addActionListener(new Panel1());
	    b9.addActionListener(new Panel1());
	    B1.addActionListener(new Panel1());
	    B2.addActionListener(new Panel1());
	    b3.addActionListener(this);
	}

	public static void main(String[] args) {
		new Panel1();

	}
public static int FirstNumber ,SecondNumber;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			FirstNumber=Integer.parseInt(button1.getText());
		}
		else if(e.getSource()==button2) {
			FirstNumber=Integer.parseInt(button2.getText());
		}
		//textfield.setText(FirstNumber);;
				}

}

	
	//Example3
//		setTitle("panel2");
//        setSize(400,300);
//	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	    
//		String names[]= {"ch1","ch2"};
//		JComboBox check=new JComboBox(names);
//		
//		JCheckBox ch=new JCheckBox("ch1");
//		JCheckBox ch2=new JCheckBox("ch2");
//		
//		JButton b1=new JButton("b1");
//		JButton b2=new JButton("b2");
//		
//		JPanel p1,p2;
//		 p1=new JPanel();
//		 p2=new JPanel();
//		
//		
//		 
//		p1.setLayout(new FlowLayout() );
//		p2.setLayout(new FlowLayout());
//		
//		p1.add(b1);
//		p1.add(b2);
//		
//		p2.add(ch);
//		p2.add(ch2);
//		
//		add(check,BorderLayout.NORTH);
//		add(p1,BorderLayout.CENTER);
//	    add(p2,BorderLayout.SOUTH);
//	    setVisible(true);
//	}
//	
	
	

	
	
	
	
	
	//Eample2
//JButton button1,button2,button3,button4;
//JPanel panel01,panel02;
//public Panel1() {
//	button1=new JButton("#1");
//	button2=new JButton("#2");
//    button3=new JButton("b1");
//    button4=new JButton("b2");
//    
//    setTitle("panel2");
//    setSize(400,300);
//    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    panel01=new JPanel(new GridLayout(1,2));
//    panel02=new JPanel(new GridLayout(2,1));
//    panel01.add(button1);
//    panel01.add(button2);
//    panel02.add(button3);
//    panel02.add(button4);
//    
//    add(panel01,BorderLayout.NORTH);
//    add(panel02,BorderLayout.WEST);
//    setVisible(true);


   

//	EampleOne
//	JButton buttons[] =new JButton [5];
//	JPanel panel =new JPanel(new GridLayout(1,buttons.length));
//	public Panel1() {
//		setTitle("Panel");
//		setSize(400,300);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		for(int x=0;x<buttons.length;x++) {
//			buttons[x]=new JButton("Button"+(x+1));
//		panel.add(buttons[x]);
//		}
//		add(panel,BorderLayout.SOUTH);
//		setVisible(true);
	
	
