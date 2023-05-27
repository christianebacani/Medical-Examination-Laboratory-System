import java.util.Scanner;
public class MedicalExaminationLaboratorySystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int price[] = {189,289,389,489,589,689,789};
        boolean transaction = true;
        
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        while(transaction){
        
        System.out.print("\n\tAVAILABLE MEDICAL EXAMINATIONS\n\n");
        System.out.print("EXAMINATION\t\t\tPRICE\n\n");
        System.out.print("1.) Blood Test\t\t\tP 189\n\n");
        System.out.print("2.) Urinalysis\t\t\tP 289\n\n");
        System.out.print("3.) Fecalysis \t\t\tP 389\n\n");
        System.out.print("4.) Med Test  \t\t\tP 489\n\n");
        System.out.print("5.) Pap smear \t\t\tP 589\n\n");
        System.out.print("6.) Blood Smear\t\t\tP 689\n\n");
        System.out.print("7.) Genetic Test\t\tP 789\n\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        total += price[choice - 1];
       
        System.out.print("Do you want to take more examinations (y/n)?: ");
        input.nextLine();
        String examMore = input.nextLine();
        
        if(examMore.equalsIgnoreCase("n")){
            transaction = false;
            System.out.print("The total price is : P " + total + "\n");
            
            System.out.print("Enter your payment : P ");
            int payment = input.nextInt();
            
            int change = payment - total;
            
            System.out.print("Change : P " + change + "\n\n");
              
        }
        
        }
    }
}
