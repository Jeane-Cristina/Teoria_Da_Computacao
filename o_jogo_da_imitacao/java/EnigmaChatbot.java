import java.util.Scanner;

public class EnigmaChatbot {
      public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String input;
                System.out.println("--- Assistente Bletchley Park ---");
                System.out.println("Ola! Eu sou o TuringBot. Sobre o que quer falar? (historia, java, huts, sair)");
                while (true) {
                              System.out.print("> ");
                              input = scanner.nextLine().toLowerCase().trim();
                              if (input.equals("sair")) {
                                                System.out.println("Encerrando transmissao... ate logo!");
                                                break;
                              }
                              String resposta;
                              switch (input) {
                                case "historia":
                                                      resposta = "A Enigma foi criada por Arthur Scherbius em 1918 para uso comercial.";
                                                      break;
                                case "java":
                                                      resposta = "Podemos programar a logica dos rotores usando aritmetica modular: (i + rot) % 26.";
                                                      break;
                                case "huts":
                                                      resposta = "As Huts eram cabanas de madeira. A Hut 8 era onde Alan Turing trabalhava.";
                                                      break;
                                case "ajuda":
                                                      resposta = "Tente: 'historia', 'java' ou 'huts'.";
                                                      break;
                                default:
                                                      resposta = "Desculpe, essa mensagem esta criptografada para mim. Pode repetir?";
                              }
                              System.out.println(resposta);
                }
                scanner.close();
      }
}
