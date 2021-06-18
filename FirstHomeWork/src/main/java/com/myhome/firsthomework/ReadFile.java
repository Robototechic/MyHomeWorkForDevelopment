package com.myhome.firsthomework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    private final String path;

    List<String> list = new ArrayList<String>();

    public ReadFile(String path) {

        this.path = path;
    }

    //использоваие в данном случае класса кажется избыточным, по сравнению с простым статическим методом. Для чего сделано именно так?
    public List<String> readFileFunc () throws IOException {

        File file = new File(path);
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line = reader.readLine();
        list.add(line);
        while (line != null) {
//            System.out.println(line);
            // считываем остальные строки в цикле
            line = reader.readLine();
            if (line != null) {
                list.add(line);
            }
        }

        //https://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html#close
        fr.close();

        return list;
    }

}
