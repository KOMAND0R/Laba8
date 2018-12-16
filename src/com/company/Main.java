package com.company;

import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите текст: ");
        try(FileWriter writer = new FileWriter("src/txtFile.txt", false))
        {
            String text = "";
            while (!(text.equals("0")))
            {
                text = sc.nextLine();
                if (!(text.equals("0")))
                {
                    writer.write(text + "\r\n");
                }
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

