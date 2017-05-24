package Modelo;

public class prueba {
	public static void main(String[] args) {
		Articulo articulo = new Articulo("1", "Peine", 20f, "Peine para calvos");
		Articulo segundo = new Articulo("2", "Coca Cola Zero", 50f, "Agua");
		Articulo articulo2 = new Articulo("1", "Peine2", 202f, "Peine para2 calvos");
		articulo.setId("1");
		segundo.setId("2");
		articulo2.setId("1");
		System.out.println(articulo.equals(segundo));
		System.out.println(articulo.equals(articulo2));
		Cliente cliente= new Cliente("2", "Pedro", "Merida");
		Cliente cliente2= new Cliente("4", "Pedroas", "Merifa2da");
		System.out.println(cliente.equals(cliente2));
	}
}
