
import java.util.PriorityQueue;
import java.util.Queue;


public class Main {

    public static void main(String[] args) throws InterruptedException{
        
    
        Queue<Hasta> acilservis = new PriorityQueue<Hasta>();
        
        acilservis.offer(new Hasta("Emre Bey","Baş ağrısı"));
        acilservis.offer(new Hasta("Merve Hanım","Apandisit"));
        acilservis.offer(new Hasta("Oğuz Bey","Yanık"));
        acilservis.offer(new Hasta("Elif Hanım","Apandisit"));
        acilservis.offer(new Hasta("Teoman Bey","Baş ağrısı"));
        acilservis.offer(new Hasta("Şule Hanım","Yanık"));
        int i = 1;
        while(acilservis.isEmpty() != true){
            
            System.out.println("*************************");
            System.out.println(i + ".sırada :");
            System.out.println(acilservis.poll());
            System.out.println("*************************");
            i++;
            Thread.sleep(1500);

        }        
        
    }
}
