package com.ncu.main;
import com.ncu.exception.*;
import com.ncu.validators.*;
import java.util.Scanner;
import java.io.*;
public class ProCal{
    public String user_name;
    public int user_id = 1;
    private String password;
    public static int count = 1;
    public static String input;
    ProCal(String Ruser, String Rpassword) {
        this.user_id = count++;
        this.user_name = Ruser;
        this.password = Rpassword;
        count++;
        System.out.printf("User %s has been created \n", Ruser);
        System.out.printf("Enter 'login' to log in or 'register' to open another account");
    }
    public static void login(String Luser, String Lpassword) {
        for (int i = 1; i <= count; i++) {
            System.out.printf("Enter 'login' to log in or 'register' to open another account");
        }
    }
    public static void main(String[] args) throws EmptyFileException, MissingException 
    {  
        Scanner scanner = new Scanner(System.in);
        System.out.println("login");
        System.out.println("register");
        input = scanner.nextLine();
            while (input.equals("login")) {
                System.out.println("username");
                String Luser = scanner.nextLine();
                System.out.println("Password");
                String Lpassword = scanner.nextLine();
                int a = count;
                login(Luser, Lpassword);
                System.out.println("");
                input = scanner.nextLine();
            }
            while (input.equals("register")) {
                System.out.println("username");
                String Ruser = scanner.nextLine();
                System.out.println("Password");
                String Rpassword = scanner.nextLine();
                ProCal count = new ProCal(Ruser, Rpassword);
                System.out.println("");
                input = scanner.nextLine();
            }
            while ((!input.equals("register")) || (!input.equals("login"))) {
                System.out.println("invild option, choose login or regiser!");
                input = scanner.nextLine();
            }
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<LOGIN SUCCESSFUL>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("+++++++++++++++++++++++++++++++++WELCOME+++++++++++++++++++++++++++++++++++++");
System.out.println("press 1 to add task");
System.out.println("press 2 to update task");
System.out.println("press 3 to delete task");
System.out.println("press 4 to display");
System.out.println("press 5 to exit");
System.out.println("****************************************************************************");
Scanner input = new Scanner(System.in);
int cases = input.nextInt();
switch(cases)
{
    case 1:
    {
        System.out.println("selected option: 1. add task");
        try{
            File f1 = new File("Productivity Calculator.txt"); //if(f1.createNewFile()){
                //System.out.println("File Created with File Name : "+f1.getName());
                FileWriter fw = new FileWriter(f1,true);
                BufferedWriter bw = new BufferedWriter(fw);
                int another = 1;
                do{
                System.out.print("Enter Routine task :");
                String task = input.next();
                bw.write(task+",");
                System.out.print("Enter category(Productive/Non-Productive) :");
                String category = input.next();
                bw.write(category+",");     
                //System.out.print("To enter time in hours press h/H and to enter in minutes press m/M :");
                //char ftime = sc.next().charAt(0);
                Float time;
                //if(ftime == 'm' || ftime == 'M' ) {
                //  System.out.print("Enter time(Minutes) :");
                //  time = sc.nextFloat();
                //  time = time/60;
                //  bw.write(time+"");
                //}
                //if(ftime == 'h' || ftime == 'H'){
                    System.out.print("Enter time(Hours) :");
                    time = input.nextFloat();
                    bw.write(time+"");  
                //} 
                System.out.println("Press 1 to add another task or 0 to leave:");
                another = input.nextInt();
                bw.newLine();
                }   while(another==1);
            bw.close(); 
        } 
        catch(Exception e)
        {
            System.out.println("Error Ocurred");
        }
          int s=0;
          float time;
          {
 //value of sum enter
 //add is used;
          s+=time;
          if(s<=24)
          {
          System.out.println("You Can add");
          }
          else
          System.out.println(" You cant add");
          //then back to add menu or update menu
         //subtract is used
         s+=time;
         }
         System.out.println("Hours left");
        //then back to add menu
        break;
    }
case 2:
{
    System.out.println("Selected Option 2. update");
    System.out.println("enter the routine task");
    Scanner sc = new Scanner(System.in);
    String sctask = sc.nextLine();
    File f=new File("D:\\java\\unguided project\\file\\Productivity Calculator.txt");
    Scanner myReader = new Scanner(f);
    boolean found=false;
    String restAll="";
    while(myReader.hasNextLine())
    {
        String data = myReader.nextLine();
        if(data.split(";")[0].equals(sctask)){
            found=true;
        }
    }
        if(found==true){
        System.out.println("Enter productive task to update and non-productive task and hours");
        String scChoice = sc.nextLine();
        if(scChoice.trim().equalsIgnoreCase("productive")){
        System.out.println("enter new productive task");
        }
        String scValue = sc.nextLine();
        File f1=new File("D:\\java\\unguided project\\file\\Productivity Calculator.txt");
        Scanner myReader2 = new Scanner(f1);
            while(myReader2.hasNextLine())
            {
                String data = myReader2.nextLine();
                System.out.println(data);
                if(data.split(";")[0].equals(sctask)){
                    String newData = sctask+";"+data.split(";")[1]+";"+scValue+";"+data;
                    restAll = restAll + "\r\n" +newData;
                    System.out.println("EQUALS:"+restAll);
                }
                else{
                    System.out.println("Different:" +restAll);
                    restAll = restAll +"\r\n" +data;
                }
            }
        System.out.println(restAll);
    }else if(scChoice.trim().equalsIgnoreCase("non-productive")){
            System.out.println("enter the new non-productive");
            String scValue = sc.nextLine();
            File f1=new File("D:\\java\\unguided project\\file\\Productivity Calculator.txt");
            Scanner myReader2 = new Scanner(f1);
            while(myReader2.hasNextLine())
            {
                String data = myReader2.nextLine();
                System.out.println(data);
                if(data.split(";")[0].equals(sctask)){
                    String newData = sctask+";"+data.split(";")[1]+";"+scValue+";"+data;
                    restAll = restAll + "\r\n" +newData;
                    System.out.println("EQUALS:"+restAll);
            }
                else{
                    System.out.println("Different:" +restAll);
                    restAll = restAll +"\r\n" +data;
                    }
                }
            System.out.println(restAll);
        
    }
       else if(scChoice.trim().equalsIgnoreCase("hours")){
        System.out.println("Enter the number of hours");
        String scValue = sc.nextLine();
        File f1= new File("D:\\java\\unguided project\\file\\Productivity Calculator.txt");
        Scanner myReader2 = new Scanner(f1);
        while(myReader2.hasNextLine())
        {
            String data = myReader2.nextLine();
            if(data.split(";")[0].equals(sctask)){
                String newData = sctask+";"+scValue+";"+data.split(";")[2]+";"+data;
                restAll = restAll +"\r\n" +newData;
            }
            else 
            {
            restAll = restAll + "\r\n" +data;
            }
        }
        
   } else
    {
        System.out.println("Wrong choice entered");
        break;
    }
    restAll=restAll.trim();
    myReader.close();
    FileWriter myWriter = new FileWriter("D:\\java\\unguided project\\file\\ProductivityCalculator.txt");
    myWriter.write(restAll);
    myWriter.close();
    System.out.println("data has been updated");
    else{
    System.out.println("data is not present");
}
}
   
case 3:
{
    System.out.println("selected option 3. Display");
    System.out.println("enter the productive task u want to delete:");
    String productive = input.nextLine();
    System.out.println("Enter the non-productive task u want to delete");
    String nonproductive = input.nextLine();
    System.out.println("enter a time that you want to delete");
    float time = input.nextFloat();
    String restAll="";
    try
    {
        File f =new File("D:\\java\\unguided project\\file\\Productivity Calculator.txt");
        Scanner myReader2 = new Scanner(f);
        while(myReader2.hasNextLine())
        {
            String data = myReader2.nextLine();
            if(data.contains(productive) & data.contains(nonproductive) & data.contains(time))
            {
                continue;
            }
            else
            {
                restAll = restAll + "\r\n" +data;
            }
        }
        restAll=restAll.trim();
        System.out.println(restAll);
        myReader2.close();
    }
    catch(Exception e)
    {
        System.out.println("error");
    }
    break;
}
case 4:
{
    try
    {
        File f=new File("D:\\java\\unguided project\\file\\Productivity Calculator.txt");
        FileReader fin = new FileReader(f);
        BufferedReader bin = new BufferedReader(fin);
        String s;
        System.out.println("\n.................................................details....................................");
        while((s=bin.readLine())!=null)
        {
            System.out.println(" "+s);
        }
    }
    catch(Exception e)
    {
        System.out.println("Error");
    }
    break;
}
case 5:
System.out.println("\nSelected Option: 5. exit");
break;
default:
System.out.println("INVALID CHOICE...........................");
System.out.println("PLEASE ENTER AGAIN!!!!!!!!!!!!!!!!");
break;
}
}
}



