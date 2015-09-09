public class BinaryTree implements Comparable<BinaryTree>{
    
    protected char valor;
    protected int frecuencia;
    protected BinaryTree padre;
    
    public BinaryTree(char valor, int frecuencia, BinaryTree padre){
        this.valor = valor;
        this.frecuencia = frecuencia;
        this.padre = padre;
    }
    
    public char getValor(){
        return valor;
    }
    
    public int getFrecuencia(){
        return frecuencia;
    }
    
    @Override
    public int compareTo(BinaryTree other){
        int comparacion;
        if (other.getFrecuencia() >= frecuencia){
            comparacion = 1;
        } else {
            comparacion = 0;
        }
        return comparacion;
    }
    
    public BinaryTree crearDerecha(char valorDerecha, int frecuenciaDerecha, BinaryTree self){
        BinaryTree hijoDerecha;
        hijoDerecha = new BinaryTree(valorDerecha, frecuenciaDerecha, self);
        return hijoDerecha;
    }
    
    public BinaryTree crearIzquierda(char valorIzquierda, int frecuenciaIzquierda, BinaryTree self){
        BinaryTree hijoIzquierda;
        hijoIzquierda = new BinaryTree(valorIzquierda, frecuenciaIzquierda, self);
        return hijoIzquierda;
    }
    
    @Override
    public String toString(){
        String a = "";
        a = a+valor;
        a = a+" ";
        a = a+frecuencia;
        return a;
    }
}
