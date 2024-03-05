package four;

public class teacher extends people{
    public String name="子类teacher中的变量";
    @Override
    public void run() {
        System.out.println("老师跑得快");
    }
}
