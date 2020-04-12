class Student {
	String index;
	String firstName;
	String lastName;
	int []grades;

	public Student(String index, String firstName, String lastName, int[] grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}

	public String getIndex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public double getAverage() {
		double avg;
		int count;
		for (int i=0;i,grades.length;i++){
			avg+=grades[i];
			count++;
		}
		return avg/count;
	}

	public int ECTSCredits() {
		int passed;
		for (int i =0;i<grades.length;i++){
			if (grades[i]>5){
				passed++;
			}
		}
		return passed*6;
	}
}
