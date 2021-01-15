package accessModifiers;


	class B{
		 int data =11;  // default is useful within the current package
		 void m1() {
			 System.out.println(data);
			
		}
	}

	
	public class Default {
		public static void main(String[] args) {
			B obj= new B();
			obj.data=20; 
			obj.m1(); 
		}
	}


