import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
public class AlgoritmoHuffman {

    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        String mensaje;
        HashSet<Character> HashCadena = new HashSet<>();
        char [] ArrayCadena;
                
        System.out.print("Ingrese el mensaje:");
        mensaje= teclado.nextLine();
        ArrayCadena=mensaje.toCharArray();
        
        for (int i=0; i < ArrayCadena.length; i++){
		if (ArrayCadena[i] != ' '){
			HashCadena.add(ArrayCadena[i]);
		}
	}
		
	ArrayList<Integer> ArrayFrecuencia = new ArrayList<Integer>();

        for(char a : HashCadena){
		int e = 0;
		for(int j=0;j< ArrayCadena.length;j++){
			if (a == ArrayCadena[j]){
				e++;
			}
		}
		ArrayFrecuencia.add(e);
	}
         
        //Une la frecuencia con el character
	String[] ArrayElementos = new String[HashCadena.size()];
	int val = 0;
	for(char j : HashCadena){
		ArrayElementos[val] = (Integer.toString(ArrayFrecuencia.get(val)) + j);
		val++;
	}
		
	//Ordena el Array de menor a mayor
	Arrays.sort(ArrayElementos);
		
        System.out.println(ArrayFrecuencia);

        BinaryTree arbol1;
        BinaryTree arbol2;
        BinaryTree arbol3;
        arbol1 = new BinaryTree ("sho", 4, null);
        arbol2=arbol1.crearDerecha ("cerote", 8, arbol1);
        arbol3=arbol1.crearIzquierda ("puta", 21, arbol1);
        
    }
    
}
