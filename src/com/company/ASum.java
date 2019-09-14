package com.company;

public class ASum {

    public static long findNb(long m) {
        System.out.println("INPUT : " + m);
        long sum  = 0L;
        int i = 1;
        while(sum < m){
            sum += (long) Math.pow(i, 3);
            System.out.println("N = " + i + "; SUM = " + sum);
            i++;
        }
        System.out.println("RETURN : " + ((sum == m) ? i-1 : -1));
        return (sum == m) ? i-1 : -1;
    }
}
