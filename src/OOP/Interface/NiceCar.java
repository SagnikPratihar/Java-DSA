package OOP.Interface;

public class NiceCar {
    private  Engine engine;
    private Media player=new cdPlayer();

    public NiceCar() {
        engine=new powerEngine();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }

    public void start(){
        engine.start();
    }

    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

   public void upgradeEngine(){
        this.engine=new ElectricEngine();
   }
}
