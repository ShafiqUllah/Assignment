package SepThirteen.Prob1;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This is the final version of MyFrame. It illustrates use of inner classes for
 * listeners. It also shows how to invoke a message dialog to report an error.
 * 
 * @author Administrator
 *
 */
public class Prob6_1 extends JFrame {

	private JPanel topPanel_1;
	private JPanel topPanel_2;
	private JPanel submitButtonPanel;
	private JPanel panelForName;
	private JLabel nameLabel;
	private JTextField nameTextFiled;

	private JPanel panelForStreet;
	private JLabel streetLabel;
	private JTextField streetTextFiled;

	private JPanel panelForCity;
	private JLabel cityLabel;
	private JTextField cityTextFiled;

	private JPanel panelForState;
	private JLabel stateLabel;
	private JTextField stateTextFiled;

	private JPanel panelForZip;
	private JLabel zipLabel;
	private JTextField zipTextFiled;

	private JButton submitButton;

	public Prob6_1() {
		initializeWindow();
		JPanel mainPanel = new JPanel();
		defineTopPanel_1();
		defineTopPanel_2();
		defineSubmitButtonPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel_1, BorderLayout.NORTH);
		mainPanel.add(topPanel_2, BorderLayout.CENTER);
		mainPanel.add(submitButtonPanel, BorderLayout.SOUTH);
		getContentPane().add(mainPanel);
	}

	private void defineTopPanel_1() {
		topPanel_1 = new JPanel();
		topPanel_1.setLayout(new FlowLayout(FlowLayout.CENTER));
		defineTextPanelForName();
		topPanel_1.add(panelForName);

		defineTextPanelForStreet();
		topPanel_1.add(panelForStreet);

		defineTextPanelForCity();
		topPanel_1.add(panelForCity);

	}

	private void defineTopPanel_2() {
		topPanel_2 = new JPanel();
		topPanel_2.setLayout(new FlowLayout(FlowLayout.CENTER));

		defineTextPanelForState();
		topPanel_2.add(panelForState);

		defineTextPanelForZip();
		topPanel_2.add(panelForZip);

	}

	private void defineSubmitButtonPanel() {
		submitButtonPanel = new JPanel();
		submitButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		submitButton = new JButton("Submit");
		submitButton.addActionListener((evt) -> {

			String textVal = nameTextFiled.getText() +"\n" + streetTextFiled.getText() 
			+ "\n"+cityTextFiled.getText() +", "+
					 stateTextFiled.getText() + " "+zipTextFiled.getText();
			
			System.out.println(textVal);
		});
		submitButtonPanel.add(submitButton);

	}

	private void defineTextPanelForName() {
		JPanel topText = new JPanel();
		JPanel bottomField = new JPanel();

		topText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		bottomField.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

		nameTextFiled = new JTextField(10);
		nameLabel = new JLabel("Name");
		nameLabel.setFont(makeSmallFont(nameLabel.getFont()));
		bottomField.add(nameTextFiled);
		topText.add(nameLabel);

		panelForName = new JPanel();
		panelForName.setLayout(new BorderLayout());
		panelForName.add(topText, BorderLayout.NORTH);
		panelForName.add(bottomField, BorderLayout.CENTER);
	}

	private void defineTextPanelForStreet() {
		JPanel topText = new JPanel();
		JPanel bottomField = new JPanel();

		topText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		bottomField.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

		streetTextFiled = new JTextField(10);
		streetLabel = new JLabel("Street");
		streetLabel.setFont(makeSmallFont(streetLabel.getFont()));
		bottomField.add(streetTextFiled);
		topText.add(streetLabel);

		panelForStreet = new JPanel();
		panelForStreet.setLayout(new BorderLayout());
		panelForStreet.add(topText, BorderLayout.NORTH);
		panelForStreet.add(bottomField, BorderLayout.CENTER);
	}

	private void defineTextPanelForCity() {
		JPanel topText = new JPanel();
		JPanel bottomField = new JPanel();

		topText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		bottomField.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

		cityTextFiled = new JTextField(10);
		cityLabel = new JLabel("City");
		cityLabel.setFont(makeSmallFont(cityLabel.getFont()));
		bottomField.add(cityTextFiled);
		topText.add(cityLabel);

		panelForCity = new JPanel();
		panelForCity.setLayout(new BorderLayout());
		panelForCity.add(topText, BorderLayout.NORTH);
		panelForCity.add(bottomField, BorderLayout.CENTER);
	}

	private void defineTextPanelForState() {
		JPanel topText = new JPanel();
		JPanel bottomField = new JPanel();

		topText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		bottomField.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

		stateTextFiled = new JTextField(10);
		stateLabel = new JLabel("State");
		stateLabel.setFont(makeSmallFont(stateLabel.getFont()));
		bottomField.add(stateTextFiled);
		topText.add(stateLabel);

		panelForState = new JPanel();
		panelForState.setLayout(new BorderLayout());
		panelForState.add(topText, BorderLayout.NORTH);
		panelForState.add(bottomField, BorderLayout.CENTER);
	}

	private void defineTextPanelForZip() {
		JPanel topText = new JPanel();
		JPanel bottomField = new JPanel();

		topText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		bottomField.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

		zipTextFiled = new JTextField(10);
		zipLabel = new JLabel("Zip");
		zipLabel.setFont(makeSmallFont(zipLabel.getFont()));
		bottomField.add(zipTextFiled);
		topText.add(zipLabel);

		panelForZip = new JPanel();
		panelForZip.setLayout(new BorderLayout());
		panelForZip.add(topText, BorderLayout.NORTH);
		panelForZip.add(bottomField, BorderLayout.CENTER);
	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Address Form");
		centerFrameOnDesktop(this);
		setSize(520, 170);
		setResizable(false);
	}

	public static Font makeSmallFont(Font f) {
		return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
	}

	public static void centerFrameOnDesktop(Component f) {
		final int SHIFT_AMOUNT = 0;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Prob6_1 mf = new Prob6_1();
				mf.setVisible(true);
			}
		});
	}

	private void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE); // could also be
																							// INFORMATION_MESSAGE
	}

	private static final long serialVersionUID = 3618976789175941431L;
}
