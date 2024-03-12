import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int dateOfStartWork;

    public Person() {
    }

    public Person(String name, String surname, int dateOfBirth, int dateOfStartWork) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.dateOfStartWork = dateOfStartWork;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDateOfStartWork() {
        return dateOfStartWork;
    }

    public void setDateOfStartWork(int dateOfStartWork) {
        this.dateOfStartWork = dateOfStartWork;
    }







}
