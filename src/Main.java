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
    }
}
