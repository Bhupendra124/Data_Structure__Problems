package Bank.node;

import java.util.Scanner;

public class Queue
{
    Scanner scanner=new Scanner(System.in);

    static int cashBal =10000;
    public  Node front;
    public static   int COUNT=0;
    // method for Adding The Queue
    public void addAtFront(int data)
    {
        Node temp = new Node();
        temp.data =data;
        temp.nextNode = null;
        if(front == null)
        {
            front =temp;
        }
        else
        {
            Node  temp1 = front;
            while(temp1.nextNode!= null)
            {
                temp1=temp1.nextNode;
            }
            temp1.nextNode=temp;
        }
    }
    // method for Deleting The Queue
    public void deleteAtRear()
    {
        Node rear = new Node();
        rear= front;
        if(front ==null)
        {
            System.out.println("Sorry queue is Empty ");
        }
        else
        {
            front = front.nextNode;
        }
        COUNT--;
    }
    // method For Size
    public int size()
    {
        return COUNT;
    }

    // Function for operations withdraw and Deposit
    public void doOpearations()
    {
        int count= size();
        while(front != null)
        {
            System.out.println("Tranactions is Going on");
            if(front.data == 1)
            {
                System.out.println("Enter How Much Money Do U Want Deposit ");
                int money =scanner.nextInt();
                cashBal=cashBal+money;
                System.out.println( "user Deposit money Succesfully "+money);
                deleteAtRear();
            }
            else if(front.data == 2)
            {
                System.out.println("Enter How Much Money Do U Want Withdraw");
                int money =scanner.nextInt();
                if(money<cashBal)
                {
                    cashBal=cashBal-money;
                    System.out.println( "user Withdrawn money Succesfully " +money);
                    deleteAtRear();
                    break;
                }
                else
                    System.out.println("Cash Counter Empty");
                	System.exit(0);
            }
        }
    }
    public void display(){
        Node rear= front;
        if(rear==null)
        {
            System.out.println(" Queue Is Empty ");
        }
        else
        {
            while(rear!=null)
            {
                System.out.print(rear.data+"  ");
                rear=rear.nextNode;
            }
        }
    }
    public int  getCashCounterBalance()
    {
        return cashBal;
    }
}
