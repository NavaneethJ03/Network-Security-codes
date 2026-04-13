import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();
        System.out.print("Enter shift: ");
        int shift=sc.nextInt();
        StringBuilder enc=new StringBuilder(),dec=new StringBuilder();
        
        for(char c:text.toCharArray()){
            if(Character.isLetter(c)){
                char base=Character.isUpperCase(c)?'A':'a';
                char e=(char)(base+(c-base+shift)%26);
                enc.append(e);
                dec.append((char)(base+(e-base+(26-shift))%26));
            }else{
                enc.append(c);
                dec.append(c);
            }
        }
        
        System.out.println("Encrypted: "+enc);
        System.out.println("Decrypted: "+dec);
    }
}
