package com.kandarp.application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Desktop;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JList;

public class Schedule {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFieldPeriod1;
	private JTextField textFieldPeriod2;
	private JTextField textFieldPeriod3;
	private JTextField textFieldPeriod4;
	private JTextField textFieldPeriod5;
	private JTextField textFieldPeriod6;
	private JTextField textFieldPeriod7;
	private JTextField textFieldPeriod8;
	
	private int customPeriod1Time;
	private int customPeriod2Time;
	private int customPeriod3Time;
	private int customPeriod4Time;
	private int customPeriod5Time;
	private int customPeriod6Time;
	private int customPeriod7Time;
	private int customPeriod8Time;
	private int homeroomTime;
	
	private int totalMinutes;
	private JTextField textFieldHomeroomTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Schedule window = new Schedule();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Schedule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 735, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel_Assembly = new JPanel();
		frame.getContentPane().add(panel_Assembly, "name_1105897159092");
		panel_Assembly.setLayout(null);
		
		JSpinner spinnerStartTimeHour = new JSpinner();
		spinnerStartTimeHour.setModel(new SpinnerNumberModel(7, 7, 14, 1));
		spinnerStartTimeHour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerStartTimeHour.setBounds(41, 29, 58, 39);
		panel_Assembly.add(spinnerStartTimeHour);
		
		JSpinner spinnerStartTimeMinute = new JSpinner();
		spinnerStartTimeMinute.setModel(new SpinnerNumberModel(44, 0, 59, 1));
		spinnerStartTimeMinute.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerStartTimeMinute.setBounds(124, 29, 58, 39);
		panel_Assembly.add(spinnerStartTimeMinute);
		
		JLabel lblEnterSchoolStart = new JLabel("Enter school start time:");
		lblEnterSchoolStart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterSchoolStart.setBounds(24, 0, 168, 25);
		panel_Assembly.add(lblEnterSchoolStart);
		
		JLabel label = new JLabel(":");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(110, 34, 21, 25);
		panel_Assembly.add(label);
		
		JSpinner spinnerNumberOfPeriods = new JSpinner();
		spinnerNumberOfPeriods.setModel(new SpinnerNumberModel(8, 1, 8, 1));
		spinnerNumberOfPeriods.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spinnerNumberOfPeriods.setBounds(248, 65, 41, 33);
		panel_Assembly.add(spinnerNumberOfPeriods);
		
		JLabel lblNewLabel = new JLabel("Number of periods");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(209, 34, 124, 28);
		panel_Assembly.add(lblNewLabel);
		
		JLabel lblEnterSchoolEnd = new JLabel("Enter school end time:");
		lblEnterSchoolEnd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterSchoolEnd.setBounds(24, 90, 168, 25);
		panel_Assembly.add(lblEnterSchoolEnd);
		
		JSpinner spinnerEndTimeHour = new JSpinner();
		spinnerEndTimeHour.setModel(new SpinnerNumberModel(14, 7, 14, 1));
		spinnerEndTimeHour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerEndTimeHour.setBounds(41, 120, 58, 39);
		panel_Assembly.add(spinnerEndTimeHour);
		
		JLabel label_1 = new JLabel(":");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(110, 126, 21, 25);
		panel_Assembly.add(label_1);
		
		JSpinner spinnerEndTimeMinute = new JSpinner();
		spinnerEndTimeMinute.setModel(new SpinnerNumberModel(20, 0, 59, 1));
		spinnerEndTimeMinute.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerEndTimeMinute.setBounds(124, 120, 58, 39);
		panel_Assembly.add(spinnerEndTimeMinute);
		
		JLabel lblDoYouWant = new JLabel("Do you want to add assembly time?");
		lblDoYouWant.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDoYouWant.setBounds(24, 218, 236, 19);
		panel_Assembly.add(lblDoYouWant);
		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		buttonGroup.add(rdbtnYes);
		rdbtnYes.setBounds(41, 244, 71, 23);
		panel_Assembly.add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setSelected(true);
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(124, 244, 109, 23);
		panel_Assembly.add(rdbtnNo);
		
