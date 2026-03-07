package Java.InputFormats;
import java.util.*;
public class stringInputs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // CASE 1 : ['A','B','C','D','e'] or {'A','B','C','D','E'}
        String s = sc.nextLine();
        StringBuilder StrBil = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        for(char a:s.toCharArray()){
            if(Character.isLetter(a)){
                    StrBil.append(a);
            }
            else{
                arr.add(StrBil.toString());
                StrBil.setLength(0);
            }
        }
        if(StrBil.length()>0){
            arr.add(StrBil.toString());
        }
        for(String a:arr){
            System.out.print(a);
        }




        //CASE 2: A B C D
        String s = sc.nextLine();
        String[] arr = s.split(",");
        for(String a:arr){
            System.out.println(a);
        }




        //CASE 3 :
        // 4
        // A
        // B
        // D
        // C
        int a = sc.nextInt();
        String[] arr = new String[a+1];
        for(int i=0;i<=a;i++){
            arr[i] = sc.nextLine();
        }
        for(String Z:arr){
            System.out.println(Z);
        }

        //CASE$ 4: 
        // Do not Know What Input Was Given in Line By Line
        // A
        // B
        // C
        // D
        //.....(We Dont the limit or length of the Input)
        ArrayList<String> arr = new ArrayList<>();
        while(true){
            String a = sc.nextLine();
            if(a.isEmpty()){
                break;
            }
            arr.add(a);
        }
        for(String z : arr){
            System.out.println(z);
        }




    }

    
}
