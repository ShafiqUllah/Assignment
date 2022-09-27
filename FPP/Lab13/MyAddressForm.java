package lab13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

public class MyAddressForm extends JFrame {
	private final String STREET_FIELD_LABEL = "Street";
	private final String CITY_FIELD_LABEL = "City";
	private final String STATE_FIELD_LABEL = "State";
	private final String ZIP_FIELD_LABEL = "Zip";
	private final String TITLE_TEXT = "Address Form";
	private final String ID_FIELD_LABEL = "ID";
	private final String FIRST_NAME_FIELD_LABEL = "First Name";
	private final String LAST_NAME_FIELD_LABEL = "Last Name";
	private final String SSN_FIELD_LABEL = "SSN";
	private final String SEARCH_BUTTON_LABEL = "Search";
	private final String SAVE_BUTTON_LABEL = "Save";
	private final String CLEAR_BUTTON_LABEL = "Clear";

	private JLabel messageLabel;
	private JTextField idField;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField ssnField;
	private JLabel ssnLabel;
	private JLabel streetLabel;
	private JLabel cityLabel;
	private JTextField streetField;
	private JTextField cityField;
	private JTextField stateField;
	private JTextField zipField;
	private JLabel idLabel;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel stateLabel;
	private JLabel zipLabel;

	private final int FIELD_SIZES = 15;

	private JButton searchButton;
	private JButton saveButton;
	private JButton clearButton;

	String dburl = "jdbc:mysql://localhost:3306/FPP_DB";
	Connection connection;
	Statement stmt;

	public MyAddressForm() {
		setName(TITLE_TEXT);
		setTitle(TITLE_TEXT);
	}

	void createDBConnection() throws SQLException {
		connection = DriverManager.getConnection(dburl, "root", "Shohag@123");
		System.out.println("Got connection...");
	}

	void closeDBConnection() {
		try {
			if (connection != null)
				connection.close();
			System.out.println("Connection closed");
		} catch (SQLException ex) {
			System.out.println("Unable to close connection");
		}

	}

