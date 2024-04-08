import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Moto> motos = new ArrayList<>();
    public static List<Carro> carros = new ArrayList<>();
    public static List<Caminhao> caminhoes = new ArrayList<>();

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

        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Menu principal
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Cadastrar Automovel");
            System.out.println("3. Gerenciar Saldo");
            System.out.println("4. Comprar Automovel");
            System.out.println("0. Encerrar Programa");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        // Menu Opção 1
                        handleOption1(scanner);
                        break;
                    case 2:
                        // Menu Opção 2
                        handleOption2(scanner);
                        break;
                    case 3:
                        // Menu Opção 3
                        handleOption3(scanner);
                        break;
                    case 4:
                        // Menu Opção 4
                        handleOption4(scanner);
                        break;
                    case 0:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.next(); // Limpa o buffer de entrada
                choice = -1; // Define uma opção inválida para continuar o loop
            }

        } while (choice != 0);

        scanner.close();
    }

    private static void handleOption1(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n=== Cadastrar Usuário ===");
            System.out.println("1. Cadastrar Vendedor");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Executando ação do Submenu 1...");
                        break;
                    case 2:
                        System.out.println("Executando ação do Submenu 2...");
                        break;
                    case 0:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.next();
                choice = -1;
            }
        } while (choice != 0);
    }

    private static void handleOption2(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n=== Cadastrar Automovel ===");
            System.out.println("1. Nova Moto");
            System.out.println("2. Novo Carro");
            System.out.println("3. Novo Caminhão");
            System.out.println("0. Voltar");
            System.out.println();
            System.out.print("Escolha uma opção: ");

            try {
                choice = scanner.nextInt();
                String marca;
                String modelo;
                int ano;
                double preco;
                int quilometragem;
                String placa;
                String combustivel;
                String cor;
                String cambio;
                int peso;
                switch (choice) {
                    
                    case 1:
                        int cilindradas;
                        String tipo;

                        System.out.println();
                        System.out.println("Insira as informações da moto");
                        System.out.println();

                        System.out.print("marca: ");
                        marca = scanner.next();

                        System.out.print("modelo: ");
                        modelo = scanner.next();

                        System.out.print("ano: ");
                        ano = scanner.nextInt();

                        System.out.print("preco: ");
                        preco = scanner.nextDouble();

                        System.out.print("quilometragem: ");
                        quilometragem = scanner.nextInt();

                        System.out.print("placa: ");
                        placa = scanner.next();

                        System.out.print("combustivel: ");
                        combustivel = scanner.next();

                        System.out.print("cor: ");
                        cor = scanner.next();

                        System.out.print("cambio: ");
                        cambio = scanner.next();

                        System.out.print("peso: ");
                        peso = scanner.nextInt();

                        System.out.print("cilindradas: ");
                        cilindradas = scanner.nextInt();

                        System.out.print("tipo: ");
                        tipo = scanner.next();

                        Moto moto = new Moto(marca, modelo, ano, preco, quilometragem, placa, combustivel, cor, cambio, peso, cilindradas, tipo);
                        motos.add(moto);

                        System.out.println();
                        System.out.println("Moto cadastrada com sucesso!");
                        choice = 0;
                        break;
                    case 2:
                        int portas;

                        System.out.println();
                        System.out.println("Insira as informações da moto");
                        System.out.println();

                        System.out.print("marca: ");
                        marca = scanner.nextLine();

                        System.out.print("modelo: ");
                        modelo = scanner.nextLine();

                        System.out.print("ano: ");
                        ano = scanner.nextInt();

                        System.out.print("preco: ");
                        preco = scanner.nextDouble();

                        System.out.print("quilometragem: ");
                        quilometragem = scanner.nextInt();

                        System.out.print("placa: ");
                        placa = scanner.nextLine();

                        System.out.print("combustivel: ");
                        combustivel = scanner.nextLine();

                        System.out.print("cor: ");
                        cor = scanner.nextLine();

                        System.out.print("cambio: ");
                        cambio = scanner.nextLine();

                        System.out.print("peso: ");
                        peso = scanner.nextInt();

                        System.out.print("portas: ");
                        portas = scanner.nextInt();

                        Carro carro = new Carro(marca, modelo, ano, preco, quilometragem, placa, combustivel, cor, cambio, peso, portas);
                        carros.add(carro);

                        System.out.println();
                        System.out.println("Carro cadastrado com sucesso!");
                        choice = 0;
                        break;
                    case 3:
                        int eixos;
                        int cargaMaxima;

                        System.out.println();
                        System.out.println("Insira as informações da moto");
                        System.out.println();

                        System.out.print("marca: ");
                        marca = scanner.nextLine();

                        System.out.print("modelo: ");
                        modelo = scanner.nextLine();

                        System.out.print("ano: ");
                        ano = scanner.nextInt();

                        System.out.print("preco: ");
                        preco = scanner.nextDouble();

                        System.out.print("quilometragem: ");
                        quilometragem = scanner.nextInt();

                        System.out.print("placa: ");
                        placa = scanner.nextLine();

                        System.out.print("combustivel: ");
                        combustivel = scanner.nextLine();

                        System.out.print("cor: ");
                        cor = scanner.nextLine();

                        System.out.print("cambio: ");
                        cambio = scanner.nextLine();

                        System.out.print("peso: ");
                        peso = scanner.nextInt();

                        System.out.print("eixos: ");
                        eixos = scanner.nextInt();

                        System.out.print("carga maxima: ");
                        cargaMaxima = scanner.nextInt();

                        Caminhao caminhao = new Caminhao(marca, modelo, ano, preco, quilometragem, placa, combustivel, cor, cambio, peso, eixos, cargaMaxima);
                        caminhoes.add(caminhao);

                        System.out.println();
                        System.out.println("Caminhão cadastrado com sucesso!");
                        choice = 0;
                    case 0:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.next();
                choice = -1;
            }
        } while (choice != 0);
    }

    private static void handleOption3(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n=== Gerenciar Saldo ===");
            System.out.println("1. Adicionar Saldo");
            System.out.println("2. Ver saldo");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Executando ação do Submenu 1...");
                        break;
                    case 2:
                        System.out.println("Executando ação do Submenu 2...");
                        break;
                    case 0:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.next();
                choice = -1;
            }
        } while (choice != 0);
    }

    private static void handleOption4(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n=== Comprar Automovel ===");
            System.out.println("1. Submenu 1");
            System.out.println("2. Submenu 2");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Executando ação do Submenu 1...");
                        break;
                    case 2:
                        System.out.println("Executando ação do Submenu 2...");
                        break;
                    case 0:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.next();
                choice = -1;
            }
        } while (choice != 0);
    }
}
