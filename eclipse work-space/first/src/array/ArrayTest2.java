package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		int a = 10;
		int [] arr1 = {1,2,3};
		int[][] arr2 = {
				{1,2,3},
				{4,5,6}
		};
		int [][][] arr3 = {
				{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}
				},
				{
					{10,20,30,40},
					{50,60,70,80},
					{90,100,110,120}
				}
		};
		for (int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		for (int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				for (int z=0; z<=arr3[i].length; z++)
				System.out.println(arr3[i][j][z]);
			}
		}

	}

}
