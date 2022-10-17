package Me06_Switch;

public class C01_1회차 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ranking = 3;
		char medalcolor;
		switch(ranking) {
		case 1: 
			medalcolor='G';
			System.out.println("매달 색상 : "+medalcolor);
			break;
		case 2:
			medalcolor='S';
			System.out.println("매달 색상 : "+medalcolor);
			break;
		case 3: 
			medalcolor='B';
			System.out.println("매달 색상 : "+medalcolor);
			break;
		case 4: 
			medalcolor='C';
			System.out.println("매달 색상 : "+medalcolor);
			break;
		default :
			medalcolor='D';
			System.out.println("매달 색상 : "+medalcolor);
		}
	}

}
