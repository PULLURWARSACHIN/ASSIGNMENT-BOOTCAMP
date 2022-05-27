class student{
	void exam() {
		System.out.println("he went to exam hall");
	}
}

class boy extends student{
	void boy() {
		System.out.println("he sat at his place");
	}
}

class Inheritance{
	public static void main (String args[]) {
		student obj  = new student();
		boy charan = new boy();
		
		charan.exam();
		charan.boy();
		
	}
	}
	