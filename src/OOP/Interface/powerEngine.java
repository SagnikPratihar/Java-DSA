package OOP.Interface;

public class powerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Power engine accelerate");
    }
}
