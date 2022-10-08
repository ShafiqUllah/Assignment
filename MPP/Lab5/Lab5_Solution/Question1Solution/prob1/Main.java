package lab5.prob1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck[] ducks = {new MallarDuck(),new DecoyDuck(),
				new RedheadDuck(), new RubberDuck()};
		
		for(Duck d:ducks) {
			System.out.println( d.getClass().getSimpleName() + ":" );
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
	}

}
