import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		long initialTime=System.currentTimeMillis();
		System.out.println("------------Starting------------");
		System.out.println("Detecting precision: "+Constants.aproximation);
		Dibujo d = new Dibujo();
		
		double time =(double) ((System.currentTimeMillis()-initialTime)/1000f);
		System.out.println("------------Finished------------");
		System.out.println("Total solutions: "+d.getContador());
		System.out.println("Tiempo total: "+time+" s");
	}

}
