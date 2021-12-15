public abstract class Componente {
    private float precio;

    public abstract float calcularPrecio();

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
