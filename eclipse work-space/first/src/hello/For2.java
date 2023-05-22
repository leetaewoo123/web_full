package hello;

public class For2 {
	public static void gugudan() {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i==3 && j==5) {
					return;
				}
				System.out.println(i+" x "+ j + " = " + i*j);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("gugudan() 호출 전");
		gugudan();
		System.out.println("gugudan() 호출 후");
	}

}
