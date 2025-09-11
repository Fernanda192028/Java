// 1. Monstre uma mensagem
// Utilize a estrutura base do Java
// Use as boas práticas(sempre iniciar nome de classe com letra maiuscula )

public class Mensagem {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}


// 2. Procurando o número
// contrua um programa em que o
// usuário tem que adivinhar o número
// número = 42
// utilize a estrutura if e else 
// informe se o usuário está perto ou não do número
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



// 3. Idade e pagemento
// Contrua um programa que cheque se o usuário fez ou não o pagamento e se é maior de idade
// idade = 18
// informe se o acesso foi ou não liberado

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



// 4. Monstrar números de 1 a 10 
// Use a instrução System.out.println(1);
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
// utilize do while 
// não esqueca do contador 


public class NumerosDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}




