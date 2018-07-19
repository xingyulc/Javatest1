package com.hand;

/**
 * @program: JavaTest1
 * @description: 单例模式
 * @author: lichao
 * @create: 2018-07-19 09:21
 **/

public class LazySingleton {

    private static LazySingleton instance = null;
    private LazySingleton() { }
    synchronized public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public double calculate(double wageBefore){
        //税
        double tax = 0;
        if (wageBefore > 3500){
            wageBefore = wageBefore - 3500;
            if (wageBefore < 1500){
                tax = wageBefore*0.03;
            }else if (wageBefore < 4500){
                tax = 1500*0.03 + (wageBefore-1500)*0.10;
            }else if (wageBefore < 9000){
                tax = 1500*0.03 + (4500-1500)*0.10+(wageBefore-4500)*0.20;
            }else if(wageBefore < 35000){
                tax = tax = 1500*0.03 + (4500-1500)*0.10
                        +(9000-4500)*0.20+(wageBefore-9000)*0.25;
            }else if (wageBefore < 55000){
                tax = tax = 1500*0.03 + (4500-1500)*0.10
                        +(9000-4500)*0.20+(35000-9000)*0.25+(wageBefore-35000)*0.30;
            }else if (wageBefore < 80000){
                tax = tax = 1500*0.03 + (4500-1500)*0.10
                        +(9000-4500)*0.20+(35000-9000)*0.25+
                        (55000-35000)*0.30+(wageBefore-55000)*0.35;
            }else {
                tax = tax = 1500*0.03 + (4500-1500)*0.10
                        +(9000-4500)*0.20+(35000-9000)*0.25+
                        (55000-35000)*0.30+(80000-55000)*0.35+(wageBefore-80000)*0.45;
            }
        }
        double wageAfter = wageBefore - tax;
        return wageAfter;
    }



}
