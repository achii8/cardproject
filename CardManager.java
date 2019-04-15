
public class CardManager {
    public static void main(String[] args) {
        CardInfo john=new CardInfo();
        CardHolder.getInstance().addClient(john);

        CardInfo achi=new CardInfo("1111222233334444","20/20",123,"Archili",
                "Vardidze", CardType.Visa);
        CardHolder.getInstance().addClient(achi);

        CardInfo rati= new CardInfo("1111222233334444","12/20", 777,"rati"," laitadze", CardType.Visa);
        CardHolder.getInstance().addClient(rati);
        CardInfo [] c={
                new CardInfo("4929370647252219","01/2021",386,"Beverly","Walkowiak", CardType.Visa),
                new CardInfo("4485753871439543","01/2020",126,"Susan"," Vogt", CardType.Mastercard),
                new CardInfo("5443408276597217","11/2021",656,"Anna","Maynard", CardType.AMEX),
                new CardInfo("4929557410800535","09/2040",345,"nika","Walkowiak", CardType.Visa),
                new CardInfo("4929370647252219","01/2021",386,"tornike","Walkowiak", CardType.Mastercard),
                new CardInfo("4929370647252219","01/2021",386,"malxazi","Walkowiak", CardType.Visa),
                new CardInfo("4929370647252219","01/2021",386,"oto","Walkowiak", CardType.Visa),
                new CardInfo("4929370647252219","01/2021",386,"giorgi","Walkowiak", CardType.Mastercard),
                new CardInfo("4929370647252219","01/2021",386,"nino","Walkowiak", CardType.Visa),
                new CardInfo("4929370647252219","01/2021",386,"khatia","Walkowiak", CardType.AMEX)
        };

        for(int i=0;i<c.length;i++){
            CardHolder.getInstance().addClient(c[i]);
        }

        CardHolder.getInstance().getAllCards();

        System.out.println("ბარათების რაოდენობა არის : " +CardHolder.getInstance().getSize());

        CardHolder.getInstance().removeByIdentificator(3);
        System.out.println("ახლანდელი რაოდენობა არის : "+CardHolder.getInstance().getSize());



    }
}
