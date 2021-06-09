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

        return list;
    }

}
