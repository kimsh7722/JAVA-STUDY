package Me24_파일입출력;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C05_OutputStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// 예외처리
		OutputStream out = new FileOutputStream("c:\\IoText\\text.exe");
		out.write('a'); out.write('b'); out.write('c'); 
		out.flush();
	}

}
