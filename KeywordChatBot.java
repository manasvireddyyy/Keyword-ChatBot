import java.util.Scanner;

public class KeywordChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.print("You: ");
            String user = sc.nextLine().trim().toLowerCase();
            
            if(user.contains("bye")){
                System.out.println("Gold Fish: Bye!");
                break;
            }
            else if(user.contains("how are you")){
                System.out.println("Gold Fish: I'm just a bot, but thanks for asking!");
            }
            else if(user.contains("hello") || user.contains("hi")){
                System.out.println("Gold Fish: Hey, hi!");
            }
            else if(user.contains("happy")){
                System.out.println("Gold Fish: That sounds great!!");
            }

            else if(user.contains("sad")){
                System.out.println("Gold Fish: OFoohhh! i'm sorriee to hear that");
            }
            else if(user.contains("angry")){
                System.out.println("Gold Fish: Oh no! don't be angry");
            }
            else{
                System.out.println("Gold Fish: I dont understand");
            }
        }

        sc.close();
    }
}