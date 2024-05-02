import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class App {
    static int temp_dialog = 80;

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);  
        int escolha;      
        
        Digita("\nAbro meus olhos ...", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nOlho ao redor...", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nEstá muito frio aqui", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nNão me lembro de nada...", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nPor que não sinto medo ...?", TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\nQuem me trouxe pra cá ...?", TimeUnit.MILLISECONDS, temp_dialog);;
        
        do {
            Digita("\nVocê observa ao redor? ", TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n1 - Sim", TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n2 - Não", TimeUnit.MILLISECONDS, temp_dialog);
            escolha = input.nextInt();
            if (escolha != 1 && escolha != 2) {
                Digita("\n1 - Sim", TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n2 - Não", TimeUnit.MILLISECONDS, temp_dialog);
            }
        } while (escolha != 1 && escolha != 2);

        if (escolha == 1) {
            Digita("\nEstou sozinha e este lugar é muito estranho. Tem uma cama, uma porta e alguns outros objetos velhos.", TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\nA Sala tem um papel de parede florido amarelo que lembra o quarto de minha infância. Tem alguns brinquedos espalhados pelo chão.", TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\nAbro a porta e saio para fora do quarto. Tem uma estrada e muitas arvores em volta.", TimeUnit.MILLISECONDS, temp_dialog); 
            Digita("\nVejo um pacote no chão de tamanho e formato semelhante a um corpo.", TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\nMe aproximo dele ...", TimeUnit.MILLISECONDS, temp_dialog);
        } else if (escolha == 2) {
            Digita("\nAbro a porta e saio para fora do quarto. Tem uma estrada e muitas arvores em volta.", TimeUnit.MILLISECONDS, temp_dialog); 
            Digita("\nVejo um pacote no chão de tamanho e formato semelhante a um corpo.", TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\nMe aproximo dele ...", TimeUnit.MILLISECONDS, temp_dialog);
        }
    }

    public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            unit.sleep(tempo_mensagem);
        }
    }
}
