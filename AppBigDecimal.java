
package br.com.bandtec.bigdecimal.app;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;


public class AppBigDecimal {
    
    public static void main(String[] args) {
        
        double a = 0.02;
        double b = 0.03;
        double c = b - a;
        System.out.println(c);
        
        BigDecimal n1 = new BigDecimal("0.02");
        BigDecimal n2 = new BigDecimal("0.03");
        BigDecimal n3 = n2.subtract(n1);
        System.out.println(n3);
        
        System.out.println(n1.add(n2));
        System.out.println(n2.divide(n1));
        System.out.println(n1.multiply(n2));
        
        System.out.println(n1.abs());
        System.out.println(n1.negate());
        System.out.println(n1.max(n2));
        System.out.println(n2.max(n1));
        System.out.println(n2.pow(2));
        
        //Ways of creating a BigDecimal
        BigDecimal n4 = BigDecimal.valueOf(1.879);
        BigDecimal n5 = BigDecimal.valueOf(77);
        BigDecimal n6 = BigDecimal.valueOf(4567038, 4);
        BigDecimal n7 = BigDecimal.valueOf(1234567890L);
        
        //-----------------------------------------------
        
        System.out.println(n1.intValue()); //BigDecimal to int
        System.out.println(n3.doubleValue()); //BigDecimal to double
        System.out.println(n7.longValue()); //BigDecimal to long int
        
        
        //Rounding values
        BigDecimal valor01 = new BigDecimal("4.01");
        BigDecimal valor02 = new BigDecimal("4.41");
        BigDecimal valor03 = new BigDecimal("4.50");
        BigDecimal valor04 = new BigDecimal("4.51");
        BigDecimal valor05 = new BigDecimal("4.99");
        BigDecimal valor06 = new BigDecimal("3.5958");
                
        System.out.println(valor03.setScale(0, RoundingMode.HALF_UP));
        System.out.println(valor06.setScale(2, RoundingMode.CEILING));
        
    }
    
    
}
