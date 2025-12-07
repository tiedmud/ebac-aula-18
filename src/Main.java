//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! ");

        Notificador notificador = new Notificador() {
            @Override
            public void enviarMensagem(String mensagem) {
                System.out.println("Bem-vindo " + mensagem + "!");
            }
        };
        UsuarioService usuarioService = new UsuarioService(notificador);
        usuarioService.registrar("Ricardo");
    }
}