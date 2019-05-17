package main;

import DTO.User_Data;
import Server.Client;
import UI.LoginForm;

public class Kakao_Talk_Main {
	public static void main(String[] args) {
		
		//데이터 저장
		User_Data user_Data = new User_Data();
		
		// 프레임 실행
		LoginForm loginForm = new LoginForm(user_Data);

		// http://blog.naver.com/PostView.nhn?blogId=jin93hj&logNo=220639194556
	}
}
