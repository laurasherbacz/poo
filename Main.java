package ex1Lista2;

public class Main {
    public static void main(String[] args) {
        Sala sala1 = new Sala("Sala 1 ", 30);
        Sala sala2 = new Sala("Sala 2", 40);
        Reserva reserva1 = new Reserva(sala1);
        Reserva reserva2 = new Reserva("23/07/2025", "Laura", sala2);

        reserva2.setAlterarsocilicitante("Manuela");
        reserva1.gerarResumo();
        reserva2.gerarResumo();
    }

}
