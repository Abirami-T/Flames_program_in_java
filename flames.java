import java.util.*;
class flame{
    void fun1(String n1, String n2){
       int len1=n1.length();
       int len2=n2.length();
       StringBuilder s1=new StringBuilder(n1);
       StringBuilder s2=new StringBuilder(n2);
       outerloop:
       for(int i=0;i<len1;i++){
           innerloop:
           for( int j=0;j<len2;j++){
               if(s1.charAt(i)==s2.charAt(j)){
                   s1.setCharAt(i,'#');
                   s2.setCharAt(j,'#');
                   break;
               }
           }
       }
       int c1,c2,c;
       
       c1=fun2(s1.toString(),len1);
       c2=fun2(s2.toString(),len2);
       c=c1+c2;
       game(c1);
    }
    int fun2(String n1,int l1){
        int c1=0;
        for(int i=0;i<l1;i++){
            if(n1.charAt(i)=='#'){
                continue;
            }
            c1++;
        }
        return c1;
    }
    
    void game(int c) {
        StringBuilder list = new StringBuilder("FLAMES");
        int j = 5;
        int m = 0;
        int x = list.length();
        for (int i = 0; list.length()>1; i++) {
            m++;
            if (m == c) {
                
                
                list.deleteCharAt(i);
                m = 0;
                i--;
                
            }
            if(i==list.length()-1){
                    i=-1;
                }
        }
        switch(list.charAt(0)){
            case 'F':System.out.println("Friends");
            break;
            case 'L':System.out.println("Love");
            break;
            case 'A':System.out.println("Affection");
            break;
            case 'M':System.out.println("Marriage");
            break;
            case 'E':System.out.println("Enemy");
            break;
            case 'S':System.out.println("Sister");
            break;
            default:System.out.println("Exceptional case");
            
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String n1,n2;
        n1=in.next();
        n2=in.next();
        n1=n1.toLowerCase();
        n2=n2.toLowerCase();
        flame f=new flame();
        f.fun1(n1,n2);
    }
}
