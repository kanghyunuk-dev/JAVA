package Ch06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class C05FileInputStreamMain {

	public static void main(String[] args) throws IOException {
		InputStream fin = new FileInputStream("C:\\IOTEST\\pdf.pdf");
		long startTime = System.currentTimeMillis();
		
		// 사이즈 클 수록 buffer 공간 필수
		byte[] buffer = new byte[1024];
		
		while (true) {
			int data = fin.read(buffer);
			if (data == -1) {
				break;
			}
//			System.out.print((char) data);
		}
		fin.close();
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime - startTime) + "ms");
	}

}
