import java.util.Scanner;
class Student
{
    String name;
    int sub1,sub2,sub3,sub4,sub5,avg,sum;
    int rollno;


    public static void main(String args[])
    {
        Student s=new Student();

        s.createAccount();

        System.out.println("Your name is :"+s.name);
        System.out.println("Your rollno is :"+s.rollno);
        System.out.println("Your sum of all your subjects is is :"+s.sum);
        System.out.println("Your average of all your subjects is is :"+s.avg);


    }

    void createAccount()
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your name:");
        name = sc.next();

        System.out.println("Enter your rollno:");
        rollno = sc.nextInt();

        System.out.println("Enter marks in subject 1:");
        sub1 = sc.nextInt();

        System.out.println("Enter marks in subject 2:");
        sub2 = sc.nextInt();

        System.out.println("Enter marks in subject 3:");
        sub3 = sc.nextInt();

        System.out.println("Enter marks in subject 4:");
        sub4 = sc.nextInt();

        System.out.println("Enter marks in subject 5:");
        sub5 = sc.nextInt();

        sum=sub1+sub2+sub3+sub4+sub5;
        avg=sum/5;




    }


}
