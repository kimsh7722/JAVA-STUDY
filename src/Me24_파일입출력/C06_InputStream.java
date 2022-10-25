package Me24_파일입출력;

import java.io.FileInputStream;
import java.io.InputStream;

public class C06_InputStream {

	public static void main(String[] args) throws Exception{

		InputStream in = new FileInputStream("c:\\IoText\\text.exe");
		while(true) {
			int data=in.read();
			if(data==-1) {
				break;
			}
			System.out.print((char)data+" ");
		}
	}

}
