package main;

import com.company.Someclass.Someclass;
/*1) Создать класс с двумя переменными. Добавить метод
вывода на экран значений этих переменных.
Добавить метод, который находит сумму
значений этих переменных, и метод который
находит наибольшее значение из этих 
двух переменных.
*/
public class Main {

    public static void main(String[] args) {
        Someclass someclass = new Someclass();
        Someclass.vivod();
        System.out.println(Someclass.summ());
        System.out.println(Someclass.max());
    }
}
