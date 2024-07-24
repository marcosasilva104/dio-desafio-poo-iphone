import application.Iphone;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException  {
        
        try (Scanner sc = new Scanner(System.in)) {
            Iphone iphone = new Iphone();
            boolean iphoneLigado = true;
            
            int opcao;
            
            while (iphoneLigado) { 
                    System.out.println("""
                                       Selecione uma op\u00e7\u00e3o no menu: 
                                       1: Fazer liga\u00e7\u00e3o 
                                       2: Atender liga\u00e7\u00e3o 
                                       3: Ativar correio de voz 
                                       4: Selecionar m\u00fasica 
                                       5: Tocar a m\u00fasica 
                                       6: Pausar a m\u00fasica 
                                       7: Exibir p\u00e1gina 
                                       8: Abrir nova aba no navegador 
                                       9: Atualizar p\u00e1gina 
                                       0: Desligar 
                                       Digite a op\u00e7\u00e3o:""");
                    
                    opcao = sc.nextInt();
               
                    switch (opcao) {
                        case 1 -> {
                            iphone.ligar();
                            System.out.println("Fazendo ligação");
                            Thread.sleep(5000);
                    }
                        case 2 -> {
                            iphone.atender();
                            System.out.println("Atendendo ligação");
                            Thread.sleep(5000);
                    }
                        case 3 -> {
                            iphone.iniciarCorreioVoz();
                            System.out.println("Iniciando correio de voz");
                            Thread.sleep(5000);
                    }
                        case 4 -> {
                            iphone.selecionarMusica();
                            System.out.println("Selecionando música");
                            Thread.sleep(5000);
                    }
                        case 5 -> {
                            iphone.tocar();
                            System.out.println("Tocando música");
                            Thread.sleep(5000);
                    }
                        case 6 -> {
                            iphone.pausar();
                            System.out.println("Música pausada");
                            Thread.sleep(5000);
                    }
                        case 7 -> {
                            iphone.exibirPagina();
                            System.out.println("Exibindo página web");
                            Thread.sleep(5000);
                    }
                        case 8 -> {
                            iphone.adicionarNovaAba();
                            System.out.println("Nova aba");
                            Thread.sleep(5000);
                    }
                        case 9 -> {
                            iphone.atualizarPagina();
                            System.out.println("Atualiazando página");
                            Thread.sleep(5000);
                        }
                        case 0 -> {
                            System.out.println("Desligando o aparelho");
                            iphoneLigado = false;
                            Thread.sleep(1000);
                    }
                        default -> System.out.println("Opção inválida. Insira um número de 0 a 9.");
                    }
 
            }
            sc.close();
        }
    }
}

