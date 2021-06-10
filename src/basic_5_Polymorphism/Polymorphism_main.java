package basic_5_Polymorphism;

class Animal{
	public void move() {
		System.out.println("동물이 움직인다.");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 움직인다.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 움직인다.");
	}
}

public class Polymorphism_main {
	public static void main(String[] args) {
		moveAnimal(new Animal());
		moveAnimal(new Human());
		moveAnimal(new Tiger());
		/*
		 ------------------------
		 Console
		 ------------------------
		 동물이 움직인다.
		 사람이 움직인다.
		 호랑이가 움직인다.
         ------------------------
		*/
	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
}
