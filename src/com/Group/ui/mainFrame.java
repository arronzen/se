package com.Group.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class mainFrame extends javax.swing.JFrame {
	private JLabel mainLabel;
	private JButton memberManageButton;
	private JButton groupManageButton;
	private static String string;
	static mainFrame  main = null; 

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				mainFrame inst = new mainFrame("社团管理员");
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public static mainFrame getMainFrame(){
		if(main == null){
			main = new mainFrame(login.getComBoxValue());
		}
		return main;
	}
	
	private mainFrame(String str) {
		super();
		
		string = str;
		initGUI(string);
		//System.out.print(string);
	}
	
	private void initGUI(String str) {
		string = str;
		//System.out.print(string);
		try {
			{
				this.setSize(243, 167);
			}
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u793e\u56e2\u7ba1\u7406\u7cfb\u7edf");
			{
				mainLabel = new JLabel();
				getContentPane().add(mainLabel);
				mainLabel.setText("\u6b22\u8fce\u767b\u5f55\u793e\u56e2\u7ba1\u7406\u7cfb\u7edf");
				mainLabel.setBounds(12, 12, 179, 27);
				mainLabel.setFont(new java.awt.Font("微软雅黑",1,16));
			}
			{
				groupManageButton = new JButton();
				getContentPane().add(groupManageButton);
				groupManageButton.setText("\u793e\u56e2\u7ba1\u7406");
				groupManageButton.setBounds(24, 51, 136, 51);
				groupManageButton.setFont(new java.awt.Font("微软雅黑",1,20));	
				//System.out.print(string);
				if(string.equals("社团管理员")) 
				{
						groupManageButton.setVisible(false);
				}
				groupManageButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {
						 
						 groupManageButtonActionPerformed(evt);
						
				}
				});
				
			}
			{
				memberManageButton = new JButton();
				getContentPane().add(memberManageButton);
				memberManageButton.setText("\u793e\u5458\u7ba1\u7406");
				memberManageButton.setBounds(25, 53, 133, 48);
				memberManageButton.setFont(new java.awt.Font("微软雅黑",1,20));
				if(string.equals("校团委管理员")) 
				{
					memberManageButton.setVisible(false);
				}
				memberManageButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {					
						memberManageButtonActionPerformed(evt);
						//main.dispose();
				}
				});
			}
			pack();
			this.setSize(202, 170);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	public void groupManageButtonActionPerformed(ActionEvent evt){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				groupManageFrame groupManage = groupManageFrame.getgroupManageFrame();
				groupManage.setLocationRelativeTo(null);
				groupManage.setVisible(true);
			}
		});
	
	}
	public void memberManageButtonActionPerformed(ActionEvent evt){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				memberManageFrame memberManage = memberManageFrame.getmemberManageFrame();
				memberManage.setLocationRelativeTo(null);
				memberManage.setVisible(true);
			}
		});
	}
//	public void actManageButtonActionPerformed(ActionEvent evt){
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				ApproveActFrame ApproveAct = ApproveActFrame.getApproveActFrame();
//				ApproveAct.setLocationRelativeTo(null);
//				ApproveAct.setVisible(true);
//			}
//		});
//	}
//	public void actApplyButtonActionPerformed(ActionEvent evt){
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				ActApplyFrame ActApply = ActApplyFrame.getActApplyFrame();
//				ActApply.setLocationRelativeTo(null);
//				ActApply.setVisible(true);
//			}
//		});
	}


