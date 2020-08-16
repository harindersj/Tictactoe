package Toe;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.text.spi.BreakIteratorProvider;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenu;

public class tictac extends JFrame {

	private JPanel contentPane;
	static int player=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictac frame = new tictac();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tictac() {
		setResizable(false);
		getContentPane().setEnabled(false);
		getContentPane().setBackground(new Color(173, 216, 230));
	//	setUndecorated(true);
		setTitle("TIC TOC TOE");
		setVisible(true);
		setLocation(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(447,452);
		getContentPane().setLayout(null);
		String[] arr=new String[9];
		arr[0]="0";arr[1]="1";arr[2]="2";arr[3]="3";arr[4]="4";arr[5]="5";arr[6]="6";arr[7]="7";arr[8]="8";
		
		JLabel Name = new JLabel("");
		Name.setForeground(new Color(255, 255, 255));
		Name.setOpaque(true);
		Name.setBackground(new Color(0, 0, 0));
		Name.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		Name.setBounds(50, 32, 167, 45);
		getContentPane().add(Name);
		
		JButton btnNewButton = new JButton("");
		
		
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 46));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player==0){
					btnNewButton.setText("O");
					btnNewButton.setBackground(Color.yellow);
					btnNewButton.setEnabled(false);
					player=1;
					arr[0]="O";
					Name.setText("Player X Turn");
				}
				else if(player==1){
					btnNewButton.setText("X");
					btnNewButton.setBackground(new Color(0,255,64));
					btnNewButton.setEnabled(false);
										player=0;
										arr[0]="X";
										Name.setText("Player O Turn");
				}
				if(arr[0]==arr[1]&&arr[1]==arr[2]){
					JOptionPane.showMessageDialog(null, arr[0]+"win");
				}
				else	if(arr[0]==arr[3]&&arr[3]==arr[6]){
					JOptionPane.showMessageDialog(null, arr[0]+"win");
				}
				else	if(arr[0]==arr[4]&&arr[4]==arr[8]){
					JOptionPane.showMessageDialog(null, arr[0]+"win");
				}
				else	if((arr[0]!="0")&&(arr[1]!="1")&&(arr[2]!="2")&&(arr[3]!="3")&&(arr[4]!="4")&&(arr[5]!="5")&&(arr[6]!="6")&&(arr[7]!="7")&&(arr[8]!="8")){
					JOptionPane.showMessageDialog(null, "tie");
				}
				
			}
		});
		btnNewButton.setBounds(19, 131, 128, 89);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");

		button.setBackground(new Color(0, 191, 255));
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Comic Sans MS", Font.BOLD, 46));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player==0){
					button.setText("O");
					button.setBackground(Color.yellow);
					button.setEnabled(false);
					arr[1]="O";
					player=1;
					Name.setText("Player X Turn");
				}
				else if(player==1){
					button.setText("X");
					button.setBackground(new Color(0,255,64));
					button.setEnabled(false);
										player=0;
										arr[1]="X";
										Name.setText("Player O Turn");
				}
				if(arr[0]==arr[1]&&arr[1]==arr[2]){
					JOptionPane.showMessageDialog(null, arr[0]+"win");
				}
				else	if(arr[1]==arr[4]&&arr[4]==arr[7]){
					JOptionPane.showMessageDialog(null, arr[1]+"win");
				}
				else	if((arr[0]!="0")&&(arr[1]!="1")&&(arr[2]!="2")&&(arr[3]!="3")&&(arr[4]!="4")&&(arr[5]!="5")&&(arr[6]!="6")&&(arr[7]!="7")&&(arr[8]!="8")){
					JOptionPane.showMessageDialog(null, "tie");
				}
			}
		});
		button.setBounds(149, 131, 128, 89);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("");

		button_1.setBackground(new Color(0, 191, 255));
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Comic Sans MS", Font.BOLD, 46));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player==0){
					button_1.setText("O");
					button_1.setBackground(Color.yellow);
					button_1.setEnabled(false);
					player=1;
					arr[2]="O";
					Name.setText("Player X Turn");
				}
				
				else if(player==1){
					button_1.setText("X");
					button_1.setBackground(new Color(0,255,64));
					button_1.setEnabled(false);
					Name.setText("Player O Turn");
					player=0;
					arr[2]="X";
				}
				if(arr[0]==arr[1]&&arr[1]==arr[2]){
					JOptionPane.showMessageDialog(null, arr[0]+"win");
				}
				else	if(arr[2]==arr[5]&&arr[5]==arr[8]){
					JOptionPane.showMessageDialog(null, arr[2]+"win");
				}
				else if(arr[2]==arr[4]&&arr[4]==arr[6]){
					JOptionPane.showMessageDialog(null, arr[2]+"win");
				}
				else	if((arr[0]!="0")&&(arr[1]!="1")&&(arr[2]!="2")&&(arr[3]!="3")&&(arr[4]!="4")&&(arr[5]!="5")&&(arr[6]!="6")&&(arr[7]!="7")&&(arr[8]!="8")){
					JOptionPane.showMessageDialog(null, "tie");
				}
				
			}
			
		});
		button_1.setBounds(279, 131, 128, 89);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
	
		button_2.setBackground(new Color(0, 191, 255));
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Comic Sans MS", Font.BOLD, 46));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player==0){
					button_2.setText("O");
					button_2.setBackground(Color.yellow);
					button_2.setEnabled(false);
					player=1;
					arr[3]="O";
					Name.setText("Player X Turn");
					
				}
				else if(player==1){
					button_2.setText("X");
					button_2.setBackground(new Color(0,255,64));
					button_2.setEnabled(false);
					Name.setText("Player O Turn");
					player=0;
					arr[3]="X";
				}
				if(arr[0]==arr[3]&&arr[3]==arr[6]){
					JOptionPane.showMessageDialog(null, arr[0]+"win");
				}
				else	if(arr[3]==arr[4]&&arr[4]==arr[5]){
					JOptionPane.showMessageDialog(null, arr[0]+"win");
				}
				else	if((arr[0]!="0")&&(arr[1]!="1")&&(arr[2]!="2")&&(arr[3]!="3")&&(arr[4]!="4")&&(arr[5]!="5")&&(arr[6]!="6")&&(arr[7]!="7")&&(arr[8]!="8")){
					JOptionPane.showMessageDialog(null, "tie");
				}
			}
		});
		button_2.setBounds(19, 221, 128, 89);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		
		button_3.setBackground(new Color(0, 191, 255));
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Comic Sans MS", Font.BOLD, 46));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player==0){
					button_3.setText("O");
					button_3.setBackground(Color.yellow);
					button_3.setEnabled(false);
					Name.setText("Player X Turn");
					player=1;
					arr[4]="O";
				}
				else if(player==1){
					button_3.setText("X");
					
					button_3.setBackground(new Color(0,255,64));
					button_3.setEnabled(false);
					player=0;
					Name.setText("Player O Turn");
					arr[4]="X";
				}
				if(arr[1]==arr[4]&&arr[4]==arr[7]){
					JOptionPane.showMessageDialog(null, arr[4]+"win");
				}
				else	if(arr[0]==arr[4]&&arr[4]==arr[8]){
					JOptionPane.showMessageDialog(null, arr[0]+"win");
				}
				else	if(arr[2]==arr[4]&&arr[4]==arr[6]){
					JOptionPane.showMessageDialog(null, arr[4]+"win");
				}
				else	if(arr[3]==arr[4]&&arr[4]==arr[5]){
					JOptionPane.showMessageDialog(null, arr[4]+"win");
				}
				else	if((arr[0]!="0")&&(arr[1]!="1")&&(arr[2]!="2")&&(arr[3]!="3")&&(arr[4]!="4")&&(arr[5]!="5")&&(arr[6]!="6")&&(arr[7]!="7")&&(arr[8]!="8")){
					JOptionPane.showMessageDialog(null, "tie");
				}
			}
		});
		button_3.setBounds(149, 221, 128, 89);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");

		button_4.setBackground(new Color(0, 191, 255));
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("Comic Sans MS", Font.BOLD, 46));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player==0){
					button_4.setText("O");
					button_4.setBackground(Color.yellow);
					button_4.setEnabled(false);
					Name.setText("Player X Turn");
					player=1;
					arr[5]="O";

				}
				else if(player==1){
					button_4.setText("X");
					button_4.setBackground(new Color(0,255,64));
					button_4.setEnabled(false);
					Name.setText("Player O Turn");
					player=0;
					arr[5]="X";
				}
				if(arr[2]==arr[5]&&arr[5]==arr[8]){
					JOptionPane.showMessageDialog(null, arr[5]+"win");
				}
				else	if(arr[3]==arr[4]&&arr[4]==arr[5]){
					JOptionPane.showMessageDialog(null, arr[5]+"win");
				}
				else	if((arr[0]!="0")&&(arr[1]!="1")&&(arr[2]!="2")&&(arr[3]!="3")&&(arr[4]!="4")&&(arr[5]!="5")&&(arr[6]!="6")&&(arr[7]!="7")&&(arr[8]!="8")){
					JOptionPane.showMessageDialog(null, "tie");
				}
			}
		});
		button_4.setBounds(279, 221, 128, 89);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");

		button_5.setBackground(new Color(0, 191, 255));
		button_5.setForeground(Color.BLACK);
		button_5.setFont(new Font("Comic Sans MS", Font.BOLD, 46));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player==0){
					button_5.setText("O");
					button_5.setBackground(Color.yellow);
					button_5.setEnabled(false);
					Name.setText("Player X Turn");
					player=1;
					arr[6]="O";
				}
				else if(player==1){
					button_5.setText("X");
					button_5.setBackground(new Color(0,255,64));
					button_5.setEnabled(false);
					Name.setText("Player O Turn");
					player=0;
					arr[6]="X";
					}
				if(arr[0]==arr[3]&&arr[3]==arr[6]){
					JOptionPane.showMessageDialog(null, arr[0]+"win");
				}
				else	if(arr[6]==arr[4]&&arr[4]==arr[2]){
					JOptionPane.showMessageDialog(null, arr[4]+"win");
				}
				else if(arr[6]==arr[7]&&arr[7]==arr[8]){
					JOptionPane.showMessageDialog(null, arr[6]+"win");
				}
				else	if((arr[0]!="0")&&(arr[1]!="1")&&(arr[2]!="2")&&(arr[3]!="3")&&(arr[4]!="4")&&(arr[5]!="5")&&(arr[6]!="6")&&(arr[7]!="7")&&(arr[8]!="8")){
					JOptionPane.showMessageDialog(null, "tie");
				}
				
			}
		});
		button_5.setBounds(19, 311, 128, 89);
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");

		button_6.setBackground(new Color(0, 191, 255));
		button_6.setForeground(Color.BLACK);
		button_6.setFont(new Font("Comic Sans MS", Font.BOLD, 46));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player==0){
					button_6.setText("O");
					button_6.setBackground(Color.yellow);
					button_6.setEnabled(false);
					Name.setText("Player X Turn");
					player=1;
					arr[7]="O";
					
				}
				else if(player==1){
					button_6.setText("X");
					button_6.setBackground(new Color(0,255,64));
					arr[7]="X";
					Name.setText("Player O Turn");
					player=0;
					button_6.setEnabled(false);
				}
				if(arr[7]==arr[4]&&arr[4]==arr[1]){
					JOptionPane.showMessageDialog(null, arr[7]+"win");
				}
				else if(arr[6]==arr[7]&&arr[7]==arr[8]){
					JOptionPane.showMessageDialog(null, arr[6]+"win");
				}
				else if((arr[0]!="0")&&(arr[1]!="1")&&(arr[2]!="2")&&(arr[3]!="3")&&(arr[4]!="4")&&(arr[5]!="5")&&(arr[6]!="6")&&(arr[7]!="7")&&(arr[8]!="8")){
					JOptionPane.showMessageDialog(null, "tie");
				}
			}
		});
		button_6.setBounds(149, 311, 128, 89);
		getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_7.setBackground(new Color(0, 191, 255));
		button_7.setForeground(Color.BLACK);
		button_7.setFont(new Font("Comic Sans MS", Font.BOLD, 46));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player==0){
					button_7.setText("O");
					button_7.setBackground(Color.yellow);
					button_7.setEnabled(false);
					player=1;
					Name.setText("Player X Turn");
					arr[8]="O";
				}
				else if(player==1){
					button_7.setText("X");
					button_7.setBackground(new Color(0,255,64));
					button_7.setEnabled(false);
					Name.setText("Player O Turn");
					arr[8]="X";
					player=0;
				}
				if(arr[0]==arr[4]&&arr[4]==arr[8]){
					JOptionPane.showMessageDialog(null, arr[0]+"win");
				}
				else if(arr[2]==arr[5]&&arr[5]==arr[8]){
					JOptionPane.showMessageDialog(null, arr[2]+"win");
				}
				else if(arr[6]==arr[7]&&arr[7]==arr[8]){
					JOptionPane.showMessageDialog(null, arr[6]+"win");
				}
				else if((arr[0]!="0")&&(arr[1]!="1")&&(arr[2]!="2")&&(arr[3]!="3")&&(arr[4]!="4")&&(arr[5]!="5")&&(arr[6]!="6")&&(arr[7]!="7")&&(arr[8]!="8")){
					JOptionPane.showMessageDialog(null, "tie");
				}
				
					
			}
		});
		button_7.setBounds(279, 311, 128, 89);
		getContentPane().add(button_7);
		
		JButton btnRefresh = new JButton("REFRESH");
		btnRefresh.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			new tictac();
			setVisible(false);
			}
		});
		btnRefresh.setForeground(Color.BLACK);
		btnRefresh.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnRefresh.setBackground(new Color(30, 144, 255));
		btnRefresh.setBounds(279, 45, 128, 40);
		getContentPane().add(btnRefresh);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 441, 21);
		getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("FILE");
		menuBar.add(mnNewMenu);
		
		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int r=JOptionPane.showConfirmDialog(null, "Sure ypo want to Exit");
			if(r==JOptionPane.YES_OPTION){
				System.exit(0);
			}
			}
		});
		mnNewMenu.add(btnExit);
		
		JMenu mnNewMenu_1 = new JMenu("HELP");
		menuBar.add(mnNewMenu_1);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "written in java language "
					+ "IED used is eclipse."
					+"by Harinder singh");
			}
		});
		mnNewMenu_1.add(btnAbout);
		
		
		
		setVisible(true);
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
