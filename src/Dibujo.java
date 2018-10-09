import java.util.ArrayList;

public class Dibujo {

	ArrayList<Conjunto> conjuntos = new ArrayList<>();

	float precision = Constants.incrementPointsSphere;
	int contador = 0;
	String name1 = "e1";
	String name2 = "e2";
	String name3 = "e3";
	String name4 = "e4";

	public Dibujo() {

		initializer();
	}

	public void initializer() {
		for (float j = Constants.minRadio; j < Constants.maxRadio; j += Constants.radioIncrement) {
			System.out.println("With radio: " + j);
			conjuntos.clear();
			conjuntos.add(new Conjunto(j, 1, 3, 2, precision, name1));
			conjuntos.add(new Conjunto(j, 2, 5, 4, precision, name2));
			conjuntos.add(new Conjunto(j, -3, -2, -4, precision, name3));
			conjuntos.add(new Conjunto(j, 0, 0, 0, precision, name4));
			for (int i = 0; i < conjuntos.size(); i++) {
				getTangentPlanesOfSphere(conjuntos.get(i), i);
			}
		}
	}

	public void getTangentPlanesOfSphere(Conjunto c, int pos) {

		for (int i = 0; i < c.getPoints().size(); i++) {
			Plano p = Sphere.getPlanoTangenteAEsfera(c.getS(), c.getPoints().get(i));

			c.getS();
			Point3D p1 = Sphere.isPlanoTangenteAEsfera(conjuntos.get(0).getS(), p);
			Point3D p2 = Sphere.isPlanoTangenteAEsfera(conjuntos.get(1).getS(), p);
			Point3D p3 = Sphere.isPlanoTangenteAEsfera(conjuntos.get(2).getS(), p);
			Point3D p4 = Sphere.isPlanoTangenteAEsfera(conjuntos.get(3).getS(), p);
			if (p4 != null && p3 != null && p2 != null && p1 != null) {
				System.out.println("---------------Encontrado un plano----------------");
				System.out.println("----> Plano: A " + p.getA() + " B " + p.getB() + " C " + p.getC() + " D " + p.getD()
						+ " <-----" + " Ax+By+Cz+D=0");
				System.out.print("Tangente a " + name1 + " en: ");
				Point3D.printPoint(p1);
				System.out.print("Tangente a " + name2 + "  en: ");
				Point3D.printPoint(p2);
				System.out.print("Tangente a " + name3 + " en: ");
				Point3D.printPoint(p3);
				System.out.print("Tangente a " + name4 + " en: ");
				Point3D.printPoint(p4);
				contador++;
			}

		}
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}
