/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fernando
 */
public class Pratica34 {

    public static long fatorial(int num) {
        if (num == 0) {
            return (1);
        } else {
            return num * fatorial(num - 1);
        }
    }
    
    public static int mdc(int m, int n) {
        
        if (n == 0) {
            return m;
        } else if (n > m) {
            return mdc(n, m);
        } else {
            return mdc(n, m % n);
        }
    }
}
