public class Rectangulo extends Figura implements Mostrar{
    private Double base;
    private Double altura;

    public Rectangulo(String color, Double base, Double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public void mostrarInfo() {
        System.out.printf("""
                    La figura es un rectángulo
                    Su base es: %.2f
                    Su altura es: %.2f
                    Color: %s%n
                    Área de la figura: %.2f
                    =======================%n
                """, getBase(), getAltura(), getColor(), calcularArea());
    }

    
    
}
