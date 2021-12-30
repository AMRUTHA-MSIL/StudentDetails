import java.io.*;
import java.util.Scanner;

class Student {

    float eng, phy, chem, math, comp,sports1,sports2,sports3;
    String text,grade;
    double total, average, totalpercentage,sportstotal,granttotal,studypercentage,sportspercentage,score;

    void input() {
        Scanner op=new Scanner(System.in);
        System.out.println("Enter name of the student:");
        Scanner stdname=new Scanner(System.in);
        text=stdname.nextLine();
        System.out.println("Enter marks of five subjects:");
        System.out.print("Enter marks of English subjects:");
        eng=op.nextFloat();
        System.out.print("Enter marks of physics subjects:");
        phy=op.nextFloat();
        System.out.print("Enter marks of chemistry subjects:");
        chem=op.nextFloat();
        System.out.print("Enter marks of maths subjects:");
        math=op.nextFloat();
        System.out.print("Enter marks of computers subjects:");
        comp=op.nextFloat();
        System.out.println("enter marks of sports1");
        sports1=op.nextFloat();
        System.out.println("enter marks of sports2");
        sports2=op.nextFloat();
        System.out.println("enter marks of sports2");
        sports2=op.nextFloat();
    }
}

class Main extends Student {

    void display() {
        total = eng + phy + chem + math + comp;
        sportstotal=sports2+sports1+sports3;
        granttotal=total+sportstotal;
        average = (total / 5.0);
        studypercentage = (total / 350.0) * 100;
        sportspercentage=(sportstotal/100.0)*100;
        totalpercentage=(granttotal/450.0)*100;
        System.out.println("Total marks ="+total);
        System.out.println("Sports total marks="+sportstotal);
        System.out.println("Average marks = "+average);
        System.out.println("marks Percentage = "+studypercentage);
        System.out.println("sports percentage="+sportspercentage);
        System.out.println("total percentage="+totalpercentage);
        if(granttotal>200) {
            System.out.println("student is passed");
        }else{
            System.out.println("student is failed");
        }
        switch((int) (granttotal/8.0)) {

            case 4:
                grade = "O";
                break;
            case 3:
                grade = "A";
                break;
            case 2:
                grade = "B";
                break;
            case 1:
                grade = "C";
                break;
            default:
                grade = "F";
                break;
        }

        // display result
        System.out.println("Grade = " + grade);

    }

    public static void main(String args[]) throws IOException {
        Main c = new Main();
        c.input();
        c.display();
    }
}