	private void buildUI(final Container pane) {

		idLabel = new JLabel(ID_FIELD_LABEL);
		firstNameLabel = new JLabel(FIRST_NAME_FIELD_LABEL);
		lastNameLabel = new JLabel(LAST_NAME_FIELD_LABEL);
		ssnLabel = new JLabel(SSN_FIELD_LABEL);
		streetLabel = new JLabel(STREET_FIELD_LABEL);
		cityLabel = new JLabel(CITY_FIELD_LABEL);
		stateLabel = new JLabel(STATE_FIELD_LABEL);
		zipLabel = new JLabel(ZIP_FIELD_LABEL);

		messageLabel = new JLabel("");

		idField = new JTextField(FIELD_SIZES);
		firstNameField = new JTextField(FIELD_SIZES);
		lastNameField = new JTextField(FIELD_SIZES);
		ssnField = new JTextField(FIELD_SIZES);
		streetField = new JTextField(FIELD_SIZES);
		cityField = new JTextField(FIELD_SIZES);
		stateField = new JTextField(FIELD_SIZES);
		zipField = new JTextField(FIELD_SIZES);

		final JPanel mainPanel = new JPanel(new GridLayout(4, 1, 20, 0));
		mainPanel.setSize(200, 150);

		final JPanel row1Panel = new JPanel(new FlowLayout());

		final JPanel row1grid1 = new JPanel(new GridLayout(2, 1));
		row1grid1.add(idLabel);
		row1grid1.add(idField);
		row1Panel.add(row1grid1);

		final JPanel row1grid2 = new JPanel(new GridLayout(2, 1));
		row1grid2.add(firstNameLabel);
		row1grid2.add(firstNameField);
		row1Panel.add(row1grid2);

		final JPanel row1grid3 = new JPanel(new GridLayout(2, 1));
		row1grid3.add(lastNameLabel);
		row1grid3.add(lastNameField);
		row1Panel.add(row1grid3);

		final JPanel row1grid4 = new JPanel(new GridLayout(2, 1));
		row1grid4.add(ssnLabel);
		row1grid4.add(ssnField);
		row1Panel.add(row1grid4);

		mainPanel.add(row1Panel);

		final JPanel row2Panel = new JPanel(new FlowLayout());

		final JPanel row2grid1 = new JPanel(new GridLayout(2, 1));
		row2grid1.add(streetLabel);
		row2grid1.add(streetField);
		row2Panel.add(row2grid1);

		final JPanel row2grid2 = new JPanel(new GridLayout(2, 1));
		row2grid2.add(cityLabel);
		row2grid2.add(cityField);
		row2Panel.add(row2grid2);

		final JPanel row2grid3 = new JPanel(new GridLayout(2, 1));
		row2grid3.add(stateLabel);
		row2grid3.add(stateField);
		row2Panel.add(row2grid3);

		final JPanel row2grid4 = new JPanel(new GridLayout(2, 1));
		row2grid4.add(zipLabel);
		row2grid4.add(zipField);
		row2Panel.add(row2grid4);

		mainPanel.add(row2Panel);

		final JPanel row3Panel = new JPanel(new FlowLayout());
		Border blueline = BorderFactory.createLineBorder(Color.BLUE);
		row3Panel.setBorder(blueline);
		row3Panel.add(messageLabel);
		mainPanel.add(row3Panel);

		searchButton = new JButton(SEARCH_BUTTON_LABEL);
		searchButton.setFont(new Font("Serif", Font.BOLD, 12));
		searchButton.setActionCommand(SEARCH_BUTTON_LABEL);
		searchButton.setSize(5, 2);

		searchButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (idField.getText() != null && !idField.getText().trim().equals("")) {
					try {
						createDBConnection();

						stmt = connection.createStatement();
						String query = "Select p.*, a.* from person p " + "	LEFT JOIN address a ON p.id = a.id "
								+ " where p.id = " + idField.getText();
						ResultSet rs = stmt.executeQuery(query);

						if (rs.next()) {
							idField.setText(String.valueOf(rs.getInt("id")));
							firstNameField.setText(rs.getString("firstname"));
							lastNameField.setText(rs.getString("lastname"));
							ssnField.setText(rs.getString("ssn"));

							streetField.setText(rs.getString("street"));
							cityField.setText(rs.getString("city"));
							stateField.setText(rs.getString("state"));
							zipField.setText(rs.getString("zip"));
						} else {
							System.out.println("No records found");
						}
					} catch (SQLException ex) {
						System.out.println(ex.getMessage());
						ex.printStackTrace();
					} finally {
						if (stmt != null) {
							try {
								stmt.close();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
						}
						closeDBConnection();
					}
				} else {
					System.out.println("Enter a valid ID to search for detail");
					messageLabel.setText("Enter a valid ID to search for detail");
				}
			}
		});

		saveButton = new JButton(SAVE_BUTTON_LABEL);
		saveButton.setFont(new Font("Serif", Font.BOLD, 12));
		saveButton.setActionCommand(SAVE_BUTTON_LABEL);
		saveButton.setSize(5, 2);

		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (idField.getText() != null && !idField.getText().trim().equals("")
						&& firstNameField.getText() != null && !firstNameField.getText().trim().equals("")
						&& lastNameField.getText() != null && !lastNameField.getText().trim().equals("")
						&& ssnField.getText() != null && !ssnField.getText().trim().equals("")) {
					try {
						createDBConnection();

						stmt = connection.createStatement();
						String query = "insert into person(id,firstname,lastname,ssn) " + "values ("
								+ Integer.parseInt(idField.getText()) + ", \"" + firstNameField.getText() + "\", \""
								+ lastNameField.getText() + "\", \"" + ssnField.getText() + "\")";
						System.out.println("Person Insert: " + query);
						int noOfRows = stmt.executeUpdate(query);

						if (noOfRows > 0) {
							query = "insert into address (id, street, city, state, zip) values ("
									+ Integer.parseInt(idField.getText()) + ",\"" + streetField.getText() + "\",\""
									+ cityField.getText() + "\",\"" + stateField.getText() + "\",\""
									+ zipField.getText() + "\")";
							System.out.println("Address Insert: " + query);
							noOfRows = stmt.executeUpdate(query);

							System.out.println("Person informatoin successfully added");
						} else {
							System.out.println("Unable to insert person information");
						}
					} catch (NumberFormatException ex) {
						System.out.println(ex.getMessage());
						messageLabel.setText("Enter a valid ID to create a person entry");
					} catch (SQLException ex) {
						System.out.println(ex.getMessage());
						messageLabel.setText("All fields are reqiured");
					} finally {
						if (stmt != null) {
							try {
								stmt.close();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
						}
						closeDBConnection();
					}
				} else {
					System.out.println("All the fields are required and need a valid person ID");
					messageLabel.setText("All the fields are required and need a valid person ID");
				}
			}
		});

		clearButton = new JButton(CLEAR_BUTTON_LABEL);
		clearButton.setFont(new Font("Serif", Font.BOLD, 12));
		clearButton.setActionCommand(CLEAR_BUTTON_LABEL);
		clearButton.setSize(5, 2);

		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idField.setText("");
				firstNameField.setText("");
				lastNameField.setText("");
				ssnField.setText("");
				streetField.setText("");
				cityField.setText("");
				stateField.setText("");
				zipField.setText("");
			}
		});

		final JPanel row4Panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
		row4Panel.add(searchButton);
		row4Panel.add(saveButton);
		row4Panel.add(clearButton);
		mainPanel.add(row4Panel);

		pane.add(mainPanel);
	}

	private String showFormattedString() {
		return this.lastNameField.getText() + "\n" + this.streetField.getText() + "\n" + this.cityField.getText() + ", "
				+ this.stateField.getText() + " " + this.zipField.getText();
	}

	private static void initialize() {
		MyAddressForm frame = new MyAddressForm();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.buildUI(frame.getContentPane());
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

		UIManager.put("swing.boldMetal", Boolean.FALSE);

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MyAddressForm.initialize();
			}
		});
	}

}
