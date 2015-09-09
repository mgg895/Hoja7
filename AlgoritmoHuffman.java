import java.util.Arrays;
import java.util.Scanner;

public class AlgoritmoHuffman {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        String mensaje;
        char [] ArrayCadena;
        String [] codigos;
                
        System.out.print("Ingrese el mensaje:");
        mensaje= teclado.nextLine();
        ArrayCadena=mensaje.toCharArray();
        
        int [] ArrayFrecuencia ;
        BinaryTree [] ArrayArboles;
        
        ArrayFrecuencia = new int[ArrayCadena.length];
        ArrayArboles = new BinaryTree[ArrayCadena.length];
        codigos = new String[ArrayCadena.length];

          for(int i=0;i< ArrayCadena.length;i++){
              char c = ArrayCadena[i];
              int e = 1;
              for(int j=i+1;j< ArrayCadena.length;j++){
                  if (ArrayCadena[j]==c){
                      e++;
                      ArrayCadena[j]=' ';
                  }
              }
              ArrayArboles[i]=new BinaryTree(c,e,null);
              ArrayFrecuencia[i]=e;
          }
        
        Arrays.sort(ArrayArboles);
        
        int codigo =0;
        for(int i=ArrayCadena.length-1;i>0;i--){
            codigos[i]= Integer.toBinaryString(codigo++);
        }
        
        System.out.println(Arrays.toString(ArrayArboles));
        System.out.println(Arrays.toString(codigos));
    }
}

