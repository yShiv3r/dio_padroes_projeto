package one.digitalInnovation.gof.strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Agindo normalmente...");
    }

}