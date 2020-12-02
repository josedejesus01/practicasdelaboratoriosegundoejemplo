

package dados;

// tipod de dato abstracto
public class dados {// se crea el paquete dados
    private int cantidad_de_lado;// se crea los tipo de atributos a utilizar
    private int ladoactual;

    public dados(int cantidad_de_lado) {// se crea el metodo contructor para inicializar las variables
        this.cantidad_de_lado = cantidad_de_lado;
        
    }
    //descripcion de las operaciones definidas
    // se crean los metodos getter y setter
    public int getCantidad_de_lado() {
        return cantidad_de_lado;
    }

    public void setCantidad_de_lado(int cantidad_de_lado) {
        this.cantidad_de_lado = cantidad_de_lado;
    }

    public int getLadoactual() {
        return ladoactual;
    }

    public void setLadoactual(int ladoactual) {
        this.ladoactual = ladoactual;
    }
    
    
    
 
}
