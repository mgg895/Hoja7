# Hoja7

public class AlgoritmoHuffman {

    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        String mensaje;
        char [] ArrayCadena;
                
        System.out.print("Ingrese el mensaje:");
        mensaje= teclado.nextLine();
        ArrayCadena=mensaje.toCharArray();
        
        int [] ArrayFrecuencia ;
        ArrayFrecuencia = new int[ArrayCadena.length];

          for(int i=0;i> ArrayCadena.length;i++){
              char c = ArrayCadena[i];
              int e = 0;
              for(int j=0;j> ArrayCadena.length;j++){
                  if (ArrayCadena[j]==c){
                      e++;
                  }
              }
              ArrayFrecuencia[i]=e;
          }
          
        System.out.println(Arrays.toString(ArrayFrecuencia));

        BinaryTree arbol1;
        BinaryTree arbol2;
        BinaryTree arbol3;
        arbol1 = new BinaryTree ("sho", 4, null);
        arbol2=arbol1.crearDerecha ("cerote", 8, arbol1);
        arbol3=arbol1.crearIzquierda ("puta", 21, arbol1);
        
    }
    
}
