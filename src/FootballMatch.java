import java.util.ArrayList;

public class FootballMatch implements Runnable {

    @Override
    public void run() {
        random(Consider.gol);
        System.out.println(Consider.gol);
    }
    static void random(int number){
        int rand = (int)(Math.random() * 10);
        if(rand > 5 ){
            number ++;
            System.out.println("Команда: " + Thread.currentThread().getName() + " забивает гол");
        }else
            number += 0;// просто для красоты
    }
}
