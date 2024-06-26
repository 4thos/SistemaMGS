import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Alice", "Nuts", "None", "123-456-7890", "alice@example.com");
        Pessoa pessoa2 = new Pessoa("Bob", "Pollen", "Asthma", "987-654-3210", "bob@example.com");
        Pessoa pessoa3 = new Pessoa("Carol", "Dairy", "High blood pressure", "555-123-4567", "carol@example.com");
        Pessoa pessoa4 = new Pessoa("David", "Shellfish", "Diabetes", "111-222-3333", "david@example.com");
        Pessoa pessoa5 = new Pessoa("Eve", "Peanuts", "None", "999-888-7777", "eve@example.com");
        Pessoa pessoa6 = new Pessoa("Frank", "None", "Heart condition", "444-555-6666", "frank@example.com");
        Pessoa pessoa7 = new Pessoa("Grace", "None", "None", "777-888-9999", "grace@example.com");
        Pessoa pessoa8 = new Pessoa("Henry", "None", "Asthma", "222-333-4444", "henry@example.com");
        Pessoa pessoa9 = new Pessoa("Ivy", "None", "None", "666-555-4444", "ivy@example.com");
        Pessoa pessoa10 = new Pessoa("Jack", "None", "None", "123-456-7890", "jack@example.com");

        List<Pessoa> listaPessoa = new ArrayList<>();
        listaPessoa.add(pessoa1);
        listaPessoa.add(pessoa2);
        listaPessoa.add(pessoa3);
        listaPessoa.add(pessoa4);
        listaPessoa.add(pessoa5);
        listaPessoa.add(pessoa6);
        listaPessoa.add(pessoa7);
        listaPessoa.add(pessoa8);
        listaPessoa.add(pessoa9);
        listaPessoa.add(pessoa10);



        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        System.out.println("Digite o seu nome: ");
        pessoa.setNome(sc.nextLine());

        boolean temDadosNaLista = false;
        for(var item : listaPessoa){
            if(item.getNome().equals(pessoa.getNome())){
                System.out.println("-----------------------------------------------------");
                System.out.println("\nDados informados:");
                System.out.println("Nome:" + item.getNome());
                System.out.println("Alergia:" + item.getAlergia());
                System.out.println("Problemas Medicos:" + item.getProblemasMedicos());
                System.out.println("Telefone:" + item.getTelefone());
                System.out.println("E-mail:" + item.getEmail());

                temDadosNaLista = true;

            }
        }

        if (temDadosNaLista == false) {
            System.out.println("-----------------------------------------------------");
            System.out.println("\nO nome: " + pessoa.getNome() +" não consta na lista!");

        }


        /*System.out.println("Qual a sua alergia: ");
        pessoa.setAlergia(sc.nextLine());

        System.out.println("Problemas Medicos: ");
        pessoa.setProblemasMedicos(sc.nextLine());

        System.out.println("Telefone: (99) 99999-9999");
        pessoa.setTelefone(sc.nextLine());

        System.out.println("Qual é o seu email:");
        pessoa.setEmail(sc.nextLine());*/

/*

        System.out.println("-----------------------------------------------------");
        System.out.println("\nDados informados:");
        System.out.println("Nome:" + pessoa.getNome());
        System.out.println("Alergia:" + pessoa.getAlergia());
        System.out.println("Problemas Medicos:" + pessoa.getProblemasMedicos());
        System.out.println("Telefone:" + pessoa.getTelefone());
        System.out.println("E-mail:" + pessoa.getEmail());*/


    }
}