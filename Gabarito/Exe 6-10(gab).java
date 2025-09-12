// 6. Usando break
// Crie um programa que mostre um loop de 0 a 4 e interrompa (break) quando o valor for 5
// Quando isso acontecer, mostre uma mensagem ao usuário
// Utilize o laço for
   
   public class UsandoBreak {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Valor: " + i);

            if (i == 5) {
                System.out.println("O valor chegou a 5, saindo do loop...");
                break;
            }
        }
    }
}



// 7. Usando continue
// Crie um loop de 0 até 9
// Quando o valor for 5, mostre a mensagem "Continue e pule para o próximo loop"



public class UsandoContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            if (i == 5) {
                System.out.println("Continue e pule para o próximo loop");
                continue; 
            }
            System.out.println("Valor: " + i);
        }
    }
}

// 8. Teste de Mesa (1)
// Mostre a saída final do código

public static void main(String[] args) {
    int a = 15, s = 0;
    while (a < 20) {
        if (a % 2 == 0) {
            s++;
        }
        a++;
    }
    System.out.println(s);
}

| Passo | `a` | `s` | saída parcial |
| ----- | --- | --- | ------------- |
| 0     | 15  | 0   | 0             |
| 1     | 16  | 1   |               |
| 2     | 17  | 1   |               |
| 3     | 18  | 2   |               |
| 4     | 19  | 2   |               |
| 5     | 20  | 2   | **2 (final)** |



Resposta : 2


// 9. Teste de Mesa (2)
// Mostre a saída final do código

public class Principal {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for(int z = 0; z < 5; z++) {
            if ((++x > 2) || (++y > 2)) {
                x++;
            }
        }
        System.out.println(x);
        System.out.print(y);
    }
}

| Passo | `x` | `y` | `z` | saída parcial |
| ----- | --- | --- | --- | ------------- |
| 0     | 0   | 0   | -   | 0,0           |
| 1     | 1   | 1   | 0   | 1,1           |
| 2     | 2   | 2   | 1   | 2,2           |
| 3     | 4   | 2   | 2   | 4,2           |
| 4     | 6   | 2   | 3   | 6,2           |
| 5     | 8   | 2   | 4   | 8,2 (final)   |


Resposta : 8,2


// 10. Teste de Mesa (2)
// Mostre a saída final do código


public class Principal {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for(int z = 0; z < 5; z++) {
            if ((++x > 2) && (y++ > 2)) {
                x++;
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
}

| Passo | `x` | `y` | `z` | saída parcial |
| ----- | --- | --- | --- | ------------- |
| 0     | 0   | 0   | -   | 0,0           |
| 1     | 1   | 0   | 0   | 1,0           |
| 2     | 2   | 0   | 1   | 2,0           |
| 3     | 3   | 1   | 2   | 3,1           |
| 4     | 4   | 2   | 3   | 4,2           |
| 5     | 6   | 3   | 5   | 6,3 (final)   |


Resposta : 6,3
