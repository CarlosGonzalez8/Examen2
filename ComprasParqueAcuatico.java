class ComprasParqueAcuatico {
    private final double precioEntrada;

    public ComprasParqueAcuatico(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public double calcularTotalCompra() {
        return precioEntrada;
    }

    public double calcularTotalCompra(double precioComidaBuffet, String nombrePlatillo) {
        double total = precioEntrada + precioComidaBuffet;
        System.out.println("Servicio: Comida buffet");
        System.out.println("Platillo seleccionado: " + nombrePlatillo);
        return total;
    }

    public double calcularTotalCompra(double precioComidaBuffet, String nombrePlatillo, String seccionEspectaculo, double precioEspectaculo) {
        double total = precioEntrada + precioComidaBuffet + precioEspectaculo;
        System.out.println("Servicio: Comida buffet");
        System.out.println("Platillo seleccionado: " + nombrePlatillo);
        System.out.println("Servicio: Espectáculo nocturno");
        System.out.println("Sección seleccionada: " + seccionEspectaculo);
        return total;
    }

    public double calcularTotalCompra(double precioComidaBuffet, String nombrePlatillo, String seccionEspectaculo, double precioEspectaculo, String tipoInteraccionDelfines, double precioInteraccion) {
        double total = precioEntrada + precioComidaBuffet + precioEspectaculo + precioInteraccion;
        System.out.println("Servicio: Comida buffet");
        System.out.println("Platillo seleccionado: " + nombrePlatillo);
        System.out.println("Servicio: Espectáculo nocturno");
        System.out.println("Sección seleccionada: " + seccionEspectaculo);
        System.out.println("Servicio: Nado con delfines");
        System.out.println("Tipo de interacción: " + tipoInteraccionDelfines);
        return total;
    }
}