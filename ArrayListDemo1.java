/*ArrayList
----------------------------------------------------------
Adding Employee Objects in ArrayList
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

class Employee{
	String ename;
	String desg;
	long salary;
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void enterEmployeeDetails() throws IOException{
		
		System.out.print("Enter Employee Name: ");
		ename = br.readLine();
		System.out.print("Enter Employee desg: ");
		desg = br.readLine();
		System.out.print("Enter Employee Salary: "); 	
		boolean bsalary	= true;
		do
		{	
			try{ salary = Long.parseLong(br.readLine()); }
			catch(Exception e){ 
				bsalary = false;
				System.out.println("Invalid Salary Entered ! Re-enter..."); 
			}
		}while(bsalary==false);
	}
	
	public void displayEmployeeData(){
	/*	System.out.println("---------------------------");
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Designation: "+desg);
		System.out.println("Employee Salary: "+salary);
		System.out.println("---------------------------");
	*/
		System.out.printf("\n%-15s %-15s %10d",ename,desg,salary);
	}
}

class ArrayListDemo1{
	public static void main(String args[]) throws IOException{
		
		ArrayList<Employee> al = new ArrayList<>(); 
		int choice=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("\n\t-: Menu :-");
			System.out.println("--------------------------------");
			System.out.println("1 Insert New Employee Data");
			System.out.println("2 View All Employee Data");
			System.out.println("0 Exit");	
			System.out.println("---------------------------------\n");
			
			System.out.print("Enter your choice: ");			
			choice = Integer.parseInt(br.readLine());
			
			switch(choice){
				case 1:
					Employee e = new Employee();
					e.enterEmployeeDetails();
					al.add(e);
					break;				
				case 2:
					System.out.printf("\nEmployeeName \tDesignation\t    Salary");
					System.out.println("\n------------------------------------------------------------");
					Iterator<Employee> itr = al.iterator();
					while(itr.hasNext()){
						itr.next().displayEmployeeData();			
					} 
					System.out.println("\n------------------------------------------------------------");
					break;
				case 0:
					System.out.println("Have a nice day!");
					break;
							
			}
			
		}while(choice!=0);
	
	}
}

/*Output
----------------------------------------------------------

	-: Menu :-
--------------------------------
1 Insert New Employee Data
2 View All Employee Data
0 Exit
---------------------------------

Enter your choice: 1
Enter Employee Name: Gautam
Enter Employee desg: Trainee
Enter Employee Salary: 10000

	-: Menu :-
--------------------------------
1 Insert New Employee Data
2 View All Employee Data
0 Exit
---------------------------------

Enter your choice: 1
Enter Employee Name: Lalit
Enter Employee desg: Paroject Leader
Enter Employee Salary: 30000

	-: Menu :-
--------------------------------
1 Insert New Employee Data
2 View All Employee Data
0 Exit
---------------------------------

Enter your choice: 2

EmployeeName 	Designation	    Salary
------------------------------------------------------------

Gautam          Trainee              10000
Lalit           Paroject Leader      30000
------------------------------------------------------------

	-: Menu :-
--------------------------------
1 Insert New Employee Data
2 View All Employee Data
0 Exit
---------------------------------

Enter your choice: 0
Have a nice day!

*/
