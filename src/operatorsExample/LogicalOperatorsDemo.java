package operatorsExample;

public class LogicalOperatorsDemo {

	public static void main(String[] args) {
		//AND(&&)    OR(||)   NOT(!)
		
		//int a=20,b=30;
		
		
		int x=15;
		int y=25;
		//AND(&&) Operator
		System.out.println("------AND(&&) )Operator-------");
		System.out.println((x>y)&&(x>=y)); //False and false = False
		System.out.println((x>y)&&(x<=y)); //False and True = False
		System.out.println((x<y)&&(x>y));  //True and False = False
		System.out.println((x<y)&&(x<=y));  //True and True = True
		
		
		//OR (||) Operator
		System.out.println("------OR(||) Operator-------");
		System.out.println((x>y)||(x>=y)); //False or false = False
		System.out.println((x>y)||(x<=y)); //False or True = True
		System.out.println((x<y)||(x>y));  //True or False = True
		System.out.println((x<y)||(x<=y));  //True or True = True
		
		//NOT Operator
		System.out.println("------NOT(!) Operator-------");
		System.out.println(!(x>y)); // (x>y) is false so false will be converted to True because of the NOT function.
		System.out.println(!(x<y)); //(x<y) is true so true will be converted to false because of the NOT function.

	}

}
