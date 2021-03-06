import java.util.Scanner;
public class Driver{
    public static void main(String args[]){
        long startTime = System.nanoTime();
        int numTestCases;
        Scanner sc = new Scanner(System.in);
        numTestCases = sc.nextInt();
        while(numTestCases-->0){
            int size;
            size = sc.nextInt();
            A2DynamicMem obj = new A2DynamicMem(size, 2);
            int numCommands = sc.nextInt();
            // System.out.println(size);
            while(numCommands-->0) {
                String command;
                command = sc.next();
                int argument=-1;
                argument = sc.nextInt();
                  // System.out.println(command + " " + argument);
                int result = -5;
                switch (command) {
                    case "Allocate":
                        result = obj.Allocate(argument);
                        break;
                    case "Free":
                        result = obj.Free(argument);
                        break;
                    case "Defragment":
                        obj.Defragment();
                        break;
                    default:
                        break;
                }
                if (!command.equals("Defragment")) {
                    // System.out.println(result);
                }
                
                // obj.freeBlk.print();
                // obj.allocBlk.print();  
                
            }
        }
        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime)/1000000000.0);   
    }
}