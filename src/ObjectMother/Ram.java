package ObjectMother;

public class Ram extends Componente{

    private int memoria;

    public Ram(int memoria) {
        this.memoria = memoria;
        this.setPrecio(calcularPrecio());
    }

    @Override
    public float calcularPrecio() {
        return memoria/300;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "memoria=" + memoria +
                '}';
    }

    public int getMemoria() {
        return memoria;
    }
}
