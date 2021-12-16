package ObjectMother;

public class Movil {
    private Bateria bateria;
    private Pantalla pantalla;
    private Ram ram;
    private Procesador procesador;
    private long antutu;
    private float precio;

    public Movil(Bateria bateria, Pantalla pantalla, Ram ram, Procesador procesador) {
        this.bateria = bateria;
        this.pantalla = pantalla;
        this.ram = ram;
        this.procesador = procesador;
        this.precioTotal();
    }

    public void precioTotal(){
        this.setPrecio(ram.getPrecio()+ procesador.getPrecio()+ bateria.getPrecio()+ pantalla.getPrecio());
    }

    public void calcularAntutu(){

    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public long getAntutu() {
        return antutu;
    }

    public void setAntutu(long antutu) {
        this.antutu = antutu;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

