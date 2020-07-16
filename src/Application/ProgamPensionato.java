package Application;

import Entities.KeyboarInput;
import Entities.Pensionato;

import java.util.Objects;

public class ProgamPensionato {

    public static void main(String[] args) {

        Pensionato[] client = new Pensionato[10];
        String newClient;
        int i = 1;

        do {
            System.out.println("Rent #" + i);
            int room = KeyboarInput.readIntegerType("Room: ") - 1;
            client[room] = new Pensionato(
                    room,
                    KeyboarInput.readAString("Name: "),
                    KeyboarInput.readAString("Email: "));

            newClient = KeyboarInput.readAString("Wish to get a room?(y/n)");

            i++;
        } while (newClient.equals("y"));

        System.out.println("\nBusy rooms:");
        for (Pensionato Pensionato : client) {
            if (Objects.nonNull(Pensionato))
            System.out.println(Pensionato);
        }
    }
}
