package com.hand;

/**
 * @program: JavaTest1
 * @description: ConcreteFactory
 * @author: lichao
 * @create: 2018-07-19 10:54
 **/

public class ConcreteFactory implements Factory {
    public Product create(String str) {
        Product product = null;
       if(str.equals("Stream")){
            product = new Stream();
       }else if (str.equals("others")){
           product = new Others();
       }

       return product;
    }
}


