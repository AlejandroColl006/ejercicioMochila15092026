package ClaseMochila;

public class Mochila {

        private int capacidadMaxima ;
        private int pesoActual;

        public Mochila() {
            pesoActual = 0;
            capacidadMaxima = 5000;
        }

        public Mochila(int capacidadMaxima) {
            this.capacidadMaxima = capacidadMaxima;
            pesoActual = capacidadMaxima / 2;
        }
        public Mochila(int capacidadMaxima, int pesoActual) {
            this.capacidadMaxima = capacidadMaxima;
            if (pesoActual > capacidadMaxima) {
                this.pesoActual = capacidadMaxima;
            } else if (pesoActual < 0) {
                this.pesoActual = 0;
            } else {
                this.pesoActual = pesoActual;
            }
        }

        public void llenarMochila(){
            pesoActual = capacidadMaxima;
        }
        public void sacarObjeto(int peso){
            if (peso >= pesoActual) {
                pesoActual = 0;
            } else {
                pesoActual -= peso;
            }
        }

        public void vaciarMochila(){
            pesoActual = 0;
        }
        public void meterObjeto(int peso){
            if (pesoActual + peso > capacidadMaxima) {
                pesoActual = capacidadMaxima;
            } else {
                pesoActual += peso;
            }
        }

        public int getPesoActual() {
            return pesoActual;
        }
        public int getCapacidadMaxima() {
            return capacidadMaxima;
        }

    public static void main() {

    }
}
