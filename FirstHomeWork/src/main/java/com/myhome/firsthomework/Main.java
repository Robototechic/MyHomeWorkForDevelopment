package com.myhome.firsthomework;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            ReadFile readFileFirst = new ReadFile("C:\\Users\\maksi\\Documents\\development\\FirstHomeWork\\fileMassiveNumberOne.csv");
            ReadFile readFileSecond = new ReadFile("C:\\Users\\maksi\\Documents\\development\\FirstHomeWork\\fileMassiveNumberTwo.csv");

            List<String> listFirst = new ArrayList<String>();
            List<String> listSecond = new ArrayList<String>();
            List<String> listThird = new ArrayList<String>();
            List<String> listFour = new ArrayList<String>();
            listFirst.addAll(0, readFileFirst.readFileFunc());
            listSecond.addAll(0, readFileSecond.readFileFunc());
            FindMaxValueFromList findMaxValueFromList = new FindMaxValueFromList();
            CheckNumbersInList checkNumbersInList = new CheckNumbersInList();

            checkNumbersInList.funcCheckNumberInList(listFirst);
            checkNumbersInList.funcCheckNumberInList(listSecond);

            for(int i=0; i<listFirst.size(); i++) {
                String paramFromFirstList = listFirst.get(i);
                if(listSecond.contains(paramFromFirstList) && !listThird.contains(paramFromFirstList)) {
                    listThird.add(paramFromFirstList);
                }
            }
            if(listThird.size() != 0) {
                findMaxValueFromList.funcFindMaxValueFromList(listThird, listFour);
                System.out.println("Result: " + listFour);
            }
            else {
                System.out.println("No matches found in the files!");
            }

        } catch (IOException e) {
            System.out.println("File not found! " + e.getMessage());

        } catch (NumberFormatException nfe) {
            System.out.println("The file has an invalid format value: " + nfe.getMessage());
        }
    }

}

