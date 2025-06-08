public class ValorContainer {
    public int valor;

    public ValorContainer(int valor) {
        this.valor = valor;
    }

    public ValorContainer() {
        this.valor = 0;
    }

    public void imprimirValor(String nome) {
        System.out.println(nome + ".valor = " + valor);
    }

    public static void trocarValores(ValorContainer refA, ValorContainer refB) {
        int temp = refA.valor;
        refA.valor = refB.valor;
        refB.valor = temp;
    }
}