import java.util.ArrayList;

public class Point3D {
	private float x;
	private float y;
	private float z;

	public Point3D(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;

	}

	public float getDistance(Point3D p) {
		Vector3D v = new Vector3D(this, p);
		return v.getModulo();
	}

	public void round(int decimals) {
		float precision=decimals*10;
		x=(float)Math.round(x * precision) / precision;
		y=(float)Math.round(y * precision) / precision;
		z=(float)Math.round(z * precision) / precision;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float getZ() {
		return z;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setZ(float z) {
		this.z = z;
	}
	public static void printPoints(ArrayList<Point3D>points) {
		for(Point3D p:points) {
			printPoint(p);
		}
		
	}
	public static void printPoint(Point3D p) {
		System.out.println("( "+p.getX()+" , "+p.getY()+" , "+p.getZ()+" )");
		
	}

}
