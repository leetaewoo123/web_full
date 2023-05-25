package array;

public class ArrayTest {

	public static void main(String[] args) {
		int a = 10;
		int [] studantIDs = new int[] {101, 102, 103};
		int [] ids = {11, 22, 33, 44};	// 선언과 동시에 초기화
		int [] num;				// 배열객체 참조 변수 선언
		num = new int[5];		// 배열객체 인스턴스 생성(인스턴스 화)
		
		for(int i=0; i<num.length; i++) { // 배열 객체에 값 넣기
			num[i] = i + 1;
		}
		for (int i=0; i<studantIDs.length; i++) {
			System.out.println(studantIDs[i]);
		}
		
		for(int id : ids) {			// 개선된 for 구조
			System.out.println(id);
		}
		for(int n : num) {			// 개선된 for 구조
			System.out.println(n);
		}

	}

}
