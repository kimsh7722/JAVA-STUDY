package Me24_파일입출력;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class C09_아_JSON {

	public static void main(String[] args) throws Exception{
	
		// URL과 연결된 Jsoup.connection
		Connection conn = Jsoup.connect("https://shopping.interpark.com/best/main.do");
		System.out.println(conn);
		
		// DOM객체를 꺼내와 저장
		Document document = conn.get();
		System.out.println(document);
		
		// DOM객체 안에서 img태그요소만 추출
		Elements element = document.getElementsByTag("img");
		System.out.println("추출한 element : "+element);
		
		// JSON DATA 추출
		System.out.println("---- JSON을 이용하여 데이터 추출 ----");
		String imgUrl=null;
		for(int i=0; i<element.size(); i++) {
			try {
			// http가 있다면 관련된 자료를 불러오고
			if(element.get(i).toString().contains("https")) {
				imgUrl = element.get(i).getElementsByAttribute("src").attr("src");
				
			// http가 없다면 // 관련된것을 불러와라
			}else if(element.get(i).toString().contains("//")){
				imgUrl = "https"+element.get(i).getElementsByAttribute("src").attr("src");
			}
			// " "을 기준으로 요소안의 내용을 문자열로 바꾼뒤 잘라내기
//			String str[] = element.get(i).toString().split(" ");
//			System.out.println(str[2]);
//			int start = str[1].indexOf("\"");
//			int end = str[1].lastIndexOf("\"");
//			imgUrl = str[1].substring(start,end);
			System.out.println(imgUrl);
			
			// URL 연결 파일 받아오기
			URL url = new URL(imgUrl);
			InputStream in = url.openStream();
			
//			Buff 속도향상
			BufferedInputStream bin= new BufferedInputStream(in);
			byte [] buff = new byte[4096];
			
			String filename="ImageFile";
//			if(element.get(i).toString().contains(".jpg")) {
//				OutputStream out = new FileOutputStream("c:\\IoText\\"+filename+i+".jpg");
//			}else if(element.get(i).toString().contains(".png")){
//				OutputStream out = new FileOutputStream("c:\\IoText\\"+filename+i+".png");
//			}
			OutputStream out = new FileOutputStream("c:\\IoText\\"+filename+i+".jpg");
			int data=0;
				while(true) {
					data=bin.read(buff);
					if(data==-1) {
						break;
					}
					out.write(data);
					out.flush();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
