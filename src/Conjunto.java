import java.util.ArrayList;

public class Conjunto {
	private Sphere s;
	private ArrayList<Point3D>points = new ArrayList<>();
	public Conjunto(float radius,float xCenter,float yCenter,float zCenter,float increment,String name) {
		System.out.println("--New sphere: "+name+": CenterPoint (Cx,Cy,Cz): ( "+xCenter+" , "+yCenter+" , "+zCenter+" ) Radius: "+radius+" (x-x0)^2+(y-y0)^2+(z-z0)^2=R^2");
		s= new Sphere(radius, xCenter, yCenter, zCenter);
		points=s.getAllPoints(increment);
	}
	public Sphere getS() {
		return s;
	}
	public ArrayList<Point3D> getPoints() {
		return points;
	}
	public void setS(Sphere s) {
		this.s = s;
	}
	public void setPoints(ArrayList<Point3D> points) {
		this.points = points;
	}
	
	
}
