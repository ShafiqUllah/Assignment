package SepSix;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dataSource = Data.records;
		String[] dataArray = dataSource.split(":");
		
		for(int i = 0 ; i< dataArray.length ; i++) {
			//System.out.println(dataArray[i]);
			String[] eachDataElement = dataArray[i].split(",");
			System.out.println(eachDataElement[0]);
		}
 
	}

}
