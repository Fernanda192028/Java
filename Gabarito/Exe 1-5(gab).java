// 1. Mostrar uma mensagem
// Utilize a estrutura base do Java
// Use boas práticas (sempre iniciar o nome da classe com letra maiúscula)

public class Mensagem {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}


// 2. Procurando o número
// Construa um programa em que o
// usuário tem que adivinhar o número
// número = 42
// Utilize a estrutura if e else 
// Informe se o usuário está perto ou não do número
// Utilize JOptionPane
import javax.swing.JOptionPane;

public class ProcurarNumero {
    public static void main(String[] args) {
        int numeroSecreto = 42;

       
        String entrada = JOptionPane.showInputDialog("Adivinhe o número:");
        int chute = Integer.parseInt(entrada);

        if (chute == numeroSecreto) {
            JOptionPane.showMessageDialog(null, "Parabéns! Você acertou.");
        } else if (Math.abs(chute - numeroSecreto) <= 5) {
            JOptionPane.showMessageDialog(null, "Você está perto!");
        } else {
            JOptionPane.showMessageDialog(null, "Você está longe.");
        }
    }
}



// 3. Idade e pagamento
// Construa um programa que verifique se o usuário fez o pagamento e se é maior de idade
// Idade mínima = 18
// Informe se o acesso foi ou não liberado 
public class IdadePagamento {
    public static void main(String[] args) {
        int idade = 18;
        boolean pagamento = true;

        if (idade >= 18 && pagamento) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}



// 4. Mostrar os números de 1 a 10 
// Use a instrução System.out.println();
// Use for ou while

public class NumerosForWhile {
    public static void main(String[] args) {
        
        // Usando for
        System.out.println("Com for:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Usando while
        System.out.println("Com while:");
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }
    }
}



// 5. Mostrar os números de 1 a 10
// Utilize do-while
// Não esqueça do contador


public class NumerosDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}




