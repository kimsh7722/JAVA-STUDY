package Me24_파일입출력;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;

public class C08_URL_Stream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("https://www.naver.com");
		
		// 기본 스트림
		InputStream in= url.openStream();
		
		// 보조 스트림(버퍼공간 추가)
		BufferedInputStream bin = new BufferedInputStream(in);
		
		// 보조스트림(스트림(1byte) -> 문자형(2byte)으로 받음)
		Reader r = new InputStreamReader(bin); // 필요
		
		OutputStream out = new FileOutputStream("c:\\IoText\\index.txt");
		Writer wout = new OutputStreamWriter(out); // 보조스트림(byte->char로변환)
		
		while(true) {
			int data = r.read();
			if(data==-1) {
				break;
			}
			System.out.print((char)data);
			wout.write(data);
		}
	}

}
