import java.util.concurrent.TimeUnit;

public class App {
    static int temp_dialog = 80;

    public static void main(String[] args) throws Exception {
        Digita("\nvenha até mim", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nvenha até mim", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nvenha até mim", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nvenha até mim", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nvenha até mim", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nvenha até mim", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nvenha até mim", TimeUnit.MILLISECONDS, temp_dialog);
    }

    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }
}
