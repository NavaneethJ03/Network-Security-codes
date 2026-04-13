import java.util.*;
class UFWFirewall{
public static void main(String [] args){
try{
System.out.println("Configure UFW firewall");
new processBuilder("sudo" , "UFW" , "default" , "deny" , "incoming").start();
new processBuilder("sudo" , "UFW" , "default" , "allow" , "outgoing").start();
new processBuilder("sudo" , "UFW" , "allow" , "80/tcp").start();
new processBuilder("sudo" , "UFW" , "enable").start();
System.out.println("UFW configured to allow only webtraffic");
}
catch (IoException e){
	System.out.println("Error configuring firewall");
}}

	
