package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("나옹이", 100);

        AnimalMethod.checkup(dog); // 제네릭 메소드 타입 추론으로 제네릭 생략
        AnimalMethod.checkup(cat);

        Dog targetdog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetdog);
        System.out.println("bigger = " + bigger);
    }
}
