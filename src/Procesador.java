public class Procesador extends Componente {
    private int nucleos;
    private float frecuencia;
    private String modelo;

    public Procesador(int nucleos, float frecuencia, String modelo) {
        super();
        this.nucleos = nucleos;
        this.frecuencia = frecuencia;
        this.modelo = modelo;
        this.setPrecio(this.calcularPrecio());
    }

    @Override
    public float calcularPrecio() {
        return 0;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
