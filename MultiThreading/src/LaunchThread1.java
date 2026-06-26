public class LaunchThread1
{
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Application Started");

//        try {
//            Thread.sleep(5000);
//        }
//        catch (Exception e){
//            System.out.println("Exception occur");
//        }

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        Thread.sleep(4000);
        thread.setName("Telusko");
        thread.setPriority(4);
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println("Application Terminated");

    }
}
