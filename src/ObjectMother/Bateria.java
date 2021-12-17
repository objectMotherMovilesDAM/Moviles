package ObjectMother;

public class Bateria extends Componente{

    private int capacidad;

    public Bateria(int capacidad) {
        this.capacidad = capacidad;
        this.setPrecio(this.calcularPrecio());
    }

    @Override
    public float calcularPrecio() {
    	
        return 0;
    }
}
