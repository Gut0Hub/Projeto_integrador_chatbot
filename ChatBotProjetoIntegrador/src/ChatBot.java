import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bem-vindo ao assistente de atendimento ao aluno! O que você gostaria de saber?");
            System.out.println("1 - Dúvidas sobre disciplinas");
            System.out.println("2 - Informações sobre a plataforma");
            System.out.println("3 - Sair do assistente");

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    tratarDuvidasDisciplina(scanner);
                    break;
                case "2":
                    tratarInformacoesPlataforma(scanner);
                    break;
                case "3":
                    System.out.println("Agradecemos pela sua visita! Até logo!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha novamente.");
            }
        }

        scanner.close();
    }

    private static void tratarDuvidasDisciplina(Scanner scanner) {
        System.out.println("Sobre o que você gostaria de esclarecer em relação às disciplinas?");
        System.out.println("1 - Quais UAs estão disponíveis?");
        System.out.println("2 - Qual é a proposta do projeto integrador?");
        
        String escolha = scanner.nextLine();
        
        if (escolha.equals("1")) {
            System.out.println("As UAs disponíveis são: Estruturas de Dados, Programação Orientada a Objetos, e Desenvolvimento Web.");
        } else if (escolha.equals("2")) {
            System.out.println("O projeto integrador visa desenvolver um sistema que simule um atendimento ao aluno.");
        } else {
            System.out.println("Desculpe, não consegui entender sua pergunta.");
        }

        perguntarMais(scanner);
    }

    private static void tratarInformacoesPlataforma(Scanner scanner) {
        System.out.println("O que você gostaria de saber sobre a plataforma?");
        System.out.println("1 - Como acessar a plataforma?");
        System.out.println("2 - Como resolver problemas técnicos?");
        
        String escolha = scanner.nextLine();

        if (escolha.equals("1")) {
            System.out.println("Você pode acessar a plataforma pelo link no e-mail de boas-vindas.");
        } else if (escolha.equals("2")) {
            System.out.println("Para problemas técnicos, entre em contato com o suporte pelo e-mail support@escola.com.");
        } else {
            System.out.println("Opção inválida, por favor tente novamente.");
        }

        perguntarMais(scanner);
    }

    private static void perguntarMais(Scanner scanner) {
        System.out.println("Posso ajudar com mais alguma coisa?");
        System.out.println("1 - Não, obrigado.");
        System.out.println("2 - Voltar ao menu.");

        String resposta = scanner.nextLine();
        if (resposta.equals("1")) {
            System.out.println("Obrigado pela sua visita! Até logo!");
            System.exit(0);
        } else if (!resposta.equals("2")) {
            System.out.println("Opção não reconhecida. Voltando ao menu principal.");
        }
    }
}
