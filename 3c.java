import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String enc="",dec="";
        for(char c:text.toCharArray()){
            if(c>='a'&&c<='z')
            enc+=(char)('z'-(c-'a'));
            else
            enc+=c;
        }
        
        for(char e:enc.toCharArray()){
            if(e>='a'&&e<='z')
            dec+=(char)('z'-(e-'a'));
            else
            dec+=e;
        }
        System.out.println("Encrypted: "+enc);
        System.out.println("Decrypted: "+dec);
    }
}
