import java.util.Scanner;
class  SelectionStmt_prog1
{
	public void firstProblem()
	{
		//First Problem

		System.out.println("int x=0");

		System.out.println("if(x)");
		System.out.println("{");
	    String syso1="System.out.println("+"Hello"+")";
		System.out.println(syso1);	
	    System.out.println("}");
		System.out.println("else");							
		System.out.println("{");				
	    String syso2="System.out.println("+"Hi"+")";
		System.out.println(syso2);
		System.out.println("}");	

		System.out.println("A:Hello   B:Hi   C:CE   D:RE");
		Scanner obj=new Scanner(System.in);
		String option=obj.nextLine();
		System.out.println("Selected Option :"+option);

	}
	
	public void secondProblem()
	{
		//SECOND PROBLEM
		System.out.println("int x=10");

		System.out.println("if(x=20)");
		System.out.println("{");
	    String syso1="System.out.println("+"Hello"+")";
		System.out.println(syso1);	
	    System.out.println("}");
		System.out.println("else");							
		System.out.println("{");				
	    String syso2="System.out.println("+"Hi"+")";
		System.out.println(syso2);
		System.out.println("}");	

		System.out.println("A:Hello   B:Hi   C:CE   D:RE");
		Scanner obj=new Scanner(System.in);
		String option=obj.nextLine();
		System.out.println("Selected Option :"+option);
	}
	
	public void thirdProblem()
	{
		//THIRD PROBLEM
	System.out.println("int x=10");

	System.out.println("if(x==10)");
	System.out.println("{");
    String syso1="System.out.println("+"Hello"+")";
	System.out.println(syso1);	
    System.out.println("}");
	System.out.println("else");							
	System.out.println("{");				
    String syso2="System.out.println("+"Hi"+")";
	System.out.println(syso2);
	System.out.println("}");	

	System.out.println("A:Hello   B:Hi   C:CE   D:RE");
	Scanner obj=new Scanner(System.in);
	String option=obj.nextLine();
	System.out.println("Selected Option :"+option);


	}
	
	public void fourthProblem()
	{
		//FOURTH PROBLEM
		System.out.println("Boolean b=true");

		System.out.println("if(b=false)");
		System.out.println("{");
	    String syso1="System.out.println("+"Hello"+")";
		System.out.println(syso1);	
	    System.out.println("}");
		System.out.println("else");							
		System.out.println("{");				
	    String syso2="System.out.println("+"Hi"+")";
		System.out.println(syso2);
		System.out.println("}");	

		System.out.println("A:Hello   B:Hi   C:CE   D:RE");
		Scanner obj=new Scanner(System.in);
		String option=obj.nextLine();
		System.out.println("Selected Option :"+option);

	}
	
	public void fifthProblem()
	{
		//FIFTH PROBLEM
		System.out.println("boolean b=true");

		System.out.println("if(b==false)");
		System.out.println("{");
	    String syso1="System.out.println("+"Hello"+")";
		System.out.println(syso1);	
	    System.out.println("}");
		System.out.println("else");							
		System.out.println("{");				
	    String syso2="System.out.println("+"Hi"+")";
		System.out.println(syso2);
		System.out.println("}");	

		System.out.println("A:Hello   B:Hi   C:CE   D:RE");
		Scanner obj=new Scanner(System.in);
		String option=obj.nextLine();
		System.out.println("Selected Option :"+option);

	}
	
	public void sixthProblem()
	{
		boolean b=false;
		if(b==false)
		{
		  System.out.println("Hello");
		}
		else
		{
			System.out.println("Hi");
		}				
	}
	public static void main(String[] args) 
	{
		SelectionStmt_prog1 sprog1 = new SelectionStmt_prog1();
		sprog1.firstProblem();
	}
}
