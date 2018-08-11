import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    



public class date{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String strfromdate=sc.next();
        System.out.println("input from date:"+strfromdate);
        String strtodate=sc.next();
        System.out.println("input to date:"+strtodate);
        
        
        String strfromdatearr[];
        strfromdatearr=strfromdate.split("-");
      
    int y=Integer.parseInt(strfromdatearr[0]);
    int m=Integer.parseInt(strfromdatearr[1]);
    int d=Integer.parseInt(strfromdatearr[2]);

        String strtodatearr[];
        strtodatearr=strtodate.split("-");
        fromdateret(y, m, d);
    int  y1=Integer.parseInt(strtodatearr[0]);
    int  m1=Integer.parseInt(strtodatearr[1]);
    int  d1=Integer.parseInt(strtodatearr[2]);
        todateret(y1,m1,d1);
        sc.close();
        
    }
   static void fromdateret(int yyyy,int mm,int dd){
    if(mm<=12){
    dd=01;
    System.out.println("output from date return:"+yyyy+"-"+mm+"-"+dd);}
   }
   static void todateret(int yyyy,int mm,int dd){
       
       
  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
   LocalDateTime now = LocalDateTime.now();  
   String dt=dtf.format(now);
   String dtarr[];
   dtarr=dt.split("-");
   int  ynow=Integer.parseInt(dtarr[0]);
    int  mnow=Integer.parseInt(dtarr[1]);
    int  dnow=Integer.parseInt(dtarr[2]);
    
    String strnow=""+ynow+mnow+dnow;
    String strtodate=""+yyyy+mm+dd;
    
    
    int fullnowdate=Integer.parseInt(strnow);
    int fulltodate=Integer.parseInt(strtodate);
    if(fullnowdate>=fulltodate){
                
       if(mm<=12){
        if(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12){
        dd=31;}
        else if(mm==2){
            if(yyyy%4==0)
                dd=29;
            else dd=28;
        }
        else dd=30;
        }
        
        System.out.println("to date return:"+yyyy+"-"+mm+"-"+dd);
    }
       else{
          yyyy=ynow;mm=mnow;dd=dnow;
           System.out.println("to date return:"+yyyy+"-"+mm+"-"+dd);
       }
       
   }
   
   }
