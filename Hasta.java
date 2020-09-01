
public class Hasta implements Comparable<Hasta> {
    private String isim;
    private String sikayet;
    
    private int öncelik;
    
    public Hasta(String isim,String sikayet){
        this.isim = isim;
        this.sikayet = sikayet;
        
        if(sikayet.equals("Apandisit")){
            this.öncelik = 3;
        }
        else if(sikayet.equals("Yanık")){
            this.öncelik = 2;
        }
        else{
            this.öncelik = 1;
        }
    }

    @Override
    public String toString() {
        String bilgiler = "Hasta adı : " + isim
                        + "\n Şikayet : " + sikayet
                        + "\n Öncelik : " + öncelik;
        
        return bilgiler;
    }

    @Override
    public int compareTo(Hasta hasta) {
        if(this.öncelik > hasta.öncelik){
            return -1;
        }
        else if(this.öncelik < hasta.öncelik){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    
}
