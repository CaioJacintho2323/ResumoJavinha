package com.caiojacintho.runtime;

public class Main4 {
    public static void main(String[] args) {
        //UNCHECKED
        try {
            System.out.println(divisao(5, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento Ilegal, o pode ser divisivel por 0") ;
        }
        return a/b;
    }
}
