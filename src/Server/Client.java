package Server;

import java.net.Socket;

import DTO.User_Data;

public class Client {
	String ip;

	public Client(User_Data user_Data) {
		// 114.70.26.100
		ip = user_Data.getIp();
		try {
			Socket s = new Socket(ip, 8888);
			System.out.println("서버 IP : " + s.getInetAddress());
			System.out.println("서버 P# : " + s.getPort());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
