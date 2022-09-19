package SepForteen;

public class Driver {
	public static void main(String[] args) {
		Object[] objArr = {new HatMaker(),
							new HatMaker(),
							new VeeMaker(),
							new ParallelMaker(),
							new FaceMaker()};		
		
		new Driver(objArr);
	}
	public Driver(Object[] figures){
		final String SPACE = " ";
		for(Object o : figures){
			System.out.print(((Figure) o).getFigure()+SPACE);
		}
	}

}
