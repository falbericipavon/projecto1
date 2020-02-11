package auto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AppMapAuto {
	
	public static void main(String[] args) {
		HashMap<String, Auto> mapa = new HashMap<String, Auto>();
		String pat1 = "A123";
		Auto a1 = new Auto(pat1, "Ford");
		mapa.put(pat1, a1);
		
		String pat2 = "B234";
		Auto a2 = new Auto(pat2, "Renault");
		mapa.put(pat2, a2);
		
		Set<String> claves = mapa.keySet();
		Iterator<String> it = claves.iterator();
		
		while(it.hasNext()) {
			String clave = it.next();
			Auto auto = mapa.get(clave);
			System.out.println("clave: " + clave + " valor: " + auto.getModelo());
		}
	}

}
