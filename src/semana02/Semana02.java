package semana02;

import javax.swing.JOptionPane;
import view.PrimeiraInterface;

public class Semana02 {

    public static void main(String[] args) {
        new PrimeiraInterface(); 


    }

    public static void metodoJoption() {
        String nome = JOptionPane.showInputDialog("informe seu email");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "qual a sua idade", "idade", JOptionPane.INFORMATION_MESSAGE));

        JOptionPane.showInputDialog("Hello Word");
        JOptionPane.showInputDialog(null, "Digite seu Nome? ", "Titulo", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Mensagem de teste");
        JOptionPane.showConfirmDialog(null, "DESEJA CADASTRAS", "teste", JOptionPane.YES_NO_OPTION);

        JOptionPane.showMessageDialog(null, "DEU CERT0");
        JOptionPane.showMessageDialog(null, "mesagem teste", "TESTE", JOptionPane.ERROR_MESSAGE);

    }

   public static void metodoScanner() {
//
//        String nomeAlunos[] = new String[5];
//        boolean situacaoAlunos[] = new boolean[5];
//        double alturaAluno[] = new double[5];
//        int idadeAluno[] = new int[5];
//
//        Scanner leitor = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//
//            System.out.println("Informe seu nome");
//            nomeAlunos[i] = leitor.nextLine();
//            System.out.println("Você estuda?");
//            situacaoAlunos[i] = leitor.nextBoolean();
//            System.out.println("Qual a sua altura");
//            alturaAluno[i] = leitor.nextDouble();
//            System.out.println("Qual a sua idade?");
//            int idade = leitor.nextInt();
//        }
//
//        for (int i = 0; i < nomeAlunos.length; i++) {
//            System.out.println("Nome: " + nomeAlunos[i] + " Estudante " + situacaoAlunos[i]);
//        }
//
//        leitor.useDelimiter(",");
//
//        while (leitor.hasNexInt()) {
//            int numero = leitor.nexInt();
//            System.out.println("Numero " + numero);
//            leitor.skip(",");
//        }
//
//    }
}
