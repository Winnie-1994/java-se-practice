package szu.panda.Interface;

public class TestInterface {
	
	public void test() {
		PetCarer pc = new Worker();
		pc.feed();
	}
	
}

interface PetCarer {
	void feed();
	void playWithPet();
}

class Worker implements PetCarer {
	public void feed() {
		System.out.println("Worker feed ... ");
	}
	public void playWithPet() {
		System.out.println("Worker play with pet ... ");
	}
}

