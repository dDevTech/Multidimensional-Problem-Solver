import java.util.ArrayList;

public class Sphere {
	private float radius;
	private float xCenter;
	private float yCenter;
	private float zCenter;

	public Sphere(float radius, float xCenter, float yCenter, float zCenter) {
		this.radius = radius;
		this.xCenter = xCenter;
		this.yCenter = yCenter;
		this.zCenter = zCenter;

	}

	public Point3D[] getPoint(float x, float y) {
		float x1 = x - xCenter;
		float y1 = y - yCenter;
		float z = (float) (zCenter + Math.sqrt(radius*radius-(x1 * x1) - (y1 * y1)));

		Point3D[] array = { new Point3D(x1, y1, -z), new Point3D(x1, y1, z) };
		return array;
	}

	public ArrayList<Point3D> getAllPoints(float increment) {
		int decimalsRound = (int) (1 / (float) increment);

		ArrayList<Point3D> points = new ArrayList<>();
		for (float x = -radius; x < radius; x += increment) {
			for (float y = -radius; y < radius; y += increment) {

				Point3D[] solutions = getPoint(x, y);
				solutions[0].round(decimalsRound);
				solutions[1].round(decimalsRound);
				points.add(solutions[0]);
				points.add(solutions[1]);
			}
		}
		System.out.println("Total points get: " + points.size());
		return points;
	}
	
	public static Plano getPlanoTangenteAEsfera(Sphere e,Point3D p) {
		Vector3D v= new Vector3D(new Point3D(e.getxCenter(), e.getyCenter(), e.getzCenter()), p);
		float d =Plano.getDParameter(v.getX(), v.getY(), v.getZ(), p);
		return new Plano(v.getX(), v.getY(), v.getZ(), d);
		
	}
	public static Point3D isPlanoTangenteAEsfera(Sphere e,Plano plano) {
		Vector3D normal = new Vector3D(plano.getA(),plano.getB(),plano.getC());
		int precision=(int) (1 / (float) Constants.aproximation);
		float t=(plano.getA()*e.getxCenter()+plano.getB()*e.getyCenter()+plano.getC()*e.getyCenter()+plano.getD())/(plano.getA()+plano.getB()+plano.getD());		
		float x= e.getxCenter()+normal.getX()*t;
		float y= e.getyCenter()+normal.getY()*t;
		float z= e.getzCenter()+normal.getZ()*t;
		float x2=(e.getxCenter()-x);
		float y2=(e.getyCenter()-y);
		float z2=(e.getzCenter()-z);
		float d2=(float) Math.sqrt(x2*x2+y2+y2+z2*z2);
		float d=(float)Math.round(d2 * precision) / precision;
		Point3D point;
		if(d==e.getRadius()) {
			point=new Point3D(x2, y2, z2);
			point.round((int)(1/Constants.aproximation));
			return point;
		}else{
			return null;
		}
		
		
	}

	public float getRadius() {
		return radius;
	}

	public float getxCenter() {
		return xCenter;
	}

	public float getyCenter() {
		return yCenter;
	}

	public float getzCenter() {
		return zCenter;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public void setxCenter(float xCenter) {
		this.xCenter = xCenter;
	}

	public void setyCenter(float yCenter) {
		this.yCenter = yCenter;
	}

	public void setzCenter(float zCenter) {
		this.zCenter = zCenter;
	}
	

}
