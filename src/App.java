public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo1 =  new Circulo("Azul", 8.0);

        circulo1.calcularArea();
        circulo1.mostrarInfo();

        Rectangulo rectangulo1 = new Rectangulo("Rojo", 5.0, 3.0);

        rectangulo1.calcularArea();
        rectangulo1.mostrarInfo();


    }
}
