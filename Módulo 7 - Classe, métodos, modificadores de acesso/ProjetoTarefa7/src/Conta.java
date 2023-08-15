/**
 * @author Eric Ferrari Ramos
 *
 * @version 1.0
 */

public class Conta {

    private int numeroConta;

    private String nomeCliente;

    private double saldo;




    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * Metódo deposita valor na conta corrente.
     * @param saldo
     */
    public void deposita(double saldo){
        this.saldo += saldo;
    }



}
