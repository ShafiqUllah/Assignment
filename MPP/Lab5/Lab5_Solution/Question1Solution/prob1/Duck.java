package lab5.prob1;

public abstract class Duck {
	public void swim() {
		System.out.println("\tswimming");
	}
	
	public abstract void display();
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quickBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuickBehavior(QuackBehavior quickBehavior) {
		this.quickBehavior = quickBehavior;
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public QuackBehavior getQuickBehavior() {
		return quickBehavior;
	}
	
	public void fly() {
		this.flyBehavior.fly();
	}
	
	public void quack() {
		this.quickBehavior.quack();
	}

}
