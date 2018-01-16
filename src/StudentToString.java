
 class StudentToString 

{
	String sname;
	int rollno;
	
	
	public StudentToString(String sname, int rollno) {
		super();
		this.sname = sname;
		this.rollno = rollno;
	}


	public String toString() {
		return "[sname=" + sname + ", rollno=" + rollno + "]";
	}

}
