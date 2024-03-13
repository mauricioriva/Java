import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class ClaseArrayList{
	
	public static void main(String[] args) {
		
		// ArrayList<String> coleccion = new ArrayList<String>();
		LinkedList<String> coleccion = new LinkedList<String>();

		coleccion.add("hola");
		coleccion.add("como estas?");

		System.out.println(coleccion);

		coleccion.set(0,"adios");

		System.out.println(coleccion);

		coleccion.remove(0);

		System.out.println(coleccion);

		String elementoCero = coleccion.get(0);

		System.out.println(elementoCero);

/*		
		NO se puede:
		List<String> coleccion2 = new LinkedList<String>();
		ArrayList<String> coleccion3 = (ArrayList<String>)coleccion2;
*/		
		List<String> coleccion2 = new LinkedList<String>();
		ArrayList<String> coleccion3 = new ArrayList<String>(coleccion2);
		

	}

}