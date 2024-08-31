package upf.ccc.front;

import upf.ccc.domain.Veiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConcessionariaOO {

    static List<Veiculo> lista = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("--------------------------- Bem-vindo(a) à Concessionária JOO ---------------------------");

        do {
            System.out.println("C = Cadastrar veículos, L = Listar veículos, A = Alterar disponiblidade, S = Sair do programa. ");
            System.out.print("Opcao: ");

            String sc = new Scanner(System.in).next();
            switch (sc) {
                case "L":
                    menuListagem();
                    break;
                case "C":
                    cadastrarVeiculo();
                    break;
                case "A":
                    alterarDisponibilidade();
                    break;
                case "S":
                    sairDoPrograma();
                    break;
                default:
                    System.out.println("Por favor, digite uma opcao valida.");
                    break;
            }
        } while (true);

    }

    public static void menuListagem() {
        System.out.println("Escolha como deseja listar: G = Geral ou C = Por cor.");
        System.out.print("Opcao: ");

        String sc2 = new Scanner(System.in).next();

        switch (sc2) {
            case "G":
                listarVeiculos();
                break;
            case "C":
                listarPorCor();
                break;
            default:
                System.out.println("Por favor, digite uma opcao valida.\n");
                break;
        }
    }

    public static void cadastrarVeiculo() {
        Veiculo obj = new Veiculo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        obj.nome = scanner.next();

        System.out.print("Marca: ");
        obj.marca = scanner.next();

        System.out.print("Cor: ");
        obj.cor = scanner.next();

        System.out.print("Ano: ");
        obj.ano = scanner.next();

        System.out.print("Placa: ");
        obj.placa = scanner.next();

        System.out.print("Disponivel (True/False): ");
        obj.disponivel = scanner.nextBoolean();

        System.out.println("");

        lista.add(obj);

    }

    public static void listarVeiculos() {
        for (Veiculo obj : lista) {
            System.out.println("Nome: " + obj.nome + " | Marca: " + obj.marca
                    + " | Cor: " + obj.cor + " | Ano: " + obj.ano + " | Placa: " + obj.placa
                    + " | Disponibilidade: " + obj.exibirDisponibilidade());

            System.out.println("");
        }
    }

    public static void listarPorCor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a cor desejada: ");

        String corDesejada = scanner.next();

        boolean encontrou = false;

        for (Veiculo obj : lista) {
            if (obj.cor.equalsIgnoreCase(corDesejada)) {
                System.out.println("Nome: " + obj.nome + " | Marca: " + obj.marca
                        + " | Cor: " + obj.cor + " | Ano: " + obj.ano + " | Placa: " + obj.placa
                        + " | Disponibilidade: " + obj.exibirDisponibilidade());

                encontrou = true;

                System.out.println("");
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum veículo encontrado com a cor especificada.");
            System.out.println("");
        }
    }

    public static void alterarDisponibilidade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a placa do veículo que deseja alterar a disponibilidade: ");
        String placaDesejada = scanner.next();

        boolean encontrou = false;

        for (Veiculo obj : lista) {
            if (obj.placa.equalsIgnoreCase(placaDesejada)) {
                System.out.print("Digite a nova disponibilidade (True/False): ");

                boolean novaDisponibilidade = scanner.nextBoolean();

                obj.alterarDisponibilidade(novaDisponibilidade);

                System.out.println("Disponibilidade do veículo com placa " + placaDesejada + " alterada com sucesso!");
                encontrou = true;
                System.out.println("");
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum veículo encontrado com a placa especificada.");
            System.out.println("");
        }

    }

    public static void sairDoPrograma() {
        System.out.println("Até uma próxima!");
        System.exit(0);
    }
}
