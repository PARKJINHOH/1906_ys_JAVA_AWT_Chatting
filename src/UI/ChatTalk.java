package UI;

import java.awt.Component;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import DTO.User_Data;

public class ChatTalk extends JFrame {
	Frame frame = new Frame();
	GridBagLayout gBag;

	public ChatTalk(User_Data user_Data) {
		gBag = new GridBagLayout();
		frame.setLayout(gBag);

		frame.setTitle("카카오톡");

		Label iplLabel = new Label("IP :" + user_Data.getIp(), Label.CENTER);
		Label namelLabel = new Label("NAME : " + user_Data.getName(), Label.CENTER);
		/* 텍스트 에리어 */
		JTextArea area = new JTextArea(5, 40);
		JScrollPane scrollPane = new JScrollPane(area);

		/* 텍스트 필드 */
		JTextField text = new JTextField(10);

		/* 그리드 삽입 */
		gbinsert(iplLabel, 0, 0, 2, 1);
		gbinsert(namelLabel, 2, 0, 2, 1);
		gbinsert(scrollPane, 0, 1, 4, 4);
		gbinsert(text, 0, 6, 4, 1);

		text.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				area.append(t.getText() + "\n");
				t.setText("");

			}
		});

		frame.pack();
		frame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void gbinsert(Component c, int x, int y, int w, int h) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gBag.setConstraints(c, gbc);
		frame.add(c);
	}

}
