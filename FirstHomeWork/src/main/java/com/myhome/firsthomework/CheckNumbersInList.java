package com.myhome.firsthomework;

import java.util.List;

public class CheckNumbersInList {

    //выглядит избыточным делать проверку отдельными методами, тем более что оно в нескольких местах
    //вполне себе норм сделать было преобразование при загрузке из файса сразу и один раз
    public void funcCheckNumberInList(List<String> list) throws NumberFormatException{

        for(int i=0; i<list.size(); i++) {
            int paramFromFirstList = Integer.parseInt(list.get(i));
        }
    }

}
