import java.util.Scanner;

public class Trougao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Temena trougla
        System.out.println("Unesite temena koordinata trougla: ");
        System.out.print("- Koordinate temena A su: ");
        double xA = scanner.nextDouble();
        double yA = scanner.nextDouble();
        System.out.print("- Koordinate temena B su: ");
        double xB = scanner.nextDouble();
        double yB = scanner.nextDouble();
        System.out.print("- Koordinate temena C su: ");
        double xC = scanner.nextDouble();
        double yC = scanner.nextDouble();
        // Izracunavanje stranica trougla
        double a = Math.sqrt(Math.pow(xB - xC,2) + Math.pow(yB - yC, 2));
        double b = Math.sqrt(Math.pow(xC - xA,2) + Math.pow(yC - yA,2));
        double c = Math.sqrt(Math.pow(xA - xB,2) + Math.pow(yA - yB,2));
        // Izracunavanje vrednosti s- poluobima
        double s = (a + b + c) / 2;
        // Izracunavanje povrsine trougla
        double P = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Povrsina trougla iznosi: " + P);
    }
}
