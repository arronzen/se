package com.Group.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import com.Group.control.GroupInfoControl;
import com.Group.model.GroupInfo;

public class inquireGroupInfoOutBox extends javax.swing.JFrame {
	private JLabel inquireKeyLabel;
	private static JTextField groupIDText;
	private JButton idInquireButton;
	private JLabel GroupIDLabel;
	static inquireGroupInfoOutBox  inquireGroupInfo = null;
	

	/**
	* Auto-generated main method to display this JFrame
	*/
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				inquireGroupInfoOutBox inst = new inquireGroupInfoOutBox();
//				inst.setLocationRelativeTo(null);
//				inst.setVisible(true);
//			}
//		});
//	}
public static inquireGroupInfoOutBox  getinquireGroupInfoOutBox(){
	if(inquireGroupInfo  == null){
		inquireGroupInfo  = new inquireGroupInfoOutBox();
	}
	return inquireGroupInfo;
}


	private inquireGroupInfoOutBox() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				inquireKeyLabel = new JLabel();
				getContentPane().add(inquireKeyLabel);
				inquireKeyLabel.setText("\u8bf7\u8f93\u5165\u67e5\u8be2\u4fe1\u606f");
				inquireKeyLabel.setBounds(131, 12, 139, 25);
				inquireKeyLabel.setFont(new java.awt.Font("微软雅黑",1,14));
			}
			{
				GroupIDLabel = new JLabel();
				getContentPane().add(GroupIDLabel);
				GroupIDLabel.setText("\u793e\u56e2\u7f16\u53f7");
				GroupIDLabel.setBounds(55, 54, 61, 21);
			}
			{
				groupIDText = new JTextField();
				getContentPane().add(groupIDText);
				groupIDText.setBounds(128, 53, 175, 24);
			}
			{
				idInquireButton = new JButton();
				getContentPane().add(idInquireButton);
				idInquireButton.setText("\u67e5\u8be2");
				idInquireButton.setBounds(321, 53, 65, 24);
				idInquireButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {	
						if(idGetGroupInfo() == null)
						{
							JOptionPane.showMessageDialog(null, "查询的社团不存在！", "消息提示", JOptionPane.ERROR_MESSAGE);
						}
						else idInquireButtonActionPerformed(evt);
						inquireGroupInfo.dispose();
						
					}
				});
			}
			pack();
			this.setSize(413, 140);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	public void idInquireButtonActionPerformed(ActionEvent evt){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				groupManageFrame groupManage =groupManageFrame.getgroupManageFrame(idGetGroupInfo());
				groupManage.setLocationRelativeTo(null);
				groupManage.setVisible(true);
				
			}
		});
	}
	public static GroupInfo idGetGroupInfo(){
		return 	GroupInfoControl.getGroupControl().findByID(groupIDText.getText());
	} 
	
}

