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
import com.Group.control.MemberInfoControl;
import com.Group.model.Admin;
import com.Group.model.GroupInfo;
import com.Group.model.MemberInfo;


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
public class memberManageFrame extends javax.swing.JFrame {
	private JLabel memberManageLabel;
	private JButton changeMemberButton;
	private JButton inquireMemberButton;
	private JButton deleteMemberButton;
	private JTextArea otherInfoTextArea;
	private JLabel memberPhoneLabel;
	private JButton addMemberButton;
	private JScrollPane otherInfoPane;
	private JTextField memberPhoneText; 
	private JTextField memberPostText;
	private JLabel memberPostLabel;
	private JTextField memberClassText;
	private JLabel memberClassLabel;
	private JTextField memberNameText;
	private JLabel memberNameLabel;
	private JTextField memberIDText;
	private JLabel memberIDLabel;
	static memberManageFrame  memberManage = null;

	/**
	* Auto-generated main method to display this JFrame
	*/
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				memberManage = new memberManageFrame();
//				memberManage.setLocationRelativeTo(null);
//				memberManage.setVisible(true);
//			}
//		});
//	}
	public static memberManageFrame  getmemberManageFrame(){
		if(memberManage  == null){
			memberManage  = new memberManageFrame();
		}
		return memberManage;
	}
	public static memberManageFrame  getmemberManageFrame(MemberInfo memberInfo){
		
		memberManage.dispose();
		memberManage  = new memberManageFrame(memberInfo);
	
	    return memberManage;
    }
	
	
	private memberManageFrame() {
		super();
		initGUI();
	}
	private memberManageFrame(MemberInfo memberInfo) {
		super();
		initGUI(memberInfo);
	}

