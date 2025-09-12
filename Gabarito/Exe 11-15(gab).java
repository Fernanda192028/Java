// 11. Casting explícito
// Declare duas variáveis (double e int).
// Atribua valores a ambas.
// Converta o valor double para int (casting explícito).
// Compare os valores convertidos e informe se são iguais ou diferentes.

public class Casting {
    public static void main(String[] args) {
        double num = 2.9;   
        int num1 = 2;       

        
        int numConvertido = (int) num;

       
        if (num1 == numConvertido) {
            System.out.println("São números iguais");
        } else {
            System.out.println("São números diferentes");
        }
    }
}


// 12. Casting implícito
// Declare uma variável int com valor 25.
// Atribua esse valor a uma variável double (casting implícito).
// Exiba ambos os valores.
// Compare-os e informe se são iguais ou diferentes.


public class CastingImplicito {
    public static void main(String[] args) {
        int numeroInt = 25;         
        double numeroDouble = numeroInt; 

        System.out.println("Valor int: " + numeroInt);
        System.out.println("Valor double (casting implícito): " + numeroDouble);

        if (numeroInt == numeroDouble) {
            System.out.println("Os valores são iguais.");
        } else {
            System.out.println("Os valores são diferentes.");
        }
    }
}


//13.Dias da semana com Switch
// Leia um número inteiro de 1 a 7 (representando os dias da semana).
/* Use switch para exibir o nome correspondente do dia.

1 → Domingo

2 → Segunda-feira

3 → Terça-feira

4 → Quarta-feira

5 → Quinta-feira

6 → Sexta-feira

7 → Sábado*/
//Se o número não for entre 1 e 7, mostre "Dia inválido".
//Adicional: se o dia for 1 (domingo) ou 7 (sábado), também exiba "Fim de semana".


import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Dia inválido");
        }

        sc.close();
    }
}


// 14.Conta Bancária com Encapsulamento
/*  - Possua os seguintes atributos privados:
     - titular (String)
     - saldo (double)

 -  Tenha os métodos públicos:

    - depositar(double valor) → aumenta o saldo.

    - sacar(double valor) → diminui o saldo se houver saldo suficiente.

    - getSaldo() → retorna o saldo atual.

    - getTitular() e setTitular(String nome) → permitem acessar e alterar o titular.

No programa principal (main):

1.Crie um objeto da classe ContaBancaria.

2.Defina o nome do titular.

3.Faça depósitos e saques.

4.Exiba o saldo e o nome do titular.*/

class ContaBancaria {
    private String titular;
    private double saldo;

   
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque não permitido.");
        }
    }

    
    public double getSaldo() {
        return saldo;
    }
}




// 15.Animais com Abstração
/*
1.Crie uma classe abstrata Animal com:

- Um atributo chamado nome (String).

- Um método abstrato chamado emitirSom().


2.Crie duas classes que herdam de Animal:

- Cachorro → imprime "Au Au!" quando emitirSom() for chamado.

- Gato → imprime "Miau!" quando emitirSom() for chamado.

3. No programa principal (main):

- Crie um objeto de cada tipo (Cachorro e Gato).

- Chame o método emitirSom() para cada um.*/


abstract class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }


    public abstract void emitirSom();
}


class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Au Au!");
    }
}


class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }
}



