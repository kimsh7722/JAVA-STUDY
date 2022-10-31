package 시험10_28;

import java.util.ArrayList;

class Cal {
	private static Cal instance;
 
	ArrayList<Integer> arr = new ArrayList<>();
	
	public int InsertVal(int tmp) {
		try {
				arr.add(tmp);

		}catch (Exception e) {

			return -1;
		}
		return 0;
	}
	
	public static Cal getInstance() {
		if(instance == null) {
			instance = new Cal();
		}
		
		return instance;
	}
	
	public void ShowVal() {

		System.out.println("------ 조회 ------");
		for(int i=0; i<arr.size(); i++) {
			if(i < 10) {
				System.out.println(arr.get(i));
			}
		}
	}
}

public class M1_SinggleTon {

	public static void main(String[] args) {
		
		Cal cal = Cal.getInstance();
		
		for(int i=1; i<=100; i++) {
			cal.InsertVal(i);
		}
		cal.ShowVal();

	}

}
