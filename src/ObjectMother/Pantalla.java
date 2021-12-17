package ObjectMother;

public class Pantalla extends Componente{

    private float pulgadas;

    public Pantalla(float pulgadas) {
        this.pulgadas = pulgadas;
        this.setPrecio(this.calcularPrecio());
    }
    
    @Override
    public float calcularPrecio() {
        return pulgadas*6;
    }

	public float getPulgadas() {
		return pulgadas;
	}

	public float setPulgadas(float pulgadas) {
		return this.pulgadas = pulgadas;
	}
    
}
