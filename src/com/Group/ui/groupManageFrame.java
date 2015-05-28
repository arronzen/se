package com.Group.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import com.Group.control.AdminControl;
import com.Group.control.GroupInfoControl;
import com.Group.model.Admin;
import com.Group.model.GroupInfo;

public class groupManageFrame extends javax.swing.JFrame {
	private JLabel groupManageLabel;
	private JTextField passwordText;
	private JLabel passwordLabel;
	private JTextField managerIDText;
	private JLabel managerIDLabel;
	private JTextArea otherInforTextArea;
	private JScrollPane otherInforPane;
	private JButton inquireGroupButton;
	private JButton deleteGroupButton;
	private JButton changeInfoButton;
	private JButton creatGroupButton;
	private JLabel otherNameLabel;
	
	private JTextField leaderPhoneText;
	private JLabel leaderPhoneLabel;
	private JTextField leaderClassText;
	private JLabel leaderClass;
	private JTextField groupIDText;
	private JTextField leaderNameText;
	private JLabel leaderNameLabel;
	private JTextField groupNameText;
	private JLabel groupNameLabel;
	private JTextField memberAccountText;
	private JLabel memberAccount;
	private JLabel groupIDLabel;
	static groupManageFrame  groupManage = null; 

	/**
	* Auto-generated main method to display this JFrame
	*/
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				groupManageFrame inst = new groupManageFrame();
//				inst.setLocationRelativeTo(null);
//				inst.setVisible(true);
//			}
//		});
//	}
	public static groupManageFrame  getgroupManageFrame(){
		if(groupManage  == null){
			groupManage  = new groupManageFrame();
		}
		return groupManage;
	}
	public static groupManageFrame  getgroupManageFrame(GroupInfo groupInfo){
		
			groupManage.dispose();
			groupManage  = new groupManageFrame(groupInfo);
		
		    return groupManage;
	}
	
