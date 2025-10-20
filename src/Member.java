

public class Member extends Person{
    String buyDate;
    String lastPayed;
    String memberShip;

    public Member() {
        super();

    }

    public String getBuyDate() {
        return buyDate;
    }

    public String getLastPayed() {
        return lastPayed;
    }

    public String getMemberShip() {
        return memberShip;
    }

    public Member(String name, String adress, String email, String personalId, String buyDate, String lastPayed, String memberShip) {
        super(name, adress, email, personalId);
        this.buyDate = buyDate;
        this. lastPayed = lastPayed;
        this.memberShip = memberShip;
    }
}
