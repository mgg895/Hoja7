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
		
		System.out.println(HashCadena);
		
		int[] ArrayFrecuencia = new int[HashCadena.size()];
		//Se obtiene la frecuencia de cada letra en el arreglo
		int val = 0;
		for(char a : HashCadena){
				int e = 0;
				for(int j=0;j< ArrayCadena.length;j++){
					if (a == ArrayCadena[j]){
						e++;
					}
				}
				ArrayFrecuencia[val] = e;
				val++;
		}
		
		
		
		//Une la frecuencia con el character
		String[] ArrayElementos = new String[HashCadena.size()];
		val = 0;
		for(char j : HashCadena){
			ArrayElementos[val] = (Integer.toString(ArrayFrecuencia[val]) + j);
			val++;
		}
		
		//Ordena el Array de menor a mayor
		
		Arrays.sort(ArrayElementos);
		Arrays.sort(ArrayFrecuencia);

        System.out.println(Arrays.toString(ArrayFrecuencia));
		System.out.println(Arrays.toString(ArrayElementos));

       BinaryTree<String> arbol = new BinaryTree<String> ();
	   
	   for (int i=0;i<HashCadena.size()+1;i++){
		   BinaryTree<String> nuevoArbol = arbol.crearDerecha (ArrayElementos[i], ArrayFrecuencia[i], arbol);
		   //arbol3=arbol1.crearIzquierda ("p", 21, arbol1);
		   System.out.println(nuevoArbol);
	   }
    }
}
