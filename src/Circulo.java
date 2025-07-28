public class Circulo extends Figura implements Mostrar{
    private Double radio;
    private static final Double PI = 3.14159;

    public Circulo(String color, Double radio){
        super(color);
        this.radio = radio;
    }

    public Double getRadio(){
        return radio;
    }

    public void setColor(String color){
        this.setColor(color);
    }

    @Override
    public Double calcularArea() {
        return PI * (Math.pow(radio, 2));
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("""
                    La figura es un círculo
                    Su radio es: %.2f
                    Color: %s%n
                    Área de la figura: %.2f
                    =======================%n
                """, getRadio(), getColor(), calcularArea());
    }

}
