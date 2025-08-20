import java.util.Scanner;

public class ObjetoConvenio {

    static class Convenio {
            String nome;
            String plano;
            Double tarifa;

            public String getNome() {
                return nome;
            }
            public void setNome(String nome) {
                this.nome = nome;
            }
            public String getPlano() {
                return plano;
            }
            public void setPlano (String plano) {
                this.plano = plano;
            }
            public Double getTarifa () {
                return tarifa;
            }
            public void setTarifa (Double tarifa) {
                this.tarifa = tarifa;
            }

    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Convenio conv = new Convenio();

        System.out.println("Nome do convênio:");
        conv.setNome(sc.nextLine());
        System.out.println("Nome do plano:");
        conv.setPlano(sc.nextLine());
        System.out.println("Valor do plano:");
        conv.setTarifa(sc.nextDouble());

        sc.nextLine();

        System.out.println("\n~~~~~~FICHA~~~~~~");
        System.out.println("Convênio: "+conv.getNome());
        System.out.println("Plano: "+conv.getPlano());
        System.out.println("Tarifas: "+conv.getTarifa());
    }
}

