// example showing the concept of Thread 

class Demo9{
    public static void main(String args[]){
        /*
        Runnable obj = new Runnable(){
            @Override
            public void run(){
                System.out.println("Run method executes");
            }
        };        
        Thread th1 = new Thread(obj);
        th1.start();
        */

       /*
        Thread th1 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Run method executes");
            }
        });
        th1.start();
        */
        /*
        new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Run method executes");
            }
        }).start();
       */
      /*
        Thread th1 = new Thread(){
            @Override
            public void run(){
                System.out.println("Run method executes");
            }
        };
        th1.start();
        */
       /*
        new Thread(){
            @Override
            public void run(){
                System.out.println("Run method executes");
            }
        }.start();
       */
        /*
        Runnable obj = ()->System.out.println("Run method executes"); 
        Thread th1 = new Thread(obj);
        th1.start();
        */
       /*
        Thread th1 = new Thread(()->System.out.println("Run method executes"));
        th1.start();
        */

        new Thread(()->System.out.println("Run method executes")).start();

    }
}