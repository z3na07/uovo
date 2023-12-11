public class cucinauovo {
    public static void main(String[] args) {
        System.out.println("\nucina l'uovo");
        for(int i=0; i<100;i++){
            System.out.print("°_°");
            Wait();
        }
    }

    private static void Wait() {
        try{
            Thread.sleep(1000)
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
