package lab5.prob1;

public class DecoyDuck extends Duck{
	public DecoyDuck() {
		super();
		// TODO Auto-generated constructor stub
		setFlyBehavior(new CannotFly());
		setQuickBehavior(new MuteQuack());
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\tdisplaying");
		
	}

}
