package arrayDT;

public class SingleDimention {
public static void main(String[] args) {
	

//int a[]= new int[5];
  /*a[0]=100;
  a[1]=100;
  a[2]=100;
  a[3]=100;
  a[4]=100;*/

int a[]= {10,11,12,13,14};  //declear array and insert value
System.out.println(a.length);
System.out.println(a[2]);

/*for(int i=0; i<=a.length-1;i++) {
	System.out.println(a[i]);*/

for(int i:a) {
	System.out.println(i);
}
}

}