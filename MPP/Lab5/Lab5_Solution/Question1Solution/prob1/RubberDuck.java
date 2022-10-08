package lab5.prob1;

public class RubberDuck extends Duck{
	public RubberDuck() {
		super();
		// TODO Auto-generated constructor stub
		setQuickBehavior(new Squeak());
		setFlyBehavior(new CannotFly());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\tdisplaying");
		
	}

//	@Override
//	public void quack() {
//		// TODO Auto-generated method stub
//		QuackBehavior quackBehavior = getQuickBehavior();
//		quackBehavior.quack();
//	}
//
//	@Override
//	public void fly() {
//		// TODO Auto-generated method stub
//		FlyBehavior flyBehavior = getFlyBehavior();
//		flyBehavior.fly();
//	}

}
