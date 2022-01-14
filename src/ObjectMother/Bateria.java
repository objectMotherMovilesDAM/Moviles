package ObjectMother;

public class Bateria extends Componente {

    private int capacidad;

    public Bateria(int capacidad) {
        this.capacidad = capacidad;
        this.setPrecio(this.calcularPrecio());
    }

    @Override
    public float calcularPrecio() {
        return capacidad/100;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "capacidad=" + capacidad +
                '}';
    }
}