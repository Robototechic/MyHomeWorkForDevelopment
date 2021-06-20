package com.myhome.firsthomework;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValueFromList {

    public static List<String> funcFindMaxValueFromList(List<String> listThird) {
        int countMaxValueFromList = 3;
        List<String> finalList = new ArrayList<String>();

        for(int i = 0; i< countMaxValueFromList; i++) {
            int maxValueInList = 0;
            for(int j=0; j<listThird.size(); j++) {
                String stringValueInList = listThird.get(j);
                int valueInList = Integer.parseInt(stringValueInList);
                if(valueInList > maxValueInList) {
                    maxValueInList = valueInList;
                }
            }
            finalList.add(String.valueOf(maxValueInList));
            listThird.remove(String.valueOf(maxValueInList));
        }
        return finalList;
    }
}
