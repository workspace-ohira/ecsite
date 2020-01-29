
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="090-1234-5678";
		taro.address="五反田1-2-3";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person ziro = new Person();
		ziro.name="木村次郎";
		ziro.age=18;
		ziro.phoneNumber="080-1234-5678";
		ziro.address="戸越1-2-3";

		System.out.println(ziro.name);
		System.out.println(ziro.age);
		System.out.println(ziro.phoneNumber);
		System.out.println(ziro.address);

		Person hanako = new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="070-1234-5678";
		hanako.address="中延1-2-3";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		Robot aibo = new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name="pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();
	}

}
