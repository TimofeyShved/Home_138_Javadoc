package com.company;

/**
 *
* <h1>Eto moy glavniy class</h1>
* @author Timofey
* @version 0.0.1
* @since 1.0
* V documente mo)/(no pisat kak v <b>html</b>
* <img src="doc-files/enot.jpeg" alt="enot">
* */
public class Main {

    /**
    *  Eto moyo pole myField, on celoe chislo
    *
    * */
    int myField;

    /**
    * Eto starovaya tochka programi
    * @param args
    * */
    public static void main(String[] args) {
        oldMethod();
        newMethod();
    }

    /**
    * Etot metod vernet i
    * @param i celoe chislo
    * @param s stroka
    * @throws RuntimeException oshibka
     * @return i celoe chislo
    * */
    int getMyField(int i, String s) throws RuntimeException{

        return i;
    }

    /**
    * stariy metod
    * @deprecated ispolzuy metod @see Main#otherMetod
    * */
    static void oldMethod(){
        System.out.println("Устаревшие действия");
    }

    /**
     * nowiy metod
     * @see OtherClass#otherMetod()
     * Pereyti po ssilke {@link OtherClass#otherMetod()}
     * */
    static void newMethod(){
        System.out.println("Новые действия");
        OtherClass otherClass = new OtherClass();
        otherClass.otherMetod();
    }
}
