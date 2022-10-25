package Me24_파일입출력;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class C02_해당가져온파일읽기 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader in = new FileReader("c:\\IoText\\text.txt");
		while(true) {
			int data = in.read();
			if(data == -1) {
				break;
			}
			System.out.print(data+" ");
		}
	}

}
