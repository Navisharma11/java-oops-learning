class Producer extends Thread {
    Queue q;
    int i = 1;

    public Producer(Queue q) {
        this.q = q;
    }

    public void run()
    {
        while (true)
        {
            q.produce(i++);
        }
    }
}

class Consumer extends Thread
{
    Queue q;

    public Consumer(Queue q)
    {
        this.q=q;
    }

    public void run()
    {
        while (true)
        {
            q.consume();
        }
    }
}

class Queue
{
    int data;
    boolean flag = false;

    synchronized public void produce(int i)
    {
        try
        {
            if(flag == true)
            {
                System.out.println("Producer in waiting state");
                wait();
            }
            else
            {
               data = i;
               System.out.println("I Have Produced Data "+data);
               flag = true;
               notify();
             }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    synchronized public void consume()
    {
        try
        {
            if(flag == false)
            {
                System.out.println("Consumer in wait state");
                wait();
            }
            else
            {
                System.out.println("I Have Consumed Data "+data);
                flag = false;
                notify();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}



public class LaunchInterThread1
{
    public static void main(String[] args)
    {
        Queue q = new Queue();

//        new Producer(q).start();
//        new Consumer(q).start();

        Producer prod = new Producer(q);
        Consumer c = new Consumer(q);

        prod.start();
        c.start();
    }
}
