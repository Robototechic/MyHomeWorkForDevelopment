package com.myhome.firsthomework;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {

            String path = "C:\\Users\\maksi\\Documents\\myDevelopment\\FirstHomeWork\\fileMassiveNumberOne.csv";
            List<String> listFirst = ReadFile.readFileFunc(path);

            path = "C:\\Users\\maksi\\Documents\\myDevelopment\\FirstHomeWork\\fileMassiveNumberTwo.csv";
            List<String> listSecond = ReadFile.readFileFunc(path);
            List<String> listThird = new ArrayList<String>();

            for(int i=0; i<listFirst.size(); i++) {
                String paramFromFirstList = listFirst.get(i);
                if(listSecond.contains(paramFromFirstList) && !listThird.contains(paramFromFirstList)) {
                    listThird.add(paramFromFirstList);
                }
            }
            if(listThird.size() != 0) {
                System.out.println("Result: " + FindMaxValueFromList.funcFindMaxValueFromList(listThird));
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

