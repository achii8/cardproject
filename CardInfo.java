
import java.io.Serializable;



enum CardType{
    Mastercard(0), Visa(1), AMEX(2);
    private int number;
    CardType(int n){
        number=n;
    }
    int getNumber(){
        return number;
    }
}

public class CardInfo implements Serializable {
    private String cardNumber;
    private String validThro;
    private int CCV2;
    private String cardHolderName;
    private String cardHolderSurname;
    private CardType cardtype;



    /**
     * CardInfo Constructor
     * @param cardNumber
     * @param validThro
     * @param CCV2
     * @param cardHolderName
     * @param cardHolderSurname
     * @param cardtype
     */
    public CardInfo(String cardNumber, String validThro, int CCV2, String cardHolderName,
                    String cardHolderSurname, CardType cardtype) {
        if(cardNumber.length()>16 || cardNumber.length()<16){
            this.cardNumber="არასწორი ნომერი!";
        }
        else{
            this.cardNumber = cardNumber;
        }

        this.validThro = validThro;
        this.CCV2 = CCV2;
        this.cardHolderName = cardHolderName;
        this.cardHolderSurname = cardHolderSurname;
        this.cardtype = cardtype;

    }
    public CardInfo(){
        this.cardNumber="0000000000000000";
        this.CCV2=000;
        this.validThro="00/00";
        this.cardHolderName="John";
        this.cardHolderSurname="Doe";
        this.cardtype= CardType.AMEX;
    }



    /**
     * CREATING GETTER METHODS
     * @return
     */
    public String getCardNumber() { return cardNumber; }

    public String getValidThro() { return validThro; }

    public int getCCV2() { return CCV2; }

    public String getCardHolderName() { return cardHolderName; }

    public String getCardHolderSurname() { return cardHolderSurname; }

    public CardType getCardType() { return cardtype; }

    /**
     * CREATING SETTER METHODS
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public void setValidThro(String validThro) { this.validThro = validThro; }

    public void setCCV2(int CCV2) { this.CCV2 = CCV2; }

    public void setCardHolderName(String cardHolderName) { this.cardHolderName = cardHolderName; }

    public void setCardHolderSurname(String cardHolderSurname) { this.cardHolderSurname = cardHolderSurname; }

    public void setCardType(CardType cardType) { this.cardtype = cardType; }


    @Override
    public String toString(){
        return "ბარათის 16ნიშნა ნომერი:"+ this.cardNumber + " || კლიენტის სახელი:"+this.cardHolderName+" " +
                "|| კლიენტის გვარი:"+this.cardHolderSurname+" ||ბარათის ვადები:"+this.validThro+" ||CCV2 კოდი:"
                +this.CCV2+ " ||ბარათის ტიპი:"+this.cardtype;
    }


}

