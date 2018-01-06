package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(InputStreamReader(System.in));

        String Sn = reader.readLine();
        int nN = Integer.parseInt(Sn);

        System.out.println("Я буду зарабатывать $"+nN+" в час");
    }
}
