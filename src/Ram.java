public class Ram extends Componente{

    private int memoria;

    public Ram(int memoria) {
        this.memoria = memoria;
        this.setPrecio(calcularPrecio());
    }

    @Override
    public float calcularPrecio() {
        return 0;
    }
}
