package Ch06;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class C08URLStreamMain {

	public static void main(String[] args) throws URISyntaxException, IOException {
		// ULR : https://n.news.naver.com/mnews/article/018/0006274800
		URL url = (new URI("https://n.news.naver.com/mnews/article/018/0006274800")).toURL();
		// 기본스트림 추출
		InputStream in = url.openStream();
		//보조스트림 추가
		BufferedInputStream buffIn = new BufferedInputStream(in); //보조스트림(버퍼추가) 추가
		Reader rin = new InputStreamReader(buffIn);				// 보조스트림(byte -> char) 추가 (바이트 스트림을 문자 스트림으로 변환)
		//기본스트림(OUT)생성
		Writer fout = new FileWriter("C:\\IOTEST\\index.html");
		//
		while(true) {
			int data = rin.read();
			if(data==-1)
				break;
			
			fout.write((char)data);
			fout.flush();
		}
		fout.close();
		rin.close();
		buffIn.close();
		in.close();
	}

}
