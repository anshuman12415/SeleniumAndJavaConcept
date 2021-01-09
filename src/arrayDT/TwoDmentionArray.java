package arrayDT;

public class TwoDmentionArray {

	public static void main(String[] args) {
		
	
	//int a[][]=new int[3][2]; //3 rows ,2 column
	
	/*a[0][0]=100;
	a[0][1]=100;
	
	a[1][0]=100;
	a[1][1]=100;
	
	a[2][0]=100;
	a[2][1]=100;*/
	
	int a[][]= {{100,101},{100,102},{100,103}};
	System.out.println(a.length);
	System.out.println(a[0].length);
	
	for(int i=0; i<=a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.println(a[i][j]);
			
		}
	}
	
}
}