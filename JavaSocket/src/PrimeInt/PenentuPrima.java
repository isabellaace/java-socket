package PrimeInt;

public class PenentuPrima {
	private int bilUji;
    private boolean truePrima;
   
    /**
     * Constructor
     * @param bilUji : bilangan yang akan diuji apakah prima atau bukan
     */
    public PenentuPrima(int bilUji) {
        this.bilUji = bilUji;
        prosesCek();
    }
   
    /**
     * Method untuk mengembalikan string
     * Apakah bilangan uji termasuk prima atau bukan
     */
    public String getPrima() {
        if (truePrima) {
            return "Bilangan "+bilUji+" Merupakan Bilangan Prima";
        } else {
            return "Bilangan "+bilUji+" Bukan Merupakan Bilangan Prima";
        }
    }
   
    /**
     * Method yang memproses untuk menentukan prima atau bukan
     */
    private boolean prosesCek() {
        truePrima = true;
        for (int i=bilUji-1;i>1;i--) {
            if (bilUji % i == 0) {
                truePrima = false;
            }
        }
        return truePrima;
       
    } 

}
