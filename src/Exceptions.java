import java.util.ArrayList;
import java.util.Collections;
public class Exceptions {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<Object> lista = new ArrayList<Object>();
		Collections.addAll(lista, "13","Hola Mundo",48,"Adios Mundo");
		System.out.println(lista);
		for(int i = 0; i < lista.size(); i++) {
			try {
				Integer castedValue = (Integer) lista.get(i);
				System.out.println("Casteo Exitoso\n");
			} catch (Exception e) {
				
				System.out.println("Imposible de convertir: "+lista.get(i));
				System.out.println("Error: \n"+e.toString());
			}
		    
		}
	}
}
