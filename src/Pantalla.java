public class Pantalla extends Componente{

    private float pulgadas;

    public Pantalla(float pulgadas) {
        this.pulgadas = pulgadas;
        this.setPrecio(this.calcularPrecio());
    }

    @Override
    public float calcularPrecio() {
        return 0;
    }
}
