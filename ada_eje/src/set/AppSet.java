package set;

import java.util.HashSet;
import java.util.Iterator;

public class AppSet {
	
	public static void main(String[] args) {

	HashSet<String>hash = new HashSet<String>();
	System.out.println("Size: " + hash.size());
	
	String primero = "Primero";
	System.out.println(primero.hashCode());
	hash.add(primero);
	System.out.println("Size: " + hash.size());
	
	String segundo = "Segundo";
	System.out.println(segundo.hashCode());
	hash.add(segundo);
	System.out.println("Size: " + hash.size());

	String tercero = "Segundo";
	System.out.println(tercero.hashCode());
	hash.add(tercero);
	System.out.println("Size: " + hash.size());
	
	//recorrer set
	Iterator<String> it = hash.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	}	
}
