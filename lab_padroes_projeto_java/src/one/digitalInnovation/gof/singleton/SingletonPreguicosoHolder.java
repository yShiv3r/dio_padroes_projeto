package one.digitalInnovation.gof.singleton;

public class SingletonPreguicosoHolder {

    private static class InstanceHolder {
        public static SingletonPreguicosoHolder instancia = new SingletonPreguicosoHolder();
    }

    private SingletonPreguicosoHolder() {
        super();
    }

    public static SingletonPreguicosoHolder getInstancia() {
        return InstanceHolder.instancia;
    }

}
