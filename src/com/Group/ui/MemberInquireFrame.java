package com.Group.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import com.Group.control.MemberInfoControl;
import com.Group.model.MemberInfo;

public class MemberInquireFrame extends javax.swing.JFrame {
	private JLabel memberInquireLabel;
	private JLabel memberIDLabel;
	private JButton idInquireButton;
	private static JTextField memberIDText;
	static MemberInquireFrame  MemberInquire = null; 

	/**
	* Auto-generated main method to display this JFrame
	*/
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				MemberInquireFrame inst = new MemberInquireFrame();
//				inst.setLocationRelativeTo(null);
//				inst.setVisible(true);
//			}
//		});
//	}
	public static MemberInquireFrame  getMemberInquireFrame(){
		if(MemberInquire  == null){
			MemberInquire = new MemberInquireFrame();
		}
		return MemberInquire;
	}


		private MemberInquireFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				memberInquireLabel = new JLabel();
				getContentPane().add(memberInquireLabel);
				memberInquireLabel.setText("\u8bf7\u8f93\u5165\u67e5\u8be2\u4fe1\u606f");
				memberInquireLabel.setBounds(154, 12, 141, 25);
				memberInquireLabel.setFont(new java.awt.Font("微软雅黑",1,14));
			}
			{
				memberIDLabel = new JLabel();
				getContentPane().add(memberIDLabel);
				memberIDLabel.setText("\u793e\u5458\u7f16\u53f7");
				memberIDLabel.setBounds(66, 56, 67, 17);
			}
			{
				memberIDText = new JTextField();
				getContentPane().add(memberIDText);
				memberIDText.setBounds(154, 53, 162, 24);
				
			}
			{
				idInquireButton = new JButton();
				getContentPane().add(idInquireButton);
				idInquireButton.setText("\u67e5\u8be2");
				idInquireButton.setBounds(328, 53, 68, 24);
				idInquireButton.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent evt) {
						if(idGetMemberInfo() == null)
						{
							JOptionPane.showMessageDialog(null, "查询的成员不存在！", "消息提示", JOptionPane.ERROR_MESSAGE);
						}
						else
						{
							InquireButtonActionPerformed(evt);	
						}
						
						MemberInquire.dispose();
					}
				});
			}
			pack();
			this.setSize(432, 141);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	public void InquireButtonActionPerformed(ActionEvent evt){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				memberManageFrame memberManage = memberManageFrame.getmemberManageFrame(idGetMemberInfo());		
				memberManage.setLocationRelativeTo(null);
				memberManage.setVisible(true);
			}
		});
	}
		public static MemberInfo idGetMemberInfo()
		{
			MemberInfo memberInfo = MemberInfoControl.getMemberInfoControl().findByID(memberIDText.getText());

			
				return 	memberInfo;
			
			
		} 	 
		
	
}
