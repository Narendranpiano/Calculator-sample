import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {

	boolean isOperatorClicked=false;
	
	String oldvalue;
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton;
	JButton fourButton,fiveButton,sixButton;
	JButton oneButton,twoButton,threeButton,zeroButton;
	JButton dotButton, equalButton,plusButton,minusButton;
	JButton mulButton,divButton,clearButton,deleteButton;
	public Calculator() {
		
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(500, 100);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(sevenButton);
		sevenButton.addActionListener(this);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(eightButton);
		eightButton.addActionListener(this);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(nineButton);
		nineButton.addActionListener(this);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(fourButton);
		fourButton.addActionListener(this);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(fiveButton);
		fiveButton.addActionListener(this);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(sixButton);
		sixButton.addActionListener(this);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(oneButton);
		oneButton.addActionListener(this);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(twoButton);
		twoButton.addActionListener(this);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(threeButton);
		threeButton.addActionListener(this);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(dotButton);
		dotButton.addActionListener(this);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(zeroButton);
		zeroButton.addActionListener(this);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(equalButton);
		equalButton.addActionListener(this);
		
		divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(divButton);
		divButton.addActionListener(this);
		
		mulButton=new JButton("X");
		mulButton.setBounds(330, 230, 80, 80);
		mulButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(mulButton);
		mulButton.addActionListener(this);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330, 330, 80, 80);
		minusButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(minusButton);
		minusButton.addActionListener(this);
		
		plusButton=new JButton("+");
		plusButton.setBounds(330, 430, 80, 80);
		plusButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(plusButton);
		plusButton.addActionListener(this);
		
		clearButton=new JButton("C");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(clearButton);
		clearButton.addActionListener(this);
		
		deleteButton=new JButton("<–");
		deleteButton.setBounds(430, 330, 80, 80);
		deleteButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(deleteButton);
		deleteButton.addActionListener(this);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
		
		if(e.getSource()== sevenButton) {
			
			if(isOperatorClicked==true) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"7");
			}
			
		}else if(e.getSource()== eightButton) {
			
			if(isOperatorClicked==true) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			
			
		
		}else if (e.getSource()== nineButton) {
			
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"9");
			
		}else if(e.getSource()== fourButton) {
			
			displayLabel.setText(displayLabel.getText()+"4");
		
		}else if(e.getSource()== fiveButton) {
			
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"5");
		
		}else if(e.getSource()== sixButton) {
			
			displayLabel.setText(displayLabel.getText()+"6");
		
		}else if(e.getSource()== oneButton) {
			
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"1");
		
		}else if(e.getSource()== twoButton) {
			
			displayLabel.setText(displayLabel.getText()+"2");
		
		}else if(e.getSource()== threeButton) {
			
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+"3");
		
		}else if(e.getSource()== zeroButton) {
			
			displayLabel.setText(displayLabel.getText()+"0");
		
		}else if(e.getSource()== dotButton) {
			
			
			String labelText=displayLabel.getText();
			displayLabel.setText(labelText+".");
	    
		}else if(e.getSource()== equalButton) {
			
			
	    }else if(e.getSource()== plusButton) {
			
	    	isOperatorClicked=true;
	    	oldValue=displayLabel.getText();
			
	    }else if(e.getSource()== mulButton) {
			
			
	    }else if(e.getSource()== divButton) {
			
			
	    }else if(e.getSource()== minusButton) {
			
			
	    }else if(e.getSource()== clearButton) {
			
	    	displayLabel.setText("");
			
	    }				
    }
}