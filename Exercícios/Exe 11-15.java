// 11. Casting explícito
// Declare duas variáveis (double e int).
// Atribua valores a ambas.
// Converta o valor double para int (casting explícito).
// Compare os valores convertidos e informe se são iguais ou diferentes.


public class Casting{
    public static void main(String[] args){
        double num = 2.9;
        int num1 = 2;

    }
}

// 12. Casting implícito
// Declare uma variável int com valor 25.
// Atribua esse valor a uma variável double (casting implícito).
// Exiba ambos os valores.
// Compare-os e informe se são iguais ou diferentes.


public class CastingImplicito {
    public static void main(String[] args) {
    int num = 25;
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

public class  DiasDaSemana{
    public static void main(String[] args)

}

// 14.Conta Bancária com Encapsulamento
/* - Possua os atributos privados:

  - titular (String)

  -  saldo (double)

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

}




// 15.Animais com Abstração
/*
1.Crie uma classe abstrata Animal com:

// - Um atributo chamado nome (String).
// - Um método abstrato chamado emitirSom().


2.Crie duas classes que herdam de Animal:

- Cachorro → imprime "Au Au!" quando emitirSom() for chamado.

- Gato → imprime "Miau!" quando emitirSom() for chamado.

3. No programa principal (main):

- Crie um objeto de cada tipo (Cachorro e Gato).

- Chame o método emitirSom() para cada um.*/
abstract class Animal {
    
}