	private groupManageFrame() {
		super();
		initGUI();
	}
	private groupManageFrame(GroupInfo groupInfo) {
		super();
		initGUI(groupInfo);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u793e\u56e2\u7ba1\u7406\u7cfb\u7edf\u2014\u793e\u56e2\u4fe1\u606f\u7ba1\u7406");
			{
				groupManageLabel = new JLabel();
				getContentPane().add(groupManageLabel);
				groupManageLabel.setText("\u793e\u56e2\u4fe1\u606f\u7ba1\u7406");
				groupManageLabel.setBounds(40, 136, 161, 34);
				groupManageLabel.setFont(new java.awt.Font("微软雅黑",1,22));
			}
			{
				groupIDLabel = new JLabel();
				getContentPane().add(groupIDLabel);
				groupIDLabel.setText("\u793e\u56e2\u7f16\u53f7");
				groupIDLabel.setBounds(242, 60, 64, 17);
			}
			{
				groupIDText = new JTextField();
				getContentPane().add(groupIDText);
				groupIDText.setBounds(301, 57, 107, 24);
			}
			{
				memberAccount = new JLabel();
				getContentPane().add(memberAccount);
				memberAccount.setText("\u793e\u56e2\u4eba\u6570");
				memberAccount.setBounds(430, 60, 62, 17);
			}
			{
				memberAccountText = new JTextField();
				getContentPane().add(memberAccountText);
				memberAccountText.setBounds(492, 56, 113, 24);
			}
			{
				groupNameLabel = new JLabel();
				getContentPane().add(groupNameLabel);
				groupNameLabel.setText("\u793e\u56e2\u540d\u79f0");
				groupNameLabel.setBounds(242, 93, 60, 17);
			}
			{
				groupNameText = new JTextField();
				getContentPane().add(groupNameText);
				groupNameText.setBounds(302, 90, 303, 24);
			}
			{
				leaderNameLabel = new JLabel();
				getContentPane().add(leaderNameLabel);
				leaderNameLabel.setText("\u8d1f \u8d23 \u4eba");
				leaderNameLabel.setBounds(243, 160, 60, 17);
			}
			{
				leaderNameText = new JTextField();
				getContentPane().add(leaderNameText);
				leaderNameText.setBounds(309, 157, 111, 24);
			}
			{
				leaderClass = new JLabel();
				getContentPane().add(leaderClass);
				leaderClass.setText("\u8d1f\u8d23\u4eba\u73ed\u7ea7");
				leaderClass.setBounds(426, 160, 70, 17);
			}
			{
				leaderClassText = new JTextField();
				getContentPane().add(leaderClassText);
				leaderClassText.setBounds(496, 157, 109, 24);
			}
			{
				leaderPhoneLabel = new JLabel();
				getContentPane().add(leaderPhoneLabel);
				leaderPhoneLabel.setText("\u8d1f\u8d23\u4eba\u8054\u7cfb\u65b9\u5f0f");
				leaderPhoneLabel.setBounds(242, 194, 103, 17);
			}
			{
				leaderPhoneText = new JTextField();
				getContentPane().add(leaderPhoneText);
				leaderPhoneText.setBounds(345, 191, 260, 24);
			}
			{
				otherNameLabel = new JLabel();
				getContentPane().add(otherNameLabel);
				otherNameLabel.setText("\u793e\u56e2\u5907\u6ce8\u4fe1\u606f");
				otherNameLabel.setBounds(242, 223, 103, 24);
			}
			{
				creatGroupButton = new JButton();
				getContentPane().add(creatGroupButton);
				creatGroupButton.setText("\u521b\u5efa\u793e\u56e2");
				creatGroupButton.setBounds(28, 361, 113, 39);
				creatGroupButton.setFont(new java.awt.Font("微软雅黑",0,14));
				creatGroupButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {				
						creatGroupbuttonActionPerformed(evt);	
						
					}
				});
				
			    
			}
			{
				changeInfoButton = new JButton();
				getContentPane().add(changeInfoButton);
				changeInfoButton.setText("\u4fee\u6539\u793e\u56e2\u4fe1\u606f");
				changeInfoButton.setBounds(171, 361, 118, 39);
				changeInfoButton.setFont(new java.awt.Font("微软雅黑",0,14));
				changeInfoButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {
						if(groupIDText.getText().length() == 0)
						{
							JOptionPane.showMessageDialog(null, "请输入要删除的社团！", "消息提示", JOptionPane.WARNING_MESSAGE);
						}	
															
					}
				});
			}
			{
				deleteGroupButton = new JButton();
				getContentPane().add(deleteGroupButton);
				deleteGroupButton.setText("\u6ce8\u9500\u793e\u56e2");
				deleteGroupButton.setBounds(315, 361, 115, 39);
				deleteGroupButton.setFont(new java.awt.Font("微软雅黑",0,14));
				deleteGroupButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {
						if(groupIDText.getText().length() == 0)
						{
							JOptionPane.showMessageDialog(null, "请输入要删除的社团！", "消息提示", JOptionPane.WARNING_MESSAGE);
						}	
															
					}
				});
			}
			{
				inquireGroupButton = new JButton();
				getContentPane().add(inquireGroupButton);
				inquireGroupButton.setText("\u67e5\u8be2\u793e\u56e2\u4fe1\u606f");
				inquireGroupButton.setBounds(465, 361, 125, 39);
				inquireGroupButton.setFont(new java.awt.Font("微软雅黑",0,14));
				inquireGroupButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {				
						inquireGroupButtonActionPerformed(evt);				
					}
				});
			}
			{
				otherInforPane = new JScrollPane();
				getContentPane().add(otherInforPane);
				otherInforPane.setBounds(242, 253, 363, 75);
				{
					otherInforTextArea = new JTextArea();
					otherInforPane.setViewportView(otherInforTextArea);
					otherInforTextArea.setWrapStyleWord(true);
					otherInforTextArea.setLineWrap(true);
				}
			}
			{
				managerIDLabel = new JLabel();
				getContentPane().add(managerIDLabel);
				managerIDLabel.setText("\u7ba1\u7406\u5458\u5e10\u53f7");
				managerIDLabel.setBounds(243, 127, 72, 17);
			}
			{
				managerIDText = new JTextField();
				getContentPane().add(managerIDText);
				managerIDText.setBounds(309, 124, 111, 24);
				managerIDText.setText(groupIDText.getText());
				managerIDText.setEditable(false);
			}
			{
				passwordLabel = new JLabel();
				getContentPane().add(passwordLabel);
				passwordLabel.setText("\u7ba1\u7406\u5458\u5bc6\u7801");
				passwordLabel.setBounds(426, 127, 70, 17);
			}
			{
				passwordText = new JTextField();
				getContentPane().add(passwordText);
				passwordText.setBounds(496, 124, 109, 24);
			}
			pack();
			this.setSize(648, 449);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
