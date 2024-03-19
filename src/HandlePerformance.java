import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HandlePerformance {

    Scanner reader = new Scanner(System.in);

    Queue<Performance> performance = new LinkedList<>();




    public void handlePerformance(){
    int choice = 0;
    do{
        System.out.println("\n"+"Here are the complementary passes operations available to you" + "\n");
        System.out.println("Type 1 to add performance" + "\n");
        System.out.println("Type 2 to display the list  of  performances" + "\n");
        System.out.println("Type 3 to start the performance" + "\n");
        System.out.println("Type 4 to QUIT" + "\n");
        choice = reader.nextInt();
        reader.nextLine();
        switch (choice){
            case 1:
                System.out.println("How many performance would you like to add :");
                int num = reader.nextInt();
                reader.nextLine();
                addPerformance(num);
                break;
            case 2:
                displayPerformance();
                break;
            case 3:
                startPerformance();
                break;
            case 4:
                break;
            default:
                System.out.println("Invaild choice. Please enter a vaild choice");
           }
        }while(choice != 4);
   }
    

    public void addPerformance(int num){

        for(int i = 0; i < num; i++){
            System.out.println("Enter the Performance ID :");
            String  performanceID = reader.nextLine();

            System.out.println("Enter the name of Performance  :");
            String performanceName = reader.nextLine();

            System.out.println("Enter the  name of the lead performance :");
            String performanceLeadName = reader.nextLine();

            System.out.println("Enter the rank of the performance  :");
            char performanceGroup = reader.nextLine().charAt(0);


            Performance performance = new Performance(performanceID, performanceName, performanceLeadName, performanceGroup);

            this.performance.offer(performance);
    }

}

         public void displayPerformance(){
            System.out.println("Here is the list of performance:" + "\n" + performance);
    }
    
    public void startPerformance(){
        System.out.println("The next performance starrting is:"  + performance.poll());
    }

}