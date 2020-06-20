import java.lang.*;

public class HelloThere {
	
	public static void main(String[] args){
		int kg=100;
		KgToLbsConverter x= new KgToLbsConverter();
		double lbs = x.convert(kg);
		
		System.out.println(kg+" Kgs is "+lbs+" pounds");
	}

}



