public class Que2 {
    private int x = instanceMethodOne();
    private int y = instanceMethodTwo();

    private static int z = staticMethodOne();

    public  int instanceMethodOne(){
        System.out.println("4-I am instance method one");
        return 1;
    }

    public int instanceMethodTwo(){
        System.out.println("5-I am instance method two");
        return 1;
    }

    public static int staticMethodOne(){
        System.out.println("1-I am static method one");
        return 1;
    }

    public static int staticMethodTwo(){
        System.out.println("I am static method two");
        return 1;
    }

    {
        System.out.println("6-I am instance initialization block one");
    }
    {
        System.out.println("7-I am instance initialization block two");
    }

    static{

            System.out.println("2-I am static initialization block one");
    }
    static{

        System.out.println("3-I am static initialization block two");
    }
    Que2(){
        System.out.println("8-Constructor one");
    }
    Que2(int a){
        System.out.println("9-Constructor two");
    }





}
