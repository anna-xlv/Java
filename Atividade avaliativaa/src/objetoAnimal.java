import java.util.Scanner;

public class objetoAnimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        animal animall = new animal();

        System.out.println("~~~~~~~~Ficha animal~~~~~~~~");

        System.out.println("\nqual a espécie? ");
        String especie = scan.nextLine();
        animall.setEspecie(especie);
        System.out.println("qual o nome? ");
        String nome = scan.nextLine();
        animall.setNome(nome);
        System.out.println("qual a idade? ");
        int idade = scan.nextInt();
        System.out.println("qual o peso? ");
        double peso = scan.nextDouble();

        animall.setIdade(idade);
        animall.setPeso(peso);

        System.out.println("\n~~~~~~~~Animal "+animall.getNome()+"~~~~~~~~");
        System.out.println(animall.getEspecie());
        System.out.println(animall.getNome());
        System.out.println(animall.getIdade());
        System.out.println(animall.getPeso());
    }
}