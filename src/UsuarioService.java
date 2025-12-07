public class UsuarioService {
    Notificador notificador;

    public UsuarioService(Notificador notificador) {
        this.notificador = notificador;
    }

    void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }

    public void registrar(String nome) {
        System.out.println("Usuário " + nome + " registrado.");
        notificador.enviarMensagem("Bem-vindo " + nome + "!");
    }
}
