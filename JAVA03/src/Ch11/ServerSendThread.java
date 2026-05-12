package Ch11;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ServerSendThread implements Runnable {

	DataOutputStream dout;
	Scanner sc = new Scanner(System.in);

	public ServerSendThread(DataOutputStream dout) {
		this.dout = dout;
	}

	@Override
	public void run() {
		String send = null;
		while (true) {
			System.out.println("[SERVER (q:종료)] : ");
			send = sc.nextLine();
			// SERVER -> CLIENT (송신)
			try {
				dout.writeUTF(send);
				dout.flush();
//				if (send.equals("q"))
//					break;
				
			} catch (IOException e) {
				System.out.println("[EXCEPTION] : " + e.getCause());
//				e.printStackTrace();
			}
		}

//		sc.close();
	}

}
