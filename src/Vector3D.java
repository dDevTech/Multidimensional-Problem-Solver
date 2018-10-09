import java.util.ArrayList;

public class Vector3D {
	private float x;
	private float y;
	private float z;

	public Vector3D(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;

	}

	public Vector3D(Point3D pInicial, Point3D pFinal) {
		x = pFinal.getX() - pInicial.getX();
		y = pFinal.getY() - pInicial.getY();
		z = pFinal.getZ() - pInicial.getZ();
	}

	public float getModulo() {
		float r = (float) Math.sqrt(x * x + y * y + z * z);
		return r;

	}

	public static void printVector(Vector3D v) {
		System.out.println(v.getX() + " , " + v.getY() + " , " + v.getZ());

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

}
