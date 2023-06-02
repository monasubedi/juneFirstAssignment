public class Que1 {
    static int count = 0;

    Que1(){
        ++count;
    }

    public static int getCount(){
        return count;
    }

    public static void main(String[]args){
        Que1 instance = null;
        for(int i = 0; i < 3; i++){
            instance = new Que1();
        }
        System.out.println("Number of instances so far =" + instance.getCount());
    }


}
