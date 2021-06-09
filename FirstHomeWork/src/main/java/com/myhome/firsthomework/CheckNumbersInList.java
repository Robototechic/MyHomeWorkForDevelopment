package com.myhome.firsthomework;

import java.util.List;

public class CheckNumbersInList {

    public void funcCheckNumberInList(List<String> list) throws NumberFormatException{

        for(int i=0; i<list.size(); i++) {
            int paramFromFirstList = Integer.parseInt(list.get(i));
        }
    }

}
