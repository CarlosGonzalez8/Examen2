public class Main {
    public static void main(String[] args) {
        ComprasParqueAcuatico parque = new ComprasParqueAcuatico(50.0);

        double total1 = parque.calcularTotalCompra();
        System.out.println("Compra 1:");
        System.out.println("Total a pagar: $" + total1);
        System.out.println();

        double total2 = parque.calcularTotalCompra(20.0, "Hamburguesa");
        System.out.println("Compra 2:");
        System.out.println("Total a pagar: $" + total2);
        System.out.println();

        double total3 = parque.calcularTotalCompra(20.0, "Pizza", "VIP", 50.0);
        System.out.println("Compra 3:");
        System.out.println("Total a pagar: $" + total3);
        System.out.println();

        double total4 = parque.calcularTotalCompra(20.0, "Hot dog", "Balcón", 20.0, "Sencilla", 50.0);
        System.out.println("Compra 4:");
        System.out.println("Total a pagar: $" + total4);
    }
}
