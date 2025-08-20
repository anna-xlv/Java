import java.util.Scanner;
public class ObjetoPaciente {

    static class Paciente{
        String nome;
        String endereco;
        String cpf;
        char sexo;
        String nivelDeEscolaridade;
        String email;
        String dataDeNascimento;
        String telefone;


        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getEndereco() {
            return endereco;
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        public String getCpf() {
            return cpf;
        }
        public void setcpf(String cpf) {
            this.cpf = cpf;
        }
        public char getSexo() {
            return sexo;
        }
        public void setSexo(char sexo) {
            this.sexo = sexo;
        }
        public String getNivelDeEscolaridade() {
            return nivelDeEscolaridade;
        }
        public void setNivelDeEscolaridade(String nivelDeEscolaridade) {
            this.nivelDeEscolaridade = nivelDeEscolaridade;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getDataDeNascimento() {
            return dataDeNascimento;
        }
        public void setDataDeNascimento(String dataDeNascimento) {
            this.dataDeNascimento = dataDeNascimento;
        }
        public String getTelefone() {
            return telefone;
        }
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paciente paci = new Paciente();

        System.out.println("Quantidade de fichas: ");
        int ficha = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < ficha; i++ ) {


            System.out.println("\nNome do paciente: ");
            paci.setNome(sc.nextLine());
            System.out.println("Gênero do paciente (F = Feminino M = Masculino O = Outros): " );
            paci.setSexo(sc.next().charAt(0));
            System.out.println("Data de nascimento do paciente: ");
            paci.setDataDeNascimento(sc.next());
            System.out.println("CPF do paciente:");
            paci.setcpf(sc.nextLine());
            sc.nextLine();
            System.out.println("Nível de escolaridade do paciente: ");
            paci.setNivelDeEscolaridade(sc.nextLine());
            sc.nextLine();
            System.out.println("Email para contato: ");
            paci.setEmail(sc.nextLine());
            System.out.println("Telefone para contato: ");
            paci.setTelefone(sc.nextLine());
            System.out.println("Endereço do paciente: ");
            paci.setEndereco(sc.nextLine());
            sc.nextLine();



            System.out.println("\n\n~~~~~~FICHA~~~~~~");
            System.out.println("Nome: "+paci.getNome());
            System.out.println("Gênero: "+paci.getSexo());
            System.out.println("Data de nascimento: "+paci.getDataDeNascimento());
            System.out.println("CPF: "+paci.getCpf());
            System.out.println("Nível de escolaridade: "+paci.getNivelDeEscolaridade());
            System.out.println("Email: "+paci.getEmail());
            System.out.println("Telefone: "+paci.getTelefone());
            System.out.println("Endereço: "+paci.getEndereco());


        }

    }
}
