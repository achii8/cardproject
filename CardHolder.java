
import java.util.HashMap;
import java.util.Map;

public class CardHolder   {

    /**
     * ველებად შემოვიტანე CardHolder კლასის სტატიკური ობიექტი.
     * იდენტიფიკატორი, რომ განვსაზღვრო მონაცემთა რაოდენობა
     * HashMap ბარათების შესაქმნელად, რომელსაც
     */
    private static CardHolder instance=new CardHolder();
    private static int identificator;

    private Map<Integer,CardInfo>clients=new HashMap<>();

    /**
     * CardHolder კონსტრუქტორი იდენტიფიკატორს თავიდან 0 მნიშვნელობას ანიჭებს
     */


    CardHolder(){
        this.identificator=0;
    }


    public void addClient(CardInfo cardInfo){
        if(cardInfo==null){
            return;
        }

        this.clients.put(identificator, cardInfo);
        this.identificator++;

    }


    public boolean removeByIdentificator(int id){
        if(0>identificator && identificator<id){
            return false;
        }
        this.clients.remove(id);
        return true;
    }


    public CardInfo getCard(int id){
        if(0 < this.identificator && this.identificator < id && this.clients.containsKey(id)){
            return null;
        }

        return this.clients.get(id);
    }


    public void getAllCards(){
        for(int i=0;i<identificator;i++)
            System.out.println(CardHolder.getInstance().getCard(i));
    }


    /**
     * ბარათების რაოდენობის ბეჭდვა
     * @return
     */

    public int getSize(){ return this.clients.size(); }

    /**
     * Instance-ს დაბრუნება
     * @return
     */

    public static CardHolder getInstance() { return instance; }




}