private void initGUI(final GroupInfo group) {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("\u793e\u56e2\u7ba1\u7406\u7cfb\u7edf\u2014\u793e\u56e2\u4fe1\u606f\u7ba1\u7406");
			{
				groupManageLabel = new JLabel();
				getContentPane().add(groupManageLabel);
				groupManageLabel.setText("\u793e\u56e2\u4fe1\u606f\u7ba1\u7406");
				groupManageLabel.setBounds(40, 136, 161, 34);
				groupManageLabel.setFont(new java.awt.Font("微软雅黑",1,22));
			}
			{
				groupIDLabel = new JLabel();
				getContentPane().add(groupIDLabel);
				groupIDLabel.setText("\u793e\u56e2\u7f16\u53f7");
				groupIDLabel.setBounds(242, 60, 64, 17);
			}
			{
				groupIDText = new JTextField();
				getContentPane().add(groupIDText);
				groupIDText.setBounds(301, 57, 107, 24);
				groupIDText.setText(group.getGroupId());
			}
			{
				memberAccount = new JLabel();
				getContentPane().add(memberAccount);
				memberAccount.setText("\u793e\u56e2\u4eba\u6570");
				memberAccount.setBounds(430, 60, 62, 17);
			}
			{
				memberAccountText = new JTextField();
				getContentPane().add(memberAccountText);
				memberAccountText.setBounds(492, 56, 113, 24);
				memberAccountText.setText(group.getGroupAccount().toString());
			}
			{
				groupNameLabel = new JLabel();
				getContentPane().add(groupNameLabel);
				groupNameLabel.setText("\u793e\u56e2\u540d\u79f0");
				groupNameLabel.setBounds(242, 93, 60, 17);
			}
			{
				groupNameText = new JTextField();
				getContentPane().add(groupNameText);
				groupNameText.setBounds(302, 90, 303, 24);
				groupNameText.setText(group.getGroupName());
			}
			{
				leaderNameLabel = new JLabel();
				getContentPane().add(leaderNameLabel);
				leaderNameLabel.setText("\u8d1f \u8d23 \u4eba");
				leaderNameLabel.setBounds(243, 160, 60, 17);
			}
			{
				leaderNameText = new JTextField();
				getContentPane().add(leaderNameText);
				leaderNameText.setBounds(309, 157, 111, 24);
				leaderNameText.setText(group.getGroupLeader());
			}
			{
				leaderClass = new JLabel();
				getContentPane().add(leaderClass);
				leaderClass.setText("\u8d1f\u8d23\u4eba\u73ed\u7ea7");
				leaderClass.setBounds(426, 160, 70, 17);
			}
			{
				leaderClassText = new JTextField();
				getContentPane().add(leaderClassText);
				leaderClassText.setBounds(496, 157, 109, 24);
				leaderClassText.setText("无此信息");
			}
			{
				leaderPhoneLabel = new JLabel();
				getContentPane().add(leaderPhoneLabel);
				leaderPhoneLabel.setText("\u8d1f\u8d23\u4eba\u8054\u7cfb\u65b9\u5f0f");
				leaderPhoneLabel.setBounds(242, 194, 103, 17);
			}
			{
				leaderPhoneText = new JTextField();
				getContentPane().add(leaderPhoneText);
				leaderPhoneText.setBounds(345, 191, 260, 24);
				leaderPhoneText.setText(group.getLeaderPhone());
			}
			{
				otherNameLabel = new JLabel();
				getContentPane().add(otherNameLabel);
				otherNameLabel.setText("\u793e\u56e2\u5907\u6ce8\u4fe1\u606f");
				otherNameLabel.setBounds(242, 223, 103, 24);
			}
			{
				creatGroupButton = new JButton();
				getContentPane().add(creatGroupButton);
				creatGroupButton.setText("\u521b\u5efa\u793e\u56e2");
				creatGroupButton.setBounds(28, 361, 113, 39);
				creatGroupButton.setFont(new java.awt.Font("微软雅黑",0,14));
				creatGroupButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {
						//if()
						creatGroupbuttonActionPerformed(evt);	
						//JOptionPane.showMessageDialog(null, "创建成功！", "消息提示", JOptionPane.INFORMATION_MESSAGE);
					}
				});
			}
			{
				changeInfoButton = new JButton();
				getContentPane().add(changeInfoButton);
				changeInfoButton.setText("\u4fee\u6539\u793e\u56e2\u4fe1\u606f");
				changeInfoButton.setBounds(171, 361, 118, 39);
				changeInfoButton.setFont(new java.awt.Font("微软雅黑",0,14));
				changeInfoButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {
						if(groupIDText.getText().length() == 0)
						{
							JOptionPane.showMessageDialog(null, "请输入要删除的社团！", "消息提示", JOptionPane.WARNING_MESSAGE);
						}

						if(JOptionPane.showConfirmDialog(null, "确定要修改信息么？！", "消息提示", JOptionPane.YES_NO_OPTION) == 0)
						{							
							GroupInfoControl.getGroupControl().delete(group);
							Admin admin = new Admin();
							admin.setAdminId(group.getAdminId());
							admin.setAdminPassword(group.getPassoword());
							admin.setAdminType("社团管理员");	
							AdminControl.getAdminControl().delete(admin);
							creatGroupbuttonActionPerformed(evt);
							JOptionPane.showMessageDialog(null, "修改成功？！", "消息提示", JOptionPane.WARNING_MESSAGE);
						}
					}
				});
				
			}
			{
				deleteGroupButton = new JButton();
				getContentPane().add(deleteGroupButton);
				deleteGroupButton.setText("\u6ce8\u9500\u793e\u56e2");
				deleteGroupButton.setBounds(315, 361, 115, 39);
				deleteGroupButton.setFont(new java.awt.Font("微软雅黑",0,14));
				deleteGroupButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {
						if(groupIDText.getText().length() == 0)
						{
							JOptionPane.showMessageDialog(null, "请输入要删除的社团！", "消息提示", JOptionPane.WARNING_MESSAGE);
						}
						
						else if(JOptionPane.showConfirmDialog(null, "确定要删除？！", "消息提示", JOptionPane.YES_NO_OPTION) == 0)
						{
							Admin admin = new Admin();
							admin.setAdminId(group.getAdminId());
							admin.setAdminPassword(group.getPassoword());
							admin.setAdminType("社团管理员");
							GroupInfoControl.getGroupControl().delete(GroupInfoControl.getGroupControl().findByID(groupIDText.getText()));
							AdminControl.getAdminControl().delete(admin);
							JOptionPane.showMessageDialog(null, "删除成功？！", "消息提示", JOptionPane.WARNING_MESSAGE);
						}
						
						
					}
				});
			}
			{
				inquireGroupButton = new JButton();
				getContentPane().add(inquireGroupButton);
				inquireGroupButton.setText("\u67e5\u8be2\u793e\u56e2\u4fe1\u606f");
				inquireGroupButton.setBounds(465, 361, 125, 39);
				inquireGroupButton.setFont(new java.awt.Font("微软雅黑",0,14));
				inquireGroupButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {				
						inquireGroupButtonActionPerformed(evt);	
						
					}
				});
			}
			{
				otherInforPane = new JScrollPane();
				getContentPane().add(otherInforPane);
				otherInforPane.setBounds(242, 253, 363, 75);
				{
					otherInforTextArea = new JTextArea();
					otherInforPane.setViewportView(otherInforTextArea);
					otherInforTextArea.setWrapStyleWord(true);
					otherInforTextArea.setLineWrap(true);
					otherInforTextArea.setText(group.getOtherInfo());
				}
			}
			{
				managerIDLabel = new JLabel();
				getContentPane().add(managerIDLabel);
				managerIDLabel.setText("\u7ba1\u7406\u5458\u5e10\u53f7");
				managerIDLabel.setBounds(243, 127, 72, 17);
			}
			{
				managerIDText = new JTextField();
				getContentPane().add(managerIDText);
				managerIDText.setBounds(309, 124, 111, 24);
				managerIDText.setText(group.getAdminId());
				managerIDText.setEditable(false);
				
			}
			{
				passwordLabel = new JLabel();
				getContentPane().add(passwordLabel);
				passwordLabel.setText("\u7ba1\u7406\u5458\u5bc6\u7801");
				passwordLabel.setBounds(426, 127, 70, 17);
			}
			{
				passwordText = new JTextField();
				getContentPane().add(passwordText);
				passwordText.setBounds(496, 124, 109, 24);
				passwordText.setText(group.getPassoword());
			}
			pack();
			this.setSize(648, 449);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	public void inquireGroupButtonActionPerformed(ActionEvent evt){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				inquireGroupInfoOutBox inquireGroupInfo = inquireGroupInfoOutBox.getinquireGroupInfoOutBox();
				inquireGroupInfo.setLocationRelativeTo(null);
				inquireGroupInfo.setVisible(true);
			}
		});
		
		
	}
	public void creatGroupbuttonActionPerformed(ActionEvent evt){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				if(groupIDText.getText().length()==0||groupNameText.getText().length()==0||memberAccountText.getText().length()==0||leaderNameText.getText().length()==0||leaderPhoneText.getText().length()==0||otherInforTextArea.getText().length()==0||groupIDText.getText().length()==0||passwordText.getText().length()==0)
				{
					JOptionPane.showMessageDialog(null, "有信息未填写？！", "消息提示", JOptionPane.WARNING_MESSAGE);
				}
				else{
					GroupInfo groupInfo = new GroupInfo();
				groupInfo.setGroupId(groupIDText.getText());
				groupInfo.setGroupName(groupNameText.getText());
				Date date = new Date(0000-00-00);
				groupInfo.setGroupSetTime(date);
				groupInfo.setGroupAccount(Integer.valueOf(memberAccountText.getText()).intValue());
				groupInfo.setGroupLeader(leaderNameText.getText());
				groupInfo.setLeaderPhone(leaderPhoneText.getText());
				groupInfo.setOtherInfo(otherInforTextArea.getText());
			    groupInfo.setAdminId(groupIDText.getText());
			    groupInfo.setPassoword(passwordText.getText());
			    GroupInfoControl.getGroupControl().save(groupInfo);
			    Admin admin = new Admin();
			    admin.setAdminId(groupIDText.getText());
			    admin.setAdminPassword(passwordText.getText());
			    admin.setAdminType("社团管理员");
			   AdminControl.getAdminControl().save(admin);
			   JOptionPane.showMessageDialog(null, "创建成功？！", "消息提示", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
	}
}
