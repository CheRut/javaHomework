package ru.dimcher.part001.controlWork;
import java.util.*;
/**
 * 	Class Sub - пример пример нахождения подстроки в строке.
 * 	@author dimCher
 * 	@since 31.05.2016.
 *	@param: str1 - массив символов(основная строка)
 *	@param: str2 - массив символов(подстрока)
 *	@param: temp - вспомагательный массив
 *	@param: lit - символ принимающий значение при выполнении условия
 *	@param n - счетчик вспомагательного массива
 *	@param count - номер элемента  массива подстроки подстроки 
 */
public class Sub {

    boolean contains(String origin, String sub) {
        char[] str2 = sub.toCharArray();
        char[] str1 = origin.toCharArray();
        char[] temp = new char[str2.length];
        int count = 0;
        for (int i=0;i<str1.length;i++) {

            for (int j = 0; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    temp[j] = str1[i];
                    count++;

                }
            }

        }
            if (Arrays.toString(temp).equals(Arrays.toString(str2))){
               // System.out.println(Arrays.toString(temp)+" = "+Arrays.toString(str2));
                return true;}

       // System.out.println(Arrays.toString(temp)+"!= "+Arrays.toString(str2));
return false;

    }

    public static void main(String[] args) {

        Sub sub = new Sub();
        System.out.println(sub.contains("junior","or"));
        System.out.println( sub.contains("каюта","юта"));
        System.out.println(sub.contains("песок","сок"));
        System.out.println( sub.contains("кекс","кик"));
    }
}
