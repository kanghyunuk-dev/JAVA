package Ch06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C06FileOutputStreamMain {

	public static void main(String[] args) throws IOException {
		OutputStream fout = new FileOutputStream("C:\\IOTEST\\test2.txt");
		
		fout.write("가나다".getBytes(StandardCharsets.UTF_8));
		fout.write('b');
		fout.write('c');
		fout.flush();
		fout.close();
	}

}
