package com.Group.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import com.Group.control.AdminControl;

public class login extends javax.swing.JFrame {
	private JLabel loginLabel;
	private JTextField userNameText;
	private static JComboBox userTypeComboBox;
	private JLabel userTypeLabel;
	private JButton cancleButton;
	private JButton loginButton;
	private JTextField passwordText;
	private JLabel passwordLabel;
	private JLabel userNameLabel;
	static login inst = null;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				inst = new login();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public login() {
		super();
		initGUI();
	}
	
	public void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u767b\u5f55");
			{
				loginLabel = new JLabel();
				getContentPane().add(loginLabel);
				loginLabel.setText("\u7cfb\u7edf\u767b\u5f55");
				loginLabel.setBounds(82, -9, 109, 66);
				loginLabel.setFont(new java.awt.Font("微软雅黑",1,22));
			}
			{
				userNameLabel = new JLabel();
				getContentPane().add(userNameLabel);
				userNameLabel.setText("\u7528\u6237\u540d\uff1a");
				userNameLabel.setBounds(44, 104, 55, 16);
				userNameLabel.setFont(new java.awt.Font("微软雅黑",1,12));
			}
			{
				userNameText = new JTextField();
				getContentPane().add(userNameText);
				userNameText.setBounds(117, 101, 119, 24);
			}
			{
				passwordLabel = new JLabel();
				getContentPane().add(passwordLabel);
				passwordLabel.setText("\u5bc6   \u7801\uff1a");
				passwordLabel.setBounds(44, 142, 55, 17);
				passwordLabel.setFont(new java.awt.Font("微软雅黑",1,12));
			}
			{
				passwordText = new JTextField();
				getContentPane().add(passwordText);
				passwordText.setBounds(117, 139, 119, 25);
			}
			{
				loginButton = new JButton();
				getContentPane().add(loginButton);
				loginButton.setText("\u767b\u5f55");
				loginButton.setBounds(44, 171, 73, 24);
				loginButton.setFont(new java.awt.Font("微软雅黑",1,12));				
				loginButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {
					if(AdminControl.getAdminControl().find(userNameText.getText())==null)
					{
						JOptionPane.showMessageDialog(null, "用户名不存在！", "消息提示", JOptionPane.ERROR_MESSAGE);
					}
					else if(getComBoxValue().equals(AdminControl.getAdminControl().find(userNameText.getText()).getAdminType()))
						{
						   if(AdminControl.getAdminControl().find(userNameText.getText()).getAdminPassword().equals(passwordText.getText()))
							   {
							   if(getComBoxValue().equals("校团委管理员")) 
								{
								   groupManageButtonActionPerformed(evt) ;
								}
							   else
							   {
								   memberManageButtonActionPerformed(evt);
							   }
							    	inst.dispose();
						       }
						   else   JOptionPane.showMessageDialog(null, "用户名和密码不匹配！", "消息提示", JOptionPane.ERROR_MESSAGE);
						 }
					else JOptionPane.showMessageDialog(null, "用户和用户组不匹配！", "消息提示", JOptionPane.ERROR_MESSAGE);
					}});
			}
			{
				cancleButton = new JButton();
				getContentPane().add(cancleButton);
				cancleButton.setText("\u53d6\u6d88");
				cancleButton.setBounds(152, 171, 73, 24);
				cancleButton.setFont(new java.awt.Font("微软雅黑",1,12));				
				cancleButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {				
					cancleButtonActionPerformed(evt);				
					}
				});
			}
			{
				userTypeLabel = new JLabel();
				getContentPane().add(userTypeLabel);
				userTypeLabel.setText("\u7528\u6237\u7ec4\uff1a");
				userTypeLabel.setBounds(44, 75, 53, 17);
				userTypeLabel.setFont(new java.awt.Font("微软雅黑",1,12));
			}
			{
				ComboBoxModel userTypeComboBoxModel = 
						new DefaultComboBoxModel(
								new String[] { "校团委管理员", "社团管理员" });
				userTypeComboBox = new JComboBox();
				getContentPane().add(userTypeComboBox);
				userTypeComboBox.setModel(userTypeComboBoxModel);
				userTypeComboBox.setBounds(117, 71, 119, 24);
			}
			pack();
			this.setSize(312, 253);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
//	public void loginButtonActionPerformed(ActionEvent evt){
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {			
//				mainFrame main = mainFrame.getMainFrame();
//				main.setLocationRelativeTo(null);
//				main.setVisible(true);
//			}
//		});
	
	public void cancleButtonActionPerformed(ActionEvent evt){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				System.exit(1);
			}
		});
	
			
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
	
	//返回combox的值
	public static String getComBoxValue(){
		return userTypeComboBox.getSelectedItem().toString();
	}

}
