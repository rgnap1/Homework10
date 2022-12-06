import  java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework10");
        System.out.println("task 1, 2, 3");
        System.out.println();

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        String result = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + result);
        String endFullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " +endFullName);

        System.out.println();
        System.out.println("task 3 option 2.");
        String [] threeWords = fullName.split(" " + 3);
        System.out.println(Arrays.toString(threeWords));





    }
}



