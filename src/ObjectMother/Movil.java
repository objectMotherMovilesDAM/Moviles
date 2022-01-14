package ObjectMother;

import java.util.Objects;

public class Movil {
    private String marca;
    private Bateria bateria;
    private Pantalla pantalla;
    private Ram ram;
    private Procesador procesador;
    private long antutu;
    private float precio;

    public Movil(Bateria bateria, Pantalla pantalla, Ram ram, Procesador procesador,String marca) {
        this.bateria = bateria;
        this.pantalla = pantalla;
        this.ram = ram;
        this.procesador = procesador;
        this.precioTotal();
        this.calcularAntutu();
        this.marca = marca;
    }

    public void precioTotal(){
        this.setPrecio(ram.getPrecio()+ procesador.getPrecio()+ bateria.getPrecio()+ pantalla.getPrecio());
    }

    public void calcularAntutu(){
        this.antutu = (long) (procesador.getNucleos()*(procesador.getFrecuencia()+ram.getMemoria())*4);
    }

    @Override
    public String toString() {
        return "Movil{" +
                "marca="+marca+
                ", bateria=" + bateria.toString() +
                ", pantalla=" + pantalla.toString() +
                ", ram=" + ram.toString() +
                ", procesador=" + procesador.toString() +
                ", antutu=" + antutu +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movil)) return false;
        Movil movil = (Movil) o;
        return getMarca().equals(movil.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBateria(), getPantalla(), getRam(), getProcesador(), getAntutu(), getPrecio());
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

    public String getMarca() {
        return marca;
    }
}

