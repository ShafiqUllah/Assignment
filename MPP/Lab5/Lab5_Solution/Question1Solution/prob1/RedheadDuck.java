package lab5.prob1;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		super();
		// TODO Auto-generated constructor stub
		setFlyBehavior(new FlyWithWings());
		setQuickBehavior(new Quack());
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
