package basic_4_Generic_WildCard;

import java.util.Arrays;

public class MainClass {

	//와일드카드 사용법
	//1. 제네릭타입<?> : 모든 클래스/인터페이스 타입이 올 수 있다.
	//2. 제네릭타입<? extend 상위타입> : 타입 파라미터와 대치하는 상위 타입과 하위 타입이 올 수 있다.
	//3. 제네릭타입<? super 하위타입> : 타입 파라미터와 대치하는 하위타입과 상위타입이 올 수 있다.
	
	//1번조건에 따라 모든 제네릭 타입의 값을 받을 수 있다.
	public static void defineSpecies(Species<?> species) {
		System.out.println(species.getName() + " " + Arrays.toString(species.getSpecies()));
	}
	
	//2번조건에 따라 자신과 자신의 자식 클래스의 제네릭 타입값만 입력받아 컴파일 가능
	public static void defineSpeciesSimian(Species<? extends Simian> species) {
		System.out.println(species.getName() + " " + Arrays.toString(species.getSpecies()));
	}
	
	//3번조건에 따라 자신과 자신의 상속한 상위의 클래스의 제네릭 타입 값만 입력받아 컴파일
	public static void defineSpeciesLion(Species<? super Lion> species) {
		System.out.println(species.getName() + " " + Arrays.toString(species.getSpecies()));
	}
	
	public static void main(String[] args) {
		Species<Animal> animal = new Species<Animal>("종족 : ", 4);
		animal.add(new Animal("동물"));
		animal.add(new Simian("유인원"));
		animal.add(new Human("사람"));
		animal.add(new Lion("사자"));
		
		Species<Simian> simian = new Species<Simian>("종족 : ", 4);
		simian.add(new Simian("유인원"));
		simian.add(new Human("사람"));
		
		Species<Human> human = new Species<Human>("종족 : ", 4);
		human.add(new Human("사람"));
		
		Species<Lion> lion = new Species<Lion>("종족 : ", 4);
		lion.add(new Lion("사자"));
		
		defineSpecies(animal);
		defineSpecies(simian);
		defineSpecies(human);
		defineSpecies(lion);
		System.out.println();
		
		//defineSpeciesSimian(animal); //상위 클래스는 컴파일 오류
		defineSpeciesSimian(simian); //자신은 정상출력
		defineSpeciesSimian(human); //상속받은 클래스는 정상출력
		//defineSpeciesSimian(lion); //상속받지 않은 클래스는 컴파일 오류
		System.out.println();
		
		defineSpeciesLion(animal); //상속받은 상위클래스 정상출력
		//defineSpeciesLion(simian); //관련없는 클래스 컴파일 오류
		//defineSpeciesLion(human); //관련없는 클래스 컴파일 오류
		defineSpeciesLion(lion); //자신은 정상출력
		System.out.println();
	} 

}
