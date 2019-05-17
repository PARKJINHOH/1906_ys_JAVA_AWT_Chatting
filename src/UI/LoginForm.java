package UI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import DTO.User_Data;
import Server.Client;

public class LoginForm extends JFrame {
	Frame frame = new Frame();
	JButton confirm, cancel;
	Client client;;

	public LoginForm(User_Data user_Data) {
		frame.setLayout(new GridLayout(4, 2));

		frame.setTitle("īī���� �α���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 130);

		Label iplLabel = new Label("IP", Label.LEFT);
		Label namelLabel = new Label("NAME", Label.LEFT);
		Label checkLabel = new Label("", Label.LEFT);

		TextField IP = new TextField(10);
		IP.setText("114.70.26.100");
		TextField NAME = new TextField(10);

		frame.add(iplLabel);
		frame.add(IP);

		frame.add(namelLabel);
		frame.add(NAME);

		confirm = new JButton("Ȯ��");
		cancel = new JButton("���");

		frame.add(confirm);
		frame.add(cancel);

		frame.add(checkLabel);

		confirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String getip = IP.getText().trim();
				String getname = NAME.getText().trim();
				if (!getip.equals("") && !getname.equals("")) {
					user_Data.setIp(getip);
					user_Data.setName(getname);
					try {
//						client = new Client(user_Data);

						// �̵� �ؾ���//
						new ChatTalk(user_Data);
						frame.setVisible(false);

					} catch (Exception e2) {
						e2.printStackTrace();
						System.out.println("���� ���� ����");
					}
				} else {
					checkLabel.setText("IP,NAME Ȯ�����ּ���");
				}
			}
		});
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		frame.setVisible(true);

	}
}
