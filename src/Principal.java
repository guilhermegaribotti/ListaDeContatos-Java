import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Contato> contatos = new ArrayList();

        Contato contato = new Contato("Gui","gui@gmail.com","12345");
        Contato contato1 = new Contato("Iris","gui@gmail.com","12345");
        Contato contato2 = new Contato("Dudu","gui@gmail.com","12345");

        contatos.add(contato);
        contatos.add(contato1);
        contatos.add(contato2);


        for(Contato c: contatos) {
            System.out.println(c);

        }

        System.out.println("A lista tem "+ contatos.size() + " contatos.");
    }
}
