package entidades;

//nombre
public class Persona {

    //Atributos
    private String DNI;                 //17.815.251-3
    private String nombre;              //Domingo Saavedra
    private int efectivo;               //1000
    private boolean tieneSueno;         //false
    private boolean tienaHambre;        //true

    public Persona(String DNI, String nombre, int efectivo, boolean tieneSueno, boolean tienaHambre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.efectivo = efectivo;
        this.tieneSueno = tieneSueno;
        this.tienaHambre = tienaHambre;
    }

    public Persona() {
    }

    //Métodos
    public void comprar(Producto producto){
            if(producto.getStock() ==0){
                System.out.println("producto sin stock");
            }else{
                if(producto.getPrecio() <=efectivo){
                    System.out.println("voy a comprar 1: "+ producto.getNombre());
                    efectivo = efectivo - producto.getPrecio();
                    producto.disminuirStock(1);
                    System.out.println("ahora me queda de saldo: $"+efectivo);
                }
            }
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }

    public boolean isTieneSueno() {
        return tieneSueno;
    }

    public void setTieneSueno(boolean tieneSueno) {
        this.tieneSueno = tieneSueno;
    }

    public boolean isTienaHambre() {
        return tienaHambre;
    }

    public void setTienaHambre(boolean tienaHambre) {
        this.tienaHambre = tienaHambre;
    }
}
