import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

	private JTextField answerText;
	private double number1;
	private double number2;
	private boolean add = false, sub = false, mult = false, div = false;

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.createGUI();
	}

	public void createGUI() {
		JFrame frame = new JFrame("Calculator");

		// operation buttons and zero
		JButton equalsButton = new JButton("=");
		JButton clearButton = new JButton("C");
		JButton multButton = new JButton("*");
		JButton divButton = new JButton("/");
		JButton addButton = new JButton("+");
		JButton subButton = new JButton("-");
		JButton zeroButton = new JButton("0");

		JPanel numbersPanel = new JPanel();
		numbersPanel.setLayout(new GridLayout(4, 3));

		// create buttons 1 - 9
		JButton[] numberButtons = new JButton[10];
		for(int i = 1; i < 10; i++) {
			numberButtons[i] = new JButton(Integer.toString(i));
			numbersPanel.add(numberButtons[i]);
		}

		// give all number buttons action listeners
		numberButtons[1].addActionListener(new ListenOne());
		numberButtons[2].addActionListener(new ListenTwo());
		numberButtons[3].addActionListener(new ListenThree());
		numberButtons[4].addActionListener(new ListenFour());
		numberButtons[5].addActionListener(new ListenFive());
		numberButtons[6].addActionListener(new ListenSix());
		numberButtons[7].addActionListener(new ListenSeven());
		numberButtons[8].addActionListener(new ListenEight());
		numberButtons[9].addActionListener(new ListenNine());
		zeroButton.addActionListener(new ListenZero());

		// give all operation buttons action listeners
		equalsButton.addActionListener(new ListenEquals());
		multButton.addActionListener(new ListenMult());
		divButton.addActionListener(new ListenDiv());
		addButton.addActionListener(new ListenAdd());
		subButton.addActionListener(new ListenSub());
		clearButton.addActionListener(new ListenClear());

		numbersPanel.add(clearButton);
		numbersPanel.add(zeroButton);
		numbersPanel.add(equalsButton);
		

		JPanel operationsPanel = new JPanel();
		operationsPanel.setLayout(new GridLayout(4, 1));
		operationsPanel.add(divButton);
		operationsPanel.add(multButton);
		operationsPanel.add(subButton);
		operationsPanel.add(addButton);

		JPanel answerPanel = new JPanel();
		answerText = new JTextField(23);
		answerText.setFont(answerText.getFont().deriveFont(50));
		answerText.setHorizontalAlignment(JTextField.RIGHT);
		answerText.setEditable(false);
		answerPanel.add(answerText);

		frame.getContentPane().add(BorderLayout.CENTER, numbersPanel);		// center region of screen
		frame.getContentPane().add(BorderLayout.EAST, operationsPanel);		// right region of screen
		frame.getContentPane().add(BorderLayout.NORTH, answerPanel);		// top region of screen
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(300, 300);

		frame.setVisible(true);
	}

	class ListenOne implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String number = answerText.getText();
			answerText.setText(number + "1");
		}
	}

	class ListenTwo implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String number = answerText.getText();
			answerText.setText(number + "2");
		}
	}

	class ListenThree implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String number = answerText.getText();
			answerText.setText(number + "3");
		}
	}

	class ListenFour implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String number = answerText.getText();
			answerText.setText(number + "4");
		}
	}

	class ListenFive implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String number = answerText.getText();
			answerText.setText(number + "5");
		}
	}

	class ListenSix implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String number = answerText.getText();
			answerText.setText(number + "6");
		}
	}

	class ListenSeven implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String number = answerText.getText();
			answerText.setText(number + "7");
		}
	}

	class ListenEight implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String number = answerText.getText();
			answerText.setText(number + "8");
		}
	}

	class ListenNine implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String number = answerText.getText();
			answerText.setText(number + "9");
		}
	}

	class ListenZero implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String number = answerText.getText();
			answerText.setText(number + "0");
		}
	}

	class ListenEquals implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			number2 = Double.parseDouble(answerText.getText());
			if(add == true) {
				number2 = number2 + number1;
				answerText.setText(Double.toString(number2));
			}
			else if(sub == true) {
				number2 = number1 - number2;
				answerText.setText(Double.toString(number2));
			}
			else if(mult == true) {
				number2 = number2 * number1;
				answerText.setText(Double.toString(number2));
			}
			else if(div == true) {
				if(number2 == 0) {
					answerText.setText("Error. Press 'C'");
				}
				else {
					number2 = number1 / number2;
					answerText.setText(Double.toString(number2));
				}
			}
			
			add = false;
			sub = false;
			mult = false;
			div = false;
		}
	}

	class ListenMult implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			number1 = Double.parseDouble(answerText.getText());
			answerText.setText("");
			mult = true;
		}
	}

	class ListenDiv implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			number1 = Double.parseDouble(answerText.getText());
			answerText.setText("");
			div = true;
		}
	}

	class ListenAdd implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			number1 = Double.parseDouble(answerText.getText());
			answerText.setText("");
			add = true;
		}
	}

	class ListenSub implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			number1 = Double.parseDouble(answerText.getText());
			answerText.setText("");
			sub = true;
		}
	}

	class ListenClear implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			answerText.setText("");
		}
	}
}