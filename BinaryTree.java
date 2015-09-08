# Hoja7

public class BinaryTree {
    
    protected String valor;
    protected int frecuencia;
    protected BinaryTree padre;
    
    public BinaryTree(String valor, int frecuencia, BinaryTree padre){
        this.valor = valor;
        this.frecuencia = frecuencia;
        this.padre = padre;
    }
    
    public BinaryTree crearDerecha(String valorDerecha, int frecuenciaDerecha, BinaryTree self){
        BinaryTree hijoDerecha;
        hijoDerecha = new BinaryTree(valorDerecha, frecuenciaDerecha, self);
        return hijoDerecha;
    }
    
    public BinaryTree crearIzquierda(String valorIzquierda, int frecuenciaIzquierda, BinaryTree self){
        BinaryTree hijoIzquierda;
        hijoIzquierda = new BinaryTree(valorIzquierda, frecuenciaIzquierda, self);
        return hijoIzquierda;
    }
}
