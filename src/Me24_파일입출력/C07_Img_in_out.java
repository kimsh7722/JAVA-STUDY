package Me24_파일입출력;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C07_Img_in_out {

	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream in = new FileInputStream("c:\\IoText\\cat.jpg");
		OutputStream out = new FileOutputStream("c:\\IoText\\copy.jpg");
		byte [] buff = new byte[4096];
//		try {
		// 1번째 방식
//			while(true) 
//				// buff 크기만큼 읽어와서 buff에 저장, 읽은 개수를 리턴
//				int cnt=in.read(buff);
//				
//				// 나가기
//				if(cnt == -1) {
//					break;
//				}
//				// 0번째부터 읽어들인 cnt만큼만 buff를 읽는 다
//				out.write(buff,0,cnt);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		// 2번째 방식
		int cnt=0;
		while((cnt=in.read(buff))!=-1) {
			out.write(buff,0,cnt);
		}
	}
}