		JLabel lblEnterAssembly = new JLabel("Enter assembly start time:");
		lblEnterAssembly.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterAssembly.setBounds(24, 269, 209, 25);
		panel_Assembly.add(lblEnterAssembly);
		
		JSpinner spinnerAssemblyStartHour = new JSpinner();
		spinnerAssemblyStartHour.setModel(new SpinnerNumberModel(8, 7, 14, 1));
		spinnerAssemblyStartHour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerAssemblyStartHour.setBounds(41, 302, 58, 39);
		panel_Assembly.add(spinnerAssemblyStartHour);
		
		JSpinner spinnerAssemblyStartMinute = new JSpinner();
		spinnerAssemblyStartMinute.setModel(new SpinnerNumberModel(0, 0, 59, 1));
		spinnerAssemblyStartMinute.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerAssemblyStartMinute.setBounds(124, 302, 58, 39);
		panel_Assembly.add(spinnerAssemblyStartMinute);
		
		JLabel label_2 = new JLabel(":");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(110, 307, 21, 25);
		panel_Assembly.add(label_2);
		
		JLabel label_3 = new JLabel(":");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(110, 385, 21, 25);
		panel_Assembly.add(label_3);
		
		JLabel lblEnterAssemblyEnd = new JLabel("Enter assembly end time:");
		lblEnterAssemblyEnd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterAssemblyEnd.setBounds(24, 347, 168, 25);
		panel_Assembly.add(lblEnterAssemblyEnd);
		
		JSpinner spinnerAssemblyEndHour = new JSpinner();
		spinnerAssemblyEndHour.setModel(new SpinnerNumberModel(9, 7, 14, 1));
		spinnerAssemblyEndHour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerAssemblyEndHour.setBounds(41, 380, 58, 39);
		panel_Assembly.add(spinnerAssemblyEndHour);
		
		JSpinner spinnerAssemblyEndMinute = new JSpinner();
		spinnerAssemblyEndMinute.setModel(new SpinnerNumberModel(0, 0, 59, 1));
		spinnerAssemblyEndMinute.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerAssemblyEndMinute.setBounds(124, 380, 58, 39);
		panel_Assembly.add(spinnerAssemblyEndMinute);
		
		JLabel lblDoYouWant_1 = new JLabel("Set custom time for any period(s)?");
		lblDoYouWant_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDoYouWant_1.setBounds(351, 11, 236, 25);
		panel_Assembly.add(lblDoYouWant_1);
		
		JLabel lblPeriod = new JLabel("Period 1");
		lblPeriod.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeriod.setBounds(361, 47, 58, 19);
		panel_Assembly.add(lblPeriod);
		
		JLabel lblPeriod_1 = new JLabel("Period 2");
		lblPeriod_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeriod_1.setBounds(361, 72, 58, 19);
		panel_Assembly.add(lblPeriod_1);
		
		JLabel lblPeriod_2 = new JLabel("Period 3");
		lblPeriod_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeriod_2.setBounds(361, 97, 58, 19);
		panel_Assembly.add(lblPeriod_2);
		
		JLabel lblPeriod_3 = new JLabel("Period 4");
		lblPeriod_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeriod_3.setBounds(361, 122, 58, 19);
		panel_Assembly.add(lblPeriod_3);
		
		JLabel lblPeriod_4 = new JLabel("Period 5");
		lblPeriod_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeriod_4.setBounds(361, 147, 58, 19);
		panel_Assembly.add(lblPeriod_4);
		
		JLabel lblPeriod_5 = new JLabel("Period 6");
		lblPeriod_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeriod_5.setBounds(361, 172, 58, 19);
		panel_Assembly.add(lblPeriod_5);
		
		JLabel lblPeriod_6 = new JLabel("Period 7");
		lblPeriod_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeriod_6.setBounds(361, 197, 58, 19);
		panel_Assembly.add(lblPeriod_6);
		
		JLabel lblPeriod_7 = new JLabel("Period 8");
		lblPeriod_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPeriod_7.setBounds(361, 222, 58, 19);
		panel_Assembly.add(lblPeriod_7);
		
