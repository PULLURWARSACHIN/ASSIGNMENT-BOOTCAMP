class student{
	void exam() {
		System.out.println("he went to exam hall");
	}
}

class boy {
	void boy() {
		System.out.println("he sat at his place");
	}
}

class girl {
	void girl() {
		System.out.println("he saw a girl");
	}
}

class crush {
	void crushed() {
		System.out.println("he had a crush on her");
	}
}
class Main{
	public static void main (String args[]) {
		student obj  = new student();
		boy charan = new boy();
		girl rt = new girl();
		crush r2 = new crush();
		
		obj.exam();
		charan.boy();
		rt.girl();
		r2.crushed();
		
	}
	}
	