package ru.mentee.power;
import java.util.Scanner;

    public class PalindromeChecker {
        public static boolean isPalindrom(String input) {
            if (input == null) {
                return false;
            }

            // Удаляем пробелы и приводим к нижнему регистру
            String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
            String reverseSpelling = "";

            for (int i = cleanedInput.length() - 1; i >= 0; i--) {
                reverseSpelling = reverseSpelling + cleanedInput.charAt(i);
            }

            return reverseSpelling.equals(cleanedInput);
        }
    }

