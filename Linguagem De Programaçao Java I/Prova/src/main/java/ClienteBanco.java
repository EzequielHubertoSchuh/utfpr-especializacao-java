
/**
 *
 * @author ezequiel huberto schuh
 */
public abstract class ClienteBanco implements Verifica {

    private int numeroConta = 0;
    private String nome = "";
    private Endereco ender = new Endereco();

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) throws NumException {
        if (numeroConta < 0) {
            throw new NumException();
        }
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnder() {
        return ender;
    }

    public void setEnder(Endereco ender) {
        this.ender = ender;
    }

    public abstract void verifDoc();

    @Override
    public void validar() {
        if (getNumeroConta() % 2 == 0) {
            System.out.println("Conta número: " + getNumeroConta() + " é PAR!");
        } else {
            System.out.println("Conta número: " + getNumeroConta() + " é IMPAR!");
        }
    }

}
