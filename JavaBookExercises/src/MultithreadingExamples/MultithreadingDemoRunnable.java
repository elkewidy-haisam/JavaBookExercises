package MultithreadingExamples;

class MultithreadingDemoRunnable implements Runnable{
    public void run(){
        System.out.println("My thread is in running state.");
    }
    public static void main(String args[]){
        MultithreadingDemoRunnable obj=new MultithreadingDemoRunnable();
        Thread tobj =new Thread(obj);
        tobj.start();
    }
}
