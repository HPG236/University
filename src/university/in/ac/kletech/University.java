package university.in.ac.kletech;

public interface University {

	void NoOfBranches();
	void NoOfStudents();
	void FacultySalary();
}
final class Faculty 
{
	String name;
	int EmpID;
	String post;
	 int FacultySalary;
	 static int count=0;
	public Faculty(String name, int empID, String post) {
		count++;
		this.name = name;
		this.EmpID = empID;
		this.post = post;
	}
	
	
}
final class Department
{
	String name;
	int NoOfStudents;
	int NoOfCourses;
	public Department(String name, int noOfStudents, int noOfCourses) {
		super();
		this.name = name;
		NoOfStudents = noOfStudents;
		NoOfCourses = noOfCourses;
	}
	
}

 class college implements University
{
	 int i=0;
	String CollegeCode;
	String CollegeName;
	int NoOfFaculty;
	Faculty[] f=new Faculty[3];
	Department[] d=new Department[2];
	
	public college(String collegeCode, String collegeName)
	{
	
		this.CollegeCode = collegeCode;
		this.CollegeName = collegeName;
		
	}

	

	@Override
	public void NoOfBranches() {

		System.out.println("List of branches which student can select");
		System.out.println("Computer Science");
		System.out.println("Electronics and Communication");
		System.out.println("Mechanical");
		System.out.println("Electrical");
	}

	
	void create(String name, int noOfStudents, int noOfCourses)
	{
		d[i++]=new Department(name, noOfStudents, noOfCourses);
	}
	@Override
	public void NoOfStudents() {
	  int sum=0,i;
	  for(i=0;i<d.length;i++)
	  {
		  sum=sum+d[i].NoOfStudents;
	  }
	  System.out.println("No of students in "+ CollegeName +" are "+ sum);
	}

//overload
	void create()
	{
		f[0]=new Faculty("abc",3,"puen");
		f[1]=new Faculty("xyz",2,"attender");
		f[2]=new Faculty("pqr",1,"professor");
	}
			
	@Override
	public void  FacultySalary() {
	
		int i;
		for(i=0;i<f.length;i++)
		{
			if(f[i].EmpID==1)
			{
				f[i].FacultySalary=500000;
	    	}
			 if(f[i].EmpID==2)
			{
				f[i].FacultySalary=20000;
			}
			else
			{
				f[i].FacultySalary=1000;
			}
			System.out.println("Faculty "+ f[i].name +" is paid Rs." + f[i].FacultySalary + " salary");
		}
		
	}
	void find()
	{
	
		if(Faculty.count>=3)
		{
			System.out.println("college "+ CollegeName+ "has maximum faculty");
			
		}
		else
		{
			System.out.println("college " + CollegeName + "is short of Faculty");
		}
	}
	
}

	
//inheritance is a relationship BVB is a college

class BVB extends college
{

	public BVB(String collegeCode, String collegeName,int NoOfFaculty) {
		super(collegeCode, collegeName);
		this.NoOfFaculty=NoOfFaculty;
	}
	
	

}