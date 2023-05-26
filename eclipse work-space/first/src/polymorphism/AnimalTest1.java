package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void human() {
		System.out.println("human()");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void tiger() {
		System.out.println("tiger()");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void eagle() {
		System.out.println("eagle()");
	}
}

class Tree {
	
}

public class AnimalTest1{
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		aTest.moveAnimal(new Tree());
		// ArrayList<Animal>롤 객체를 저장해서 사용하기
		ArrayList<Animal> arrAnimal = new ArrayList<Animal>();
		arrAnimal.add(new Human());
		arrAnimal.add(new Tiger());
		arrAnimal.add(new Eagle());
		for(Animal a : arrAnimal) {
			a.move();
		}
		
		Animal[] ani = new Animal[3];		// Animal[] 배열로 객체 저장해서 사용하기
		for(int i=0; i<arrAnimal.size(); i++) {
			arrAnimal.get(i).move();
			ani[i] = arrAnimal.get(i);
		}
		for(int i=0; i<ani.length; i++) {
			ani[i].move();
		}
		for(Animal a : ani) {
			a.move();
		}
	}
	
	public void moveAnimal(Object animal) {
		if(animal instanceof Animal) {
			Animal a = (Animal)animal;
			a.move();
			if(a instanceof Human) {
				((Human)a).human();
			}else if (a instanceof Tiger) {
				((Tiger)a).tiger();
			}else if (a instanceof Eagle) {
				((Eagle)a).eagle();
			}
		}
	}
}