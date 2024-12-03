package cipher;

import java.util.Scanner;

public class CaserCipher {

        
        public void run(){
                int key=0;
                Scanner sc=new Scanner((System.in));
                System.out.println("Welcome to CaeserCipher!!..");
                boolean isNotvalid = false;
                do{
                        System.out.println("Enter 1 for Custom Key\nEnter 2 for Basic Key");
                        System.out.print(">> "); 
                        int keyType=sc.nextInt();
                        sc.nextLine();
                        switch (keyType)
                         {
                                case 1:
                                        System.out.println("Enter the Key");
                                        System.out.print(">> ");
                                        key=sc.nextInt();
                                        sc.nextLine();
                                        isNotvalid=false; 
                                        break;
                                case 2:
                                        key=3;
                                        isNotvalid=false;
                                        break;
                                default:
                                        System.out.println("Enter valid option..");
                                        isNotvalid = true;
                                        break;
                        }
                        
                        
                }while (isNotvalid);

                do{
                        System.out.println("Enter 1 Encryption\nEnter 2 Decryption\nEnter 3 for Exit");
                        System.out.print(">> ");
                        int opt=sc.nextInt();
                        sc.nextLine();
                        switch (opt) {
                                case 1:{
                                        System.out.println("Enter the Data: ");
                                        System.out.print(">> ");
                                        String data = sc.nextLine();
                                        String ct=Encrypt(data,key);
                                        System.out.println("Encrytped Data: "+ct);
                                        break;
                                }
                                
                                case 2:{
                                        System.out.println("Enter the Data: ");
                                        System.out.print(">> ");
                                        String data = sc.nextLine();
                                        String pt=Decrypt(data,key);
                                        System.out.println("Decrypted Data: "+pt);
                                        break;

                                }
                                
                                case 3:
                                        System.out.println("Exiting...");
                                        sc.close();
                                        System.exit(0);
                                        break;

                        
                                default:
                                        System.out.println("Enter valid option...");
                                        break;
                        }
    
                }while (true);
        }

        static String Encrypt(String data, int key){
                StringBuffer sb=new StringBuffer(data);
                int num;
                char c;
                for(int i=0;i<sb.length();i++){
                        c=sb.charAt(i);
                        if(Character.isUpperCase(c)){
                                num=sb.charAt(i)-65;
                                num=(num+key)%26;
                                c=(char)(num+65);

                        }
                        else if(Character.isLowerCase(c)){
                                num=sb.charAt(i)-97;
                                num=(num+key)%26;
                                c=(char)(num+97);

                        }
                        sb.setCharAt(i, c);
                }

                return sb.toString();
        }

        static String Decrypt(String data, int key){
                return Encrypt(data,26-key);
        }


}