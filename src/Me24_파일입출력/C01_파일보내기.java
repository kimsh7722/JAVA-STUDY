package Me24_파일입출력;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01_파일보내기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			Writer out = new FileWriter("c:\\IoText\\text.txt");
			out.write("apple\n");
			out.write("pineapple\n");
			out.write("banana\n");
			
			out.flush(); //버퍼 초기화
			out.close(); //스트림 제거
	}

}
