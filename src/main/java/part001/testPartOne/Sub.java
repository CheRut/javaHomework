package ru.dimcher.part001.testPartOne;

import java.util.*;
/**
 * 	Class Sub - пример пример нахождения подстроки в строке.
 * 	@author dimCher
 * 	@since 31.05.2016.
 *	@param: str1 - массив символов(основная строка)
 *	@param: str2 - массив символов(подстрока)
 *	@param: temp - вспомагательный массив
 *	@param count - номер элемента  массива подстроки подстроки 
 */
public class Sub {
        boolean contains(String origin, String sub) {
        char[] str2 = sub.toCharArray();
        char[] str1 = origin.toCharArray();
        char[] temp = new char[str2.length];
        int count = 0;
		/**
		*находим символ оригинальной строки равный первому символу подстроки
		*добавляем символ в массив temp и увеличиваем счетчик
		
		*Сравниваем массив подстроки с временным массивом
		*Выводим результат.		
		*/
        for (int i=0;i<str1.length;i++) {

            for (int j = 0; j < str2.length; j++) {
                if (str1[i] == str2[j]) {
                    temp[j] = str1[i];
                    count++;

                }
            }

        }
		/**
		*Преобразуем массив символов  к типу String
		*сравниваем значения
		*/
            if (Arrays.toString(temp).equals(Arrays.toString(str2))){
                return true;}

return false;

    }
    
}
