

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class TestSortLib {
    
    public static void main (String args[])
    {
        //int a[]= new int[9];
        SortLib f= new SortLib();
        ArrayList<StringBuilder> a= new ArrayList<StringBuilder>();
        StringBuilder sb = new StringBuilder("2Abd* > ?5PkWde");
        a.add(sb);
        SortLib m= new SortLib();
        f.lettersOnly(a);
        

        
        //f.FillArray(a);
        //System.out.println("Randomly Filed Array: "+Arrays.toString(a));
        //System.out.println("");
        
        //f.Select(a);
        //System.out.println(Arrays.toString(a));
        
        //f.Insert(a)
        //System.out.print(Arrays.toString(a));
        
        //f.Bubble(a);   
        //System.out.print(Arrays.toString(a));
        
        //f.Merge(a);
        
        //long result=f.Factorial(50);
        //System.out.println(result);
        
        //int result=f.Multi(3, 4);
        //System.out.println(result);
        
        //int result=f.Fib(11);
        //System.out.println(result);
        
        //f.FillCharArray();
        
        //int r=10;
        //int [][]m=new int [r][];
        //int u[][]=f.FillRubiks(m,r);
        //f.ColRubiks(u, r);

        //77SortLib f= new SortLib();
        boolean tVal= true;
        System.out.println("-----------------------------------");
        System.out.println("Nikhil Patel's SortLib Interface");     
        while(tVal)
        {
            System.out.println("-----------------------------------");
   
            System.out.println("Type Option to Run Method");
            System.out.println(" ");
            System.out.println("1: Binary Search");
            System.out.println("2: Array Swap");
            System.out.println("3: Non-Zero Swap");
            System.out.println("4: Hex Validation");
            System.out.println("5: Diagognal Match");
            System.out.println("6: Quit");
            System.out.println("7: Letters Only");
            System.out.println(" ");
            
            Scanner option= new Scanner(System.in);
            System.out.print("Enter Option: ");
            int chosen= option.nextInt();
            System.out.println("-----------------------------------");
            
            switch(chosen)
            {
                case 1: 
                    System.out.println("You have chosen Binary Search");
                    System.out.println(" ");
                    int []z={1,2,3,4,5,6,7,8,9,10};
                    System.out.println("The Array that is being passed is "+Arrays.toString(z));
                    System.out.println("Please Type the number you wish to find: ");
                    Scanner binaryInput= new Scanner(System.in);
                    int target= binaryInput.nextInt();
                    System.out.println(" ");
                    System.out.println("Your target number is "+target);
                    System.out.println(" ");   
                    f.binarySearch(z,0,9,target);
                    System.out.println(" ");  
                    break;
                    
                case 2:
                    System.out.println("You have chosen Array Swap");
                    System.out.println(" ");
                    int []h={1,2,3,4,5,6,7,8,9,10,11};
                    int []j={1,2,3,4,5,6,7,8,9,10};
                    System.out.println("Would you like an Even or Odd array?");
                    System.out.println("Enter 1 for Even and 2 for Odd");
                    Scanner swap= new Scanner(System.in);
                    int input= swap.nextInt();
                    if(input!=1 | input!=2)
                        System.out.println("The number you have entered is not valid please run method again and enter valud number");
                    if(input==1)
                    {
                        System.out.println("The Array that is being passed is "+Arrays.toString(j));
                        f.swapSides(j);
                        System.out.println("");
                        
                    }
                    if(input==2)
                    {
                    System.out.println("The Array that is being passed is "+Arrays.toString(h));
                    f.swapSides(h);    
                    }                 
                    break;
                    
                case 3:
                    System.out.println("You have chosen Non-Zero Swap");
                    System.out.println(" ");
                    int []zo={0,0,18,0,0,0,-2,0,0,5,0,0,0,6,0,12};
                     System.out.println("The Array that is being passed is "+Arrays.toString(zo));
                     f.zeroSort(zo);
                     break;
                     
                case 4:
                    System.out.println("You have chosen Hex Validatin");
                    System.out.println(" ");
                    String hexValues[][] = {{"Af012","34fgH","1234567"},{"ghikl","34f00","fdeAB567"},{"Af02k","34fbe","f0034AB"}};
                    //System.out.println("The double array being passed is "+Arrays.toString(hexValues));
                    int i=0;
                    int i2=0;
                    System.out.print("The String double array being passed is: ");
                    System.out.println("");
                    System.out.println("");
                    while(i<hexValues.length)
                    {
                        i2=0;
                        while(i2<hexValues[i].length)
                        {
                            System.out.print(hexValues[i][i2]+" ");
                            i2++;
                        }
                        System.out.println("");
                        i++;
                    }
                    System.out.println("");
                    System.out.println("The invalud Hexidecimal values are located at: ");
                    f.hexValidation(hexValues);
                    break;
                    
                case 5:
                    System.out.println("You have chosen Diagognal Match");
                    System.out.println(" ");
                    int b[][] = {{3,5,5,6},{3,9,4,5},{7,6,2,1},{3,4,8,7}};
                    System.out.println(f.diagMatch(b));
                    break;
                    
                case 6:
                    tVal=false;
                    break;
                    
                case 7:
                    System.out.println("You have chosen Letters Only");
                    System.out.println(" ");
                    System.out.println("Please Enter a String to be sorted: ");
                    Scanner lOInput= new Scanner(System.in);
                    String iput=lOInput.next();
                    StringBuilder inpt= new StringBuilder (iput);
                    ArrayList <StringBuilder> list= new ArrayList<StringBuilder>();
                    list.add(inpt);
                    f.lettersOnly(list);
                    break;
                    //2Abd* > ?5PkWde
                    
                    
                    
                    
                    
                    
                    
                 
                 
                    
               
            }
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
    }
}
