package Me24_파일입출력;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class C03_FlieUpload_FileRead {

	public static void main(String[] args) throws Exception{

//		Reader in = new FileReader("c:"+File.separator+"iotest"+File.separator+"IoText");
		// 읽기
		Reader in = new FileReader("c:\\IoText\\original.txt");
		// 내보내는 것
		Writer out = new FileWriter("c:\\\\IoText\\\\copyfile.txt");
		
		// 버퍼 배열
		char buff[]=new char[100];
		while(true) {
			int cnt = in.read(buff); // buff크기만큼 읽어서 buff에 저장한뒤 읽은 개수를 cnt에 전달
			if(cnt == -1) {
				break;
			}
			System.out.println("CNT : "+cnt);
			out.write(buff);
			out.flush();
		}
	}

}
