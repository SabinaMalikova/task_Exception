import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);

        Person person = new Person();


        try {
            System.out.println("Введите имя: ");
            person.setName(scannerStr.nextLine());
            if (!person.getName().matches("[a-zA-Z]+")) {
                throw new MyExceptions("Имя не может содержать цифры и другие символы! ");
            }
        } catch (MyExceptions e) {
            System.out.println(e.getMessage());

        }


        try {
            System.out.println("Введите фамилию: ");
            person.setSurname(scannerStr.nextLine());
            if (!person.getSurname().matches("[a-zA-Z]+")) {
                throw new MyExceptions("Фамилия не может содержать цифры и другие символы!");
            }
        } catch (MyExceptions e) {
            System.out.println(e.getMessage());
        }


        try {
            System.out.println("Введите дату рождения : ");
            person.setDateOfBirth(scannerNum.nextInt());
            if (Pattern.matches("[0-9]+",Integer.toString(person.getDateOfBirth()))){
                throw new MyExceptions("Год рождения должен содержать только цифры!");
            }
            if (person.getDateOfBirth() > LocalDate.now().getYear()) {
              throw new MyExceptions("Неправильно введен год! год из будущего");
            }
        }catch (MyExceptions e){
            System.out.println(e.getMessage());
        }


        try {
            System.out.println("Введите год начала работы : ");
            person.setDateOfStartWork(scannerNum.nextInt());
            if (person.getDateOfStartWork()>LocalDate.now().getYear()){
                throw new MyExceptions("Неправильно введен год! год из будущего!");
            }
            if (!(person.getDateOfStartWork() > person.getDateOfBirth()+18)){
                throw new MyExceptions("Человек еще не достиг совершеннолетия!");
            }
        }catch (MyExceptions e){
            System.out.println(e.getMessage());
            return;
        }


        int experience = LocalDate.now().getYear() - person.getDateOfStartWork();
        System.out.println("Стаж работы: "+experience);

    }
}