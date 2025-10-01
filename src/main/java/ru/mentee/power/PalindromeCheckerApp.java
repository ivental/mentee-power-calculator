package ru.mentee.power;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import static ru.mentee.power.PalindromeChecker.isPalindrom;

public class PalindromeCheckerApp {
        public static void main(String[] args) throws UnsupportedEncodingException {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));

            Scanner scan = new Scanner(System.in);
            System.out.print("Введите слово или предложение, чтобы узнать, является ли оно палиндромом :  ");
            String userInput = scan.nextLine().trim();
            scan.close();

            if (isPalindrom(userInput)) {
                System.out.println("Введенное выражение является палиндромом.");
            } else {
                System.out.println("Введенное выражение не является палиндромом.");
            }
        }
}

