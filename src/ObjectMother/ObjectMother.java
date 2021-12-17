package ObjectMother;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectMother {
    private final int MAX_NUCLEOS = 12;
    Random random = new Random();

    private String[] marcas = {"PocoPhone", "Xiaomi", "Apple", "Huawei", "Samsung", "Oppo", "Pixel", "Nokia", "Realme", "Sony", "LG", "Honor", "OnePlus", "Motorola", "HTC", "ZTE", "Asus"};
    private String[] modelos = {"Note", "Edge", "Moto", "Pro", "MX", "Solar", "Mate", "Lite", "Versa", "GT", "GTR", "X", "BW", "Neo", "TWS", "Mi", "Red Magic", "Nord", "Reno", "Master", "Find"};


    public ArrayList<Movil> generarMoviles(int cantidad){
        ArrayList<Movil> moviles = new ArrayList<Movil>();
        for (int i = 0; i < cantidad; i++) {

        }
        return moviles;
    }


    private int calcularMinimaRam(Procesador procesador) {
        int medioGB = 512;
        return procesador.getNucleos() * medioGB + random.nextInt(8)*medioGB;
    }

    private Procesador calcularProcesador() {
        int nucleos = getNucleosRandom();
        int frecuencia = calcularFrecuencia(nucleos);
        Procesador procesador = new Procesador(nucleos,frecuencia,RandomNombre.crearPalabra(6));
        return procesador;
    }

    private int getNucleosRandom(){
        return random.nextInt(MAX_NUCLEOS);
    }

    private int calcularFrecuencia(int nucleos){
        if(nucleos<=4) {
            return nucleos*450;
        }else if(nucleos<=8){
            return nucleos*250;
        }else{
            return nucleos*180;
        }
    }
}
