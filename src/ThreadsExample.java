
public class ThreadsExample extends Thread{
    public static void main (String[] args){
        ThreadsExample thread = new ThreadsExample();
        thread.start();

        System.out.println("This code is outside of the thread");
    }
    public void run(){
        System.out.println("This code is running.....");
    }

}
