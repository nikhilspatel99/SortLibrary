
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.Character;




public class SortLib {
    
    public void FillArray(int [] a){
      
        for(int i=0; i<a.length;i++){
            int r= (int)(Math.random()*100+0);
            a[i]= r;
        }
    }
    
    public int[] Select(int[]a){
        int i;
        int c;
        for(i=0; i<a.length-1;i++){
            int counter=i;
            for(c =i+1;c<a.length;c++){
                if(a[c]<a[counter])
                    counter=c;
            }
            int load=a[counter];
            a[counter]=a[i];
            a[i]=load;
            //System.out.println("Swapped "+a[counter]+ " and " + a[i]+ " "+Arrays.toString(a));
        }
        return a;         
    }
  
    public int[] Insert(int a[]){
        int ci=0;
        while(ci<a.length-1){
            int index=ci;
            while(index<a.length-1){
                if(a[index]>a[index+1]){
                    int b=a[index];
                    a[index]=a[index+1];
                    a[index+1]=b;
                    System.out.println(Arrays.toString(a));
                }
                int i=index;
                while(i>0){
                    if(a[i-1]>a[i]){
                        int s=a[i];
                        a[i]=a[i-1];
                        a[i-1]=s;
                        System.out.println(Arrays.toString(a));
                    }
                    else{
                        i=-1;
                    }
                    i--;
                }
                index++;
            }
            ci++;
        }
        System.out.println(" ");
        return a;
    }
    
    public int[] Bubble(int a[])
    {
        for (int i=0;i<a.length;i++){
            int index=a[i];
            int c=i;
            while(c>0 && a[c-1]>index){
                a[c]=a[c-1];
                c--;        
            }
            a[c]=index;
            System.out.println(Arrays.toString(a));
        }
        return a;
    }//end method
    
//     public String [] StringBubble(String a[])
//    {
//        for (int i=1;i<a.length;i++){
//            int index=a[i];
//            int c=i;
//            while(c>0 && a[c-1]>index){
//                a[c]=a[c-1];
//                c--;        
//            }
//            a[c]=index;
//            System.out.println(Arrays.toString(a));
//        }
//        return a;
//    }//end method
    
    
    
    public void Merge(int a[]){
        int[] part1= Arrays.copyOfRange(a,0,a.length/2);
        int[] part2= Arrays.copyOfRange(a, a.length/2, a.length);
        
        System.out.println("Part 1 Orginal: "+Arrays.toString(part1));
        System.out.println("Part 2 Orginal: "+Arrays.toString(part2));
        System.out.println("");
        
        this.Bubble(part1);
        this.Bubble(part2);
        System.out.println("");
        System.out.println("Part 1 Sorted: "+Arrays.toString(part1));
        System.out.println("Part 2 Sorted: "+Arrays.toString(part2));
        
       //merging now
       int i=0;
       int p1i=0;
       int p2i=0;
       
       
       int[] big= new int[part1.length+part2.length];
       
       while (i<a.length){
           
           int p1=0;
           int p2=0;
           
           if(part1[p1i]<part2[p2i]){
               big[i]=part1[p1i];
               p1=1;
               
           }
          
           if(part2[p2i]<part1[p1i]){
               big[i]=part2[p2i];
               p2=1;
           }
           
           if(p1i==part1.length){
               big[i]=part2[p2i];
               p2=1;
           }
           
           if(p2i==part2.length){
               big[i]=part1[p1i];
               p1=1;
           }
           
           if(p1==1){
               p1i++;
               i++;  
           }
           if(p2==1){
               p2i++;
               i++;  
           }
           
           
         System.out.println(Arrays.toString(big));  
       }
       //System.out.println(Arrays.toString(big));
        
    }
    //Notes
    
    // Recursive Logic
    // 1) Base Case- stops the recursion
    // 2) Recursive Definition- computes values
    // 3) Recursive Call- Self Call
    //
    //n!=n*(n-1)!  Defined in itself but with a smaller version (n-1)! is smaller than n!
    //  it calls itself
    //
    //example: 4!=4*(4-1)!
    //              4*3*(3-1)!
    //              4*3*2*(2-1)!
    //              4*3*2*1*(1-1)!
    //              4*3*2*1*0!
    //              4*3*2*1*1
    
    // Multiplication Recursively
    // a*b= a+(a*(b-1))
    //      a+(a*(b-1))
    
    
    
    public long Factorial(int n){
        if(n==0){
            return 1;
        }
        else{
           return n*Factorial(n-1); 
        }
        

    }//end factorial
        
    public int Multi(int a, int b ){
        
        if(b==1){
            return a;
        }
        else{
            return a+Multi(a,(b-1));
        }
    }//end Multi
    
    public int Fib(int a){
        
        if(a==1){
            return 0;
        }
        if(a==2){
            return 1;
        }
    
        else{
            return (Fib(a-1)+Fib(a-2));
        }
       
    }
    // 0 1 1 2 3 5 8 13 21 34 55 89
    
