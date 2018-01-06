package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int a,p=1;
        for (a = 1; a <= 10; a++) {
            p = p * a;
        }
        System.out.println(p);
    }
}
