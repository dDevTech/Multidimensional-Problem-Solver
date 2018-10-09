
public class Plano {
	private float a;
	private float b;
	private float c;
	private float d;
	static float precision;
	public Plano(float a,float b,float c,float d) {
		precision= (1/Constants.aproximation);
		a=(float)Math.round(a * precision) / precision;
		b=(float)Math.round(b * precision) / precision;
		c=(float)Math.round(c * precision) / precision;
		d=(float)Math.round(d * precision) / precision;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	
	}
	public static float getDParameter(float a,float b,float c,Point3D p) {
		float d = -(a*p.getX()+b*p.getY()+c*p.getZ());
		
		d=(float)Math.round(d * precision) / precision;
		return d;
		
	}
	public float getA() {
		return a;
	}
	public float getB() {
		return b;
	}
	public float getC() {
		return c;
	}
	public float getD() {
		return d;
	}
	public void setA(float a) {
		this.a = a;
	}
	public void setB(float b) {
		this.b = b;
	}
	public void setC(float c) {
		this.c = c;
	}
	public void setD(float d) {
		this.d = d;
	}
	
}
