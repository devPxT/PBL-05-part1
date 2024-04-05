import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Adicionando moto com placa invalida -> ABC");
        try {
            Moto motoFail = new Moto("Honda", "CBR600RR", 2022, 35000.00, 0, "ABC", "Gasolina", "Vermelha", "Manual", 180, 600, "Esportiva");
            motoFail.imprimirInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Impossivel adicionar a moto: " + e.getMessage());
        }
    
        System.out.println();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Adicionando moto");
        Moto CBR = new Moto("Honda", "CBR600RR", 2022, 35000.00, 0, "ABC-1234", "Gasolina", "Vermelha", "Manual", 180, 600, "Esportiva");
        CBR.imprimirInfo();

        System.out.println();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Adicionando carro");
        Carro FIESTA = new Carro("Ford", "Fiesta", 2021, 40000.00, 0, "XYZ-1234", "Gasolina", "Prata", "Automático", 1100, 4);
        FIESTA.imprimirInfo();
    
        System.out.println();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Adicionando caminhão");
        Caminhao FH = new Caminhao("Volvo", "FH", 2020, 300000.00, 0, "DEF-5678", "Diesel", "Branco", "Manual", 15000, 4, 40);
        FH.imprimirInfo();

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Adicionando cliente com cpf invalido -> ABC");
        try {
            Cliente clienteInvalido = new Cliente("Cliente Inválido", 30, "12345678900", 0.00, "12345678", 123);
            clienteInvalido.imprimirInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Impossível adicionar o cliente inválido: " + e.getMessage());
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println();
        }
    
        Cliente clienteValido = new Cliente("Cliente Válido", 35, "31598300040", 30000.00, "12345678", 123);
        clienteValido.imprimirInfo();
    
        Vendedor vendedor = new Vendedor("Vendedor", 25, "39096031067", 0, "12345678901234");
        vendedor.imprimirInfo();
        
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Adicionando saldo no clienteValido");

        clienteValido.adicionarSaldo(5000.0);
        
        System.out.println("Tentando comprar carro");
        FIESTA.comprarCarro(vendedor, clienteValido);

        System.out.println("Tentando comprar caminhão");
        FH.comprarCaminhao(vendedor, clienteValido);

        System.out.println("Tentando comprar moto");
        CBR.comprarMoto(vendedor, clienteValido);

        clienteValido.imprimirEndereco();

        // System.out.println("---------- Bem Vindo ---------");
        // System.out.println("1. Cadastrar Usuário");
        // System.out.println("2. Listar Usuário");
        // System.out.println("3. Cadastrar Automovel");
        // System.out.println("4. Listar Automoveis");
        // System.out.println("5. Adicionar Saldo");
        // System.out.println("6. Comprar Automovel");
        // System.out.println("0. Sair");
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Digite a opção: " );
        // int opcao = scanner.nextInt();
        // scanner.close();

        // System.out.println(opcao);

        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("---------- Bem Vindo ---------");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Listar Usuários");
            System.out.println("3. Cadastrar Automovel");
            System.out.println("4. Listar Automoveis");
            System.out.println("5. Gerenciar Saldo");
            System.out.println("6. Comprar Automovel");
            System.out.println("0. Sair");
            System.out.print("Digite a opção: ");

            try {
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Opção 1 selecionada - Cadastrar Usuário");
                        showCadastro();
                        break;
                    case 2:
                        System.out.println("Opção 2 selecionada - Listar Usuário");
                        break;
                    case 3:
                        System.out.println("Opção 3 selecionada - Cadastrar Automovel");
                        showCadastroAuto();
                        break;
                    case 4:
                        System.out.println("Opção 4 selecionada - Listar Automoveis");
                        break;
                    case 5:
                        System.out.println("Opção 5 selecionada - Gerenciar Saldo");
                        showSaldo();
                        break;
                    case 6:
                        System.out.println("Opção 6 selecionada - Comprar Automovel");
                        break;
                    case 0:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (Exception e) {
                System.out.println("Erro de entrada. Por favor, digite um número válido.");
            }
        }

        scanner.close();
    }

    public static void showCadastro() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("---------- Cadastro de Us ---------");
            System.out.println("1. Cadastrar Vendedor");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("0. Voltar");
            System.out.print("Digite a opção: ");

            try {
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Opção 1 selecionada - Cadastrar Vendedor");
                        break;
                    case 2:
                        System.out.println("Opção 2 selecionada - Cadastrar Cliente");
                        break;
                    case 0:
                        System.out.println("Voltando...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (Exception e) {
                System.out.println("Erro de entrada. Por favor, digite um número válido.");
            }
        }
    }

    public static void showCadastroAuto() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("---------- Cdastro de Automóveis ---------");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Cadastrar Moto");
            System.out.println("3. Cadastrar Caminhão");
            System.out.println("0. Voltar");
            System.out.print("Digite a opção: ");

            try {
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Opção 1 selecionada - Cadastrar Carro");
                        break;
                    case 2:
                        System.out.println("Opção 2 selecionada - Cadastrar Moto");
                        break;
                    case 3:
                        System.out.println("Opção 3 selecionada - Cadastrar Caminhão");
                        break;
                    case 0:
                        System.out.println("Voltando...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (Exception e) {
                System.out.println("Erro de entrada. Por favor, digite um número válido.");
                scanner.nextLine(); // tira os valores do scanner
            }
        }

        scanner.close();
    }

    public static void showSaldo() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("---------- Gerenciar Saldo ---------");
            System.out.println("1. Adicionar Saldo");
            System.out.println("2. Remover Saldo");
            System.out.println("0. Voltar");
            System.out.print("Digite a opção: ");

            try {
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Opção 1 selecionada - Adicionar Saldo");
                        break;
                    case 2:
                        System.out.println("Opção 2 selecionada - Remover Saldo");
                        break;
                    case 0:
                        System.out.println("Voltando...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (Exception e) {
                System.out.println("Erro de entrada. Por favor, digite um número válido.");
                scanner.nextLine(); // tira os valores do scanner
            }
        }

        scanner.close();
    }
}
