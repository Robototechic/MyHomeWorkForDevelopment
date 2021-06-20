package com.myhome.firsthomework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static List<String> readFileFunc (String path) throws IOException, NumberFormatException {

        List<String> list = new ArrayList<String>();
        File file = new File(path);
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(file);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line = reader.readLine();
        list.add(line);
        while (line != null) {
            // считываем остальные строки в цикле
            line = reader.readLine();
            if (line != null) {
                list.add(line);
            }
        }

        for(int i=0; i<list.size(); i++) {
            int paramFromFirstList = Integer.parseInt(list.get(i));
        }
        fr.close();

        return list;
    }

}
