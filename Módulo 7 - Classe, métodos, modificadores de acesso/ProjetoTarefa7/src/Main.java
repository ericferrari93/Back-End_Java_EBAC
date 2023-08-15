public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(100.00);
        conta.setNomeCliente("Eric");
        conta.setNumeroConta(123);
        System.out.println(conta.getNomeCliente());
        System.out.println(conta.getNumeroConta());
        System.out.println(conta.getSaldo());
        conta.deposita(200.00);
        System.out.println(conta.getSaldo());

    }
}
