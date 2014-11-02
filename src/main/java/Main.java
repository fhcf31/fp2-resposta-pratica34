import java.util.Scanner;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Fernando Henrique Carvalho Ferreira <fhcf31@gmail.com>
 */

public class Main {
    public static void main(String[] args) {
        long n = 1;
        int count = 0;
        
        while(n>0){
            n = count;
            n = Pratica34.fatorial((int)n);
            if(n>0)
                System.out.println("O fatorial de "+count+" é: "+n);
                count++;
        }
        
        System.out.println("\n Os MDCs");
        System.out.println("\nO mdc de 12 e 24 é "+Pratica34.mdc(12,24));
        System.out.println("O mdc de 7 e 5 é "+Pratica34.mdc(7,5));
    }
}
