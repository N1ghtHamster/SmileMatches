package com.example.a1cadm.smilematches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class GamePoolActivity extends AppCompatActivity {

    int player = 5, comp = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamepool);

        /*while (player > 0 && player <= 5 && comp > 0 && comp <= 5) {
            int playerget = numMaik(player);

            int compget = cRandom(comp + 1);

            int playerguess = numMaik(player+comp);

            //Объявляем Выбор компа
            int compguess;

            do {
                compguess = cRandom(compget + player + 1);
            }
            while (compguess < compget || compguess > compget + player);

            //Объявляем и считаем Суммы Выбора Вместе
            int together = playerget + compget;
            System.out.println("Сумма выбора : " + together);

            //Сравниваем и результируем
            if (playerguess == together && compguess == together){

            }
            else if (playerguess == together){
                player -=1;
            }
            else if (compguess == together){
                comp -=1;
            }
            else {}

            if (player == 0) {
                JOptionPane.showMessageDialog(null, "Player Win!!!!!!");
                break;
            }
            if (comp == 0) {
                JOptionPane.showMessageDialog(null, "Comp Win!!!!!!");
                break;
            }
        }*/

    }

    private static int cRandom(int comp){
        Random x = new Random();
        int num = x.nextInt(comp);
        System.out.println(num);
        return num;
    }
}
/*
public class Main {
    public static void main(String[] args) {
        while (true){
            int result = JOptionPane.showConfirmDialog(null, "Начинаем играть????","СПИЧКИ", JOptionPane.YES_NO_OPTION);
            if (result == 1){
                JOptionPane.showMessageDialog(null, "До свидания!!!!!");
                System.exit(0);}
            int player = 5, comp = 5;
            while (player > 0 && player <= 5 && comp > 0 && comp <= 5 && result == 0) {
                int playerget = numMaik(player, "Выбор Игрока : ");

                int compget = cRandom(comp + 1, "Выбор Компа : ");

                int playerguess = numMaik(player+comp, "Сумма выбора Игрока : ");

                int compguess;
                do {
                    compguess = cRandom(compget + player + 1, "Сумма выбора Компа : ");
                }
                while (compguess < compget || compguess > compget + player);

                int together = playerget + compget;
                System.out.println("Сумма выбора : " + together);

                if (playerguess == together && compguess == together){
                    JOptionPane.showMessageDialog(null, "Ничья! След Раунд.");
                    System.out.println("Осталось спичек Игрока : " + player);
                    System.out.println("Осталось спичек Компа : " + comp);
                }
                else if (playerguess == together){
                    player -=1;
                    JOptionPane.showMessageDialog(null, "Игрок выиграл раунд!");
                    System.out.println("Осталось спичек Игрока : " + player);
                    System.out.println("Осталось спичек Компа : " + comp);
                }
                else if (compguess == together){
                    comp -=1;
                    JOptionPane.showMessageDialog(null, "Комп выйграл раунд!");
                    System.out.println("Осталось спичек Игрока : " + player);
                    System.out.println("Осталось спичек Компа : " + comp);
                }
                else {
                    JOptionPane.showMessageDialog(null, "След Раунд.");
                    System.out.println("Осталось спичек Игрока : " + player);
                    System.out.println("Осталось спичек Компа : " + comp);
                }

                if (player == 0) {
                    JOptionPane.showMessageDialog(null, "Player Win!!!!!!");
                    break;
                }
                if (comp == 0) {
                    JOptionPane.showMessageDialog(null, "Comp Win!!!!!!");
                    break;
                }
            }

        }

    }

    private static int cRandom(int comp, String text){
        Random x = new Random();
        int num = x.nextInt(comp);
        System.out.println(text + num);
        return num;
    }

    private static int numMaik(int player, String labl) {
        String text;
        text = JOptionPane.showInputDialog(labl);
        int num;
        while (true){
            if (text == null){System.exit(0);}

            if (text.equals("0")){
                num = Integer.parseInt(text);
                System.out.println(labl + num);
                break;
            }
            else if (text.equals("1")){
                num = Integer.parseInt(text);
                System.out.println(labl + num);
                break;
            }
            else if (text.equals("2")){
                num = Integer.parseInt(text);
                System.out.println(labl + num);
                break;
            }
            else if (text.equals("3")){
                num = Integer.parseInt(text);
                System.out.println(labl + num);
                break;
            }
            else if (text.equals("4")){
                num = Integer.parseInt(text);
                System.out.println(labl + num);
                break;
            }
            else if (text.equals("5")){
                num = Integer.parseInt(text);
                System.out.println(labl + num);
                break;
            }
            else if (text.equals("6")){
                num = Integer.parseInt(text);
                System.out.println(labl + num);
                break;
            }
            else if (text.equals("7")){
                num = Integer.parseInt(text);
                System.out.println(labl + num);
                break;
            }
            else if (text.equals("8")){
                num = Integer.parseInt(text);
                System.out.println(labl + num);
                break;
            }
            else if (text.equals("9")){
                num = Integer.parseInt(text);
                System.out.println(labl + num);
                break;
            }
            else if (text.equals("10")){
                num = Integer.parseInt(text);
                System.out.println(labl + num);
                break;
            }
            else ; {
                JOptionPane.showMessageDialog(null, "Введите ЧИСЛО!!!!");
                text = JOptionPane.showInputDialog(labl);
                if (text == null){System.exit(0);}
            }

        }
        if (text == null){System.exit(0);}

        while (true) {
            if (0 <= num && num <= player) {
                break;
            }
            else {
                JOptionPane.showMessageDialog(null, "Введи число правильно!!!");
                num = Integer.parseInt(JOptionPane.showInputDialog(labl));
                System.out.println(labl + num);
            }
        }
        return num;
    }

}*/