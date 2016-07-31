package ru.dimcher.part001.testPartOne;



public class StartSub{
	public static void main(String[] args){
		Sub sub = new Sub();
		System.out.println(sub.contains("junior","or"));
        System.out.println( sub.contains("каюта","юта"));
        System.out.println(sub.contains("песок","пёс"));
        System.out.println( sub.contains("кекс","кик"));
	}
}
