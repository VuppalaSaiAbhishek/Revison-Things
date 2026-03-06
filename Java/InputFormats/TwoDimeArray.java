package Java.InputFormats;
import java.util.*;

public class TwoDimeArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        //CASE 1: 
        // M X N (Where M and N is Given)
        //Inputs : 3 2
        // 1 
        // 2 
        // 2
        //.. (Up to limit)

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // Integer[][] arr = new Integer[a][b];
        // for(int i=0;i<a;i++){
        //     for(int j=0;j<b;j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }


        // for(int i=0;i<a;i++){
        //     for(int j=0;j<b;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        //CASE 2: 
        // M X N 
        // M Number of Lines Strings
        // Example : 3 X 3
        // 1 2 3
        // 4 5 6
        // 7 8 9

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // sc.nextLine(); 
        // ArrayList<String[]> arr = new ArrayList<>();
        // for(int i=0;i<a;i++){
        //     String z = sc.nextLine();
        //     String[] innStrings = z.split(" ");
        //     arr.add(innStrings);
        // }
        // for(int i=0;i<arr.size();i++){
        //     for(int j=0;j<arr.get(0).length;j++){
        //         System.out.print(arr.get(i)[j]);
        //     }
        //     System.out.println();
        // }



        //CASE 3: 
        // M X N 
        // M Number of Lines Strings
        // Example : 3 X 3
        // [1, 2, 3]
        // {4, 5, 6}
        // [7, 8 ,9]

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        StringBuilder StrBil = new StringBuilder();
        for(int i=0;i<a;i++){
             ArrayList<String> inrr = new ArrayList<>();

            String z = sc.nextLine();
            for(char x: z.toCharArray()){
                if(Character.isDigit(x)){
                    StrBil.append(x);
                }
                else{
                    inrr.add(StrBil.toString());
                    StrBil.setLength(0);
                }
            }
            if(StrBil.length()>0){
                inrr.add(StrBil.toString());
                StrBil.setLength(0);
            }
            arr.add(inrr);
        }
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(0).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }


    }
}
