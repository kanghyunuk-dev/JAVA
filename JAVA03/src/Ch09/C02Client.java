package Ch09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class C02Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 서버와 연결
		Socket server = new Socket("192.168.5.12", 7000);
		System.out.println("[CLIENT] SERVER 와의 연결이 완료되었습니다.");
		// 스트림
		InputStream in = server.getInputStream();
		OutputStream out = server.getOutputStream();

		// 보조 스트림
		DataInputStream din = new DataInputStream(in);
		DataOutputStream dout = new DataOutputStream(out);

		//
		Scanner sc = new Scanner(System.in); // 키보드 입력
		String send = null; // 송신용
		String recv = null; // 수신용
		
		
		while(true) {
			//SERVER -> CLIENT (수신)
			//CLIENT 종료 예외처리
			try {
				recv = din.readUTF();
			} catch(EOFException e) {
				System.out.println("[ERROR] 서버가 연결을 끊었습니다.");
				break;
			}
			if(recv.equals("q"))
				break;
			System.out.println("[SERVER] : " + recv);
			
			System.out.println("[SERVER (q:종료)] : ");
			send = sc.nextLine();
			//CLIENT -> SERVER (송신)
			dout.writeUTF(send);
			dout.flush();
			if(send.equals("q")) 
				break;
		}
		
		sc.close();
		dout.close();
		din.close();
		out.close();
		in.close();
		server.close();
		System.out.println("[CLIENT] 연결 종료 합니다.");
	}

}
