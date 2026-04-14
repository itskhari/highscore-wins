package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreApp {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter game score");
    System.out.println("Format: Home:Visitor|0:0");
    System.out.print("Enter here: ");
    String finalScore = sc.nextLine();

    String[] splitInput = finalScore.split(Pattern.quote("|"));
    String teamName = splitInput[0];
    String[] teams = teamName.split(Pattern.quote(":"));

    String teamscores = splitInput[1];
    String[] scores = teamscores.split(Pattern.quote(":"));
    int home = Integer.parseInt(scores[0]);
    int away = Integer.parseInt(scores[1]);

    if (home > away) {
        System.out.println("Winner: Home");
    } else if (away > home) {
        System.out.println("Winner: Visitor");
    }
    if (home == away) {
        System.out.println("Game ends in tie");
    }


    }
}
