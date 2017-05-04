class Studente{
	//int media(){return 30;}
	// voglio vietrare overriding:
	final int media(){return 30;}
}
// non posso perch� il metodo media � final
class StudenteLM extends Studente{
	int media(){return 37;}	
}

// non posso perch� string � final
class MyString extends String{}

final class K{}
// non posso perch� la classe K � final
class H extends K{}

public class FinalMetodi {
	public static void main(String[] args) {
		Studente s = new StudenteLM();
		System.out.println(s.media());
	}
}
