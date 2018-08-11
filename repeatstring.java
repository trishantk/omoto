import java.util.*;
public class MyClass {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String str1[]=str.split(",");
    String arrstr[]=new String[str1.length];
    int arrcount[]=new int[str1.length];
    
  
       
       for(int i=0;i<str1.length-1;i++){
           int count=1;
           for(int j=i+1;j<str1.length;j++){
        if(str1[i].equals(str1[j]) && (str1[j]!="q")){
            count++;
            str1[j]="q";        //counting the repetition of strings and putting a dummy value q at the repeated locations and storing distict array and its count in diff array.
            
            }
            if(str1[i]!="q"){
            arrstr[i]=str1[i];
            arrcount[i]=count;
            }
                      
       }}
       int temp=0;
        String tempstr=null;
        for(int i=0;i<arrstr.length-1;i++){
            
           for(int j=i+1;j<arrstr.length;j++){
               if(arrstr[i]!="q"){                  //sorting the count array with string array
           if(arrcount[i]<arrcount[j]){
               
               temp=arrcount[i];
               tempstr=arrstr[i];
               arrcount[i]=arrcount[j];
               arrstr[i]=arrstr[j];
               arrcount[j]=temp;
               arrstr[j]=tempstr;
           }
               
           }}}
      for(int i=0;i<5;i++){
          System.out.print(arrstr[i]+"-->");        //printing top five repeated strings.
          System.out.println(arrcount[i]);
      }
        
    }
}
