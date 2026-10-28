package oops;

interface Bird{
    void canFly();
}
class Eagle implements Bird{
    public void canFly(){
        System.out.println("Egle can fly");
    }
}

public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        //using class object

        Eagle e=new Eagle();
        e.canFly();

        //using anonymous class
//        Bird b= new Bird(){
//            public void canFly(){
//                System.out.println("Eagle can fly");
//            }
//        };


        //using lambda

        Bird b=()->{
            System.out.println("Eagle can fly");
        };
        b.canFly();
        
    }
}
