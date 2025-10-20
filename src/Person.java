public class Person {

    String name;
    String adress;
    String email;
    String personalId;

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    public String getPersonalId() {
        return personalId;
    }

    public Person(String name, String adress, String email, String personalId) {
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.personalId = personalId;
    }
    public Person(){

    }
}
