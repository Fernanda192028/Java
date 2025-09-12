// 6. Usando break
// Crie um programa que mostre um loop de 0 a 4 e interrompa (break) quando o valor for 5
// Quando isso acontecer, mostre uma mensagem ao usuário
// Utilize o laço for
   
   public class UsandoBreak {
    public static void main(String[] args) {
       
    }
}



// 7. Usando continue
// Crie um loop de 0 até 9
// Quando o valor for 5, mostre a mensagem "Continue e pule para o próximo loop"




public class UsandoContinue {
    public static void main(String[] args) {
        
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

Passo    a    s    saída
 0        15   0      -



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

Passo    x    y     saída
0        0    0       -



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

Passo    x    y     saída
0        0    0       -
