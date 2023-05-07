package hashTable;

public class Entry {

    protected String key;
    protected long cardNumber;

    public Entry(String _key, long _cardNumber) {
        this.key = _key;
        this.cardNumber = _cardNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getKey() {
        return key;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setKey(String key) {
        this.key = key;
    }
}