		JLabel lblEnterTheTime = new JLabel("Enter the time in minutes");
		lblEnterTheTime.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEnterTheTime.setBounds(450, 32, 180, 14);
		panel_Assembly.add(lblEnterTheTime);
		
		textFieldPeriod1 = new JTextField();
		textFieldPeriod1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent a) {
				char entChar = a.getKeyChar();
				if(!Character.isDigit(entChar))
				{
					a.consume();
				}
				else
				{
					customPeriod1Time = Integer.parseInt(textFieldPeriod1.getText());
				}
			}
		});
		textFieldPeriod1.setBounds(460, 51, 41, 14);
		panel_Assembly.add(textFieldPeriod1);
		textFieldPeriod1.setColumns(10);
		
		textFieldPeriod2 = new JTextField();
		textFieldPeriod2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent b) {
				char entChar = b.getKeyChar();
				if(!Character.isDigit(entChar))
				{
					b.consume();
				}		
				else
				{
					customPeriod2Time = Integer.parseInt(textFieldPeriod2.getText());
				}
			}
		});
		textFieldPeriod2.setColumns(10);
		textFieldPeriod2.setBounds(460, 76, 41, 14);
		panel_Assembly.add(textFieldPeriod2);
		
		textFieldPeriod3 = new JTextField();
		textFieldPeriod3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent c) {
				char entChar = c.getKeyChar();
				if(!Character.isDigit(entChar))
				{
					c.consume();
				}
				else
				{
					customPeriod3Time = Integer.parseInt(textFieldPeriod3.getText());
				}
				
			}
		});
		textFieldPeriod3.setColumns(10);
		textFieldPeriod3.setBounds(460, 101, 41, 14);
		panel_Assembly.add(textFieldPeriod3);
		
		textFieldPeriod4 = new JTextField();
		textFieldPeriod4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent d) {
				char entChar = d.getKeyChar();
				if(!Character.isDigit(entChar))
				{
					d.consume();
				}
				else
				{
					customPeriod4Time = Integer.parseInt(textFieldPeriod4.getText());
				}
			}
		});
		textFieldPeriod4.setColumns(10);
		textFieldPeriod4.setBounds(460, 126, 41, 14);
		panel_Assembly.add(textFieldPeriod4);
		
		textFieldPeriod5 = new JTextField();
		textFieldPeriod5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char entChar = e.getKeyChar();
				if(!Character.isDigit(entChar))
				{
					e.consume();
				}
				else
				{
					customPeriod5Time = Integer.parseInt(textFieldPeriod5.getText());
				}
			}
		});
		textFieldPeriod5.setColumns(10);
		textFieldPeriod5.setBounds(460, 151, 41, 14);
		panel_Assembly.add(textFieldPeriod5);
		
		textFieldPeriod6 = new JTextField();
		textFieldPeriod6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent f) {
				char entChar = f.getKeyChar();
				if(!Character.isDigit(entChar))
				{
					f.consume();
				}
				else
				{
					customPeriod6Time = Integer.parseInt(textFieldPeriod6.getText());
				}
			}
		});
		textFieldPeriod6.setColumns(10);
		textFieldPeriod6.setBounds(460, 176, 41, 14);
		panel_Assembly.add(textFieldPeriod6);
		
		textFieldPeriod7 = new JTextField();
		textFieldPeriod7.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent g) {
				char entChar = g.getKeyChar();
				if(!Character.isDigit(entChar))
				{
					g.consume();
				}
				else
				{
					customPeriod7Time = Integer.parseInt(textFieldPeriod7.getText());
				}
			}
		});
		textFieldPeriod7.setColumns(10);
		textFieldPeriod7.setBounds(460, 201, 41, 14);
		panel_Assembly.add(textFieldPeriod7);
		
		textFieldPeriod8 = new JTextField();
		textFieldPeriod8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent h) {
				char test = h.getKeyChar();
				if(!Character.isDigit(test))
				{
					h.consume();
				}
				else
				{
					customPeriod8Time = Integer.parseInt(textFieldPeriod8.getText());
				}
			}
		});
		textFieldPeriod8.setColumns(10);
		textFieldPeriod8.setBounds(460, 226, 41, 14);
		panel_Assembly.add(textFieldPeriod8);
		
		
		JRadioButton rdbtnHomeroom = new JRadioButton("Homeroom");
		rdbtnHomeroom.setBounds(18, 184, 96, 25);
		panel_Assembly.add(rdbtnHomeroom);
		
		textFieldHomeroomTime = new JTextField("16");
		textFieldHomeroomTime.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent g) {
				char entChar = g.getKeyChar();
				if(!Character.isDigit(entChar))
				{
					g.consume();
				}
				else
				{
					String homeroom = textFieldHomeroomTime.getText();
					if(homeroom.equals(null))
					{
						homeroom = "0";
					}				
						try
						{
							int homeroomTime = Integer.parseInt(homeroom);
						}
						catch(NumberFormatException a)
						{
							
						}
				}
			}
		});
		textFieldHomeroomTime.setBounds(119, 183, 33, 22);
		panel_Assembly.add(textFieldHomeroomTime);
		textFieldHomeroomTime.setColumns(10);
	
		
		rdbtnYes.setActionCommand("Yes");
		rdbtnNo.setActionCommand("No");
		
		String rdbtnSelection = buttonGroup.getSelection().getActionCommand();
		
		/*if(rdbtnSelection.equals("Yes"))
		{
			
		}*/
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				try
				{
					spinnerNumberOfPeriods.commitEdit();
				}
				catch(java.text.ParseException e)
				{
					
				}
				int numberOfPeriods = (Integer) spinnerNumberOfPeriods.getValue();
				try 
				{
					spinnerStartTimeHour.commitEdit();
				}
				catch(java.text.ParseException e)
				{
					
				}
				int startTimeHour = (Integer) spinnerStartTimeHour.getValue();
				
				try 
				{
					spinnerStartTimeMinute.commitEdit();
				}
				catch(java.text.ParseException e)
				{
					
				}
				int startTimeMinute = (Integer) spinnerStartTimeMinute.getValue();
				
				try 
				{
					spinnerEndTimeHour.commitEdit();
				}
				catch(java.text.ParseException e)
				{
					
				}
				int endTimeHour = (Integer) spinnerEndTimeHour.getValue();
				
				try 
				{
					spinnerEndTimeMinute.commitEdit();
				}
				catch(java.text.ParseException e)
				{
					
				}
				int endTimeMinute = (Integer) spinnerEndTimeMinute.getValue();

				
				try 
				{
					spinnerAssemblyStartHour.commitEdit();
				}
				catch(java.text.ParseException e)
				{
					
				}
				int assemblyStartTimeHour = (Integer) spinnerAssemblyStartHour.getValue();
				
				try 
				{
					spinnerAssemblyStartMinute.commitEdit();
				}
				catch(java.text.ParseException e)
				{
					
				}
				int assemblyStartTimeMinute = (Integer) spinnerAssemblyStartMinute.getValue();
				
				try 
				{
					spinnerAssemblyEndHour.commitEdit();
				}
				catch(java.text.ParseException e)
				{
					
				}
				int assemblyEndTimeHour = (Integer) spinnerAssemblyEndHour.getValue();
				
				try 
				{
					spinnerAssemblyEndMinute.commitEdit();
				}
				catch(java.text.ParseException e)
				{
					
				}
				int assemblyEndTimeMinute = (Integer) spinnerAssemblyEndMinute.getValue();
				
				FileWriter out = null;
				try {
					out = new FileWriter("D:\\Output Files\\schedule.txt");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				PrintWriter print = new PrintWriter(out);
				
				final int passingTimeArrayLength = 3;
				Integer[] passingTime = new Integer[passingTimeArrayLength];
				passingTime[0] = 3;
				passingTime[1] = 4;
				passingTime[2] = 5;
				
				Double[] periods = new Double[8];
				
				if(rdbtnHomeroom.isSelected() == false)
				{
					homeroomTime = 0;
				}
				else
				{
					String testHomeroom = textFieldHomeroomTime.getText();
					if(testHomeroom.equals(""))
					{
						testHomeroom = "0";
					}
					try
					{
						homeroomTime = Integer.parseInt(testHomeroom);
					}
					catch(NumberFormatException a)
					{
						
					}				}
					
				int homeRoomMinutes = homeroomTime;
				double totalPeriodMinutes;
				double singlePeriodMinutes;
				int calcStartHour = startTimeHour;

				if(rdbtnNo.isSelected())
				{
					if(startTimeMinute > 0)
					{
						calcStartHour = startTimeHour + 1;
					}
										
					totalMinutes = (60 - startTimeMinute) + (endTimeMinute) + ((endTimeHour - calcStartHour) * 60);
					totalPeriodMinutes = totalMinutes - ((numberOfPeriods) * passingTime[1]) - homeRoomMinutes;
					singlePeriodMinutes =  totalPeriodMinutes / numberOfPeriods;
					
					double checkMinutes = singlePeriodMinutes % 1;
					
					if(checkMinutes >= 0)
					{
						if(((checkMinutes * numberOfPeriods) % 1) == 0)
						{
							singlePeriodMinutes += (checkMinutes);
						}
					}
					
					for(int i = 0; i < periods.length; i++)
					{
						periods[i] = singlePeriodMinutes;
					}
					
					double[] periodStartHour = new double[numberOfPeriods + 1];
					double[] periodEndHour = new double[numberOfPeriods + 1];
					double[] periodStartMinute = new double[numberOfPeriods + 1];
					double[] periodEndMinute = new double [numberOfPeriods + 1];
					double[] homeroomStartHour = new double[1];
					double[] homeroomStartMinute = new double[1];
					double[] homeroomEndHour = new double[1];
					double[] homeroomEndMinute = new double[1];
					
					
					double currentHour = startTimeHour;
					double currentMinute = startTimeMinute;
					
					for(int i = 0; i < numberOfPeriods + 1; i++)
					{
						if(i  == 0)
						{
							periodStartHour[i] = currentHour;
							periodStartMinute[i] = Math.rint(currentMinute);
							
							currentMinute += singlePeriodMinutes;
							{
								if(currentMinute >= 60)
								{
									currentHour += 1;
									currentMinute %= 60;
								}
							}
							periodEndHour[i] = currentHour;
							periodEndMinute[i] = Math.rint(currentMinute);
							currentMinute += 1;
							if(currentMinute >= 60)
							{
								currentHour += 1;
								currentMinute %= 60;
							}
						}
						
						if(i == 1)
						{
							homeroomStartHour[0] = currentHour;
							homeroomStartMinute[0] = Math.rint(currentMinute);
							
							currentMinute += homeRoomMinutes;
							
							if(homeRoomMinutes == 0)
							{
								currentMinute -= 1;
								if(currentMinute == 0)
								{
									currentHour -= 1;
								}
								homeroomStartHour[0] = currentHour;
								homeroomStartMinute[0] = Math.rint(currentMinute); 
								
								homeroomEndHour[0] = currentHour;
								homeroomEndMinute[0] = Math.rint(currentMinute) ;
							}
							
							if(currentMinute >= 60)
							{
								currentHour +=1;
								currentMinute %= 60;
							}
							
							homeroomEndHour[0] = currentHour;
							homeroomEndMinute[0] = Math.rint(currentMinute);
							currentMinute += passingTime[1];
							if(currentMinute>= 60)
							{
								currentHour +=1;
								currentMinute %= 60;
							}
							
						}
						if(i > 1)
						{
							
							periodStartHour[i] = currentHour;
							periodStartMinute[i] = Math.rint(currentMinute);
							
							currentMinute += singlePeriodMinutes;
							{
								if(currentMinute >= 60)
								{
									currentHour += 1;
									currentMinute %= 60;
								}
							}
							periodEndHour[i] = currentHour;
							periodEndMinute[i] = Math.rint(currentMinute);
							currentMinute += passingTime[1];
							if(currentMinute >= 60)
							{
								currentHour += 1;
								currentMinute %= 60;
							}

						}
		
					}
					
					int endMinuteBuffer = 0;
					
					if(periodEndMinute[numberOfPeriods] != endTimeMinute)
					{
						print.println("Error: " + endTimeMinute + " " + periodEndMinute[numberOfPeriods]);
						
						endMinuteBuffer = (int) (endTimeMinute - periodEndMinute[numberOfPeriods]);
						
						print.println("Correction time: " + endMinuteBuffer);
						

					}
					print.println("\t\tStart time" + "\tEnd time");
					
					print.println("Period 1.\t" + periodStartHour[0] + ":" + periodStartMinute[0] + "\t" + periodEndHour[0] + ":" + periodEndMinute[0]);
					
					if(rdbtnHomeroom.isSelected())
					{
						print.println("Homeroom\t" + homeroomStartHour[0] + ":" + homeroomStartMinute[0] + "\t" + homeroomEndHour[0] + ":" + homeroomEndMinute[0]);
					}					
					for(int i = 2; i < numberOfPeriods + 1; i++)
					{
							print.println("Period " + i + ".\t" + periodStartHour[i] + ":" + periodStartMinute[i] + "\t" + periodEndHour[i] + ":" + periodEndMinute[i]);
					}
					print.println("Total Minutes: " + totalMinutes);
					print.println("Total period Minutes: " + totalPeriodMinutes + "Homeroom" + homeRoomMinutes);
					print.println("Single Period Minutes: " + singlePeriodMinutes);
					print.close();
				}
				else
				{
					int calcStartHour2 = assemblyEndTimeHour;
										
					totalMinutes = (60 - startTimeMinute) + (endTimeMinute) + ((endTimeHour - calcStartHour) * 60);

					
					double temporaryAssemblyStartHour = assemblyStartTimeHour;
					
					if(assemblyStartTimeMinute > 0)
					{
						temporaryAssemblyStartHour = assemblyStartTimeHour  + 1;  
					}
					double assemblyMinutes = (- assemblyStartTimeMinute) + (assemblyEndTimeMinute) + ((assemblyEndTimeHour - temporaryAssemblyStartHour) * 60);
					
					totalPeriodMinutes = (60 - assemblyEndTimeMinute) + (endTimeMinute) + ((endTimeHour - calcStartHour2 - 1) * 60) - (passingTime[1] * (numberOfPeriods - 2));
					singlePeriodMinutes =  totalPeriodMinutes / (numberOfPeriods - 1);

					double checkMinutes = singlePeriodMinutes % 1;
					
					if(checkMinutes >= 0)
					{
						if(((checkMinutes * numberOfPeriods) % 1) == 0)
						{
							singlePeriodMinutes += (checkMinutes);
						}
					}
					
					for(int i = 0; i < periods.length; i++)
					{
						periods[i] = singlePeriodMinutes;
					}
					
					double[] periodStartHour = new double[numberOfPeriods + 2];
					double[] periodEndHour = new double[numberOfPeriods + 2];
					double[] periodStartMinute = new double[numberOfPeriods + 2];
					double[] periodEndMinute = new double [numberOfPeriods + 2];
					double[] homeroomStartHour = new double[1];
					double[] homeroomStartMinute = new double[1];
					double[] homeroomEndHour = new double[1];
					double[] homeroomEndMinute = new double[1];
					double[] assemblyStartHour = new double[1];
					double[] assemblyStartMinute = new double[1];
					double[] assemblyEndHour = new double[1];
					double[] assemblyEndMinute = new double[1];
					
					
					double currentHour = startTimeHour;
					double currentMinute = startTimeMinute;
					
					for(int i = 0; i < numberOfPeriods + 2; i++)
					{
						if(i  == 0)
						{
							periodStartHour[i] = currentHour;
							periodStartMinute[i] = Math.rint(currentMinute);
							
							currentMinute += singlePeriodMinutes;
							{
								if(currentMinute >= 60)
								{
									currentHour += 1;
									currentMinute %= 60;
								}
							}
							periodEndHour[i] = currentHour;
							periodEndMinute[i] = Math.rint(currentMinute);
							currentMinute += 1;
							if(currentMinute >= 60)
							{
								currentHour += 1;
								currentMinute %= 60;
							}
						}
						
						if(i == 1)
						{
							homeroomStartHour[0] = currentHour;
							homeroomStartMinute[0] = Math.rint(currentMinute);
							
							currentMinute += homeRoomMinutes;
							
							if(homeRoomMinutes == 0)
							{
								currentMinute -= 1;
								if(currentMinute == 0)
								{
									currentHour -= 1;
								}
								homeroomStartHour[0] = currentHour;
								homeroomStartMinute[0] = Math.rint(currentMinute); 
								
								homeroomEndHour[0] = currentHour;
								homeroomEndMinute[0] = Math.rint(currentMinute) ;
							}
							
							if(currentMinute >= 60)
							{
								currentHour +=1;
								currentMinute %= 60;
							}
							
							homeroomEndHour[0] = currentHour;
							homeroomEndMinute[0] = Math.rint(currentMinute);
							
							
						}
						
						if(i == 2)
						{
							assemblyStartHour[0] = assemblyStartTimeHour;
							assemblyStartMinute[0] = assemblyStartTimeMinute;
							assemblyEndHour[0] = assemblyEndTimeHour;
							assemblyEndMinute[0] = assemblyEndTimeMinute;
							currentHour = assemblyEndTimeHour;
							currentMinute = assemblyEndTimeMinute;
							currentMinute += passingTime[1];
							if(currentMinute>= 60)
							{
								currentHour +=1;
								currentMinute %= 60;
							}
						}
						if(i > 2)
						{
							
							periodStartHour[i] = currentHour;
							periodStartMinute[i] = Math.rint(currentMinute);
							
							currentMinute += singlePeriodMinutes;
							{
								if(currentMinute >= 60)
								{
									currentHour += 1;
									currentMinute %= 60;
								}
							}
							periodEndHour[i] = currentHour;
							periodEndMinute[i] = Math.rint(currentMinute);
							currentMinute += passingTime[1];
							if(currentMinute >= 60)
							{
								currentHour += 1;
								currentMinute %= 60;
							}

						}
		
					}
					
					int endMinuteBuffer = 0;
					
					if(periodEndMinute[numberOfPeriods] != endTimeMinute)
					{
						print.println("Error: " + endTimeMinute + " " + periodEndMinute[numberOfPeriods]);
						
						endMinuteBuffer = (int) (endTimeMinute - periodEndMinute[numberOfPeriods]);
						
						print.println("Correction time: " + endMinuteBuffer);
						

					}
					print.println("\t\tStart time" + "\tEnd time");
					
					print.println("Period 1.\t" + periodStartHour[0] + ":" + periodStartMinute[0] + "\t" + periodEndHour[0] + ":" + periodEndMinute[0]);
					
					if(rdbtnHomeroom.isSelected())
					{
						print.println("Homeroom\t" + homeroomStartHour[0] + ":" + homeroomStartMinute[0] + "\t" + homeroomEndHour[0] + ":" + homeroomEndMinute[0]);
						
					}		
					
					print.println("Assembly\t" + assemblyStartHour[0] + ":" + assemblyStartMinute[0] + "\t\t" + assemblyEndHour[0] + ":" + assemblyEndMinute[0]);
					print.println("Time: " + assemblyMinutes);
					
					for(int i = 3; i < numberOfPeriods + 2; i++)
					{
							print.println("Period " + (i - 1) + ".\t" + periodStartHour[i] + ":" + periodStartMinute[i] + "\t" + periodEndHour[i] + ":" + periodEndMinute[i]);
					}
					print.println("Total Minutes: " + totalMinutes);
					print.println("Total period Minutes: " + totalPeriodMinutes + "Homeroom" + homeRoomMinutes);
					print.println("Single Period Minutes: " + singlePeriodMinutes);
					print.close();
				}
				
				try {
					Desktop.getDesktop().open(new java.io.File("D:\\Output Files\\schedule.txt"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCalculate.setBounds(394, 319, 118, 23);
		panel_Assembly.add(btnCalculate);

		
		
		
	}
}
