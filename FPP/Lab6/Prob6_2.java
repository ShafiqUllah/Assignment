package SepThirteen.Prob2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Prob6_2 extends JFrame {
	private JButton counterButton;
	private JButton reverseButton;
	private JButton duplicateRemoverButton;
	private JTextField textInput;
	private JTextField textOutput;
	private JLabel labelInput;
	private JLabel labelOutput;

	public Prob6_2() {
		this.PositionFrame();
		this.InitializeComponents();
		this.getContentPane().add(LayoutComponents());
	}

	private void InitializeComponents() {
		counterButton = new JButton("Count Letters");
		counterButton.addActionListener((evt) -> {
			String input = textInput.getText();
			textOutput.setText(String.valueOf(input.length()));
		});
		reverseButton = new JButton("Reverse Letters");
		reverseButton.addActionListener((evt) -> {
			String input = textInput.getText();
			int length = input.length();
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = length - 1; i >= 0; i--) {
				stringBuilder.append(input.charAt(i));
			}
			textOutput.setText(stringBuilder.toString());
		});
		duplicateRemoverButton = new JButton("Remove Duplicates");
		duplicateRemoverButton.addActionListener((evt)->{

			String input = textInput.getText();
			char[] lst = new char[input.length()];
			boolean isDuplicate = false;
			int lstPos = 0;
			for (int i = 0; i < input.length(); i++) {
				isDuplicate = false;
				char val = input.charAt(i);
				for (char check : lst) {
					if (val == check) {
						isDuplicate = true;
						break;
					}
				}
				if (!isDuplicate) {
					lst[lstPos] = val;
					lstPos++;
				}
			}
			StringBuilder strBuilder = new StringBuilder();
			for (Object c : lst) {
				strBuilder.append(c);
			}
			textOutput.setText(strBuilder.toString());
		
		});
		textInput = new JTextField(10);
		textOutput = new JTextField(10);
		labelInput = new JLabel("Input");
		labelOutput = new JLabel("Output");
	}

	private void PositionFrame() {
		Toolkit toolKit = Toolkit.getDefaultToolkit();
		int height = toolKit.getScreenSize().height;
		int width = toolKit.getScreenSize().width;
		int frameHeight = this.getSize().height;
		int frameWidth = this.getSize().width;
		this.setLocation((width - frameWidth) / 2, (height - frameHeight) / 3);
	}

	private JPanel LayoutComponents() {
		JPanel basePanel = new JPanel();
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		JPanel rightTopPanel = new JPanel();
		JPanel rightBottomPanel = new JPanel();

		basePanel.setLayout(new FlowLayout());
		basePanel.add(leftPanel);
		basePanel.add(rightPanel);

		leftPanel.setLayout(new BorderLayout(10, 10));
		leftPanel.add(counterButton, BorderLayout.NORTH);
		leftPanel.add(reverseButton, BorderLayout.CENTER);
		leftPanel.add(duplicateRemoverButton, BorderLayout.SOUTH);

		rightPanel.setLayout(new BorderLayout());
		rightPanel.add(rightTopPanel, BorderLayout.NORTH);
		rightPanel.add(rightBottomPanel, BorderLayout.SOUTH);

		rightTopPanel.setLayout(new BorderLayout());
		rightTopPanel.add(labelInput, BorderLayout.NORTH);
		rightTopPanel.add(textInput, BorderLayout.SOUTH);

		rightBottomPanel.setLayout(new BorderLayout());
		rightBottomPanel.add(labelOutput, BorderLayout.NORTH);
		rightBottomPanel.add(textOutput, BorderLayout.SOUTH);
		return basePanel;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Prob6_2 myFrame = new Prob6_2();
				myFrame.setVisible(true);
				myFrame.setResizable(false);
				myFrame.setTitle("String Utility");
				myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
				myFrame.pack();
			}
		});
	}

}
