abstract class Anima {
	Anima(int vita) {
	}
}

class PersonaA extends Anima {
	PersonaA() {
		super(90);
	}

}

public class CostruttoreClaseAstratta {
	public static void main(String[] args) {
		Anima ma = new Anima(4000000);// questo � sbagliato
		// ma se chiamo
		PersonaA pa = new PersonaA(); // questo chiamer� il costruttore sopra
	}
}
