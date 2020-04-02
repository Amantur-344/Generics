
public class Main {
    public static void main(String[] args) {
        Thread Barcelona = new Thread(new FootballMatch(),"Barcelona");
        Thread RealMadrid = new Thread(new FootballMatch(), "Real Madrid");

//попробовал все но не смог сделать вс епесполезно


        for(int i = 0; i < 100; i++) {
            Barcelona.start();
            RealMadrid.start();
            if(Consider.gol < 15){
                break;
            }
        }
    }
}
