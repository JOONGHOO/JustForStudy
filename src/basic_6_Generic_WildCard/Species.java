package basic_6_Generic_WildCard;

public class Species<T> {
	private String name;
	private T[] species;

	public Species(String name, int num) {
		this.name = name;
		species = (T[]) (new Object[num]);
	}

	public String getName() {
		return name;
	}

	public T[] getSpecies() {
		return species;
	}

	public void add(T t) {
		for (int i = 0; i < species.length; i++) {
			if (species[i] == null) {
				species[i] = t;
				break;
			}
		}
	}
}

//1.       동물
//2.  유인원
//3.  사람     사자
class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}

class Simian extends Animal {
	public Simian(String name) {
		super(name);
	}
}

class Human extends Simian {
	public Human(String name) {
		super(name);
	}
}

class Lion extends Animal {
	public Lion(String name) {
		super(name);
	}
}