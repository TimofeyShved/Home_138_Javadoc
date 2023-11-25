package com.company;

/*
* <h1>Это мой главный класс, я буду писать в нём код</h1>
* @author Timofey
* @version 0.0.1
* @sine 1.0
* В документацию можно вписывать как в <b>html</b>
* <img src="doc-files/enot.jpeg" alt="enot" /?>
* */
public class Main {

    /*
    *  Это моё поле и его зовут myField, он целочисленный
    *
    * */
    int myField;

    /*
    * Это стартовая точка программы
    * @param args
    * */
    public static void main(String[] args) {

    }

    /*
    * Этот метод вернёт i
    * @param i целое число
    * @param s строка
    * @throws RuntimeException обработка ошибки
    * */
    int getMyField(int i, String s) throws RuntimeException{

        return i;
    }

    /*
    * Старый метод
    * @deprecated Используйте вместо него новый метод "newMethod"
    * */
    void oldMethod(){
        System.out.println("Устаревшие действия");
    }

    /*
     * Новый метод
     * @see OtherClass#otherMetod
     * @link OtherClass#otherMetod
     * */
    void newMethod(){
        System.out.println("Новые действия");
    }
}