    //Notes
    //                  
    // String.format("_", var1)
    // first paramter is called the format string (%c)
    
    
    public void FillCharArray(){
       char [][] m= new char [15][15];
       int bi=0;
       String msg="";
       while (bi<15){
           int li=0;
           while(li<15){
               int c= (int)(Math.random()*25+97);
               m[bi][li]=(char) c;
               msg= msg+String.format("%2c", m[bi][li]);
               li++;
           }//end inner while
           msg=msg+"\n";
           bi++;
       }//end outer while
       System.out.print(msg);      
    }//end FillCharArray
    
    public int[][] FillRubiks(int [][]m,int r){
        int i=0;
        while(i<r){
            int i2=0;
            int rowsize=(int)(Math.random()*8+1);
            int totalspaces= rowsize+0;
            m[i]=new int [rowsize];

            while(i2<rowsize){
                int rannum=(int)(Math.random()*50);
                m[i][i2]=rannum+1;
                i2++;
            }//inner while
            i++;
        }//outer while
        int y=0;
        while(y<r){
            System.out.println(Arrays.toString(m[y]));
            y++;
           
        }//print while
        return m;

    }//end FillRubiks
    
    public void RowRubiks(int[][]u, int r){
        int i=0;
        int size=0;
        
        while (i<r){
            size =size+u[i].length;
            i++;
        }
        System.out.println("");
        int []s= new int [size];
        i=0;
        int i2=0;
        int i3=0;
        
        while(i<r){
            i2=0;
            while(i2<u[i].length){
                s[i3]=u[i][i2];
                i2++;
                i3++;
            }
            i++;
        }
        
        System.out.println(Arrays.toString(s));
        this.Select(s);
        System.out.println(Arrays.toString(s));
        System.out.println("");
        
        i=0;
        i2=0;
        i3=0;
        
        String output="";
        while(i<r){
            i2=0;
            while(i2<u[i].length){
                u[i][i2]=s[i3];
                output=output+ String.format("%3d", u[i][i2]);
                i2++;
                i3++;
                
            }
            output=output+"\n";
            i++;
            
        }
        System.out.print(output);
        
            
        }
        
    public void ColRubiks(int [][]u, int r){
        int i=0;
        int size=0;
        
        while (i<r){
            size =size+u[i].length;
            i++;
        }
        System.out.println("");
        int []s= new int [size];
        i=0;
        int i2=0;
        int i3=0;
        
        while(i<r){
            i2=0;
            while(i2<u[i].length){
                s[i3]=u[i][i2];
                i2++;
                i3++;
            }
            i++;
        } 
        System.out.println(Arrays.toString(s));
        this.Select(s);
        System.out.println(Arrays.toString(s));
        System.out.println("");
        
        i=0;
        i2=0;
        i3=0;
        String output="";
        while(i2<8){
            i=0;
            while(i<r){
                if(i2<u[i].length){
                    u[i][i2]=s[i3];
                    i++;
                    i3++;  
                }
                else{
                    i++;
                }         
            }
            i2++;
        }
        i=0;
        i2=0;
        while(i<r){
            i2=0;
            while(i2<u[i].length){
                output=output+ String.format("%3d", u[i][i2]);
                i2++;
            }
            output=output+"\n";
            i++;  
        }
        System.out.print(output);
    }//end ColRubiks
    
    public int binarySearch(int [] a,int start, int end, int search){
        boolean trigger=false;
        int i=0;
        while(i<a.length)
        {
            if(search==a[i])
                trigger=true;
            i++;
        }
        while(trigger)
        {
            int middle=(end+start)/2;
        if(search== a[middle]){
            System.out.println("The index of your target "+search+ " is "+middle);
            return middle;
            
        }
        else if(search<a[middle]){
            
            return binarySearch(a, start, middle-1, search);
        }
        else{
            
            return binarySearch(a, middle+1, end, search);
            
        }
            
        }
        if(!trigger)
        {
            System.out.print("The number you inputed is not in the array, please run method again and choose a valid number");   
        }
        return 0;

    }
    
    
    
    public void swapSides(int [] a)
    {
        if(a.length%2==0)
        {
            int temp01;
            int temp02;
            int i=0;
            int j=a.length/2+1;
            while(j<a.length)
            {
                temp01=a[i];
                temp02=a[j];
                a[i]=temp02;
                a[j]=temp01;
                i++;
                j++;
            }
            int k=(a.length/2)-1;
            int l=a.length/2;
            temp01=a[k];
            temp02=a[l];
            a[k]=temp02;
            a[l]=temp01;    
        }
        else
        {
            int temp01;
            int temp02;
            int i=0;
            int j=a.length/2+1;
            while(j<a.length)
            {
                temp01=a[i];
                temp02=a[j];
                a[i]=temp02;
                a[j]=temp01;
                i++;
                j++;
            }  
        }
        System.out.println("The swaped array is "+Arrays.toString(a));
    }
    
