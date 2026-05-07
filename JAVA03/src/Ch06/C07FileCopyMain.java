package Ch06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class C07FileCopyMain {

	private static final String PATH = "C:\\IOTEST\\";
	public static void main(String[] args) throws IOException {
			//args[0] : source filename
			//args[1] : destination filename
			
			InputStream fin = new FileInputStream(PATH + args[0]);
			OutputStream fout = new FileOutputStream(PATH + args[1]);
			
			long startTime = System.currentTimeMillis();
			
			int data = 0;
			byte[] buff = new byte[4096];
			while((data = fin.read(buff)) != -1) {
				// data 가 읽어들인 범위를 지정 해주지 않으면, buff 에 할당한 량을 못채운 마지막 나머지 부분에서 다시 복사가 시작되어서 , data 범위값을 입력해줘야 한다
				// ex) 4096,4096,1200 -> 마지막막 부분 덜 차는 경우 -> 이전데이터가 일부같이 저장됨 -> 문제발생 -> data 값 까지만 쓰기로 설정
				fout.write(buff,0,data); 
				fout.flush();
			}
			fout.close();
			fin.close();
			
			long endTime = System.currentTimeMillis();
			System.out.println("소요시간 : " + (endTime - startTime) + "ms");
	}

}
