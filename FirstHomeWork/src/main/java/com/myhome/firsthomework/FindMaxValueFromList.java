package com.myhome.firsthomework;

import java.util.List;

public class FindMaxValueFromList {

    //нужно ли тут использовать НЕстатичекую функцию?
    //возвращаемое значение все таки лучше возвращать из функции, а не держать в качестве "входных" параметров
    public void funcFindMaxValueFromList(List<String> listThird, List<String> listFour) {
        int countMaxValueFromList = 3;
        for(int i = 0; i< countMaxValueFromList; i++) {
            int maxValueInList = 0;
            for(int j=0; j<listThird.size(); j++) {
                String stringValueInList = listThird.get(j);
                int valueInList = Integer.parseInt(stringValueInList);
                if(valueInList > maxValueInList) {
                    maxValueInList = valueInList;
                }
            }
            listFour.add(String.valueOf(maxValueInList));
            listThird.remove(String.valueOf(maxValueInList));
        }
    }


}
