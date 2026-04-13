import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine().toUpperCase();
        
        String enc="",dec="";
        
        for(int i=0;i<text.length();i+=2){
            int a=text.charAt(i)-'A',b=text.charAt(i+1)-'A';
            
            int x=(3*a+3*b)%26;
            int y=(2*a+5*b)%26;
            enc+=(char)(x+'A');
            enc+=(char)(y+'A');
        }
        
        for(int i=0;i<enc.length();i+=2){
            int a=enc.charAt(i)-'A',b=enc.charAt(i+1)-'A';
            int x=(15*a+17*b)%26;
            int y=(20*a+9*b)%26;
            dec+=(char)(x+'A');
            dec+=(char)(y+'A');
        }
        
        System.out.println("Plain text: "+text);
        System.out.println("Encrypted text: "+enc);
        System.out.println("Decrypted text: "+dec);
    }
}
