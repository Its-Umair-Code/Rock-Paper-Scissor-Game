import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        Random sc = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("\t-----------------------------------------------");
        System.out.println("\t|          Rock-Paper-Scissor Game            |");
        System.out.println("\t-----------------------------------------------");
        System.out.println("\tPress:");
        System.out.println("\t1 = START GAME");
        System.out.println("\t2 = INSTRUCTIONS");
        System.out.println("\t3 = QUIT");
        int num1;
        num1 = s.nextInt();
        if(num1==1){
        int ran = sc.nextInt(1,4);
        String rand;
        if(ran==1){
            rand="Rock";
        }
        else if(ran==2){
            rand="Paper";
        }
        else{
            rand="Scissor";
        }
        int num;
        System.out.println("Press one of your desired number : \n\t1 = Rock \n\t2 = Paper \n\t3 = Scissor ");
        num = s.nextInt();
        String numb;
        if(num==1){
            numb="Rock";
        }
        else if(num==2){
            numb="Paper";
        }
        else{
            numb="Scissor";
        }
        if(rand=="Rock"  &&  numb=="Rock"){
            System.out.println("------------------\n| Match is Tie ! |\n------------------");
            System.out.println("Hint : \n  Because computer enter "+rand+" and you also enter "+numb+".");
        }
        else if(rand=="Paper" && numb=="Paper"){
            System.out.println("------------------\n| Match is Tie ! |\n------------------");
            System.out.println("Hint : \n  Because computer enter "+rand+" and you also enter "+numb+".");
        }
        else if(rand=="Scissor" && numb=="Scissor"){
            System.out.println("------------------\n| Match is Tie ! |\n------------------");
            System.out.println("Hint : \n  Because computer enter "+rand+" and you also enter "+numb+".");
        }
        else if(rand=="Rock" && numb=="Paper"){
            System.out.println("-------------\n| YOU WIN ! |\n-------------");
            System.out.println("Hint : \n  Because computer enter "+rand+" and you enter "+numb+".");
        }
        else if(rand=="Rock" && numb=="Scissor"){
            System.out.println("--------------\n| YOU LOSE ! |\n--------------");
            System.out.println("Hint : \n  Because computer enter "+rand+" and you enter "+numb+".");
        }
        else if(rand=="Paper" && numb=="Rock"){
            System.out.println("--------------\n| YOU LOSE ! |\n--------------");
            System.out.println("Hint : \n  Because computer enter "+rand+" and you enter "+numb+".");
        }
        else if(rand=="Paper" && numb=="Scissor"){
            System.out.println("-------------\n| YOU WIN ! |\n-------------");
            System.out.println("Hint : \n  Because computer enter "+rand+" and you enter "+numb+".");
        }
        else if(rand=="Scissor" && numb=="Paper"){
            System.out.println("--------------\n| YOU LOSE ! |\n--------------");
            System.out.println("Hint : \n  Because computer enter "+rand+" and you enter "+numb+".");
        }
        else if(rand=="Scissor" && numb=="Rock"){
            System.out.println("-------------\n| YOU WIN ! |\n-------------");
            System.out.println("Hint : \n  Because computer enter "+rand+" and you enter "+numb+".");
        }
        else{
            System.out.println("Out of Rules!");
        }
     } 
     else if(num1==2){
        System.out.println("<--Paper Defeats Rock-->");
        System.out.println("<--Rock Defeats Scissor-->");
        System.out.println("<--Scissor Defeats Paper-->");
     } 
     else{
        System.out.println("<---You Quit The Game!--->");
     }
    } 
}