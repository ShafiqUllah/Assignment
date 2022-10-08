package lab5.prob1;

public class MallarDuck extends Duck {
	

	public MallarDuck() {
		super();
		// TODO Auto-generated constructor stub
		setQuickBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\tdisplay");
	}

}
