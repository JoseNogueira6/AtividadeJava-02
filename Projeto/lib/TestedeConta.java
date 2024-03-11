public class TestedeConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        minhaConta.setTitular("Nogueira");
        minhaConta.setNumero(12365);
        minhaConta.setAgencia("001");
        minhaConta.setSaldo(1000.0);
        minhaConta.setDataAbertura("10/03/2024");

        minhaConta.deposita(500.0);
        minhaConta.saca(200.0);

        System.out.println("Dados da Conta:");
        System.out.println(minhaConta.recuperaDadosParaImpressao());

        double rendimento = minhaConta.calculaRendimento();
        System.out.println("\nRendimento Mensal: " + rendimento);
    }
}



