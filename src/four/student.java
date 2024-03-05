package four;

public class student extends people{
    public String name="子类student中的变量";
    @Override
    public void run() {
        System.out.println("学生跑得快");
    }
}