	private void initGUI() {
		try {
			getContentPane().setLayout(null);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("\u793e\u5458\u4fe1\u606f\u7ba1\u7406\u7cfb\u7edf");
			{
				memberManageLabel = new JLabel();
				getContentPane().add(memberManageLabel);
				memberManageLabel.setText("\u793e\u5458\u4fe1\u606f\u7ba1\u7406\u7cfb\u7edf");
				memberManageLabel.setBounds(144, 13, 160, 32);
				memberManageLabel.setFont(new java.awt.Font("微软雅黑",0,20));
			}
			{
				memberIDLabel = new JLabel();
				getContentPane().add(memberIDLabel);
				memberIDLabel.setText("\u793e\u5458\u7f16\u53f7");
				memberIDLabel.setBounds(45, 56, 59, 25);
			}
			{
				memberIDText = new JTextField();
				getContentPane().add(memberIDText);
				memberIDText.setBounds(116, 57, 100, 24);
			}
			{
				memberNameLabel = new JLabel();
				getContentPane().add(memberNameLabel);
				memberNameLabel.setText("\u793e\u5458\u59d3\u540d");
				memberNameLabel.setBounds(45, 93, 71, 17);
			}
			{
				memberNameText = new JTextField();
				getContentPane().add(memberNameText);
				memberNameText.setBounds(116, 90, 100, 24);
			}
			{
				memberClassLabel = new JLabel();
				getContentPane().add(memberClassLabel);
				memberClassLabel.setText("\u793e\u5458\u73ed\u7ea7");
				memberClassLabel.setBounds(45, 127, 71, 17);
			}
			{
				memberClassText = new JTextField();
				getContentPane().add(memberClassText);
				memberClassText.setBounds(116, 124, 100, 24);
			}
			{
				memberPostLabel = new JLabel();
				getContentPane().add(memberPostLabel);
				memberPostLabel.setText("\u793e\u5458\u804c\u52a1");
				memberPostLabel.setBounds(45, 162, 71, 17);
			}
			{
				memberPostText = new JTextField();
				getContentPane().add(memberPostText);
				memberPostText.setBounds(116, 159, 100, 24);
			}
			{
				memberPhoneLabel = new JLabel();
				getContentPane().add(memberPhoneLabel);
				memberPhoneLabel.setText("\u8054\u7cfb\u65b9\u5f0f");
				memberPhoneLabel.setBounds(45, 196, 66, 17);
			}
			{
				memberPhoneText = new JTextField();
				getContentPane().add(memberPhoneText);
				memberPhoneText.setBounds(116, 193, 100, 24);
			}
			{
				otherInfoPane = new JScrollPane();
				getContentPane().add(otherInfoPane);
				otherInfoPane.setBounds(240, 57, 189, 160);
				{
					otherInfoTextArea = new JTextArea();
					otherInfoPane.setViewportView(otherInfoTextArea);
					otherInfoTextArea.setWrapStyleWord(true);
					otherInfoTextArea.setLineWrap(true);

				}
			}
			{
				addMemberButton = new JButton();
				getContentPane().add(addMemberButton);
				addMemberButton.setText("\u589e\u52a0\u793e\u5458");
				addMemberButton.setBounds(75, 229, 124, 52);
				addMemberButton.setFont(new java.awt.Font("微软雅黑",1,14));
				addMemberButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {				
						addMemberButtonActionPerformed(evt);	
						
					}
				});
			}
			{
				deleteMemberButton = new JButton();
				getContentPane().add(deleteMemberButton);
				deleteMemberButton.setText("\u5220\u9664\u793e\u5458");
				deleteMemberButton.setBounds(75, 292, 124, 52);
				deleteMemberButton.setFont(new java.awt.Font("微软雅黑",1,14));
				deleteMemberButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {
						if(memberIDText.getText().length() == 0)
						{
							JOptionPane.showMessageDialog(null, "请录入相关信息！", "消息提示", JOptionPane.WARNING_MESSAGE);
						}										
					}
				});
			}
			{
				changeMemberButton = new JButton();
				getContentPane().add(changeMemberButton);
				changeMemberButton.setText("\u4fee\u6539\u4fe1\u606f");
				changeMemberButton.setBounds(265, 229, 118, 52);
				changeMemberButton.setFont(new java.awt.Font("微软雅黑",1,14));
				changeMemberButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {
						if(memberIDText.getText().length() == 0)
						{
							JOptionPane.showMessageDialog(null, "请录入相关信息！", "消息提示", JOptionPane.WARNING_MESSAGE);
						}

						
					}
				});
			}
			{
				inquireMemberButton = new JButton();
				getContentPane().add(inquireMemberButton);
				inquireMemberButton.setText("\u67e5\u8be2\u793e\u5458");
				inquireMemberButton.setBounds(265, 292, 118, 52);
				inquireMemberButton.setFont(new java.awt.Font("微软雅黑",1,14));
				inquireMemberButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {				
						inquireMemberButtonActionPerformed(evt);				
					}
				});
			}
			pack();
			this.setSize(476, 394);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	private void initGUI(final MemberInfo memberInfo) {
		try {
			getContentPane().setLayout(null);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("\u793e\u5458\u4fe1\u606f\u7ba1\u7406\u7cfb\u7edf");
			{
				memberManageLabel = new JLabel();
				getContentPane().add(memberManageLabel);
				memberManageLabel.setText("\u793e\u5458\u4fe1\u606f\u7ba1\u7406\u7cfb\u7edf");
				memberManageLabel.setBounds(144, 13, 160, 32);
				memberManageLabel.setFont(new java.awt.Font("微软雅黑",0,20));
			}
			{
				memberIDLabel = new JLabel();
				getContentPane().add(memberIDLabel);
				memberIDLabel.setText("\u793e\u5458\u7f16\u53f7");
				memberIDLabel.setBounds(45, 56, 59, 25);
			}
			{
				memberIDText = new JTextField();
				getContentPane().add(memberIDText);
				memberIDText.setBounds(116, 57, 100, 24);
				memberIDText.setText(memberInfo.getMemberId());
			}
			{
				memberNameLabel = new JLabel();
				getContentPane().add(memberNameLabel);
				memberNameLabel.setText("\u793e\u5458\u59d3\u540d");
				memberNameLabel.setBounds(45, 93, 71, 17);
			}
			{
				memberNameText = new JTextField();
				getContentPane().add(memberNameText);
				memberNameText.setBounds(116, 90, 100, 24);
				memberNameText.setText(memberInfo.getMemberName());
			}
			{
				memberClassLabel = new JLabel();
				getContentPane().add(memberClassLabel);
				memberClassLabel.setText("\u793e\u5458\u73ed\u7ea7");
				memberClassLabel.setBounds(45, 127, 71, 17);
			}
			{
				memberClassText = new JTextField();
				getContentPane().add(memberClassText);
				memberClassText.setBounds(116, 124, 100, 24);
				memberClassText.setText(memberInfo.getMemberGrade().toString());
			}
			{
				memberPostLabel = new JLabel();
				getContentPane().add(memberPostLabel);
				memberPostLabel.setText("\u793e\u5458\u804c\u52a1");
				memberPostLabel.setBounds(45, 162, 71, 17);
			}
			{
				memberPostText = new JTextField();
				getContentPane().add(memberPostText);
				memberPostText.setBounds(116, 159, 100, 24);
				memberPostText.setText(memberInfo.getMemberpost());
			}
			{
				memberPhoneLabel = new JLabel();
				getContentPane().add(memberPhoneLabel);
				memberPhoneLabel.setText("\u8054\u7cfb\u65b9\u5f0f");
				memberPhoneLabel.setBounds(45, 196, 66, 17);
			}
			{
				memberPhoneText = new JTextField();
				getContentPane().add(memberPhoneText);
				memberPhoneText.setBounds(116, 193, 100, 24);
				memberPhoneText.setText(memberInfo.getMemberPhone());
			
			}
			{
				otherInfoPane = new JScrollPane();
				getContentPane().add(otherInfoPane);
				otherInfoPane.setBounds(240, 57, 189, 160);
				{
					otherInfoTextArea = new JTextArea();
					otherInfoPane.setViewportView(otherInfoTextArea);
					otherInfoTextArea.setWrapStyleWord(true);
					otherInfoTextArea.setLineWrap(true);
					otherInfoTextArea.setText(memberInfo.getOtherInfo());
				}
			}
			{
				addMemberButton = new JButton();
				getContentPane().add(addMemberButton);
				addMemberButton.setText("\u589e\u52a0\u793e\u5458");
				addMemberButton.setBounds(75, 229, 124, 52);
				addMemberButton.setFont(new java.awt.Font("微软雅黑",1,14));
				addMemberButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {				
						addMemberButtonActionPerformed(evt);	
						//JOptionPane.showMessageDialog(null, "增加成功？！", "消息提示", JOptionPane.INFORMATION_MESSAGE);
					}
				});
			}
			{
				deleteMemberButton = new JButton();
				getContentPane().add(deleteMemberButton);
				deleteMemberButton.setText("\u5220\u9664\u793e\u5458");
				deleteMemberButton.setBounds(75, 292, 124, 52);
				deleteMemberButton.setFont(new java.awt.Font("微软雅黑",1,14));
				deleteMemberButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {
						if(memberIDText.getText().length() == 0)
						{
							JOptionPane.showMessageDialog(null, "请录入相关信息！", "消息提示", JOptionPane.WARNING_MESSAGE);
						}
						
						if(JOptionPane.showConfirmDialog(null, "确定要删除？！", "消息提示", JOptionPane.YES_NO_OPTION) == 0)
						{

							MemberInfoControl.getMemberInfoControl().delete(MemberInfoControl.getMemberInfoControl().findByID(memberIDText.getText()));
							
							JOptionPane.showMessageDialog(null, "删除成功？！", "消息提示", JOptionPane.WARNING_MESSAGE);
						}
						
						
					}
				});
			}
			{
				changeMemberButton = new JButton();
				getContentPane().add(changeMemberButton);
				changeMemberButton.setText("\u4fee\u6539\u4fe1\u606f");
				changeMemberButton.setBounds(265, 229, 118, 52);
				changeMemberButton.setFont(new java.awt.Font("微软雅黑",1,14));
				changeMemberButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {
						if(memberIDText.getText().length() == 0)
						{
							JOptionPane.showMessageDialog(null, "请录入相关信息！", "消息提示", JOptionPane.WARNING_MESSAGE);
						}

						if(JOptionPane.showConfirmDialog(null, "确定要修改信息么？！", "消息提示", JOptionPane.YES_NO_OPTION) == 0)
						{							
							MemberInfoControl.getMemberInfoControl().delete(memberInfo);
							addMemberButtonActionPerformed(evt);
							JOptionPane.showMessageDialog(null, "修改成功？！", "消息提示", JOptionPane.WARNING_MESSAGE);
						}
					}
				});
			}
			{
				inquireMemberButton = new JButton();
				getContentPane().add(inquireMemberButton);
				inquireMemberButton.setText("\u67e5\u8be2\u793e\u5458");
				inquireMemberButton.setBounds(265, 292, 118, 52);
				inquireMemberButton.setFont(new java.awt.Font("微软雅黑",1,14));
				inquireMemberButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {				
						inquireMemberButtonActionPerformed(evt);				
					}
				});
			}
			pack();
			this.setSize(476, 394);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	public void inquireMemberButtonActionPerformed(ActionEvent evt){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MemberInquireFrame MemberInquire = MemberInquireFrame.getMemberInquireFrame();
				MemberInquire.setLocationRelativeTo(null);
				MemberInquire.setVisible(true);
			}
		});
	
	}
	public void addMemberButtonActionPerformed(ActionEvent evt){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				if(memberIDText.getText().length()==0||memberNameText.getText().length()==0||memberClassText.getText().length()==0||memberPhoneText.getText().length()==0||memberPostText.getText().length() == 0||otherInfoTextArea.getText().length() ==0)
				{
					JOptionPane.showMessageDialog(null, "有信息未填写？！", "消息提示", JOptionPane.WARNING_MESSAGE);
				}
				else
				{
					MemberInfo memberInfo = new MemberInfo();
				memberInfo.setMemberId(memberIDText.getText());
				memberInfo.setGroupId("001");
				memberInfo.setMemberName(memberNameText.getText());
				memberInfo.setMemberGrade(Integer.valueOf(memberClassText.getText()).intValue());
				memberInfo.setMemberPhone(memberPhoneText.getText());
				memberInfo.setMemberpost(memberPostText.getText());
				memberInfo.setOtherInfo(otherInfoTextArea.getText());
				MemberInfoControl.getMemberInfoControl().save(memberInfo);
				JOptionPane.showMessageDialog(null, "增加成功？！", "消息提示", JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
		});
	}
}