    public void zeroSort(int [] a){
        int i=0;
        int c=0;
        while(i<a.length)
        {
            if(a[i]!=0)
                c++;
            i++;
        }
        int b[]=new int[c];
        i=0;
        int i2=0;
        while(i<a.length)
        {
            if(a[i]!=0)
            {
                b[i2]=a[i];
                i2++; 
            }
            i++; 
        }
        Select(b);
        i=0;
        i2=0;
        while(i<a.length)
        {
            if(a[i]!=0)
            {
                a[i]=b[i2];
                i2++;
            }
            i++;
        }
        System.out.println("The zero sorted array is "+Arrays.toString(a));   
    }
    public String[] hexValidation(String a[][])
    {
        ArrayList<String> IndexLoc = new ArrayList<String>();
        String check = " 0 1 2 3 4 5 6 7 8 9 A B C D E F a b c d e f ";
        String temp;
        int Col = 0;
        int Row = 0;
        int i = 0;
        while(Col < a.length) {
            while (Row < a[Col].length) {
                boolean Verify = false;
                    while(i<a[Col][Row].length())
                    {
                        CharSequence Char = " " + a[Col][Row].charAt(i) + " ";
                        if(!check.contains(Char))
                            Verify = true;
                        i++;
                    }
                i=0;
                if(Verify) {
                    temp = " " + Col + " " + Row + " ";
                    IndexLoc.add(temp);
                }
                Row++;
            }
            Row=0;
            Col++;
        }
        System.out.println(IndexLoc);
        Object[] fin = IndexLoc.toArray();
        String[] finString = Arrays.copyOf(fin, fin.length, String[].class);
        return finString;
        
    }
        
    
    public String diagMatch(int [][] a)
    {
        int nd=0;
        int pd=0;
        int row[]=new int [a.length];
        int col[]=new int[a[0].length];
        int t=0;
        int b=a.length-1;
        int i=0;
        String msg="";
        i=0;
        int i2=0;
        while(i<a.length)
        {
            i2=0;
            while(i2<a[0].length)
            {
                msg= msg+String.format("%3d", a[i][i2]);
                i2++;
            }
            msg=msg+"\n";
            i++;
        }//adding the double array to formatted msg
        msg=msg+"\n";
        i=0;
        while(i<col.length)
        {
            nd=nd+a[t][i];
            pd=pd+a[b][i];
            i++;
            t++;
            b--;
        }//Finding the sum of Negative Diagnol and Positive Diagnol
        int rsum=0;
        int colsum=0;
        int c=0;
        i=0;
        while(i<a.length)
        {
            c=0;
            rsum=0;
            while(c<a[0].length)
            {    
                rsum= rsum+(a[i][c]);
                c++;
            }
            row[i]=rsum;
            i++;
        }//finding sums for each row and adding it to an array
        i=0;
        while(i<a[0].length)
        {
            c=0;
            colsum=0;
            while(c<a.length)
            { 
                colsum=colsum+a[c][i];
                c++;
            }
            col[i]=colsum;
            i++;  
        }//finding sums for each col and adding it to an array
        i=0;
        int sucess=0;  
        boolean Tval =true;
        while(i<(a[0].length))
        {    
            if(nd==col[i])
            {
                msg=msg+"The Left Diagonal equals row "+ (i+1) +" = "+ col[i];
                msg=msg+"\n";
                sucess=1;           
            }
            if(nd==row[i])
            {
                msg=msg+"The Left Diagonal equals row "+ (i+1) +" = "+ row[i];
                msg=msg+"\n";
                sucess=1;
            }
            if(pd==col[i]){
                msg=msg+"The Right Diagonal equals col "+ (i+1) +" = "+ col[i];
                msg=msg+"\n";
                sucess=1;
            }
            if(pd==row[i])
            {
                msg=msg+"The Right Diagonal equals row "+ (i+1) +" = "+ row[i];
                msg=msg+"\n";
                sucess=1;
            }
            i++;
        }
        if(sucess==0)
            {
                msg=msg+"No Match:";
                msg=msg+"\n";
                msg+="Left Diagnol Sum = "+nd;
                msg=msg+"\n";
                msg+="Rigth Diagnol Sum = "+pd;
                msg=msg+"\n";
                c=0;
                while(c<a.length)
                {
                    msg+="Row "+(c+1)+" Sum = "+(row[c]);
                    c++;
                    msg=msg+"\n";
                }
                c=0;
                while(c<a[0].length)
                {
                    msg+="Col "+(c+1)+" Sum = "+(col[c]);
                    c++;  
                    msg=msg+"\n";
                }
            }
            return msg;   
    }
    public void lettersOnly(ArrayList <StringBuilder> a) {
        int i = 0;
        int size = a.size();
        while(i< size) {
            int i2 = (a.get(i)).length()-1;
            StringBuilder i3 = a.get(i);
            while(i2 >= 0) {
                if(Character.isLetter(i3.charAt(i2))) {
                    i2--;
                }
                else {
                    a.get(i).append(i3.charAt(i2));
                    a.get(i).deleteCharAt(i2);
                }
            }
            i++;
        }
        System.out.print(a.toString());
    } 
}
    







    

